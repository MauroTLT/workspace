package ejer1;

public class Main {
	public static void main(String[] args) {
		double a = 7;
		double b = 4;
		String operacion = "-";
		LoggingSingleton.getInstance().log("Se usa calculadora " + "para hacer: " + a + " " + operacion + " " + b);
		FachadaCalculadoraOps calc = new FachadaCalculadoraOps(a, b, operacion);
		calc.operacion();
	}
}