package ejer1;
/**
 * @author Mauro Pérez Moliner 1ºDAM-B Mati
 */
public class Tarjeta implements Estrategia {

	@Override
	public void pagar() {
		System.out.println("Pagando con Tarjeta...");
	}

}