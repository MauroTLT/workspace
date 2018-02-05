
public class practica16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resultado = 0;
		resultado = factorial(5);
		System.out.println(resultado);
	}
	public static double factorial(double n){
		if(n==0){
			return 1;
		} else return n*(factorial(n-1));
			
	}

}
