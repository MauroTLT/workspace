package ampliacionT4;
import java.util.Arrays;
import java.util.Scanner;
public class ampliacion3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		int fila = 0, columna = 0;
		int totalB = 0;
		int aux2 = 0, aux = 0;
		int dir = 0;
		int barcos = 0;
		boolean correcto = false;
		Scanner entradaTeclado = new Scanner(System.in);
		//Empieza la entrada de datos
		//Tamaño del tablero
		System.out.println("¿Cual es el tamaño del tablero?");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
		fila = entradaTeclado.nextInt();
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
		columna = entradaTeclado.nextInt();
		//Creacion del tablero
		int[][] tablero = new int[fila][columna];
		//Numero de barcos
		System.out.println("¿Cuantos barcos quieres?");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
		barcos = entradaTeclado.nextInt();
		while(barcos > (fila * columna)) { //Comprobación de que el numero de barcos no sea mayor que posiciones del tablero
			System.out.println("El numero es demasiado grande");
			while (!entradaTeclado.hasNextInt()){
				System.out.println("Formato Incorrecto, prueba otra vez");
				entradaTeclado.next();
			}
			barcos = entradaTeclado.nextInt();
		}
		//Array que guarda tamaños de barco
		int[] tamBarco = new int[barcos];
		for(i = 0; i < barcos; i++) {
			System.out.println("Tamaño del barco "+ (i + 1) + ": ");
			while (!entradaTeclado.hasNextInt()){
				System.out.println("Formato Incorrecto, prueba otra vez");
				entradaTeclado.next();
			}
			tamBarco[i] = entradaTeclado.nextInt();
			aux = tamBarco[i];
			totalB += tamBarco[i];
			while(totalB > (fila * columna) || (aux > fila) || aux > columna) { //Comprobamos que los tamaños en total de los barcos no sean mayores que el tablero
				totalB = 0;
				System.out.println("El tamaño en total de los barcos supera el tamaño del tablero o un barco es mas grande que las filas y/o columnas del tablero, reintroduzca los datos bien.");
				for(i = 0; i < barcos; i++) {
					System.out.println("Tamaño del barco "+ (i + 1) + ": ");
					while (!entradaTeclado.hasNextInt()){
						System.out.println("Formato Incorrecto, prueba otra vez");
						entradaTeclado.next();
					}
					tamBarco[i] = entradaTeclado.nextInt();
					aux = tamBarco[i];
					totalB += tamBarco[i];
					if ((aux > fila) || (aux > columna)){
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(tamBarco)); //Simplemente representa los tamaños que hemos escogido
		//Pedimos la primera posicion
		for(i = 0; i < tamBarco.length; i++) {
			System.out.println("Primera posición del barco "+ (i + 1) + ": ");
			while (!entradaTeclado.hasNextInt()){
				System.out.println("Formato Incorrecto, prueba otra vez");
				entradaTeclado.next();
			}
			aux = entradaTeclado.nextInt();
			aux2 = entradaTeclado.nextInt();
			//Comprobamos que el barco no se vaya a salir del tablero ni que empiece fuera de este
			while((aux >= fila) || (aux >= columna) || (aux2 >= fila) || (aux2 >= columna)
			|| ((aux + tamBarco[i]) > fila) || ((aux + tamBarco[i]) > columna) || ((aux2 + tamBarco[i]) > fila) || ((aux + tamBarco[i]) > columna)) { 
				System.out.println("El numero es demasiado grande o el barco puede salirse del tablero, prueba otro");
				while (!entradaTeclado.hasNextInt()){
					System.out.println("Formato Incorrecto, prueba otra vez");
					entradaTeclado.next();
				}
				aux = entradaTeclado.nextInt();
				aux2 = entradaTeclado.nextInt();
			}
			correcto = false;
			while (correcto == false) {
				//Pedimos la direccion del barco entre hacia la derecha y hacia abajo
				System.out.println("Escriba 1 para pintar hacia la derecha, o 2 para pintar hacia abajo, el barco.");
				while (!entradaTeclado.hasNextInt()){
					System.out.println("Formato Incorrecto, prueba otra vez");
					entradaTeclado.next();
				}
				dir = entradaTeclado.nextInt();
				if(dir == 2) { //En caso de hacia abajo
					for(j = 0; j < tamBarco[i]; j++) {
						if(tablero[aux + j - 1][aux2 - 1] == 0) {//Si no esta repetida
							tablero[aux + j - 1][aux2 - 1] = 1;
						} else { //En caso de que este repetida
							System.out.println("Alguna posicion esta repetida");
							i--;
							break;
							//Volvemos a pedir la primera coordenada y direccion del barco con posiciones ya en el tablero
						}
					}
					correcto = true;//Todos los barcos estan bien colocados
				} else if( dir == 1) { //En caso de hacia la derecha
					for(j = 0; j < tamBarco[i]; j++) {
						if(tablero[aux - 1][aux2 + j - 1] == 0) {//Si no esta repetida
							tablero[aux - 1][aux2 + j - 1] = 1;
						} else { //En caso de que este repetida
							System.out.println("Alguna posicion esta repetida");
							i--;
							break;
							//Volvemos a pedir la primera coordenada y direccion del barco con posiciones ya en el tablero
						}
					}
					correcto = true;//Todos los barcos estan bien colocados
				}else {	
					System.out.println("Numero Incorrecto");//La direccion no es ni 1, ni 2
				}
			}
		}
		entradaTeclado.close();
		//Acaba la entrada de datos
		//Representamos el array de tablero
		for (fila = 0; fila < tablero.length; fila++) {
		     for (columna = 0; columna < tablero[fila].length; columna++) {
		    	 System.out.print(tablero[fila][columna] + " ");
		     }
		     System.out.println();
		}
	}
}