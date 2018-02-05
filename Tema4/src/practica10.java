
import java.util.Scanner;
public class practica10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalnotas = 0;
		int leidos = 0;
		int pos = 0;
		float mayor = 0F;
		float media = 0F;
		float busqueda = 0F;
		float i = 0F;
		int j = 0;
		boolean acabar = false;
		Scanner entradaTeclado = new Scanner (System.in);
		System.out.println("Escribiendo -1 dejaras de escribir notas.\nEscribe cuantas notas vas a usar:");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		totalnotas = entradaTeclado.nextInt();
		float[] notas= new float[totalnotas];
		while (leidos < notas.length && acabar == false){
			System.out.println("Escribe una nota:");
			if (acabar == false){
				if(entradaTeclado.hasNextFloat()) {
					i = entradaTeclado.nextFloat();
					if (i <= 10 && i >= 0){
						notas[leidos] = i;
						System.out.println("Valor " + leidos + " leido " + notas[leidos]);
						leidos++;
					} 
					else if (i == -1){
						acabar = true;
					}	
				}else {
					System.out.print("Nota Incorrecta. ");
					entradaTeclado.next();
				}
			}
		}
		System.out.print("\nTus notas son: ");
		for (j = 0; j < totalnotas; j++){
			System.out.print(notas[j] + "  ");
		}
		System.out.print("\n\nMedia: ");
		for (j = 0; j < notas.length; j++){
			media = media + notas[j];
		}
		media = media / notas.length;
		System.out.print(media + "\n\nLa mayor es: ");
		mayor = notas[0];
		for (j = 1; j < notas.length; j++) {
			if(notas[j]> mayor) {
				mayor = notas[j];

			}
		}
		System.out.print(mayor);
		System.out.println("\n\n¿Que nota quieres buscar?");
		while (!entradaTeclado.hasNextFloat()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		busqueda = entradaTeclado.nextFloat();
		for (j = 0; j < notas.length; j++) {
			if(notas[j]==busqueda) {
				System.out.print("Tu nota esta en la posicion: ");
				for(j = 0; j < notas.length;j++) {
					if (notas[j]== busqueda) {
						pos = j;
						System.out.print(pos+ ", ");
						
					}
				}
				System.out.print("y ya esta.");
				break;
			}
			else if (notas[j]!= busqueda && j == notas.length -1) {
				System.out.println("No tenemos esa nota. Escribe otra");
				while (!entradaTeclado.hasNextFloat()){
					System.out.println("Formato Incorrecto");
					entradaTeclado.next();
				}
				busqueda = entradaTeclado.nextFloat();
				j = 0;
			}
			
		}
		entradaTeclado.close();
	}

}