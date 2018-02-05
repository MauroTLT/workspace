import java.util.Scanner;

public class practica20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner (System.in);
		System.out.println("Escribe un texto");
		String texto = entradaTeclado.nextLine();
		System.out.println("¿Que caracter quieres buscar?");
		String caracter = entradaTeclado.nextLine();
		char caracter2 = caracter.charAt(0);
		int indexOf = texto.indexOf(caracter2);
		int lastIndexOf = texto.lastIndexOf(caracter2);
		
		if(indexOf>=0){
			System.out.println("El caracter " + caracter2 + " esta en la primera posicion: " + (indexOf+1));
			System.out.println("El caracter " + caracter2 + " esta en la ultima posicion: " + (lastIndexOf+1));
		} else{
			System.out.println("El caracter no esxiste");
		}
		entradaTeclado.close();
	}

}
