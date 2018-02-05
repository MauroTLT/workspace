import java.util.Scanner;

public class practica15 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practica15 programa = new practica15();
		programa.inici();
	}
	// Primer nivel
	public void inici() {
		float temperatura[] = new float[364];
		int DIAS_POR_MES[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int numTemperaturas = 0;
		int[] fechaActual = {0,1};
		menu(numTemperaturas, DIAS_POR_MES, temperatura, fechaActual);
	}
	public void menu(int numTemperaturas, int[] DIAS_POR_MES, float[] temperatura, int[]fechaActual) {
		System.out.println("     REGISTRO DE TEMPERATURAS");
		System.out.println("--------------------------------------");
		System.out.println("[1] -  Registrar temperaturas semanales");
		System.out.println("[2] -  Consultar temperatura media");
		System.out.println("[3] -  Consultar diferencia");
		System.out.println("[4] -  Finalizar programa");
		tratarOrden(numTemperaturas, DIAS_POR_MES, temperatura, fechaActual);
	}
	public int tratarOrden(int numTemperaturas, int[] DIAS_POR_MES, float[] temperatura, int[]fechaActual) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		boolean semaforo = false;
		do{
			System.out.print("Opción: ");
			if(teclado.hasNextInt()){
				opcion = teclado.nextInt();
				switch(opcion){
				case 1:
					numTemperaturas = registroTemp(numTemperaturas, DIAS_POR_MES, temperatura, fechaActual);
					semaforo = true;
					break;
				case 2:
					mostrarTempMedia(numTemperaturas, DIAS_POR_MES, temperatura, fechaActual);
					semaforo = true;
					break;
				case 3:
					mostrarDiferenciaMaxima(numTemperaturas, DIAS_POR_MES, temperatura, fechaActual);
					semaforo = true;
					break;
				case 4:
					finalizarEjecucion();
					semaforo = true;
					break;
				default:
					System.out.println("La opción introducida no es válida");
					semaforo = false;
				}
			}
		}while(semaforo == false);
		return opcion;
	}
	// Segundo Nivel
	public int registroTemp(int numTemperaturas, int[] DIAS_POR_MES, float[] temperatura, int[]fechaActual) {
		int leidas = 0;
		if((numTemperaturas + 7) >= temperatura.length){
			System.out.println("No queda espacio para mas temperaturas");
			
		}else{
			leidas = leerTemperatura(numTemperaturas, DIAS_POR_MES, temperatura, fechaActual);
		}
		menu(numTemperaturas, DIAS_POR_MES, temperatura, fechaActual);
		return leidas;
	}
	public void finalizarEjecucion(){
		System.out.println("Se procede a finalizar el programa");
		System.exit(0);
	}
	public void mostrarTempMedia(int numTemperaturas, int[]DIAS_POR_MES, float[] temperatura, int[] fechaActual) {
		System.out.println("La temperatura media es: " + calcularTempMed(numTemperaturas, temperatura));
		menu(numTemperaturas, DIAS_POR_MES, temperatura, fechaActual);
	}
	public void mostrarDiferenciaMaxima(int numTemperaturas,int[]DIA_POR_MES, float[] temperatura, int[]fechaActual) {
		float[] diferencias = null;
		calcularDiferencia(numTemperaturas, temperatura);
		System.out.println("Temperatura max =" + diferencias[0] + "\nTemperatura min =" + diferencias[1] + "\nLa diferencia es: "+ diferencias[2]);
		menu(numTemperaturas,DIA_POR_MES,temperatura, fechaActual);
	}
	// Tercer Nivel
	public int leerTemperatura(int numTemperaturas, int[] DIAS_POR_MES, float[] temperatura, int[]fechaActual) {
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
			actualizarFecha(DIAS_POR_MES, fechaActual);
		}
		return numTemperaturas;
	}
	public void actualizarFecha(int[] DIAS_POR_MES, int[]fechaActual) {
		int dia = fechaActual[0];
		int mes = fechaActual[1];
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
		fechaActual[0] = dia;
		fechaActual[1] = mes;
		mostrarFechaActual(fechaActual);
	}
	public void mostrarFechaActual(int[] fechaActual) {
		String mesTexto = "";
		switch (fechaActual[1]) {
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
		System.out.println("Estamos a " + fechaActual[0] + " de " + mesTexto);
	}
	public float calcularTempMed(int numTemperaturas, float[] temperatura) {
		float media = 0.0F;
		for(int i = 0; i < numTemperaturas; i++){
			media+= temperatura[i];
		}
		media = media / numTemperaturas;
		
		return media;
		
	}
	public float[] calcularDiferencia(int numTemperaturas, float[] temperatura){
		float max = 0.0F;
		float min = 0.0F;
		float[] diferencias = null; 
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
		diferencias[0]= max;
		diferencias[1]= min;
		diferencias[2]= max - min;
		return diferencias;
	}
}