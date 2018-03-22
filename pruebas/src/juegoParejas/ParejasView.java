package juegoParejas;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ParejasView extends JFrame{
	private int aux;
	private Color[] colores;
	private Container tablero, tapa;
	private CasillaModel[][] casillas;
	
	public ParejasView() {
		this.aux = 0;
		this.colores = new Color[] {Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW, Color.GRAY, Color.PINK, Color.MAGENTA, Color.CYAN};
		this.tablero = new Container();
		this.tapa = new Container();
		this.casillas = new CasillaModel[4][4];
		darFormato();
	}

	private void darFormato() {
		this.tablero.setLayout(new GridLayout(4,4));
		for(int i = 0; i < casillas.length; i++) {
			for(int j = 0; j < casillas[i].length; j++) {
				this.casillas[i][j] = new CasillaModel();
				this.tablero.add(this.casillas[i][j]);
			}
		}
		darImagen();
		this.add(tablero);

		this.setTitle("Encontrar Parejas");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void darImagen() {
		random r = new random();
		int aux1 = 0;
		int aux2 = 0;
		while(aux < 8) {
			aux1 = r.aleatorioIntSeed(4);
			aux2 = r.aleatorioIntSeed(4);
			if(casillas[aux1][aux2].getColor() == Color.WHITE) {
				casillas[aux1][aux2].setColor(colores[aux]);
				aux++;
			}
		}
		aux=0;
		while(aux < 8) {
			aux1 = r.aleatorioIntSeed(4);
			aux2 = r.aleatorioIntSeed(4);
			if(casillas[aux1][aux2].getColor() == Color.WHITE) {
				casillas[aux1][aux2].setColor(colores[aux]);
				aux++;
			}
		}
	}

	public Color[] getColores() {
		return colores;
	}

	public void setColores(Color[] colores) {
		this.colores = colores;
	}

	public Container getTablero() {
		return tablero;
	}

	public void setTablero(Container tablero) {
		this.tablero = tablero;
	}

	public Container getTapa() {
		return tapa;
	}

	public void setTapa(Container tapa) {
		this.tapa = tapa;
	}

	public CasillaModel[][] getCasillas() {
		return casillas;
	}

	public void setCasillas(CasillaModel[][] casillas) {
		this.casillas = casillas;
	}
}
