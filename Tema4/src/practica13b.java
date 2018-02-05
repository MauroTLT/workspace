import java.util.Arrays;

/**
 * Iteracion Entrada						Salida
 * {4, 25, 68, 45, 61, 65, 8, 51, 3, 5}		[68, 4, 5, 8, 25, 45, 51, 61, 65, 3]
 * [68, 4, 5, 8, 25, 45, 51, 61, 65, 3]		[68, 65, 5, 8, 25, 45, 51, 61, 4, 3]
 * [68, 65, 5, 8, 25, 45, 51, 61, 4, 3]		[68, 65, 61, 8, 25, 45, 51, 5, 4, 3]
 * [68, 65, 61, 8, 25, 45, 51, 5, 4, 3]		[68, 65, 61, 51, 25, 45, 8, 5, 4, 3]
 * [68, 65, 61, 51, 25, 45, 8, 5, 4, 3]		[68, 65, 61, 51, 45, 25, 8, 5, 4, 3]
 * [68, 65, 61, 51, 45, 25, 8, 5, 4, 3]		[68, 65, 61, 51, 45, 25, 8, 5, 4, 3]
 * [68, 65, 61, 51, 45, 25, 8, 5, 4, 3]		[68, 65, 61, 51, 45, 25, 8, 5, 4, 3]
 * [68, 65, 61, 51, 45, 25, 8, 5, 4, 3]		[68, 65, 61, 51, 45, 25, 8, 5, 4, 3]
 * [68, 65, 61, 51, 45, 25, 8, 5, 4, 3]		[68, 65, 61, 51, 45, 25, 8, 5, 4, 3]
 * [68, 65, 61, 51, 45, 25, 8, 5, 4, 3]		[68, 65, 61, 51, 45, 25, 8, 5, 4, 3]
 * 
 * @author mauro
 */
public class practica13b {
	public void seleccionDirecta(int array[], int n){
		int i = 0;
		int j = 0;
		int index_of_min = 0;
		int temp = 0;
		int pos = 0;
		for(i=0; i<n; i++){
		    index_of_min = i;
		    pos = i;
		    for(j=i; j<n; j++){
		    	if(array[index_of_min]<array[j]){
		    		index_of_min = j;
		    		pos= j;
		    	}
		    }
		    temp = array[i];
		    array[i] = array[pos];
		    array[index_of_min] = temp;
		    System.out.println(Arrays.toString(array));
		}
	}
	
}