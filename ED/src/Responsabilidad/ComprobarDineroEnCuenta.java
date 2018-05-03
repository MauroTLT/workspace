package Responsabilidad;

public class ComprobarDineroEnCuenta extends Manejador {
	@Override
	public void manejarPeticion(Peticion peticion) {
		int saldoExistente = 100;
		// Tenemos 100 euros disponibles
		if (peticion.getValue() > saldoExistente) {
			System.out.println("Su peticion no puede procesarse " + "por solicitar " + "al banco " + peticion.getValue()
					+ " euros " + "cuando su saldo actual" + " es de " + saldoExistente + " euros");
		} else {
			if (sucesor != null)
				sucesor.manejarPeticion(peticion);
		}
	}
}