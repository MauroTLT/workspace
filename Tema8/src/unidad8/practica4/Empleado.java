package unidad8.practica4;

public abstract class Empleado {
	protected String nombre;
	protected String apellido;
	protected String dni;
	protected String direccion;
	protected int antiguedad;
	protected int telefono;
	protected int salario;
	protected Empleado supervisor;
	
	public Empleado(String nombre, String apellido, String dni, String direccion, int telefono, int salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.salario = salario;
	}

	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion
				+ ", antiguedad=" + antiguedad + ", telefono=" + telefono + ", salario=" + salario + "]";
	}
	
	public abstract void incrementarSalario();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Empleado getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Empleado supervisor) {
		this.supervisor = supervisor;
	}
	
}
