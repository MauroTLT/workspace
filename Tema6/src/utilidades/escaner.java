package utilidades;

import java.util.Scanner;

public class escaner {
	public int escanerInt(Scanner entradaTeclado) {
		int num = 0;
		System.out.println("Escribe un numero");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
		num = entradaTeclado.nextInt();
		return num;
	}
}