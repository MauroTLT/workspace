import java.util.Scanner;

public class practica10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		int i = 0;
		
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		numero = entradaTeclado.nextInt();
		entradaTeclado.close();
		while (i >= 0 && i <= 10 ){
			System.out.println(i + " x " + numero + " = " + numero*i);
			i++;
		}
	}
}
