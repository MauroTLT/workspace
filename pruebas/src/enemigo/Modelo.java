package enemigo;

public class Modelo {
	
	private Casilla[][] tablero;
	
	public Modelo() {
		this.tablero = new Casilla[10][10];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				Casilla cas = new Casilla();
				this.tablero[i][j] = cas;
			}
		}
		this.tablero[2][3].setEnemy(new Enemigo());
		this.tablero[5][5].setPer(new Personaje());
	}

	public Casilla[][] getTablero() {
		return tablero;
	}

	public void setTablero(Casilla[][] tablero) {
		this.tablero = tablero;
	}
	
}
