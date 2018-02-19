package ejercicio2;
/**
 * 
 * @author Mauro Pérez 1DAM MAÑANA
 *
 */
public class Punto {
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punto(Punto punto){
		this(punto.x, punto.y);
	}
	
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
