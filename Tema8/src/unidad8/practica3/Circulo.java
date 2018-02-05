package unidad8.practica3;

public class Circulo extends Figura2D{
	private int radio;
	private double pi;
	
	public Circulo(int color, int relleno, int radio) {
		super(color, relleno);
		this.radio = radio;
		this.pi = 3.1416;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(int pi) {
		this.pi = pi;
	}
	
	public void dibujar() {
		System.out.println("Dibujando Circulo");
	}
	
}
