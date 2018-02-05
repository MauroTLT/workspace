package examen45;
/**
 * @author Mauro Perez 1DAM MAÑANA
 *
 */
public class ejercicio5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio5 programa = new ejercicio5();
		programa.inici();
	}
	public void inici() {
		int[] array = {10, 13, 77};
		int pos = 0;
		int suma = 0;
		int resultado = suma(array,suma, pos);
		System.out.println(resultado);
	}
	public int suma(int[] array, int suma, int pos) {
		suma += array[pos];
		if (pos != array.length - 1){
			return suma(array, suma, pos + 1);
		}
		return suma;
	}
}
