package unidad6.apartado1.practica11;

import java.util.Arrays;

import utilidades.random;

public class practica11_1 {

	public static void main(String[] args) {
		practica11_1 programa = new practica11_1();
		programa.inici();
	}
	public void inici() {
		random numRandom = new random();
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++){
			array[i] = numRandom.aleatorioIntSeed(10);
		}
		System.out.println(Arrays.toString(array));
		for(int i = 0; i < 5; i++){
			for(int j = 5; j < array.length; j++){
				if(array[i] == array[j]){
					System.out.print(array[i] + " ");
					j = array.length;
				}
			}
		}
	}

}
