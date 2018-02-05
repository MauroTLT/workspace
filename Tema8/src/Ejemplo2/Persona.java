package Ejemplo2;

public class Persona {
	protected String dni;
	protected String nombre;
	protected int edad;
	
	public Persona() {

	}
	
	public Persona(String sDni, String sNombre, int nEdad) {
		this.dni = sDni;
		this.nombre = sNombre;
		if (nEdad >= 0 && nEdad <= 150) {
			this.edad = nEdad;
		}
	}
	public Persona(Persona p){
		this(p.dni, p.nombre, p.edad);
	}
	
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	public void visualizar() {
		System.out.println(this.dni);
		System.out.println(this.nombre);
		System.out.println(this.edad);
	}
	
	public boolean equals(Alumno a){
		if(a == this){return true;}
		if(a == null){return false;}
		if(a.getClass() != this.getClass()){return false;}
		return dni.equals(((Persona)a).dni);
	}
	
	public void setDni(String nuevoDni) {
		this.dni=nuevoDni;
	}

	public void setNombre(String nuevoNombre) {
		this.nombre=nuevoNombre;
	}

	public void setEdad(int nuevaEdad) {
		this.edad=nuevaEdad;
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
}
