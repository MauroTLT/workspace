package unidad8.practica4;

public class Secretario extends Empleado {
	private boolean despacho;
	private String fax;
	
	public Secretario(String nombre, String apellido, String dni, String direccion, int telefono, int salario, boolean despacho, String fax) {
		super(nombre, apellido, dni, direccion, telefono, salario);
		this.despacho = despacho;
		this.fax = fax;
	}

	public void incrementarSalario() {
		this.salario += (salario * 0.05);
	}

	public String toString() {
		return "Secretario [despacho=" + despacho + ", fax=" + fax + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", dni=" + dni + ", direccion=" + direccion + ", telefono=" + telefono + ", salario=" + salario + "]";
	}

	public boolean getDespacho() {
		return despacho;
	}

	public void setDespacho(boolean despacho) {
		this.despacho = despacho;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	
}
