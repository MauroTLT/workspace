package Models;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */

public abstract class CasillaModel {
	
	private String tipo;
	
	public CasillaModel(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
