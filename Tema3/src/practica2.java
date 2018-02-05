
import java.util.Scanner;
public class practica2 {
	static final int VALOR_MINIMO=30;
	static final int PENALIZACION=2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float precio=0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		while (!entradaTeclado.hasNextFloat()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		precio=entradaTeclado.nextFloat();
		entradaTeclado.close();
		
		if(precio < VALOR_MINIMO)
			System.out.println("El precio es de:" + (precio+PENALIZACION));
		else
			System.out.println("El precio es de:" + precio);
	}
}