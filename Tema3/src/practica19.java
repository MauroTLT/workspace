import java.util.Scanner;

public class practica19 {

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
		for (i = 0;i >= 0 && i <= numero; i=i+3){
			System.out.println(i);
			total=total+i;
		}
		
		System.out.println("El total es:" +total);
		
		total=0;
		
		for (i = 0;i >= 0 && i <= numero; i=i+3){
			if (i % 3 ==0){
			total=total+i;
			}
		}
		System.out.println("El total es:" +total);
		
	}

}