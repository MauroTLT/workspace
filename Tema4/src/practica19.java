import java.util.Scanner;

public class practica19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cadenas = new String[5];
		int i = 0;
		int j = 0;
		int longi = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Escribe 5 cadenas de texto separadas por un intro.");
		for (i = 0; i <= cadenas.length - 1; i++) {
			cadenas[i] = entradaTeclado.nextLine();
		}
		for (i = 0; i <= cadenas.length - 1; i++) {
			System.out.print("La palabra ");
			for (j = 0; j <= cadenas[i].length() - 1; j++) {
				System.out.print(cadenas[i].charAt(j));
				longi++;
			}
			System.out.print(" tiene una longitud de: " + longi);
			System.out.print("\n");
			longi = 0;
		}
		entradaTeclado.close();
	}

}