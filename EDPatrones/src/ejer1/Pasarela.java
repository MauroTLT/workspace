package ejer1;
/**
 * @author Mauro Pérez Moliner 1ºDAM-B Mati
 */
public class Pasarela {
	
	private Estrategia estrategia;
	
	public void pagar() {
		if (this.estrategia != null) {
			this.estrategia.pagar();
		}
	}

	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}

}
