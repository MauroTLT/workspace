package enemigo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {
	
	private Modelo modelo;
	private View ventana;
	
	public Controller() {
		this.modelo = new Modelo();
		this.ventana = new View(modelo);
		setActions();
		EnemyMove enemigo1 = new EnemyMove(modelo, 1, ventana);
		EnemyMove enemigo2 = new EnemyMove(modelo, 2, ventana);
		EnemyMove enemigo3 = new EnemyMove(modelo, 3, ventana);
		EnemyMove enemigo4 = new EnemyMove(modelo, 4, ventana);
		EnemyMove enemigo5 = new EnemyMove(modelo, 5, ventana);
	}

	private void setActions() {
		this.ventana.addKeyListener(this);
		this.ventana.setFocusable(true);
		this.ventana.requestFocus();
	}

	@Override
	public void keyPressed(KeyEvent k) {
		if(k.getKeyCode() == KeyEvent.VK_UP) {
			move(0);
		} else if(k.getKeyCode() == KeyEvent.VK_DOWN) {
			move(1);
		} else if(k.getKeyCode() == KeyEvent.VK_LEFT) {
			move(2);
		} else if(k.getKeyCode() == KeyEvent.VK_RIGHT) {
			move(3);
		}
		
	}

	private void move(int elec) {
		boolean semaforo = false;
		for (int i = 0; i < this.modelo.getTablero().length && !semaforo; i++) {
			for (int j = 0; j < this.modelo.getTablero()[i].length && !semaforo; j++) {
				if (this.modelo.getTablero()[i][j].getPer() != null) {
					try {
						switch (elec) {
						case 0:
							this.modelo.getTablero()[i][j].setPer(null);
							this.modelo.getTablero()[i-1][j].setPer(new Personaje());
							break;
						case 1:
							this.modelo.getTablero()[i][j].setPer(null);
							this.modelo.getTablero()[i+1][j].setPer(new Personaje());
							break;
						case 2:
							this.modelo.getTablero()[i][j].setPer(null);
							this.modelo.getTablero()[i][j-1].setPer(new Personaje());
							break;
						case 3:
							this.modelo.getTablero()[i][j].setPer(null);
							this.modelo.getTablero()[i][j+1].setPer(new Personaje());
							break;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						this.modelo.getTablero()[i][j].setPer(new Personaje());
					}
					semaforo = true;
				}
			}
		}
		this.ventana.pintar(modelo.getTablero());
		this.ventana.revalidate();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
	
}
