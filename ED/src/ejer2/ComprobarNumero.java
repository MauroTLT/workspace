package ejer2;

public class ComprobarNumero extends Comprobador {

	@Override
	public void comprobar(String texto) {
		try {
			Integer.parseInt(texto);
			System.out.println("La cadena " + texto + " es un numero");
		} catch (Exception e) {
			System.out.println("La cadena " + texto + " NO es un numero");
		}
		if (sucesor != null) {
			sucesor.comprobar(texto);
		}
	}

}
