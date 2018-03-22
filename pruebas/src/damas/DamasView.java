package damas;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class DamasView extends JFrame{
	
	private Container tablero;
	private JLabel[][] casillas;
	
	public DamasView() {
		this.tablero = new Container();
		this.casillas = new JLabel[8][8];
		darFormato();
	}

	private void darFormato() {
		this.tablero.setLayout(new GridLayout(8,8));
		for(int i = 0; i < casillas.length; i++) {
			for(int j = 0; j < casillas[i].length; j++) {
				JLabel label = new JLabel();
				label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				if((i + j) % 2 != 0) {
					label.setBackground(Color.BLACK);
					if(i < 3) {
						label.setIcon(new ImageIcon(getClass().getResource("../resources/X.png")));
					} else if(i > 4) {
						label.setIcon(new ImageIcon(getClass().getResource("../resources/O.png")));
					}
				} else {label.setBackground(Color.WHITE);}
				label.setOpaque(true);
				this.casillas[i][j] = label;
				this.tablero.add(label);
			}
		}
		this.add(tablero);
		
		this.setTitle("Damas");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public Container getTablero() {
		return tablero;
	}

	public void setTablero(Container tablero) {
		this.tablero = tablero;
	}

	public JLabel[][] getCasillas() {
		return casillas;
	}

	public void setCasillas(JLabel[][] casillas) {
		this.casillas = casillas;
	}

}
