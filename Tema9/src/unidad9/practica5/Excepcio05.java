package unidad9.practica5;

public class Excepcio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciem el programa i anem a executar met01");
		met01();
		System.out.println("Tornem a estar en el main després de finalitzar met01");
	}
	
	public static void met01() {
		try {
			System.out.println("Entrem en el met01 i anem a executar met02");
			met02();
			System.out.println("Tornem a estar en met01 despres de finalitzar met02");

		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Esto con ArrayList no pasaba");
		}
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