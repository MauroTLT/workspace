
import java.io.*;

public class ejercicio6 {
	public static void main(String[] args) {
		// Cantidad de "a" en un fichero de cualquier tipo
		// Mirando errores solo con try-catch
		System.out.println("Transformando...");
		String texto = "";
		try {
			FileInputStream ficheroEntrada2 = new FileInputStream(new File("fichero.bin"));
			BufferedWriter ficheroSalida = new BufferedWriter(new FileWriter(new File("ficheroNuevo.txt")));
			int dato;
			while ((dato = ficheroEntrada2.read()) != -1) {
				if ((dato >= 97 && dato <= 122) || (dato >= 65 && dato <= 90) || dato == 32) {
					texto += (char)dato;
				}
			}
			ficheroSalida.write(texto);
			ficheroEntrada2.close();
			ficheroSalida.close();
		} catch (Exception errorDeFichero) {
			System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
		}
	}
}