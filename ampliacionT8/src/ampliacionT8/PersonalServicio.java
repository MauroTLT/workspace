package ampliacionT8;

public class PersonalServicio extends Empleado{
	private String seccion;

	public PersonalServicio(String nombre, String apellidos, String dni, String estadoCivil, int incorporacion, double salario, String seccion) {
		super(nombre, apellidos, dni, estadoCivil, incorporacion, salario);
		this.seccion = seccion;
	}
	
	public void salario() {
		if(this.estadoCivil.equalsIgnoreCase("Casado") || this.estadoCivil.equalsIgnoreCase("Casada")) {
			this.salario += (salario * 0.05);
		}
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String toString() {
		return "PersonalServicio [seccion=" + seccion + ", incorporacion=" + incorporacion + ", salario=" + salario + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", dni=" + dni + ", estadoCivil=" + estadoCivil + "]";
	}

}
