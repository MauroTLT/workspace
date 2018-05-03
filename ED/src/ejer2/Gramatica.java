package ejer2;

public class Gramatica {
	public static void main(String[] args) {
		Comprobador m1 = new ComprobarLongitud();
		Comprobador m2 = new ComprobarInicial();
		Comprobador m3 = new ComprobarNumero();
		m1.setSucesor(m2);
		m2.setSucesor(m3);
		m1.comprobar("prueba");
		m1.comprobar("EjemploEjercicio");
		m1.comprobar("1234");
	}
}
