package model;

import javax.swing.ImageIcon;

public abstract class PieceModel {
	private ImageIcon image;
	
	public PieceModel(String text) {
		this.image = new ImageIcon(getClass().getResource(text));
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}
}
