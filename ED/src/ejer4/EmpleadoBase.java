package ejer4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class EmpleadoBase {
	public void add(EmpleadoBase empleado) {
	}

	public EmpleadoBase getChild(int i) {
		return null;
	}

	public void remove(EmpleadoBase empleado) {
	}

	public abstract void print();
}

class Comercial extends EmpleadoBase {
	// NO SOBREESCRIBIREMOS LOS METODOS DE add,getChild y remove porque es un
	// elemento HOJA
	private String nombre;

	public Comercial(String nombre) {
		this.nombre = nombre;
	}

	public void print() {
		System.out.println("Nombre = " + this.nombre);
		System.out.println("");
	}
}

class Directivo extends EmpleadoBase {
	private String nombre;
	private String puesto;
	List<EmpleadoBase> empleados = new ArrayList<EmpleadoBase>();

	public Directivo(String nombre, String puesto) {
		this.nombre = nombre;
		this.puesto = puesto;
	}

	public void add(EmpleadoBase empleado) {
		empleados.add(empleado);
	}

	public EmpleadoBase getChild(int i) {
		return empleados.get(i);
	}

	public void print() {
		System.out.println("");
		System.out.println("Nombre = " + this.nombre);
		System.out.println("Puesto = " + this.puesto);
		System.out.println("Empleados a su cargo:");
		Iterator<EmpleadoBase> empleadosIterator = empleados.iterator();
		while (empleadosIterator.hasNext()) {
			EmpleadoBase empleado = empleadosIterator.next();
			empleado.print();
		}
	}

	public void remove(EmpleadoBase empleado) {
		empleados.remove(empleado);
	}
}