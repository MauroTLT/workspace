package enemigo;

import java.util.Random;

public class EnemyMove implements Runnable {
	
	private View ventana;
	private Modelo modelo;
	private int tiempo,id;
	private Thread hilo;
	private Enemigo enemigo;
	
	public EnemyMove(Modelo modelo, int id, View ventana) {
		this.enemigo = null;
		this.id = id;
		this.ventana = ventana;
		this.modelo = modelo;
		this.tiempo = 1000;
		this.hilo = new Thread(this);
		this.hilo.start();
	}

	@Override
	public void run() {
		Random r = new Random();
		boolean semaforo = false;
		while(true) {
			semaforo = false;
			for (int i = 0; i < this.modelo.getTablero().length && !semaforo; i++) {
				for (int j = 0; j < this.modelo.getTablero()[i].length && !semaforo; j++) {
					if (this.modelo.getTablero()[i][j].getEnemy() != null && this.modelo.getTablero()[i][j].getEnemy().getId() == this.id) {
						this.enemigo = this.modelo.getTablero()[i][j].getEnemy();
						try {
							if(IA(i,j)) {
								tiempo = 350;
								for (int ii = 0; ii < this.modelo.getTablero().length && !semaforo; ii++) {
									for (int jj = 0; jj < this.modelo.getTablero()[ii].length && !semaforo; jj++) {
										if (this.modelo.getTablero()[ii][jj].getPer() != null) {
											if (ii == i && jj < j && this.modelo.getTablero()[i][j-1].getEnemy() == null) {
												this.modelo.getTablero()[i][j].setEnemy(null);
												this.modelo.getTablero()[i][j-1].setEnemy(enemigo);
											} else if(ii == i && jj > j && this.modelo.getTablero()[i][j+1].getEnemy() == null) {
												this.modelo.getTablero()[i][j].setEnemy(null);
												this.modelo.getTablero()[i][j+1].setEnemy(enemigo);
											} else if (jj == j && ii < i && this.modelo.getTablero()[i-1][j].getEnemy() == null) {
												this.modelo.getTablero()[i][j].setEnemy(null);
												this.modelo.getTablero()[i-1][j].setEnemy(enemigo);
											} else if (jj == j && ii > i && this.modelo.getTablero()[i+1][j].getEnemy() == null) {
												this.modelo.getTablero()[i][j].setEnemy(null);
												this.modelo.getTablero()[i+1][j].setEnemy(enemigo);
											}
											semaforo = true;
										}
									}
								}
							} else {
								tiempo = 1000;
								switch (r.nextInt(4)) {
								case 0:
									if (this.modelo.getTablero()[i-1][j].getEnemy() == null) {
										this.modelo.getTablero()[i][j].setEnemy(null);
										this.modelo.getTablero()[i-1][j].setEnemy(enemigo);
									}
									break;
								case 1:
									if (this.modelo.getTablero()[i+1][j].getEnemy() == null) {
										this.modelo.getTablero()[i][j].setEnemy(null);
										this.modelo.getTablero()[i+1][j].setEnemy(enemigo);
									}
									break;
								case 2:
									if (this.modelo.getTablero()[i][j-1].getEnemy() == null) {
										this.modelo.getTablero()[i][j].setEnemy(null);
										this.modelo.getTablero()[i][j-1].setEnemy(enemigo);
									}
									break;
								case 3:
									if (this.modelo.getTablero()[i][j+1].getEnemy() == null) {
										this.modelo.getTablero()[i][j].setEnemy(null);
										this.modelo.getTablero()[i][j+1].setEnemy(enemigo);
									}
									break;
								}
								semaforo = true;
							}
						} catch (ArrayIndexOutOfBoundsException e) {
							System.out.println("No salgas");
							this.modelo.getTablero()[i][j].setEnemy(enemigo);
						}
						try {
							Thread.sleep(tiempo);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
			this.ventana.pintar(modelo.getTablero());
			this.ventana.revalidate();
		}
	}
	
	private boolean IA(int fila, int columna) {
		for (int i = 0; i < this.modelo.getTablero().length; i++) {
			for (int j = 0; j < this.modelo.getTablero()[i].length; j++) {
				if (this.modelo.getTablero()[i][j].getPer() != null) {
					if (i == fila || j == columna) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
