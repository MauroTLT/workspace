package ejercicio2;
/**
 * 
 * @author Mauro Pérez 1DAM MAÑANA
 *
 */
public class Elipse extends Forma{
	private double radioMayor;
	private double radioMenor;
	
	public Elipse() {
		super();
	}
	
	public Elipse(String color, Punto coordenadas, String nombre, double radioMayor, double radioMenor) {
		super(color, coordenadas, nombre);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}
	
	public Elipse(Elipse elip) {
		this(elip.color, elip.coordenadas, elip.nombre, elip.radioMayor, elip.radioMayor);
	}

	@Override
	public double calcularAreaFigura() {
		return (Math.PI * this.radioMayor * this.radioMenor);
	}

	@Override
	public void escalarFigura(double escala) {
		this.radioMayor *= escala;
		this.radioMenor *= escala;
	}

	@Override
	public String toString() {
		return super.toString() + "Elipse [radioMayor=" + radioMayor + ", radioMenor=" + radioMenor + "]";
	}

	public double getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(double radioMayor) {
		this.radioMayor = radioMayor;
	}

	public double getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(double radioMenor) {
		this.radioMenor = radioMenor;
	}

}
