package ejer2;
/**
 * @author Mauro Pérez Moliner 1ºDAM-B Mati
 */
public class Main {
	public static void main(String[] args) {
		Comprobador m1 = new ComprobarEjecutivo();
		Comprobador m2 = new ComprobarLider();
		Comprobador m3 = new ComprobarGerente();
		Comprobador m4 = new ComprobarDirector();
		m1.setSucesor(m2);
		m2.setSucesor(m3);
		m3.setSucesor(m4);
		m1.comprobar(10000);
		m1.comprobar(23000);
		m1.comprobar(79000);
	}
}