package pruebas;

import java.util.Scanner;

public class rombo {

	static final String SEPARACION = " ", CARACT1 = "/";
	static final char CARACT2 = 92;
	public static void main(String[] args) {
		int x = 0, y = 0, numFilas = 0;
		Scanner keyb = new Scanner(System.in);
		do {
			System.out.println("Introduce el numero de filas del rombo, tiene que ser mayor de 0");
			while (!keyb.hasNextInt()) {
				System.out.println("Valor incorrecto");
				keyb.next();
			}
			numFilas = keyb.nextInt();
		} while (numFilas <= 0);
		keyb.close();
		for (x = 0; x <= numFilas; x = x + 2) {
			for (int cantEspacios = numFilas - x; cantEspacios > 0; cantEspacios = cantEspacios - 2) {
				System.out.print(SEPARACION);
			}
			for (y = 1; y <= x; y++) {
				if (y == 1) {
					System.out.print(CARACT1);
				}else if(y == x){
					System.out.print(CARACT2);
				}else {
					System.out.print(SEPARACION);
				}
			}
			System.out.print("\n");
		}

	}

}