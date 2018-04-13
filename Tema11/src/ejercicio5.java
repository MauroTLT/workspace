
import java.io.*;

public class ejercicio5 {
	public static void main(String[] args) {
		// Cantidad de "a" en un fichero de cualquier tipo
		// Mirando errores solo con try-catch
		System.out.println("Contando \"letras\"...");
		String texto = "";
		try {
			FileInputStream ficheroEntrada2 = new FileInputStream(new File("fichero.bin"));
			int dato;
			while ((dato = ficheroEntrada2.read()) != -1) {
				if ((dato >= 97 && dato <= 122) || (dato >= 65 && dato <= 90) || dato == 32) {
					texto += (char)dato;
				}
			}
			ficheroEntrada2.close();
		} catch (Exception errorDeFichero) {
			System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
		}
		System.out.println("Texto: " + texto);
	}
}