package ejer2;

public class ComprobarInicial extends Comprobador {

	@Override
	public void comprobar(String texto) {
		String _first = texto.substring(0, 1);
		if (_first.toUpperCase().equals(_first)) {
			System.out.println("La cadena " + texto + " empieza por mayúscula");
		} else {
			if (sucesor != null) {
				sucesor.comprobar(texto);
			}
		}
	}
}
