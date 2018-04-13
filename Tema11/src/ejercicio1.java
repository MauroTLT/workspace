import java.io.*;
import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		String texto = "";
		boolean semaforo = false;
		try {
			BufferedWriter ficheroSalida = new BufferedWriter(new FileWriter(new File("fichero.txt")));
			while(!semaforo) {
				System.out.println("Escribe un texto a añadir: ");
				texto = entradaTeclado.nextLine();
				if(!texto.equalsIgnoreCase("Fin")) {
					ficheroSalida.write(texto);
					ficheroSalida.newLine();
					System.out.println("Volcado Finalizado");
				} else {semaforo = true;}
			}
			ficheroSalida.close();
			entradaTeclado.close();
		} catch (IOException errorDeFichero) {
			System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
		}
		
		
	}
}