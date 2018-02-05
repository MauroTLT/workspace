import java.util.Scanner;

public class practica20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		int i = 0;
		int max_num = 0;
		
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		numero = entradaTeclado.nextInt();
		System.out.println("Introduce el numero maximo");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		max_num = entradaTeclado.nextInt();
		entradaTeclado.close();
		
		for (i=0; i >= 0 && i <= max_num; i++)
			System.out.println(i + " x " + numero + " = " + numero*i);
		
	}
}