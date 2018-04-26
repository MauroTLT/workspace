package Model;

import java.util.ArrayList;

import Controller.FicheroController;

public class ListaModel {
	ArrayList<String> lista;
	
	public ListaModel(FicheroController fichero) {
		lista = new ArrayList<String>();
	}

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}

}
