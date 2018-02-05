package examen3;
/**
 * Mauro Pérez Moliner
 * 1ºDAM Mañana
 */
import java.util.Scanner;
public class ejercicio3 {

	public static final String ASTERISCO = "*";
	public static final String ESPACIO = " ";

	public static void main(String[] args) {
		int alt = 0;
		int i = 0;
		int j = 0;
		int espaciosDetras = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Escribe el numero de filas");
		while (!entradaTeclado.hasNextInt()) {
			System.out.println("Valor incorrecto, escribe otro:");
			entradaTeclado.next();
		}
		alt = entradaTeclado.nextInt();
		entradaTeclado.close();
		alt = alt * 2;
		for (i = 1; i <= alt; i = i + 2) {
			for (espaciosDetras = alt - i; espaciosDetras > 0; espaciosDetras = espaciosDetras - 2) {
				System.out.print(ESPACIO);
			}
			for (j = 0; j < i; j++) {
				System.out.print(ASTERISCO);
			}
			System.out.print("\n");
		}
	}
}
