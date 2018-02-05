import java.util.Scanner;

public class practica11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		int i = 0;
		int total = 0;
		
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		numero = entradaTeclado.nextInt();
		entradaTeclado.close();
		while (i >= 0 && i <= numero){
			System.out.println(i);
			total=total+i;
			i = i+3;
		}
		
		System.out.println("El total es:" +total);
		
		while (i >= 0 && i <= numero){
			if (i % 3 ==0){
			total=total+i;
			i++;
			}
		}
		System.out.println("El total es:" +total);
		
	}

}
