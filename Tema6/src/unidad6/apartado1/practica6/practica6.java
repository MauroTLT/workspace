package unidad6.apartado1.practica6;

import utilidades.random;

public class practica6 {

	public static void main(String[] args) {
		practica6 programa = new practica6();
		programa.inici();
	}
	public void inici() {
		random numRandom = new random();
		double num1 = numRandom.aleatorioInt();
		System.out.println(num1);
		double num2 = numRandom.aleatorioInt();
		System.out.println(num2);
	}
}
