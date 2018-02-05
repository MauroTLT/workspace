
import java.util.Scanner;
public class practica5 {
	static final int VALOR_MINIMO = 100;
	static final float DESCUENTO = 0.5F;
	static final float VALOR_MAXIMO = 200F;
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int numero = 0;
		float descuento = 0F;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		numero = entradaTeclado.nextInt();
		entradaTeclado.close();
		
		if (numero >= VALOR_MINIMO){
				descuento = (numero * DESCUENTO);
		if (descuento > VALOR_MAXIMO)
				descuento = VALOR_MAXIMO;
		}
		if (numero > 0){
		System.out.println("El precio es:" + (numero - descuento));
		if (numero < 0)
		System.out.println("Numero Incorrecto");
		}
	}
}
