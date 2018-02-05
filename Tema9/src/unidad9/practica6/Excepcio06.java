package unidad9.practica6;

import java.io.IOException;

public class Excepcio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Iniciem el programa i anem a executar met01");
			met01();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Esto con ArrayList no pasaba");
		} catch(IOException e) {
			System.out.println("Esto con ArrayList no pasaba");
		}
		System.out.println("Tornem a estar en el main després de finalitzar met01");
	}
	
	public static void met01() throws ArrayIndexOutOfBoundsException, IOException {
		System.out.println("Entrem en el met01 i anem a executar met02");
		met02();
		System.out.println("Tornem a estar en met01 despres de finalitzar met02");
	}

	public static void met02() {
		System.out.println("Entrem en el met02 i anem a executar met03");
		met03();
		System.out.println("Tornem a estar en met02 despres de finalitzar met03");
	}

	public static void met03() {
		String t[] = {"Hola", "Adéu", "Fins demà"};
		for(int i = 0; i <= t.length; i++){
			System.out.println("Posició " + i + " : " + t[i]);
		}
		System.out.println("El met03 s'ha acabat.");
	}
}