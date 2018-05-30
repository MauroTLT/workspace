package enemigo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class View extends JFrame {
	
	private JLabel mapa;
	private JLabel[][] casillas;
	
	public View(Modelo modelo) {
		this.mapa = new JLabel();
		this.casillas = new JLabel[10][10];
		darFormato(modelo);
	}

	private void darFormato(Modelo modelo) {
		pintar(modelo.getTablero());
		this.add(mapa, BorderLayout.CENTER);
		this.setSize(750, 750);
		this.setTitle("Prueba");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void pintar(Casilla[][] tablero) {
		this.mapa.removeAll();
		this.mapa.setLayout(new GridLayout(10, 10,0,0));
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				JLabel label = new JLabel();
				if (tablero[i][j].getEnemy() != null) {
					label.setBackground(Color.RED);
				} else if (tablero[i][j].getPer() != null) {
					label.setBackground(Color.BLUE);
				} else {
					label.setBackground(Color.YELLOW);
				}
				label.setOpaque(true);
				label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				this.casillas[i][j] = label;
				this.mapa.add(this.casillas[i][j]);
			}
		}
	}

	public JLabel getMapa() {
		return mapa;
	}

	public void setMapa(JLabel mapa) {
		this.mapa = mapa;
	}

	public JLabel[][] getCasillas() {
		return casillas;
	}

	public void setCasillas(JLabel[][] casillas) {
		this.casillas = casillas;
	}
	
}
