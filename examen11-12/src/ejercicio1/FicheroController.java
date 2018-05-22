package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Mauro Pérez Moliner 1ºDAM Mañana
 *
 */
public class FicheroController {

	public String[][] leer() {
		String[][] matriz = new String[10][8];
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(new File("apuestas.txt")));
			String dato = "";
			for (int i = 0; i < matriz.length; i++) {
				if ((dato = entrada.readLine()) != null) {
					matriz[i] = dato.split(" ");
				}
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return matriz;
	}

	public void escribir(int quinta, int cuarta, int tercera, int segunda, int primera, int reintegro) {
		try {
			BufferedWriter salida = new BufferedWriter(new FileWriter(new File("resultadoapuestas.txt")));
			salida.write("Reintegro: " + reintegro + " apuestas acertadas.");
			salida.newLine();
			salida.write("Quinta: " + quinta + " apuestas acertadas.");
			salida.newLine();
			salida.write("Cuarta: " + cuarta + " apuestas acertadas.");
			salida.newLine();
			salida.write("Tercera: " + tercera + " apuestas acertadas.");
			salida.newLine();
			salida.write("Segunda: " + segunda + " apuestas acertadas.");
			salida.newLine();
			salida.write("Primera: " + primera + " apuestas acertadas.");
			salida.newLine();
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
