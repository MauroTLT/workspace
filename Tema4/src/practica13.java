
public class practica13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4, 25, 68, 45, 61, 65, 8, 51, 3, 5};
		practica13a ordenarI = new practica13a();
		practica13b ordenarS = new practica13b();
		practica13c ordenarB = new practica13c();
		
		System.out.println("Insercion Directa: ");
		ordenarI.insertionSort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]+ "  ");
		}
		System.out.println("\n\nSeleccion Directa: ");
		ordenarS.seleccionDirecta(array, array.length);
		for(int i = array.length -1; i >= 0; i--){
			System.out.print(array[i]+ "  ");
		}
		System.out.println("\n\nIntercambio Directo: ");
		ordenarB.burbuja(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]+ "  ");
		}
	}
}