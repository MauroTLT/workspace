package Responsabilidad;

public abstract class Manejador {
	protected Manejador sucesor;

	public void setSucesor(Manejador sucesor) {
		this.sucesor = sucesor;
	}

	public abstract void manejarPeticion(Peticion peticion);
}