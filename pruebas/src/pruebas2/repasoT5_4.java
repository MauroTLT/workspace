package pruebas2;

import java.util.Scanner;

public class repasoT5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		int lon = 0;
		System.out.println("Longitud del array");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
		lon = entradaTeclado.nextInt();
		int[] array = new int[lon];
		for(int i = 0; i < array.length; i++){
			System.out.println("Escribe un numero");
			while (!entradaTeclado.hasNextInt()){
				System.out.println("Formato Incorrecto, prueba otra vez");
				entradaTeclado.next();
			}
			array[i] = entradaTeclado.nextInt();
		}
		entradaTeclado.close();
		imprimir(array);
	}
	public static void imprimir(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
