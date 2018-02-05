package ampliacionT4;
import java.util.Scanner;

public class ampliacion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros = 0, totalNum = 0;
		int mayor = 0, cantM = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Escribe cuantas numeros vas a usar:");
		while (!entradaTeclado.hasNextInt()) {
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		totalNum = entradaTeclado.nextInt();
		
		int[] array = new int[totalNum];
		for (numeros = 0; numeros < array.length; numeros++) {
			System.out.println("Escribe un numero");
			array[numeros] = entradaTeclado.nextInt();
			System.out.println(array[numeros] + "	");
			if(numeros==1) {
				mayor = array[numeros];
			} else if (array[numeros] > mayor) {
				mayor = array[numeros];
			}
		}
		for (numeros = 0; numeros < array.length; numeros++) {
			if (array[numeros] == mayor) {
				cantM++;
			}
		}
		System.out.print("El mayor es "+ mayor +" y esta " + cantM + " veces en el array.");
		entradaTeclado.close();
	}

}