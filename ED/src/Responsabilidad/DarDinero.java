package Responsabilidad;

public class DarDinero extends Manejador {
	@Override
	public void manejarPeticion(Peticion peticion) {
		System.out.println("Pasamos a darle " + "sus " + peticion.getValue() + " euros");
		if (sucesor != null)
			sucesor.manejarPeticion(peticion);

	}
}