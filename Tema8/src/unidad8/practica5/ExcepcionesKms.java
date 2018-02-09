package unidad8.practica5;

@SuppressWarnings("serial")
public class ExcepcionesKms extends Exception {
	private String mensaje;
	private int kmsAntes;
	
	public ExcepcionesKms(int kms){
		this.kmsAntes = kms;
	}
	public String toString() {
		mensaje = "Kilometraje menor a " + kmsAntes;
		return "Error del tipo: " + mensaje;
	}
}