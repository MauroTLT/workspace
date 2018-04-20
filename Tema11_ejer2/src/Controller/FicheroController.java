package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FicheroController {
	private BufferedWriter ficheroSalida;
	private BufferedReader ficheroEntrada;

	public FicheroController() {
		try {
			this.ficheroSalida = new BufferedWriter(new FileWriter(new File("historial.txt"), true));
			this.ficheroEntrada = new BufferedReader(new FileReader(new File("historial.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void excribir(String texto) {
		try {
			ficheroSalida.write(texto);
			ficheroSalida.newLine();
			ficheroSalida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void borrar(String cambio) {
		try {
			File inputFile = new File("historial.txt");
			File tempFile = new File("historial2.txt");
		
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

			String lineToRemove = "bbb";
			String currentLine;

		while((currentLine = reader.readLine()) != null) {
		    String trimmedLine = currentLine.trim();
		    if(trimmedLine.equals(lineToRemove)) continue;
		    writer.write(currentLine + System.getProperty("line.separator"));
		}
		writer.close(); 
		reader.close();
		boolean successful = tempFile.renameTo(inputFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String leer() {
		String linea = "";
		try {
			while ((linea = ficheroEntrada.readLine()) != null) {
				return linea;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public BufferedWriter getFicheroSalida() {
		return ficheroSalida;
	}

	public void setFicheroSalida(BufferedWriter ficheroSalida) {
		this.ficheroSalida = ficheroSalida;
	}

	public BufferedReader getFicheroEntrada() {
		return ficheroEntrada;
	}

	public void setFicheroEntrada(BufferedReader ficheroEntrada) {
		this.ficheroEntrada = ficheroEntrada;
	}
}
