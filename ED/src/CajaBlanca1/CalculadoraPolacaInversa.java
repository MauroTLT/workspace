package CajaBlanca1;

public class CalculadoraPolacaInversa {
	
	public Double calcular(double operando1, double operando2, String operacion){
		double resultado = 0.0;
		switch (operacion) {
		case "+":
			resultado = operando1 + operando2;
			break;
		case "-":
			resultado = operando1 - operando2;
			break;
		case "*":
			resultado = operando1 * operando2;
			break;
		case "/":
			resultado = operando1 / operando2;
			break;
		case "^":
			resultado = (int) Math.pow(operando1, operando2);
			break;
		case "%":
			resultado = operando1 % operando2;
			break;
		default:
			
		}
		return resultado;
	}
}
