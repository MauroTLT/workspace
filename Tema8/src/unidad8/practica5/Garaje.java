package unidad8.practica5;

import java.util.ArrayList;

public class Garaje {
	private ArrayList <Coche> lista;
	
	public Garaje() {
		lista = new ArrayList<Coche>();
	}

	public void añadeCoche(Coche coche){
		for(int i = 0; i < lista.size(); i++) {
			try{
				if(lista.get(i).getMatricula().equals(coche.getMatricula())) {
					throw new Excepciones(1);
				} else if(i == lista.size() - 1) {
					lista.add(coche);
				}
			} catch(Excepciones e) {
				System.out.println(e.toString());
			}
		}
		if(lista.size() == 0) {
			lista.add(coche);
		}
	}
	
	public Coche buscaCoche(String matricula) {
		for(int i = 0; i < lista.size(); i++) {
			try{
				if(lista.get(i).getMatricula().equals(matricula)) {
					return lista.get(i);
				} else if(i == lista.size() - 1) {
					throw new Excepciones(2);
				}
			} catch(Excepciones e) {
				System.out.println(e.toString());
			}
		}
		try{
			if(lista.size() == 0) {
				throw new Excepciones(3);
			}
		} catch(Excepciones e) {
			System.out.println(e.toString());
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