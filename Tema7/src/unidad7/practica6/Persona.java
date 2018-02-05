package unidad7.practica6;

public class Persona {
	private String dni;
	private String nombre;
	private int edad;
	
	public Persona() {
		this.dni = "11122233";
		this.nombre = "Mauro";
		this.edad = 18;
	}
	public Persona(String sDni, String sNombre, int nEdad) {
		dni = sDni;
		nombre = sNombre;
		if (nEdad >= 0 && nEdad <= 150) {
			edad = nEdad;
		}
	}
	
	public void setDni(String nuevoDni) {
		dni=nuevoDni;
	}

	public void setNombre(String nuevoNombre) {
		nombre=nuevoNombre;
	}

	public void setEdad(int nuevaEdad) {
		edad=nuevaEdad;
	}
	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public void visualizar() {
		System.out.println(dni);
		System.out.println(nombre);
		System.out.println(edad);
	}
}
