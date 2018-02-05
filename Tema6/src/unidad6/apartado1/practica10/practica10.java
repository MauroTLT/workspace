package unidad6.apartado1.practica10;

import java.util.Arrays;

public class practica10 {

	public static void main(String[] args) {
		practica10 programa = new practica10();
		programa.inici();
	}
	public void inici() {
		int[] array = {2, 1, 3, 5, 4, 6, 7, 9, 10, 8};
		int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Arrays.sort(array);
		
		System.out.println("Posicion Valor Buscado: " + Arrays.binarySearch(array, 4));
		
		System.out.println("Mostrar Array ordenado: " + Arrays.toString(array));
		
		int[] copia = Arrays.copyOf(array, 20);
		System.out.println("Array copiado: " + Arrays.toString(copia));
		
		System.out.println(Arrays.equals(array, array2));
	}

}
