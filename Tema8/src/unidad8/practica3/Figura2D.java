package unidad8.practica3;

public abstract class Figura2D extends Figura{
	protected int relleno;
	
	public Figura2D(int color, int relleno) {
		super(color);
		this.relleno = relleno;
	}

	public int getRelleno() {
		return relleno;
	}

	public void setRelleno(int relleno) {
		this.relleno = relleno;
	}

}
