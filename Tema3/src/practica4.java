
import java.util.Scanner;
public class practica4 {
	private static final int EXCELENTE = 9;
	private static final float NOTABLE = 6.5F;
	private static final int APROBADO = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero = 0F;
		
		
		
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		while (!entradaTeclado.hasNextFloat()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		numero = entradaTeclado.nextFloat();
		entradaTeclado.close();
		
		if(numero >= EXCELENTE){
			System.out.println("Excelente");
		}
		else if(numero >= NOTABLE && numero < EXCELENTE){
			System.out.println("Notable");
		}
		else if(numero >= APROBADO && numero < NOTABLE){
			System.out.println("Aprobado");
		}
		else{
			System.out.println("Suspendido");
		}
	}
}