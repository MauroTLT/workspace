package unidad8.practica4;

import java.util.ArrayList;

public class Vendedor extends Empleado{
	private int movil;
	private String areaVenta;
	private ArrayList <Clientes> listaClientes;
	private Coche coche;
	private double porcentaje;
	
	public Vendedor(String nombre, String apellido, String dni, String direccion, int telefono, int salario, int movil, String areaVenta, double porcentaje) {
		super(nombre, apellido, dni, direccion, telefono, salario);
		this.movil = movil;
		this.areaVenta = areaVenta;
		this.porcentaje = porcentaje;
		listaClientes = new ArrayList<Clientes>();
	}
	
	public void agregarCliente(Clientes cliente) {
		listaClientes.add(cliente);
	}
	
	public void eliminarCliente(Clientes cliente) {
		listaClientes.remove(cliente);
	}

	public void incrementarSalario() {
		this.salario += (salario * 0.10);
	}
	
	public String toString() {
		return "Vendedor [movil=" + movil + ", areaVenta=" + areaVenta + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", dni=" + dni + ", direccion=" + direccion + ", telefono=" + telefono + ", salario=" + salario + "]";
	}

	public int getMovil() {
		return movil;
	}

	public void setMovil(int movil) {
		this.movil = movil;
	}

	public String getAreaVenta() {
		return areaVenta;
	}

	public void setAreaVenta(String areaVenta) {
		this.areaVenta = areaVenta;
	}

	public ArrayList<Clientes> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Clientes> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
}
