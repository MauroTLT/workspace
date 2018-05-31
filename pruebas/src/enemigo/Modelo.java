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
		this.tablero[2][3].setEnemy(new Enemigo(1));
		this.tablero[2][8].setEnemy(new Enemigo(2));
		this.tablero[8][6].setEnemy(new Enemigo(3));
		this.tablero[3][3].setEnemy(new Enemigo(4));
		this.tablero[6][9].setEnemy(new Enemigo(5));
		this.tablero[5][5].setPer(new Personaje());
	}

	public Casilla[][] getTablero() {
		return tablero;
	}

	public void setTablero(Casilla[][] tablero) {
		this.tablero = tablero;
	}
	
}
