import java.util.Scanner;
public class practica13 {
	static final int NUMERO_SECRETO=241;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		numero = entradaTeclado.nextInt();
			while (!(numero==NUMERO_SECRETO)){
				System.out.println("Te has equivocado, prueba otra vez");
				while (!entradaTeclado.hasNextInt()){
					System.out.println("Formato Incorrecto");
					entradaTeclado.next();
				}
				numero=entradaTeclado.nextInt();
			}
			entradaTeclado.close();
			System.out.println("Has acertado");
	}

}
