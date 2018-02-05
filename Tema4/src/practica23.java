import java.util.Scanner;

public class practica23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "";
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("¿Que quieres convertir a un acronimo?");
		cadena = entradaTeclado.nextLine();
		entradaTeclado.close();
		for(int i = 0; i < cadena.length(); i++){
			if (i==0) {
				System.out.print(cadena.charAt(i));
			} else if ((cadena.charAt(i) == ' ') && (cadena.charAt(i + 1) >= 'A' && cadena.charAt(i + 1) <= 'Z')) {
				System.out.print(cadena.charAt(i + 1));
			}
		}
	}
}