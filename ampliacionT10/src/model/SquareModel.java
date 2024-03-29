package model;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class SquareModel extends JLabel {
	private boolean llena;
	
	public SquareModel() {
		this.llena = false;
		this.setOpaque(true);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	public boolean isLlena() {
		return llena;
	}

	public void setLlena(boolean llena) {
		this.llena = llena;
	}
}
