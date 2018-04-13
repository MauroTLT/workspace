import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner entradaTeclado = null;
		String ficheroS = "";
		String ficheroE = "";
		try {
			entradaTeclado = new Scanner(System.in);
			System.out.println("Nombre del fichero");
			ficheroE = entradaTeclado.next();
			System.out.println("¿Donde lo vuelco?");
			ficheroS = entradaTeclado.next();
			BufferedWriter ficheroSalida = new BufferedWriter(new FileWriter(new File(ficheroS + ".txt")));
			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(new File(ficheroE + ".txt")));
			String linea = null;
			while ((linea = ficheroEntrada.readLine()) != null) {
				ficheroSalida.write(linea.toUpperCase());
				ficheroSalida.newLine();
			}
			System.out.println("Operación realizada con exito");
			ficheroEntrada.close();
			ficheroSalida.close();
			entradaTeclado.close();
		} catch (IOException errorDeFichero) {
			System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
		}

	}

}