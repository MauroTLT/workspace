package model;

import javax.swing.ImageIcon;

public class PlayerModel {
	private PieceModel[] piezas;
	
	public PlayerModel(ImageIcon image) {
		this.piezas = new PieceModel[5];
		darFormato(image);
	}

	private void darFormato(ImageIcon image) {
		for (int i = 0; i < piezas.length; i++) {
			this.piezas[i] = new PieceModel(image);
		}
		
	}

	public PieceModel[] getPiezas() {
		return piezas;
	}

	public void setPiezas(PieceModel[] piezas) {
		this.piezas = piezas;
	}
}