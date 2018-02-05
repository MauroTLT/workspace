import java.util.Scanner;

public class practica22 {
	public static final int CANTIDAD = 4;
	public static void main(String[] args) {
		String[] cadenas = new String[CANTIDAD];
		int i=0,j=0;
		String aux ="";
		Scanner entradaTeclado = new Scanner(System.in);
		for(i = 0; i < cadenas.length; i++){
			System.out.println("Introduce la palabra "+(i+1)+" de " + CANTIDAD);
			cadenas[i]=entradaTeclado.nextLine();
		}
		entradaTeclado.close();
		for(i=0;i<(cadenas.length-1);i++) {
			for(j=i+1;j<cadenas.length;j++) {
				if(cadenas[i].compareToIgnoreCase(cadenas[j])>0){
					aux=cadenas[i];
					cadenas[i]=cadenas[j];
					cadenas[j]=aux;
				}
			}
		}
		System.out.println("Ordenados alfabeticamente");
		for(i=0;i<cadenas.length;i++){
			System.out.print(cadenas[i]+", ");
		}
	}
}