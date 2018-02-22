package ejercicio1;

import java.util.Scanner;
/**
 * 
 * @author Mauro Pérez 1DAM MAÑANA
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		int numerador = 0;
		int denominador = 0;
		System.out.println("Introduce el numerador");
		try {
			while(!entradaTeclado.hasNextInt()) {
				throw new ManejadorExcepcion(2);
			}
			numerador = entradaTeclado.nextInt();
			System.out.println("Introduce el denominador");
			while(!entradaTeclado.hasNextInt()) {
				throw new ManejadorExcepcion(2);
			}
			denominador = entradaTeclado.nextInt();
			try {
				if(denominador == 0){
					throw new ManejadorExcepcion(1);
				}
			} catch (ManejadorExcepcion e) {
				System.out.println(e.toString());
			}
			met1(numerador, denominador);
		} catch (ManejadorExcepcion e) {
			System.out.println(e.toString());
		} finally {
			entradaTeclado.close();
		}
	} 

	public static void met1(int numerador, int denominador) {
		try {
			met2(numerador, denominador);
		} catch (ArithmeticException e) {
			System.out.println("La operación no se ha podido realizar");
		}
	}

	public static void met2(int numerador, int denominador) throws ArithmeticException {
		System.out.println(numerador/denominador);
	}

}
