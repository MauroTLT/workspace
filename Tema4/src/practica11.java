import java.util.Scanner;

public class practica11 {
	private static final int EXCELENTE = 9;
	private static final float NOTABLE = 6.5F;
	private static final int APROBADO = 5;
	private static final String ASTERISCO = "*";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalNotas = 0;
		int leidos = 0;
		float i = 0F;
		Scanner entradaTeclado = new Scanner (System.in);
		System.out.println("Escribe cuantas notas vas a usar:");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		totalNotas = entradaTeclado.nextInt();
		float[] notas= new float[totalNotas];
		while (leidos < notas.length){
			System.out.println("Escribe una nota:");
			if(entradaTeclado.hasNextFloat()) {
				i = entradaTeclado.nextFloat();
				if (i <= 10 && i >= 0){
					notas[leidos] = i;
					System.out.println("Valor " + leidos + " leido " + notas[leidos]);
					leidos++;
				} 
			}else {
				System.out.print("Nota Incorrecta. ");
				entradaTeclado.next();
			}
		}
		System.out.println("Grafica de barras de las notas\n- - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.print("Excelente: ");
		for (int j = 0; j < totalNotas; j++){
			if(notas[j] >= EXCELENTE){
				System.out.print(ASTERISCO);
			}
		}
		System.out.print("\nNotable: ");
		for (int j = 0; j < totalNotas; j++){
			if(notas[j] >= NOTABLE && notas[j] < EXCELENTE){
				System.out.print(ASTERISCO);
			}
		}
		System.out.print("\nAprobado: ");
		for (int j = 0; j < totalNotas; j++){
			if(notas[j] >= APROBADO && notas[j] < NOTABLE){
				System.out.print(ASTERISCO);
			}
		}
		System.out.print("\nSuspendido: ");
		for (int j = 0; j < totalNotas; j++){
			if(notas[j] < APROBADO){
				System.out.print(ASTERISCO);
			}
		}
		entradaTeclado.close();
	}
}
