package unidad7.practica2;

public class Persona {
	private String dni;
	private String nombre;
	private int edad;

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
