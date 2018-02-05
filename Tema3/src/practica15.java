import java.util.Scanner;
public class practica15 {
	static final int NUMERO_SECRETO=6;
	static final int OPORTUNIDADES=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0;
		int numerointentos = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		numero = entradaTeclado.nextInt();
		numerointentos++;
			while (!(numero==NUMERO_SECRETO) && numerointentos < OPORTUNIDADES){
				System.out.println("Te has equivocado, prueba otra vez");
				while (!entradaTeclado.hasNextInt()){
					System.out.println("Formato Incorrecto");
					entradaTeclado.next();
				}
				numero=entradaTeclado.nextInt();
				numerointentos++;
			}
		if (numerointentos == OPORTUNIDADES && !(numero==NUMERO_SECRETO)){
			System.out.println("No tienes mas intentos");
		}
		else
			System.out.println("Has acertado");
		entradaTeclado.close();
	}

}
