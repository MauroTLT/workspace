package ampliacionT8;

public abstract class Empleado extends Persona{
	protected int incorporacion;
	protected double salario;

	public Empleado(String nombre, String apellidos, String dni, String estadoCivil, int incorporacion, double salario) {
		super(nombre, apellidos, dni, estadoCivil);
		this.incorporacion = incorporacion;
		this.salario = salario;
		salario();
	}
	
	public abstract void salario();

	public int getIncorporacion() {
		return incorporacion;
	}

	public void setIncorporacion(int incorporacion) {
		this.incorporacion = incorporacion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
