
public class practica14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		float[][] arrayBi = new float[5][10];
		arrayBi[1][1]=5;
		for (i = 0; i < arrayBi.length; i++) {  //número de filas
		     for (j = 0; j < arrayBi[i].length; j++) { //número de columnas de cada fila
		          System.out.print(arrayBi[i][j] + "	");
		     }
		     System.out.println();
		}
		
	}

}