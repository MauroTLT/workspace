package unidad8.practica2;

import java.util.ArrayList;

public class Coche {
	private String matricula;
	private String direccionDueño;
	private ArrayList <Reparacion> lista;
	
	public Coche(String matricula, String direccionDueño) {
		this.matricula = matricula;
		this.direccionDueño = direccionDueño;
		lista = new ArrayList<Reparacion>();
	}
	
	public void añadeReparacion(Reparacion reparacion) {
		boolean semaforo = false;
		for(int i = 0; i < lista.size() && !semaforo; i++) {
			if((lista.get(i).getKms() > reparacion.getKms())) {
				System.out.println("Kms Incorrectos");
				semaforo = true;
			} else if(i == lista.size() - 1 && !semaforo) {
				lista.add(reparacion);
				semaforo = true;
			}
		}
		if(lista.size() == 0) {
			lista.add(reparacion);
		}
	}
	
	public void buscaReparaciones(String descripcion) {
		boolean semaforo = false;
		for(int i = 0; i < lista.size(); i++){
			if(lista.get(i).getDescripcion().contains(descripcion)){
				lista.get(i).visualizar();
				semaforo = true;
			} else if(i == lista.size() - 1 && !semaforo){
				System.out.println("No existen reparaciones de ese tipo");
			}
		}
		if(lista.size() == 0) {
			System.out.println("No hay reparaciones");
			semaforo = true;
		}
		
	}
	
	public Reparacion ultimaReparacion(){
		if(lista.isEmpty()) {
			System.out.println("No hay reparaciones");
			return null;
		} else {return lista.get(lista.size() - 1);}
		
	}
	
	public void visualizar(){
		System.out.println("\nMatricula: " + this.matricula + "\n" + "Direccion del Dueño: " + this.direccionDueño + "\n");
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDireccionDueño() {
		return direccionDueño;
	}

	public void setDireccionDueño(String direccionDueño) {
		this.direccionDueño = direccionDueño;
	}

	public ArrayList <Reparacion> getLista() {
		return lista;
	}

	public void setLista(ArrayList <Reparacion> lista) {
		this.lista = lista;
	}
	
}
