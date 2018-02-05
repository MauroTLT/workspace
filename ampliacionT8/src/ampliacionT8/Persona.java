package ampliacionT8;

public abstract class Persona {
	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected String estadoCivil;
	
	public Persona(String nombre, String apellidos, String dni, String estadoCivil) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.estadoCivil = estadoCivil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
}
