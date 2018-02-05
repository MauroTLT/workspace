package FireEmblem;

public class Arma {
	private String nombre;
	private Arma ventaja;
	private Arma desventaja;
	
	public Arma() {
		
	}
	
	public Arma(String nombre) {
		this.nombre = nombre;
	}
	
	public Arma(String nombre, Arma ventaja, Arma desventaja) {
		this.nombre = nombre;
		this.ventaja = ventaja;
		this.desventaja = desventaja;
	}
	
	public void visualizar() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Ventaja sobre: " + this.ventaja.getNombre());
		System.out.println("Desventaja ante: " + this.desventaja.getNombre());
		System.out.println();
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getVentaja() {
		return ventaja;
	}

	public void setVentaja(Arma ventaja) {
		this.ventaja = ventaja;
	}

	public Arma getDesventaja() {
		return desventaja;
	}

	public void setDesventaja(Arma desventaja) {
		this.desventaja = desventaja;
	}
}
