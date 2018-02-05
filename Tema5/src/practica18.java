import java.util.Scanner;

public class practica18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Escribe un numero");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		numero = entradaTeclado.nextInt();
		for(int i = 0; i <= numero; i++){
			System.out.println(numero + " elevado a " + i + " es: " + potencia(i));
		}
		entradaTeclado.close();
	}
	public static int potencia(int n){
		if(n == 0){
			return 1;
		} else {
			return 2 * (potencia(n - 1));
		}
			
	}

}
