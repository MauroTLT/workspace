import java.util.Scanner;

public class practica5 {
	// variable global
	float temperatura[] = new float[364];
	int dia = 0;
	int mes = 1;
	int numTemperaturas = 0;
	int DIAS_POR_MES[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	float media = 0.0F;
	float diferencia = 0.0F;
	float max = 0.0F;
	float min = 0.0F;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practica5 programa = new practica5();
		programa.inici();
	}
	public void inici() {
		menu();
	}
	public void menu(){
		tratarOrden();
	}
	public void tratarOrden(){
		registroTemp();
		mostrarTempMedia();
		mostrarDiferencia();
		finalizarEjecucion();
	}
	public void finalizarEjecucion(){
	}
	public void registroTemp(){
		leerTemperatura();
		
	}
	public void leerTemperatura(){
		System.out.println("Introduce los valores de la semana: ");
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 7; i++) {
			System.out.print("Número " + i + " :");

			if (teclado.hasNextFloat()) {

				temperatura[numTemperaturas] = teclado.nextFloat();
				numTemperaturas++;

			} else {
				System.out.println("El dato introducido no es válido");
				teclado.next();
				i--;
				System.out.println("Vuelve a introducir un valor");
			}
			actualizarFecha();
		}
	}
	public void actualizarFecha(){
		if (dia == DIAS_POR_MES[11] && mes == 12) {

			dia = 1;
			mes = 1;
			
		}else{
			if (dia < DIAS_POR_MES[mes-1]) {
				dia++;
			} else {
				dia = 1;
				mes++;
			}
		}
		mostrarFecha();
	}
	public void mostrarTempMedia(){
		calcularMedia();
		menu();
	}
	public void mostrarFecha(){
		String mesTexto = "";
		switch (mes) {
		case 1:
			mesTexto = "Enero";
			break;
		case 2:
			mesTexto = "Febrero";
			break;
		case 3:
			mesTexto = "Marzo";
			break;
		case 4:
			mesTexto = "Abril";
			break;
		case 5:
			mesTexto = "Mayo";
			break;
		case 6:
			mesTexto = "Junio";
			break;
		case 7:
			mesTexto = "Julio";
			break;
		case 8:
			mesTexto = "Agosto";
			break;
		case 9:
			mesTexto = "Septiembre";
			break;
		case 10:
			mesTexto = "Octubre";
			break;
		case 11:
			mesTexto = "Noviembre";
			break;
		case 12:
			mesTexto = "Diciembre";
			break;
		default:
			System.out.println("El mes introducido no existe");
		}
		System.out.println("Estamos a " + dia + " de " + mesTexto);
	}
	public void calcularMedia(){
		for(int i = 0; i < numTemperaturas; i++){
			media+= temperatura[i];
		}
		
		media = media / numTemperaturas;
	}
	public void calcularDiferencia(){
		max = temperatura[0];
		min = temperatura[0];
		
		for(int i = 0; i < numTemperaturas;i++){
			if(temperatura[i]>=max){
				max = temperatura[i];
			}
			if(temperatura[i]<=min){
				min = temperatura[i];
			}
		}
	}
	public void mostrarDiferencia(){
		mostrarFecha();
		calcularMedia();
	}
}