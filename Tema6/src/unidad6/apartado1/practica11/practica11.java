package unidad6.apartado1.practica11;

import java.util.Arrays;

import utilidades.random;

public class practica11 {

	public static void main(String[] args) {
		practica11 programa = new practica11();
		programa.inici();
	}
	public void inici() {
		random numRandom = new random();
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++){
			array[i] = numRandom.aleatorioIntSeed(10);
		}
		System.out.println(Arrays.toString(array));
		int[] array2 = Arrays.copyOfRange(array, 5, array.length);
		Arrays.sort(array2);
		array = Arrays.copyOfRange(array, 0, 5);
		Arrays.sort(array);
		System.out.println("Primera mitad " + Arrays.toString(array));
		System.out.println("Segunda mitad " + Arrays.toString(array2));
		for(int i = 0; i < array.length; i++){
			if(Arrays.binarySearch(array2, array[i]) >= 0){
				System.out.println("El numero " + array[i] + " de la posicion " + i + " esta en la posición: " + (Arrays.binarySearch(array2, array[i]) + 5) + " del array.");
			}
		}
	}

}
