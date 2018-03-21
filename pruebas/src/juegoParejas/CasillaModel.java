package juegoParejas;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CasillaModel extends JLabel {
	
	private boolean descubierto;
	private Color color;
	
	public CasillaModel() {
		this.color = Color.WHITE;
		this.setIcon(null);
		this.setBackground(Color.WHITE);
		this.descubierto = false;
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.setOpaque(true);
	}

	public boolean isDescubierto() {
		return descubierto;
	}

	public void setDescubierto(boolean descubierto) {
		this.descubierto = descubierto;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
