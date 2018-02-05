package examen3;
/**
 * Mauro Pérez Moliner
 * 1ºDAM Mañana
 */
import java.util.Scanner;
public class ejercicio2 {
	public static final int MIN = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int total = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Escribe un numero mayor de 100");
		while (!entradaTeclado.hasNextInt()) {
			System.out.println("Valor incorrecto, escribe otro");
			entradaTeclado.next();
		}
		max = entradaTeclado.nextInt();
		entradaTeclado.close();

		for (int i = 101; i > MIN && i <= max; i += 2) {
			total = total + i;
		}
		System.out.println("El total es: " + total);
	}

}
