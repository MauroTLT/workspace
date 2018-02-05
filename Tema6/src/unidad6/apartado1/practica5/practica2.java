package unidad6.apartado1.practica5;

import utilidades.CalcularArrays;

public class practica2 {

	public static void main(String[] args) {
		practica2 programa = new practica2();
		programa.inici();
	}
	public void inici() {
		double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
		CalcularArrays calculador = new CalcularArrays();
		
		double max = calculador.calcularMaxim(notes);
		double min = calculador.calcularMinim(notes);
		double media = calculador.calcularMedia(notes);
		System.out.println("La nota maxima es: " + max + ".");
		System.out.println("La nota minima es: " + min + ".");
		System.out.println("La nota media es: " + media + ".");
	}
}
