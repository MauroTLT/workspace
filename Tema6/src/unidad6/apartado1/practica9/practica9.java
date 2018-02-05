package unidad6.apartado1.practica9;

import java.util.Scanner;

import utilidades.escaner;

public class practica9 {

	public static void main(String[] args) {
		practica9 programa = new practica9();
		programa.inici();
	}
	public void inici() {
		escaner escaner = new escaner();
		Scanner entradaTeclado = new Scanner(System.in);
		
		int cateto1 = escaner.escanerInt(entradaTeclado);
		int cateto2 = escaner.escanerInt(entradaTeclado);
		
		double resultado = (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		System.out.println(Math.sqrt(resultado));
		entradaTeclado.close();
	}
}