package pruebas;
import java.util.Scanner;

public class pruebas7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalnotas = 0;
		int leidos = 0;
		Scanner entradaTeclado = new Scanner (System.in);
		System.out.println("Escribe cuantas notas vas a usar:");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		totalnotas = entradaTeclado.nextInt();
		int[] notas= new int[totalnotas];
		while (leidos < notas.length){
			System.out.println("Escribe una nota:");
			leidos = entradaTeclado.nextInt();
			if (leidos <= 10 && leidos >= 0){
			notas[leidos] = leidos;
			System.out.println("Valor " + leidos + " leido " + notas[leidos]);
			leidos++;
			} else {
				System.out.print("Nota Incorrecta. ");
			}
		}
		System.out.print("Tus notas son: ");
		for (leidos = 1; leidos < totalnotas; leidos++){
			System.out.print(notas[leidos] + "  ");
		}
		entradaTeclado.close();
	}

}
