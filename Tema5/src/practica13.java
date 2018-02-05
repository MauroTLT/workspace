import java.util.Scanner;

public class practica13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practica13 programa = new practica13();
		programa.inici();
	}
	public void inici(){
		Scanner entradaTeclado = new Scanner(System.in);
		float[] array = {1,2,3,4,5,6,7,8,9};
		int[] arrayM5 = {10,23,45,32,67,43,29,76};
		
		float[]comparacion = metodo1(array);
		System.out.println("El mayor es " + comparacion[0] + "\nEl menor es " + comparacion[1]);
		
		float media = metodo2(array);
		System.out.println("La media aritmetrica es: "+ media);
		
		metodo3(entradaTeclado);
		
		int dias = metodo4(entradaTeclado);
		System.out.println("El mes tiene " + dias + " dias");
		
		metodo5(entradaTeclado, arrayM5);
		
		
		entradaTeclado.close();
	}
	public float[] metodo1(float[] array){
		float[] comparacion = new float [2];
		for(int i = 0; i < array.length; i++){
			if (i == 0){
				comparacion[0] = array[i];
				comparacion[1] = array[i];
			} else if (comparacion[0] < array[i] && i!=0){
				comparacion[0] = array[i];
			} else if (comparacion[1] > array[i] && i!=0){
				comparacion[1] = array[i];
			}
		}
		return comparacion;
	}
	public float metodo2(float[] array){
		float media = 0.0F;
		for(int i = 0; i < array.length; i++){
			media += array[i];
		}
		media = media / array.length;
		return media;
	}

	public void metodo3(Scanner entradaTeclado){
		float num = 0.0F;
		System.out.println("Escribe un numero entre 0 y 10");
		while (!entradaTeclado.hasNextFloat()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
		num = entradaTeclado.nextFloat();
		while(num < 0 || num > 10) {
			System.out.println("Error. Escribe un numero entre 0 y 10");
			while (!entradaTeclado.hasNextFloat()){
				System.out.println("Formato Incorrecto, prueba otra vez");
				entradaTeclado.next();
			}
			num = entradaTeclado.nextFloat();
		}
		if(num < 5){
			System.out.println("Suspendido");
		} else if (num >= 5 && num < 6.5){
			System.out.println("Aprobado");
		} else if (num >= 6.5 && num < 9){
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}
	}
	public int metodo4(Scanner entradaTeclado){
		int DIAS_POR_MES[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int num = 0;
		System.out.println("Escribe un numero entre 1 y 12");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
		num = entradaTeclado.nextInt();
		while(num < 1 || num > 12) {
			System.out.println("Error. Escribe un numero entre 1 y 12");
			while (!entradaTeclado.hasNextInt()){
				System.out.println("Formato Incorrecto, prueba otra vez");
				entradaTeclado.next();
			}
			num = entradaTeclado.nextInt();
		}
		return DIAS_POR_MES[num];
	}
	
	public void metodo5(Scanner entradaTeclado, int[] array){
		int num = 0;
		System.out.println("Escribe un numero a buscar");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
		num = entradaTeclado.nextInt();	
		for(int i = 0; i < array.length; i++){
			if(array[i] == num){
				System.out.println("Ese numero esta en la posicion " + (i + 1));
				break;
			} else {
				System.out.println("Ese numero no esta en el array");
			}
		}
	}
}