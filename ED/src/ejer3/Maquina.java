package ejer3;

public class Maquina {
	
	private Estrategia estrategia;

	public void saludar() {
		estrategia.saludar();
	}

	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}

}
