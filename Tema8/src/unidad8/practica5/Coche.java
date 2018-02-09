package unidad8.practica5;

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
			try{
				if((lista.get(i).getKms() > reparacion.getKms())) {
					throw new ExcepcionesKms(lista.get(i).getKms());
				} else if(i == lista.size() - 1 && !semaforo) {
					lista.add(reparacion);
					semaforo = true;
				}
			} catch(ExcepcionesKms e) {
				System.out.println(e.toString());
			}
			
		}
		if(lista.size() == 0) {
			lista.add(reparacion);
		}
	}
	
	public ArrayList <Reparacion> buscaReparaciones(String descripcion) {
		ArrayList <Reparacion> reparaciones = new ArrayList<Reparacion>();
		boolean semaforo = false;
		try{
			if(lista.size() == 0) {
				throw new Excepciones(3);
			}
		} catch(Excepciones e) {
			System.out.println(e.toString());
		}
		for(Reparacion i : lista){
			try{
				if(i.getDescripcion().contains(descripcion)){
					reparaciones.add(i);
					semaforo = true;
				} else if(lista.indexOf(i) == lista.size() - 1 && !semaforo) {
					throw new Excepciones(4);
				}
			} catch(Excepciones e) {
				System.out.println(e.toString());
			}
			
		}
		return reparaciones;
	}
	
	public Reparacion ultimaReparacion(){
		try{
			if(lista.isEmpty()) {
				throw new Excepciones(3);
			} else {return lista.get(lista.size() - 1);}
		} catch(Excepciones e) {
			System.out.println(e.toString());
		}
		return null;
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
