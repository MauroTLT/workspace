package Ejemplo;

public abstract class Instrumento {
	protected String tipo;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public abstract void tocar();
}
