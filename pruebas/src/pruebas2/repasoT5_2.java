package pruebas2;

public class repasoT5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
							{1,2,3,4},
							{1,2,4,3},
							{3,4,2,1}
						};
		int num = 0;
		int[][] array2 = new int[4][3];
		array2 = cambio(array,array2,num);
		for(int i = 0; i < array2.length; i++){
			for(int j = 0; j < array2[i].length; j++){
				System.out.print(array2[i][j]);
			}
			System.out.println();
		}
	}
	public static int[][] cambio(int[][] array,int[][]array2, int n) {
		for(int j = 0; j < array[n].length; j++){
			array2[j][n] = array[n][j];
		}
		if(n == array.length - 1){
			return array2;
		}
		return cambio(array, array2, n + 1);
	}
}