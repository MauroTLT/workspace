package unidad8.practica2;

import java.util.ArrayList;

public class Garaje {
	private ArrayList <Coche> lista;
	
	public Garaje() {
		lista = new ArrayList<Coche>();
	}

	public void añadeCoche(Coche coche){
		boolean semaforo = false;
		if(lista.size() == 0) {
			lista.add(coche);
			semaforo = true;
		}
		for(int i = 0; i < lista.size() && !semaforo; i++) {
			if(lista.get(i).getMatricula().equals(coche.getMatricula())) {
				System.out.println("Matricula Duplicada");
				semaforo = true;
			} else if(i == lista.size() - 1 && !semaforo) {
				lista.add(coche);
				semaforo = true;
			}
		}
	}
	
	public Coche buscaCoche(String matricula) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getMatricula().equals(matricula)) {
				return lista.get(i);
			} else if(i == lista.size() - 1) {
				System.out.println("Matricula no encontrada");
			}
		}
		if(lista.size() == 0) {
			System.out.println("No hay coches registrados");
		}
		return null;
	}

	public ArrayList<Coche> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Coche> lista) {
		this.lista = lista;
	}
}