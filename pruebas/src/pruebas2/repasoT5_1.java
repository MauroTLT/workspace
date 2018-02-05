package pruebas2;

public class repasoT5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3};
		int[] array2 = {1,2,3};
		int num = 0;
		System.out.println("El array es igual: " + comparar(array, array2, num));
	}
	public static boolean comparar(int[] array,int[] array2, int n) {
		if(array.length != array2.length){
			return false;
		}
		if ((array[n] == array2[n])){
			if(n == array.length - 1){
		    	return true;
		    }
		    return comparar(array, array2, n + 1);
		} else {
			return false;
		}
		
	}
}
