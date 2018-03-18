package model;

public class PlayerModel {
	private PieceModel[] pieza;
	private int puntos;
	
	public PlayerModel(String pieza) {
		this.pieza = new PieceModel[5];
		for (int i = 0; i < this.pieza.length; i++) {
			if (pieza.equals("x")) {
				this.pieza[i] = new XModel();
			} else {
				this.pieza[i] = new OModel();
			} 
		}
	}

	public PieceModel[] getPieza() {
		return pieza;
	}

	public void setPiezas(PieceModel[] pieza) {
		this.pieza = pieza;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}