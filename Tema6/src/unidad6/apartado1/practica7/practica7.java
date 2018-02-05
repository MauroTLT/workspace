package unidad6.apartado1.practica7;

import utilidades.random;

public class practica7 {
	public static void main(String[] args) {
		practica7 programa = new practica7();
		programa.inici();
	}
	public void inici() {
		random numRandom = new random();
		long num1 = 0, num2 = 0;
		num1 = numRandom.aleatorioLong(numRandom.aleatorioInt());
		System.out.println(num1);
		num2 = numRandom.aleatorioLong(numRandom.aleatorioInt());
		System.out.println(num2);
	}
}