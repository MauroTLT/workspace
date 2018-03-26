package Models;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */

import java.util.Random;

public class TableroModel {
	private final int FILA;
	private final int COLUMNA;
	private Punto puntos;
	private CasillaModel[][] casillas;
	
	public TableroModel() {
		this.FILA = 3;
		this.COLUMNA = 5;
		this.puntos = new Punto();
		this.casillas = new CasillaModel[FILA][COLUMNA];
		darFormato();
	}

	private void darFormato() {
		Random r = new Random();
		int asterisco = 0,agua = 0,tierra = 0,persona = 0, aux = 0;
		boolean semaforo = false;
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				semaforo = false;
				while(!semaforo) {
					aux = r.nextInt(4);
					if (asterisco < 2 && aux == 0) {
						this.casillas[i][j] = new Bomba();
						semaforo = true;
						asterisco++;
					} else if (agua < 4 && aux == 1) {
						this.casillas[i][j] = new Agua();
						semaforo = true;
						agua++;
					} else if (tierra < 4 && aux == 2) {
						this.casillas[i][j] = new Tierra();
						semaforo = true;
						tierra++;
					} else if (persona < 5 && aux == 3) {
						this.casillas[i][j] = new Persona();
						semaforo = true;
						persona++;
					} 
				}
				System.out.print(this.casillas[i][j].getTipo());
			}
			System.out.println();
		}
		/*for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				if(this.casillas[i][j] == null) {
					if (asterisco < 2) {
						this.casillas[i][j] = new Bomba();
						asterisco++;
					} else if (agua < 4) {
						this.casillas[i][j] = new Agua();
						agua++;
					} else if (tierra < 4) {
						this.casillas[i][j] = new Tierra();
						tierra++;
					} else if (persona < 5) {
						this.casillas[i][j] = new Persona();
						persona++;
					}
				}
				System.out.print(this.casillas[i][j].getTipo());
			} //Estos sout son para hacer trampas
			System.out.println();
		}*/
	}

	public CasillaModel[][] getCasillas() {
		return casillas;
	}

	public void setCasillas(CasillaModel[][] casillas) {
		this.casillas = casillas;
	}

	public Punto getPuntos() {
		return puntos;
	}

	public void setPuntos(Punto puntos) {
		this.puntos = puntos;
	}

	public int getFILA() {
		return FILA;
	}

	public int getCOLUMNA() {
		return COLUMNA;
	}

}
