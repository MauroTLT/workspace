package ampliacionT8;

import java.util.ArrayList;

public class CentroDocente {
	private ArrayList <Persona> personas;

	public CentroDocente() {
		this.setPersonas(new ArrayList <Persona>());
	}
	
	public void darAlta(Persona persona) {
		boolean semaforo = false;
		for(Persona i : personas) {
			if(i.getDni().equals(persona.getDni())) {
				System.out.println("Persona ya en la lista (DNI's identicos)");
				semaforo = true;
			} else if(personas.indexOf(i) == (personas.size() - 1) && !semaforo) {
				this.personas.add(persona);
			}
		}
		if(personas.isEmpty()) {
			this.personas.add(persona);
		}
	}
	
	public void darBaja(String dni) {
		boolean semaforo = false;
		for(int i = 0; i < personas.size() && !semaforo; i++) {
			if(personas.get(i).getDni().equals(dni)) {
				personas.remove(personas.get(i));
				semaforo = true;
			} else if(i == (personas.size() - 1) && !semaforo) {
				System.out.println("Persona no encontrada");
			}
		}
		/*for(Persona i : personas) {
			if(i.getDni().equals(dni)) {
				personas.remove(i);
				semaforo = true;
			} else if(personas.indexOf(i) == (personas.size() - 1) && !semaforo) {
				System.out.println("Persona no encontrada");
			}
		}*/
	}
	
	public void visualizar() {
		int cont = 1;
		for(Persona i : personas) {
			System.out.println("\nPersona " + cont + "\n" + i.toString());
			cont++;
		}
	}
	
	public void visualizarSalario() {
		boolean semaforo = false;
		int cont = 1;
		for(Persona i : personas) {
			if(i instanceof Empleado) {
				System.out.println("\nPersona " + cont + "\n" + "Nombre: " + i.getNombre() + ", Apellido: " + i.getApellidos()+ ", Salario: " + ((Empleado) i).getSalario());
				semaforo = true;
				cont++;
			} else if(personas.indexOf(i) == (personas.size() - 1) && !semaforo) {
				System.out.println("No hay personas con salario que mostrar");
			}
		}
	}

	public ArrayList <Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList <Persona> personas) {
		this.personas = personas;
	}
	
	
}
