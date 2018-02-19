package ejercicio2;
/**
 * 
 * @author Mauro Pérez 1DAM MAÑANA
 *
 */
public class Rectangulo extends Forma {
	private double ladoMenor;
	private double ladoMayor;
	
	public Rectangulo() {
		super();
	}
	
	public Rectangulo(String color, Punto coordenadas, String nombre, double ladoMenor, double ladoMayor) {
		super(color, coordenadas, nombre);
		this.ladoMenor = ladoMenor;
		this.ladoMayor = ladoMayor;
	}
	
	public Rectangulo(Rectangulo rect) {
		this(rect.color, rect.coordenadas, rect.nombre, rect.ladoMenor, rect.ladoMayor);
	}

	@Override
	public double calcularAreaFigura() {
		return (this.ladoMenor * this.ladoMayor);
	}

	@Override
	public void escalarFigura(double escala) {
		this.ladoMayor *= escala;
		this.ladoMenor *= escala;
	}

	@Override
	public String toString() {
		return super.toString() + "Rectangulo [ladoMenor=" + ladoMenor + ", ladoMayor=" + ladoMayor + "]";
	}

	public double getLadoMenor() {
		return ladoMenor;
	}

	public void setLadoMenor(double ladoMenor) {
		this.ladoMenor = ladoMenor;
	}

	public double getLadoMayor() {
		return ladoMayor;
	}

	public void setLadoMayor(double ladoMayor) {
		this.ladoMayor = ladoMayor;
	}

}
