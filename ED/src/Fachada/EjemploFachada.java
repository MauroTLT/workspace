package Fachada;

public class EjemploFachada {
	public static void main(String[] args) {
		int a = 7;
		int b = 4;
		String operacion = "-";
		System.out.println("Se usa calculadora " + "para hacer: " + a + " " + operacion + " " + b);
		FachadaCalculadora calc = new FachadaCalculadora(a, b, operacion);
		System.out.println("Resultado de la operacion: " + calc.operacion());
	}
}
