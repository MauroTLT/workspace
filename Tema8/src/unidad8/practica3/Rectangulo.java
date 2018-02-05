package unidad8.practica3;

public class Rectangulo extends Figura2D {
	private int ladoPequeno;
	private int ladoGrande;
	
	public Rectangulo(int color, int relleno, int ladoPequeno, int ladoGrande) {
		super(color, relleno);
		this.ladoPequeno = ladoPequeno;
		this.ladoGrande = ladoGrande;
	}

	public int getLadoPequeno() {
		return ladoPequeno;
	}

	public void setLadoPequeno(int ladoPequeno) {
		this.ladoPequeno = ladoPequeno;
	}

	public int getLadoGrande() {
		return ladoGrande;
	}

	public void setLadoGrande(int ladoGrande) {
		this.ladoGrande = ladoGrande;
	}

	public void dibujar() {
		System.out.println("Dibujando Rectangulo");
	}
}
