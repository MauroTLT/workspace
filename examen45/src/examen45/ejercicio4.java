package examen45;

/**
 * @author Mauro Perez 1DAM MAÑANA
 *
 */
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio4 programa = new ejercicio4();
		programa.inici();
	}
	public void inici() {
		int[] array = {0, 4, 7, 3, 5, -1, 10, 10, 20};
		String[] resultado = null;
		int cant = cantSeries(array);
		resultado = new String[cant];
		for(int i = 0; i < resultado.length; i++){
			resultado[i] = "";
		}
		rellenar(array, resultado);
		imprimir(resultado);
	}
	public void imprimir(String[] resultado) {
		for(int i = 0; i < resultado.length - 1; i++){
			System.out.println("Inicio serie " + (i + 1) + ": " + resultado[i]);
		}
	}
	public int cantSeries (int[] array){
		int cant = 2;
		for(int i = 0; i < array.length - 1; i++){
			if (array[i] > array[i+1]){
				cant++;
			}
		}
		return cant;
	}
	public void rellenar(int[] array, String[] resultado){
		int j = 0;
		int cant = 0;
		resultado[0] += j;
		for(int i = 1; i < resultado.length - 1; i++){
			for(int k = cant; k < array.length - 1; k++){
				if(array[k] > array[k+1]){
					j = k + 1;
					cant = j;
					break;
				}
			}
			resultado[i] += j;
		}
	}
}