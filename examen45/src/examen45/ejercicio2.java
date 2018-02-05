package examen45;

/**
 * @author Mauro Perez 1DAM MAÑANA
 *
 */
public class ejercicio2 {
	int[] resultado = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio2 programa = new ejercicio2();
		programa.inici();
	}
	public void inici() {
		int[] array1 = {-30, 10, 13, 77};
		int[] array2 = {0, 10, 20};
		
		calcular(array1, array2);
		System.out.println("Arrays juntos y ordenados");
		for(int i = 0; i < resultado.length; i++){
			System.out.print(resultado[i] + " ");
		}
		System.out.println("\nArray sin duplicados");
		duplicados();
	}
	public void duplicados() {
	    int lon = resultado.length;
	    for(int i = 0; i < lon; i++) {
	        for(int j = i + 1; j < lon; j++) {
	            if(resultado[i] == resultado[j]) {                  
	                int mover = j;
	                for(int k = j+1; k < lon; k++, mover++) {
	                    resultado[mover] = resultado[k];
	                }
	                lon--;
	                j--;
	            }
	        }
	    }
	    for(int i = 0; i < lon; i++){
	    	System.out.print(resultado[i] + " ");
	    }
	}
	public void calcular(int[] array1, int[] array2) {
		resultado = new int[array1.length+array2.length];
		int j = 0;
		for(int i = 0; i < resultado.length; i++){
			if(i < array1.length){
				resultado[i] = array1[i];
			} else {
				resultado[i] = array2[j];
				j++;
			}
		}
		for(int i = 1; i < resultado.length; i++){
			for(int k = 0;k < resultado.length-i;k++){
				if(resultado[k] < resultado[k+1]){
					int aux = resultado[k];
					resultado[k] = resultado[k+1];
					resultado[k+1] = aux;
				}
			}
		}
	}
}