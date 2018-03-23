package Models;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */

public class Punto {
	
	private static int punto = 0;

	public static int getPunto() {
		return punto;
	}

	public static void setPunto(int punto) {
		Punto.punto = punto;
	}

}
