package ejercicioClase3;

public class Telefono {
	private int movil, fijo;
	
	public Telefono(){
		
	}
	
	public Telefono(int movil, int fijo){
		this.movil = movil;
		this.fijo = fijo;
	}

	public int getMovil() {
		return movil;
	}

	public void setMovil(int movil) {
		this.movil = movil;
	}

	public int getFijo() {
		return fijo;
	}

	public void setFijo(int fijo) {
		this.fijo = fijo;
	}
}
