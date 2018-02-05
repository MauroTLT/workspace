package pruebas2;

import java.util.Scanner;

public class repasoT5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		int lon = 0;
		System.out.println("Longitud de los array");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
		lon = entradaTeclado.nextInt();
		int[] array = new int[lon];
		int[] array2 = new int[lon];
		int[] fin = new int[lon];
		for(int i = 0; i < array.length; i++){
			System.out.println("Escribe un numero para el primer array");
			while (!entradaTeclado.hasNextInt()){
				System.out.println("Formato Incorrecto, prueba otra vez");
				entradaTeclado.next();
			}
			array[i] = entradaTeclado.nextInt();
		}
		for(int i = 0; i < array.length; i++){
			System.out.println("Escribe un numero para el segundo array");
			while (!entradaTeclado.hasNextInt()){
				System.out.println("Formato Incorrecto, prueba otra vez");
				entradaTeclado.next();
			}
			array2[i] = entradaTeclado.nextInt();
		}
		entradaTeclado.close();
		multiplicar(array, array2, fin);
	}
	public static void multiplicar(int[] array, int[]array2, int[] fin) {
		for(int i = 0; i < array.length; i++){
			fin[i] = (array[i] * array2[i]);
		}
		imprimir(fin);
	}
	public static void imprimir(int[] fin) {
		for(int i = 0; i < fin.length; i++) {
			System.out.print(fin[i] + " ");
			
		}
	}
}