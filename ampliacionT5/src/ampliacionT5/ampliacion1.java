package ampliacionT5;

public class ampliacion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ampliacion1 programa = new ampliacion1();
		programa.inici();
	}
	public void inici() {
		int[] array1 = {-30, 10, 13, 80};
		int[] array2 = {0, 10, 20};
		int[] resultado = new int[array1.length + array2.length];
		System.out.println("Primer array");
		representar(array1);
		System.out.println("\n\nSegundo array");
		representar(array2);
		
		resultado=juntar(array1, array2, resultado);
		System.out.println();
		resultado=ordenar(resultado);
		System.out.print("Arrays juntos y ordenados: ");
		representar(resultado);
	}
	public int[] juntar(int[]array1, int[]array2, int[]resultado) {
		System.out.print("\n\nArrays juntos: ");
		for(int i = 0; i < resultado.length; i++) {//Juntar arrays
			if(i < array1.length) {
				resultado[i] = array1[i];
			} else {
				resultado[i] = array2[i - array1.length];
			}
			System.out.print(resultado[i] + " ");
		}
		return resultado;
	}
	public int[] ordenar(int[]resultado) {
		int aux = 0;
		for(int i = 1; i < resultado.length; i++) {//Ordenacion del resultado
			for(int j = 0;j < resultado.length-i;j++){
				if(resultado[j] > resultado[j+1]){
					aux = resultado[j];
					resultado[j] = resultado[j+1];
					resultado[j+1] = aux;
				}
			}
		}
		return resultado;
	}
	public void representar(int[]resultado) {
		for(int i = 0; i < resultado.length; i++) {
			System.out.print(resultado[i] + " ");
		}
	}
}