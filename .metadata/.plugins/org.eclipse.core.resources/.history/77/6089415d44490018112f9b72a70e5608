package Model;

import java.util.ArrayList;

import Controller.FicheroController;

public class ListaModel {
	ArrayList<String> lista;
	
	public ListaModel(FicheroController fichero) {
		lista = new ArrayList<String>();
		for(int i = 0; i < lista.size(); i++) {
			this.lista.add(fichero.leer());
		}
	}

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}

}
