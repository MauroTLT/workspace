package unidad9.practica3;

public class Excepcio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t[] = {"Hola", "Adéu", "Fins demà"};
		try {
			for(int i = 0; i <= t.length; i++){
				System.out.println("Posició " + i + " : " + t[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Esto con ArrayList no pasaba");
		} finally {
			System.out.println("Aquest codi s'executa, peti qui peti!");
		}
		System.out.println("El programa s'ha acabat.");
	}

}
