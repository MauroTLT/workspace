package examen12;

public class ejercicio6 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		
		if (a<b && b<c)
			System.out.println("Las variables estan en orden CRECIENTE");
		else if (a>b && b>c)
			System.out.println("Las variables estan en orden DECRECIENTE");
		else
			System.out.println("Las variables estan en DESORDEN");
	}

}