package ejer2;

public class ComprobarLongitud extends Comprobador {

	@Override
	public void comprobar(String texto) {
		if (texto.length() > 5) {
			System.out.println("La cadena " + texto + "  tiene más 5 caracteres");
		} else {
			if (sucesor != null) {
				sucesor.comprobar(texto);
			}
		}
	}
}
