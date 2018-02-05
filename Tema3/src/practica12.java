import java.util.Scanner;

public class practica12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
		int resto = 0;
		
		Scanner entradanumero1 = new Scanner(System.in);
		System.out.println("Introduce un numero");
		while (!entradanumero1.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradanumero1.next();
		}
		numero1 = entradanumero1.nextInt();
		Scanner entradanumero2 = new Scanner(System.in);
		System.out.println("Introduce otro numero");
		while (!entradanumero2.hasNext()){
			System.out.println("Formato Incorrecto");
			entradanumero2.next();
		}
		numero2 = entradanumero2.nextInt();
		entradanumero1.close();
		entradanumero2.close();

		resultado= numero1/numero2;
		resto= numero1 - (numero2 * resultado);
		
		System.out.println("El resto es: " + resto);
	}

}
