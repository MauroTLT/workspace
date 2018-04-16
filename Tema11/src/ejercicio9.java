import java.io.*;

public class ejercicio9 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Transformación del contenido del fichero....");
		final int BUFFER_SIZE = 54;
		byte[] arrayEntrada = null;
		FileInputStream ficheroEntrada = null;
		BufferedWriter ficheroSalida = null;
		try {
			arrayEntrada = new byte[BUFFER_SIZE];
			ficheroEntrada = new FileInputStream(new File("fichero.txt"));
			ficheroSalida = new BufferedWriter(new FileWriter(new File("Ejercicio9.bin")));
			ficheroEntrada.read(arrayEntrada, 0, BUFFER_SIZE);
			for (int i = 0; i < arrayEntrada.length; i++) {
				if ((arrayEntrada[i] == 32) || (arrayEntrada[i] >= 97 && arrayEntrada[i] <= 122)
						|| (arrayEntrada[i] >= 65 && arrayEntrada[i] <= 90)) {
					ficheroSalida.write(arrayEntrada[i]);
				}
			}
			ficheroSalida.close();
		} catch (Exception errorDeFichero) {
			System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
		}
		System.out.println("Ya ha Terminado!");
	}
}