package Responsabilidad;

public class ComprobarPeticion extends Manejador {
	@Override
	public void manejarPeticion(Peticion peticion) {

		if (peticion.getValue() == 0) {
			System.out.println("Su peticion no puede " + "procesarse por solicitar al banco 0 €");
		} else if (peticion.getValue() < 0) {
			System.out.println("Su peticion no puede " + "procesarse por solicitar " + "al banco " + peticion.getValue()
					+ " euros");
		} else {
			if (sucesor != null) {
				sucesor.manejarPeticion(peticion);
			}
		}
	}
}