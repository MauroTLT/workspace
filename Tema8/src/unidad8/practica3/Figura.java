package unidad8.practica3;

public abstract class Figura {
	protected int colorBorde;
	protected static int cont;

	public Figura(int colorBorde) {
		this.colorBorde = colorBorde;
		cont++;
	}

	public int getColorBorde() {
		return colorBorde;
	}

	public void setColorBorde(int colorBorde) {
		this.colorBorde = colorBorde;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Figura.cont = cont;
	}
	
	public abstract void dibujar();
}
