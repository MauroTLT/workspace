public class practica20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,6,7,2,6,9};
		int num = 0;
		System.out.println("La suma de los numeros del array da: " + suma(array, num));
	}
	public static int suma(int[] array, int n) {
		if (n == array.length - 1){
		    return array[n];
		}
		else
		    return suma(array, n + 1) + array[n];
	}
}