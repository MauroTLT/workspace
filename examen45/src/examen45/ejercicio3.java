package examen45;

/**
 * @author Mauro Perez 1DAM MAÑANA
 *
 */
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio3 programa = new ejercicio3();
		programa.inici();
	}

	public void inici() {
		int[][] array1 = {{30, 10, 13, 77},{15, 10, 13, 77},{70, 10, 44, 77}};
		int[][] array2 = {{0, 10, 20, 77},{15, 10, 13, 77},{12, 1, 99, 28}};
		int[][] resultado = new int[3][4];
		comunes(array1, array2, resultado);
		imprimir_comunes(resultado);
	}
	public void comunes(int[][] array1, int[][] array2, int[][]resultado) {
		for(int i = 0; i < resultado.length; i++){
			for(int j = 0; j < resultado[i].length; j++){
				if(array1[i][j] == array2[i][j]){
					resultado[i][j] = array1[i][j];
				} else {resultado[i][j] = 0;}
			}
		}
	}
	public void imprimir_comunes(int[][]resultado) {
		System.out.println("El resultado es: ");
		for(int i = 0; i < resultado.length; i++){
			for(int j = 0; j < resultado[i].length; j++){
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println();
		}
	}
}
