package unidad8.practica3;

public class Linea extends Figura{
	private int longitud;

	public Linea(int colorBorde, int longitud) {
		super(colorBorde);
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public void dibujar() {
		System.out.println("Dibujando Linea");
	}
}
