import java.util.Scanner;

public class practica8 {
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
		practica8 programa = new practica8();
		programa.inici();
	}

	// Primer nivel
	public void inici() {
		menu();
		
	}

	public void menu() {

		System.out.println("     REGISTRO DE TEMPERATURAS");
		System.out.println("--------------------------------------");
		System.out.println("[1] -  Registrar temperaturas semanales");
		System.out.println("[2] -  Consultar temperatura media");
		System.out.println("[3] -  Consultar diferencia");
		System.out.println("[4] -  Finalizar programa");
		tratarOrden();
		
	}

	public void tratarOrden() {
		
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		boolean semaforo = false;
		
		do{
			
			System.out.print("Opción: ");
			
			if(teclado.hasNextInt()){
				opcion = teclado.nextInt();
				switch(opcion){
				case 1:
					registroTemp();
					semaforo = true;
					break;
				case 2:
					mostrarTempMedia();
					semaforo = true;
					break;
				case 3:
					mostrarDiferenciaMaxima();
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
		

	}

	// Segundo Nivel
	public void registroTemp() {

		if((numTemperaturas + 7) >= temperatura.length){
			System.out.println("No queda espacio para mas temperaturas");
			
		}else{
			leerTemperatura();
		}
		menu();
		
	}
	
	public void finalizarEjecucion(){
		
		System.out.println("Se procede a finalizar el programa");
		System.exit(0);
	}

	public void mostrarTempMedia() {
		
		calcularTempMed();
		System.out.println("La temperatura media es: " + media);
		menu();
	}

	public void mostrarDiferenciaMaxima() {
		
		calcularDiferencia();
		System.out.println("Temperatura max = " + max+ "\nTemperatura min = " +min +"\nLa diferencia es: "+ (max-min));
		menu();
	}

	// Tercer Nivel

	public void leerTemperatura() {
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

	public void actualizarFecha() {

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
		mostrarFechaActual();
	}

	public void mostrarFechaActual() {
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

	public void calcularTempMed() {
		
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
}