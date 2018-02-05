
public class practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayA= {10,20,30,40,50};
		int[] arrayB= {50,60,70,80,100};
		int[] arrayC= new int[5];
		int suma= 0;
		
		suma= arrayA[3] + arrayB[4];
		System.out.println(suma);
		
		arrayC[1] = suma + arrayA[0];
		System.out.println(arrayC[1]);
	

		//El valor de los elementos del arrayC no declarados es 0.
		System.out.println(arrayC[0] + " " + arrayC[2] + " " + arrayC[3] + " " + arrayC[4]);
		
		//Ya que hemos declarado que nuestro array tiene 5 posiciones, no existe un quinto o sexto valor.
		System.out.println(arrayC[5]);
	}
}
