package pruebas;
import java.util.Scanner;

public class practica20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto ="";
		char leido = 0;
		String caracter = "";
		char car = 0;
		int i= 0;
		Scanner entradaTeclado = new Scanner (System.in);
		System.out.println("Escribe un texto");
		texto = entradaTeclado.nextLine();
		System.out.println("¿Quieres buscar algun caracter?");
		caracter = entradaTeclado.nextLine();
		while (caracter.length() > 1){
			System.out.println("Escribe un unico caracter");
			caracter = entradaTeclado.nextLine();
		}
		System.out.println(caracter);
		
		for(i = 0; i< texto.length(); i++){
			leido = texto.charAt(i);
			car = caracter.charAt(0);
			if (car == leido){
				System.out.println("El caracter esta en la posición: " + i);
			}
		}
	}

}