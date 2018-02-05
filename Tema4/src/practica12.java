
public class practica12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arrayA = new float [10];
		float[] arrayB = {1.1F , 2.2F , 3.3F , 4.4F , 5.5F , 6.6F , 7.7F , 8.8F , 9.9F , 10.1F};
		
		for(int i = 0; i < arrayA.length; i++){
			arrayA[i] = arrayB[i];
		}
		for(int i = 0; i < arrayA.length; i++){
			System.out.print(arrayA[i]+ "  ");
		}
	}
}
