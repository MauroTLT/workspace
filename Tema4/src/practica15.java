import java.util.Scanner;

public class practica15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fila = 0;
		int columna = 0;
		Scanner entradaTeclado = new Scanner (System.in);
		System.out.println("Escribe cuantas filas vas a usar:");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		fila = entradaTeclado.nextInt();
		System.out.println("Escribe cuantas columnas vas a usar:");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		columna = entradaTeclado.nextInt();
		int[][] arrayBi = new int[fila][columna];
		for (fila = 0; fila < arrayBi.length; fila++) {  //número de filas
		     for (columna = 0; columna < arrayBi[fila].length; columna++) { //número de columnas de cada fila
		    	arrayBi[fila][columna] = fila + columna;
		    	 System.out.print(arrayBi[fila][columna] + "	");
		     }
		     System.out.println();
		}
		entradaTeclado.close();
		
	}

}