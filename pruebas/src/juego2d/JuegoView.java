package juego2d;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class JuegoView extends JFrame {
	
	private GridLayout grid;
	private JLabel casilla;
	
	public JuegoView() {
		this.casilla = new JLabel();
		this.grid = new GridLayout(7, 9);
		darFormato();
	}

	private void darFormato() {
		Color[][] color = {
				{Color.BLUE, Color.BLUE, Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY},
				{Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE, Color.GRAY, Color.GRAY, Color.WHITE, Color.WHITE, Color.WHITE},
				{Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.GRAY, Color.WHITE},
				{Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE, Color.WHITE, Color.WHITE, Color.GRAY, Color.WHITE, Color.WHITE},
				{Color.BLUE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
				{Color.BLUE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE, Color.WHITE, Color.WHITE, Color.GRAY, Color.WHITE},
				{Color.BLUE, Color.BLUE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE, Color.WHITE, Color.WHITE, Color.GRAY}
		};
		this.setLayout(grid);
		for (int i = 0; i < this.grid.getRows(); i++) {
			for (int j = 0; j < this.grid.getColumns(); j++) {
				this.casilla = new JLabel();
				this.casilla.setName(i + "" + j);
				this.casilla.setBackground(color[i][j]);
				this.casilla.setOpaque(true);
				this.add(casilla);
			}
		}
		this.setSize(1000, 700);
		this.setTitle("Prueba Juego 2D");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JLabel getBola() {
		return casilla;
	}

	public void setBola(JLabel casilla) {
		this.casilla = casilla;
	}

}
