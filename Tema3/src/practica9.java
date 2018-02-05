import java.util.Scanner;

public class practica9 {
	private static final String LINEA ="_";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int numero = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		numero = entradaTeclado.nextInt();
		entradaTeclado.close();
		
		while (i >= 0 && i < numero){
			System.out.print(LINEA);
			i++;
		}
	}

}