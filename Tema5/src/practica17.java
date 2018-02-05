import java.util.Scanner;

public class practica17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resultado = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Escribe un numero");
		while (!entradaTeclado.hasNextDouble()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		resultado = entradaTeclado.nextDouble();
		for(int i = 0; i < resultado; i++){
			System.out.println(fibo(i));
		}
		entradaTeclado.close();
	}
	public static double fibo(double pos){
		if(pos == 0 || pos == 1){
			return pos;
		} else {
			return pos = (fibo(pos-2) + fibo(pos-1));
		}
			
	}
	

}
