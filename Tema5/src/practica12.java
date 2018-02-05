import java.util.Scanner;

public class practica12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practica12 programa = new practica12();
		programa.inicio();
	}
	public void inicio(){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Leemos un numero");
		float real = entrada(teclado);
		System.out.println("El numero es: " + real);
		
		System.out.println("Prueba otra vez");
		real = entrada(teclado);
		System.out.println("El numero es: " + real);
		
		teclado.close();
	}
	public float entrada(Scanner teclado){
		float numReal = 0.0F;
		while (!teclado.hasNextFloat()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			teclado.next();
		}
		numReal = teclado.nextFloat();
		return numReal;
	}
}