package tresRaya;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class RayaView extends JFrame {
	private JLabel[][] tablero;
	private Container mapa;
	private JLabel titulo;
	private JButton reset;
	private GridLayout grid;
	
	public RayaView() {
		this.tablero = new JLabel[3][3];
		this.mapa = new Container();
		this.titulo = new JLabel("Turno del Jugador 1");
		this.reset = new JButton("Nueva Partida");
		this.grid = new GridLayout(3, 3);
		darFormato();
	}

	private void darFormato() {
		this.setLayout(null);
		this.titulo.setBorder(BorderFactory.createLoweredBevelBorder());
		this.titulo.setFont(new Font("Tahoma", 0, 24));
		this.titulo.setHorizontalAlignment(SwingConstants.CENTER);
		this.titulo.setBounds(100, 10, 300, 50);
		this.reset.setBounds(150, 465, 200, 100);
		this.mapa.setLayout(grid);
		for (int i = 0; i < this.grid.getRows(); i++) {
			for (int j = 0; j < this.grid.getColumns(); j++) {
				this.tablero[i][j] = new JLabel();
				this.tablero[i][j].setOpaque(true);
				this.tablero[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				this.mapa.add(this.tablero[i][j]);
			}
		}
		this.mapa.setBounds(75, 100, 350, 350);
		this.add(titulo);
		this.add(reset);
		this.add(mapa);
		this.setSize(500, 600);
		this.setLocationRelativeTo(null);
		this.setTitle("Tres en Raya");
		this.setVisible(true);
		
	}

	public JLabel[][] getTablero() {
		return tablero;
	}

	public void setTablero(JLabel[][] tablero) {
		this.tablero = tablero;
	}

	public Container getMapa() {
		return mapa;
	}

	public void setMapa(Container mapa) {
		this.mapa = mapa;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public GridLayout getGrid() {
		return grid;
	}

	public void setGrid(GridLayout grid) {
		this.grid = grid;
	}

	public JButton getReset() {
		return reset;
	}

	public void setReset(JButton reset) {
		this.reset = reset;
	}
}
