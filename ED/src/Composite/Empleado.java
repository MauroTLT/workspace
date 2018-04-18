package Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class Empleado {
	public void add(Empleado empleado) {
	}

	public Empleado getChild(int i) {
		return null;
	}

	public void remove(Empleado empleado) {
	}

	public abstract void print();
}

class Developer extends Empleado {
	// NO SOBREESCRIBIREMOS LOS METODOS DE add,getChild y remove porque es un
	// elemento HOJA
	private String nombre;
	private double salario;

	public Developer(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}

	public void print() {
		System.out.println("Nombre = " + this.nombre);
		System.out.println("Salario = " + this.salario);
		System.out.println("");
	}
}

class Manager extends Empleado {
	private String nombre;
	private double salario;
	List<Empleado> empleados = new ArrayList<Empleado>();

	public Manager(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}

	public void add(Empleado empleado) {
		empleados.add(empleado);
	}

	public Empleado getChild(int i) {
		return empleados.get(i);
	}

	public void print() {
		System.out.println("");
		System.out.println("Nombre = " + this.nombre);
		System.out.println("Salario = " + this.salario);
		System.out.println("Empleados a su cargo:");
		Iterator<Empleado> empleadosIterator = empleados.iterator();
		while (empleadosIterator.hasNext()) {
			Empleado empleado = empleadosIterator.next();
			empleado.print();
		}
	}

	public void remove(Empleado empleado) {
		empleados.remove(empleado);
	}
}