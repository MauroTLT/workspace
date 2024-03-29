package ejer1;

public abstract class Operacion {
	double resultado = 0;
	String operacion = "";

	public final void realizaOperacion(double a, double b) {
		muestraOperacion(a, b);
		if (operacion.equals("+")) {
			calculaSuma(a, b);
		} else if(operacion.equals("-")) {
			calculaResta(a, b);
		}
		muestraResultado();
	}

	private void muestraOperacion(double a, double b) {
		LoggingSingleton.getInstance().log("Operacion :" + a + operacion + b);
	}

	private void muestraResultado() {
		LoggingSingleton.getInstance().log("El resultado es " + resultado);
	}

	protected abstract void calculaSuma(double a, double b);

	protected abstract void calculaResta(double a, double b);
}