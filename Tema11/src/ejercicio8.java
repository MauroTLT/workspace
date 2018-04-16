import java.io.*;

public class ejercicio8 {
	public static void main(String[] args) {
		//----------------
		// Copiar todo un fichero, con bloques de 54 bytes, es decir,  54 caracteres.
		// Sin ninguna comprobación de errores
		final int BUFFER_SIZE = 54;
		byte[] buf = null;
		int[] acomparacion= {66,77};
		InputStream ficheroEntrada3 = null;
		System.out.println("Copiando fichero binario...");
		try {
			ficheroEntrada3 = new FileInputStream(new File("coche.bmp"));
			buf = new byte[BUFFER_SIZE];
			ficheroEntrada3.read(buf, 0, BUFFER_SIZE);
			if (buf[0] == acomparacion[0] && buf[1] ==  acomparacion[1]){
				System.out.println("Formato Valido");
			} else 
				System.out.println("Formato no Válido");
			ficheroEntrada3.close();
		} catch (Exception errorDeFichero) {
			System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
		}
		System.out.println("Terminado!");
	}
}