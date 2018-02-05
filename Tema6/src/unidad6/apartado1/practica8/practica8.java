package unidad6.apartado1.practica8;

import utilidades.random;

public class practica8 {

	public static void main(String[] args) {
		practica8 programa = new practica8();
		programa.inici();
	}
	public void inici() {
		random numRandom = new random();
		double num1 = numRandom.aleatorioFloat();
		System.out.println(num1);
		System.out.println(Math.round(num1));

	}

}
