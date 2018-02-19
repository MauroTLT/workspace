package ejercicio2;
/**
 * 
 * @author Mauro Pérez 1DAM MAÑANA
 *
 */
public abstract class Forma {
	protected String color;
	protected Punto coordenadas;
	protected String nombre;
	
	public Forma() {
		
	}
	
	public Forma(String color, Punto coordenadas, String nombre) {
		this.color = color;
		this.coordenadas = coordenadas;
		this.nombre = nombre;
	}
	
	public Forma(Forma forma) {
		this(forma.color, forma.coordenadas, forma.nombre);
	}
	
	public abstract double calcularAreaFigura();
	
	public abstract void escalarFigura(double escala);

	@Override
	public String toString() {
		return "Forma [color=" + color + ", coordenadas=" + coordenadas.toString() + ", nombre=" + nombre + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Punto getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(Punto coordenadas) {
		this.coordenadas = coordenadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
