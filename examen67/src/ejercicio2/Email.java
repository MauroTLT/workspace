package ejercicio2;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */
public class Email {
	private String direccion;
	private boolean validado;
	
	public Email(){
		this.validado = false;
	}
	
	public Email(String direccion, boolean validado) {
		this.direccion = direccion;
		this.validado = validado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isValidado() {
		return validado;
	}

	public void setValidado(boolean validado) {
		this.validado = validado;
	}
	
	
}
