package ejer1;
/**
 * @author Mauro Pérez Moliner 1ºDAM-B Mati
 */
public class Paypal implements Estrategia {

	@Override
	public void pagar() {
		System.out.println("Pagando con PayPal...");
	}

}
