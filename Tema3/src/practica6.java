
import java.util.Scanner;
public class practica6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		float numero1 = 0F;
		float numero2 = 0F;
		
		Scanner entradaA = new Scanner(System.in);
		System.out.println("Introduce un numero");
		while (!entradaA.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaA.next();
		}
		numero1 = entradaA.nextFloat();
		
		Scanner entradaB = new Scanner(System.in);
		System.out.println("Introduce otro numero");
		while (!entradaB.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaB.next();
		}
		numero2 = entradaB.nextFloat();
		
		Scanner entrada_menu = new Scanner(System.in);
		System.out.println("Elige una de las 4 opciones");
		System.out.println("1: Sumar | 2: Restar | 3: Multiplicar | 4: Dividir");
		while (!entrada_menu.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entrada_menu.next();
		}
		menu = entrada_menu.nextInt();
		
		entradaA.close();
		entradaB.close();
		entrada_menu.close();
		
		switch(menu){
			case 1:
				System.out.println("El resultado es:" + (numero1 + numero2));
				break;
			case 2:
				System.out.println("El resultado es:" + (numero1 - numero2));
				break;
			case 3:
				System.out.println("El resultado es:" + (numero1 * numero2));
				break;
			case 4:
				if (numero1==0 || numero2==0)
					System.out.println("No se puede dividir entre 0");
				else
					System.out.println("El resultado es:" + (numero1 / numero2));
				break;
			default:
				System.out.println("Elección Incorrecta");
		}
	}
}
