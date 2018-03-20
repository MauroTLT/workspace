package model;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class BoardModel extends Container{
	private SquareModel[][] casillas;
	private PlayerModel[] jugadores;
	
	public BoardModel() {
		this.casillas = new SquareModel[3][3];
		this.jugadores = new PlayerModel[2];
		darFormato();
	}

	private void darFormato() {
		this.setLayout(new GridLayout(3, 3));
		this.setBounds(275, 100, 350, 350);
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				this.casillas[i][j] = new SquareModel();
				this.casillas[i][j].setBackground(Color.WHITE);
				this.add(this.casillas[i][j]);
			}
		}
		this.jugadores[0] = new PlayerModel("x");
		this.jugadores[1] = new PlayerModel("o");
	}

	public SquareModel[][] getCasillas() {
		return casillas;
	}

	public void setCasillas(SquareModel[][] casillas) {
		this.casillas = casillas;
	}

	public PlayerModel[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(PlayerModel[] jugadores) {
		this.jugadores = jugadores;
	}
}
