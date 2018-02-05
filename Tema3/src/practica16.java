import java.util.Scanner;


public class practica16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		String mensaje ="Introduce un numero";
		//Utilizamos la variable String para cambiar el mensaje a nuestro gusto dentro del bucle, y no nos lo repita todo el rato
		Scanner entradaTeclado = new Scanner(System.in);
		do {
			System.out.println(mensaje);
			//Pedimos el numero por primera vez
			while (!entradaTeclado.hasNextInt()) {
				System.out.println("Valor Incorrecto");
				entradaTeclado.nextLine();
			}
			//Con este while comprobamos que el valor introducido es un numero entero. Siempre al introducir cualquier valor.
			numero = entradaTeclado.nextInt();
			mensaje ="Numero Incorrecto";
			//Cambiamos el mensaje para el caso de que el numero sea incorrecto.
		} while (numero < 0 || numero >= 10);//Condicion para que entren al bucle numeros fuera de 0-10.

		entradaTeclado.close();
		System.out.println("Numero correcto");
	}
}
