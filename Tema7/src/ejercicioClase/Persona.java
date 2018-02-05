package ejercicioClase;

public class Persona {
	private String dni;
	private String nombre;
	private int edad;
	
	public Persona() {
		
	}
	public Persona(String sDni, String sNombre, int nEdad) {
		this.dni = sDni;
		this.nombre = sNombre;
		if (nEdad >= 0 && nEdad <= 150) {
			this.edad = nEdad;
		}
	}
	public Persona(int nEdad, String sDni, String sNombre) {
		this.dni = sDni;
		this.nombre = sNombre;
		if (nEdad >= 0 && nEdad <= 150) {
			this.edad = nEdad;
		}
	}
	public Persona(String sDni, int nEdad, String sNombre) {
		this.dni = sDni;
		this.nombre = sNombre;
		if (nEdad >= 0 && nEdad <= 150) {
			this.edad = nEdad;
		}
	}
	public Persona clonar(Persona p2, Persona p3) {
		return new Persona(this, p2, p3);
	}
	public Persona(Persona p1, Persona p2, Persona p3){
		this(p1.dni, p2.nombre, p3.edad);
	}
	public void visualizar() {
		System.out.println(this.dni);
		System.out.println(this.nombre);
		System.out.println(this.edad);
		System.out.println();
	}
}
