package ejer1;

public class FachadaCalculadoraOps extends Operacion {
	
	private double a,b;
	
	public FachadaCalculadoraOps(double a, double b, String operacion) {
		this.a = a;
		this.b = b;
		this.operacion = operacion;
	}

	public void operacion() {
		this.realizaOperacion(a, b);
	}
	
	@Override
	protected void calcula(double a, double b) {
		if(operacion.equals("-")) {
			this.resultado = a-b;
		} else {
			this.resultado = a+b;
		}
	}

}
