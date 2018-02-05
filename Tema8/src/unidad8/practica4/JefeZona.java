package unidad8.practica4;

import java.util.ArrayList;

public class JefeZona extends Empleado{
	private boolean despacho;
	private Secretario secretario;
	private ArrayList <Vendedor> listaVendedores;
	private Coche coche;
	
	public JefeZona(String nombre, String apellido, String dni, String direccion, int telefono, int salario,
			boolean despacho) {
		super(nombre, apellido, dni, direccion, telefono, salario);
		this.despacho = despacho;
		listaVendedores = new ArrayList<Vendedor>();
	}
	
	public void incrementarSalario() {
		this.salario += (salario * 0.20);
	}
	
	public void agregarVendedor(Vendedor vendedor) {
		listaVendedores.add(vendedor);
	}
	
	public void eliminarVendedor(Vendedor vendedor) {
		listaVendedores.remove(vendedor);
	}

	public boolean isDespacho() {
		return despacho;
	}

	public void setDespacho(boolean despacho) {
		this.despacho = despacho;
	}

	public Secretario getSecretario() {
		return secretario;
	}

	public void setSecretario(Secretario secretario) {
		this.secretario = secretario;
	}

	public ArrayList<Vendedor> getListaVendedores() {
		return listaVendedores;
	}

	public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
		this.listaVendedores = listaVendedores;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	
}
