package examen12;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = 0;
		int numero2 = 0;
		float numero3 = 0F;
		
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		numero1 = entradaTeclado.nextInt();
		System.out.println("Introduce el segundo numero");
		numero2 = entradaTeclado.nextInt();
		System.out.println("Introduce el tercer numero");
		numero3 = entradaTeclado.nextFloat();
		
		System.out.println("A	B	C	A==B	A=B	A>=B");
		System.out.println(numero1+"	"+numero2+ "	"+numero3+ "	"
		+(numero1 == numero2)+ "	"+(numero1=numero2)+"	"+ (numero1>=numero2));
		
		entradaTeclado.close();
	}

}
