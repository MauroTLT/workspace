
import java.io.*;
import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner entradaTeclado = null;
		String fichero = "";
		System.out.println("Nombre del fichero");
		try {
			entradaTeclado = new Scanner(System.in);
			fichero = entradaTeclado.next();
			if (!(new File(fichero + ".txt")).exists()) {
				System.out.println("No he encontrado " + fichero + ".txt");
				entradaTeclado.close();
				return;
			}
			System.out.println("Leyendo fichero de texto...\n");

			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(new File(fichero + ".txt")));
			String linea = null;
			while ((linea = ficheroEntrada.readLine()) != null) {
				System.out.println(linea);
			}
			ficheroEntrada.close();
			entradaTeclado.close();
		} catch (IOException errorDeFichero) {
			System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
		}
	}
}