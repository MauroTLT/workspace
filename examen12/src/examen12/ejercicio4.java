package examen12;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero = entradaTeclado.nextInt();
		entradaTeclado.close();
		if (numero % 2 == 0){
			System.out.println("El numero "+numero+" es par");
		}
		if (numero % 2 != 0){
			System.out.println("El numero "+numero+" es impar");
		}
		
	}

}
