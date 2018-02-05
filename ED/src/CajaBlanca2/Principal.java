package CajaBlanca2;

public class Principal {
	public static void main(String[] args) {
		String cadena = "La lluvia en Sevilla es una maravilla";
		Contador c1 = new Contador();
		System.out.println("Hay " + c1.carac(cadena) + " vocales");
	}
}