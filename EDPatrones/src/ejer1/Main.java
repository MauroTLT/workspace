package ejer1;
/**
 * @author Mauro Pérez Moliner 1ºDAM-B Mati
 */
public class Main {
	public static void main(String args[]) {
		Pasarela pasarela = new Pasarela();
		pasarela.setEstrategia(new Paypal());
		pasarela.pagar();
		pasarela.setEstrategia(new Tarjeta());
		pasarela.pagar();
		pasarela.setEstrategia(new BitCoin());
		pasarela.pagar();
	}
}