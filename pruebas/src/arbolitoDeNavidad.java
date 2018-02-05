
import java.util.Scanner;

public class arbolitoDeNavidad {

	public static final String ASTERISCO = "*";
	public static final String ESPACIO = " ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		random random = new random();
		int adornos = 0;
		int alt = 0;
		int espaciosDetras = 0;
		boolean estrella = false;
		String aux = "";
		System.out.println("Dime la altura del arbol: ");
		alt = entradaTeclado.nextInt();
		alt = alt * 2;
		
		System.out.println("Dime el numero aproximado de adornos: ");
		adornos = entradaTeclado.nextInt();
		
		System.out.println("¿Quieres estrella?");
		aux = entradaTeclado.next();
		if(aux.equals("si")){
			estrella = true;
		}
		entradaTeclado.close();
		System.out.println("\t     ¡Feliz Navidad!");
		for (int i = 1; i <= alt; i = i + 2) {
			if(i == alt - 1 || i == alt - 3){
				for(int j = 0; j < alt/2; j++){
					System.out.print(" ");
				}
				System.out.print("|\n");
			} else {
				for (espaciosDetras = alt - i; espaciosDetras > 0; espaciosDetras = espaciosDetras - 2) {
					System.out.print(ESPACIO);
				}
				for (int j = 0; j < i; j++) {
					int elec = random.randomInt(20);
					if(i==1 && j==0 && estrella == true){
						System.out.print("★");
					} else{
						if(elec == 0 && adornos!= 0){
							System.out.print("+");
							adornos--;
						} else {
							System.out.print(ASTERISCO);
						}
					}
					
				}
				System.out.print("\n");
			}
		}
	}

}
