package ejer2;

public abstract class Comprobador {
	protected Comprobador sucesor;

	public void setSucesor(Comprobador sucesor) {
		this.sucesor = sucesor;
	}

	public abstract void comprobar(String texto);
}
