package unidad8.practica2;

public class Reparacion {
	private String descripcion;
	private int kms;
	
	public Reparacion(String descripcion, int kms) {
		this.descripcion = descripcion;
		this.kms = kms;
	}
	
	public void visualizar(){
		System.out.println("\nDescripcion de la averia: " + this.descripcion + "\n" + "Kilometraje: " + this.kms + "\n");
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}
	
	
}
