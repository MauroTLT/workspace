package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void borrar(String cambio) {
		ArrayList<String> array = new ArrayList<String>();
		String linea = "";
		try {
			while ((linea = ficheroEntrada.readLine()) != null) {
				array.add(linea);
			}
			ficheroSalida = new BufferedWriter(new FileWriter(new File("historial.txt"), false));
			for (int i = 0; i < array.size(); i++) {
				if(!array.get(i).contains(cambio)) {
					excribir(array.get(i));
				}
			}
			ficheroSalida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void borrarTodo() {
		try {
			ficheroSalida = new BufferedWriter(new FileWriter(new File("historial.txt"), false));
			ficheroSalida.write("");
			ficheroSalida.close();
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
	
	public void leer(ArrayList<String> array) {
		String linea = "";
		try {
			while ((linea = ficheroEntrada.readLine()) != null) {
				array.add(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
