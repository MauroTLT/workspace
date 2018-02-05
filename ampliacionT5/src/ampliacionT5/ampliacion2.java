package ampliacionT5;

import java.util.Scanner;

public class ampliacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ampliacion2 programa = new ampliacion2();
		programa.inici();
	}
	public void inici() {
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Escribe una cadena de texto");
		String cadena = entradaTeclado.nextLine();
		int n = 0;
		boolean palindromo = comprobar(cadena, n);
		if(palindromo) {
			System.out.println("Es un palíndromo");
		} else {
			System.out.println("No es un palíndromo");
		}
		entradaTeclado.close();
	}
	public boolean comprobar(String cadena, int n) {
		if(n==((cadena.length() / 2) - 1) || n == cadena.length()-1) {
			return true;
		}
		if((cadena.charAt(n) == cadena.charAt((cadena.length() -1) - n))) {
			return comprobar(cadena, n + 1);
		} else {
			return false;
		}
	}
}