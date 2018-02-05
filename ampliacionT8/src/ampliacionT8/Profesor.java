package ampliacionT8;

public class Profesor extends Empleado {
	private String departamento;

	public Profesor(String nombre, String apellidos, String dni, String estadoCivil, int incorporacion, double salario, String departamento) {
		super(nombre, apellidos, dni, estadoCivil, incorporacion, salario);
		this.departamento = departamento;
	}
	
	public void salario() {
		if(this.incorporacion < 2000) {
			this.salario += (salario * 0.08);
		}
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String toString() {
		return "Profesor [departamento=" + departamento + ", incorporacion=" + incorporacion + ", salario=" + salario + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", dni=" + dni + ", estadoCivil=" + estadoCivil + "]";
	}

}
