package ejercicioClase2;

public class DatosPluviometro {
	private MedidaPrecip[] lista;
	private int contador;
	
	public DatosPluviometro(){
		lista = new MedidaPrecip[20];
		contador = 0;
	}
	
	public DatosPluviometro(int medidas){
		lista = new MedidaPrecip[medidas];
		contador = 0;
	}
	
	public double precipitacionDia(int dia, int mes, int año){
		double prec = 0;
		for(int i = 0; i < lista.length; i++){
			if(lista[i].getDia() == dia && lista[i].getMes() == mes && lista[i].getAño() == año){
				prec = prec + lista[i].getPrecipHora();
			}
		}
		return prec;
	}
	
	public void listarMes(int mes, int año){
		boolean semaforo = false;
		System.out.println("Precipitación mes: " + mes + ", año: " + año);
		System.out.println("Dia\tPrecipitación (l/m2)");
		for(int i = 1; i <= 31; i++){
			System.out.print(i +"\t");
			semaforo = false;
			for(int j = 0; j < lista.length; j++){
				if(lista[j].getMes() == mes && lista[j].getAño() == año && lista[j].getDia() == i && semaforo == false) {
					System.out.print(precipitacionDia(i, mes, año) + "\n");
					semaforo = true;
				} else if(j == lista.length -1 && semaforo == false) {
					System.out.print("Sin datos o 0\n");
				}
			}
		}
	}
	
	public void agregar(double precipHora, int dia, int mes, int año, int hora){
		lista[contador] = new MedidaPrecip(precipHora, dia, mes, año, hora);
		contador++;
	}

	public MedidaPrecip[] getLista() {
		return lista;
	}

	public void setLista(MedidaPrecip[] lista) {
		this.lista = lista;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}