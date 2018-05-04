package Ejercicio1;

import java.util.ArrayList;

public class CensoModel {

	private static ArrayList<Persona> personas;
	
	public CensoModel() {
		CensoModel.personas = new ArrayList<Persona>();
	}

	public static ArrayList<Persona> getPersonas() {
		return personas;
	}

	public static void setPersonas(ArrayList<Persona> personas) {
		CensoModel.personas = personas;
	}

}
