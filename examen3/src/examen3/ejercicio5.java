package examen3;
/**
 * Mauro Pérez Moliner
 * 1ºDAM Mañana
 */
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 0;
		int total = 0;
		boolean acabar = false;

		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Escribe el primer numero del rango");
		while (!entradaTeclado.hasNextInt()) {
			System.out.println("Valor incorrecto, escribe otro:");
			entradaTeclado.next();
		}
		min = entradaTeclado.nextInt();
		System.out.println("Escribe el ultimo numero del rango");
		while (!entradaTeclado.hasNextInt()) {
			System.out.println("Valor incorrecto, escribe otro:");
			entradaTeclado.next();
		}
		max = entradaTeclado.nextInt();
		while (acabar == false)
		if (min < max) {
			for(int i = min; i <= max; i++){
				total = total + (i*i);
			}
			acabar = true;
		} else {
			while (min >= max || !entradaTeclado.hasNextInt()) {
				System.out.println("Valor menor que el anterior, escribe otro:");
				if (entradaTeclado.hasNextInt()){
					
				}else if(min>=max){
					System.out.println("Valor incorrecto, escribe otro:");
					entradaTeclado.next();
				} else{
					System.out.println("Escribe el ultimo numero del rango");
					entradaTeclado.next();
				}
				max = entradaTeclado.nextInt();
				System.out.println("Escribe el ultimo numero del rango");
			}
			
		}
		System.out.println("El rango minimo: " + min);
		System.out.println("El rango maximo: " + max);
		System.out.println("El total es: " + total);
		entradaTeclado.close();
	}

}
