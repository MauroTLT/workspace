package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import Vista.HistorialView;

public class HistorialController {
	private HistorialView ventana;
	private BufferedReader ficheroEntrada;
	
	public HistorialController() {
		try {
			this.ficheroEntrada = new BufferedReader(new FileReader(new File("historial.txt")));
			this.ventana = new HistorialView(ficheroEntrada);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public HistorialView getVentana() {
		return ventana;
	}

	public void setVentana(HistorialView ventana) {
		this.ventana = ventana;
	}
}