package examen3;

import java.util.Scanner;
public class ejercicio1 {
	/**
	 * Mauro Pérez Moliner
	 * 1ºDAM Mañana
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduce un numero entero entre 1 y 12");
		while (!entradaTeclado.hasNextInt()) {
			System.out.println("Valor incorrecto, escribe otro");
			entradaTeclado.next();
		}
		mes = entradaTeclado.nextInt();
		entradaTeclado.close();
		System.out.print("El mes es: ");
		switch (mes) {
		case 1:
			System.out.print("Enero.");
			break;
		case 2:
			System.out.print("Febrero.");
			break;
		case 3:
			System.out.print("Marzo.");
			break;
		case 4:
			System.out.print("Abril.");
			break;
		case 5:
			System.out.print("Mayo.");
			break;
		case 6:
			System.out.print("Junio.");
			break;
		case 7:
			System.out.print("Julio.");
			break;
		case 8:
			System.out.print("Agosto.");
			break;
		case 9:
			System.out.print("Septiembre.");
			break;
		case 10:
			System.out.print("Octubre.");
			break;
		case 11:
			System.out.print("Noviembre.");
			break;
		case 12:
			System.out.print("Diciembre.");
			break;
		default:
			System.out.print("Error, ese mes no existe.");
		}

	}

}
