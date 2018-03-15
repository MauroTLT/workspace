package model;

import javax.swing.ImageIcon;

public class PieceModel {
	private ImageIcon image;
	
	public PieceModel(ImageIcon image) {
		this.image = image;
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}
}
