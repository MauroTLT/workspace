import java.util.Arrays;

public class practica10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practica10 programa = new practica10();
		programa.inicio();
	}
	public void inicio(){
		int cambio = 0;
		System.out.println("Valor cambio: " + cambio);
		int[] array = {10,5,23,435,6};
		System.out.println(Arrays.toString(array));
		
		modificar(cambio, array);
		
		System.out.println("Valor cambio: " + cambio);
		System.out.println(Arrays.toString(array));
	}
	public void modificar(int cambio, int[]array){
		cambio = 99;
		array[2] = cambio;
	}
}