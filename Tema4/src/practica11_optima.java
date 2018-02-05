import java.util.Scanner;

public class practica11_optima {
	private static final int EXCELENTE = 9;
	private static final float NOTABLE = 6.5F;
	private static final int APROBADO = 5;
	private static final String ASTERISCO = "*";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalNotas = 0;
		int leidos = 0;
		float i = 0F;
		int[] cantidad= new int[4];
		Scanner entradaTeclado = new Scanner (System.in);
		System.out.println("Escribe cuantas notas vas a usar:");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		totalNotas = entradaTeclado.nextInt();
		
		while (leidos < totalNotas){
			System.out.println("Escribe una nota:");
			if(entradaTeclado.hasNextFloat()) {
				i = entradaTeclado.nextFloat();
				if (i >= 0 && i <= 10){
					if(i >= EXCELENTE){
						cantidad[0] += 1; 
						}
						else if(i >= NOTABLE && i < EXCELENTE){
							cantidad[1] += 1;
							leidos++;
						}
						else if(i >= APROBADO && i < NOTABLE){
							cantidad[2] += 1;
							leidos++;
						}
						else if(i < APROBADO && i > -1){
							cantidad[3] += 1;
							leidos++;
						}
					}else{
						System.out.println("No es un numero entre 0 y 10");
						
					}
				
				}else {
					System.out.println("Valor Incorrecto");
					entradaTeclado.next();
				}
			
		}
		System.out.println("Grafica de barras de las notas\n- - - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.print("Excelente: ");
		for (int j = 0; j < cantidad[0]; j++){
			if(cantidad[0] > 0){
				System.out.print(ASTERISCO);
			}
		}
		System.out.print("\nNotable: ");
		for (int j = 0; j < cantidad[1]; j++){
			if(cantidad[1] > 0){
				System.out.print(ASTERISCO);
			}
		}
		entradaTeclado.close();
	}
}