import java.util.Scanner;

public class practica4 {

	public static final int VALORES = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valoresleidos= 0;
		String valor="";
		Scanner lector = new Scanner (System.in);
		System.out.println("Escribe " + VALORES + " enteros");
		while (valoresleidos < VALORES){
			if (lector.hasNextInt()){//Podemos validar la entrada de datos, pero con hasNextLine se traga los espacios igualmente
				valor = lector.nextLine();//De esta forma se traga letras, espacios y basicamente todo.
				System.out.println("Valor " + valoresleidos + " leido " + valor);
				valoresleidos++;
			}
			else{
				System.out.println("Error escribe otra vez");
				lector.next();
			}
		}
		lector.close();
		System.out.println("Ya se han leido " + VALORES + " valores");
	}

}
