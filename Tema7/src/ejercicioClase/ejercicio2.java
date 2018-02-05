package ejercicioClase;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		Circulo c1 = new Circulo();
		System.out.println("Escribe el radio del circulo: ");
		c1.setRadio(entradaTeclado.nextDouble());
		//Circulo c1 = new Circulo(entradaTeclado.nextDouble());
		System.out.println("El area es: " + c1.areaCirculo());
		System.out.println("La longitud es: " + c1.longCirculo());
		entradaTeclado.close();
	}
}
