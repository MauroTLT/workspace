import java.util.Scanner;

public class practica8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalnotas = 0;
		int leidos = 0;
		float i = 0;
		boolean acabar = false;
		Scanner entradaTeclado = new Scanner (System.in);
		System.out.println("Escribe cuantas notas vas a usar:");
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
		System.out.print("Tus notas son: ");
		for (int j = 0; j < totalnotas; j++){
			System.out.print(notas[j] + "  ");
		}
		entradaTeclado.close();
	}

}