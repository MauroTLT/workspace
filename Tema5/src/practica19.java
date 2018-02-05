import java.util.Scanner;

public class practica19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal = 0;
		String resultado =""; 
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Escribe un numero");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		decimal = entradaTeclado.nextInt();
		resultado = binario(decimal, resultado);
		for(int i = resultado.length() - 1; i >= 0; i--){
			System.out.print(resultado.charAt(i));
		}
		entradaTeclado.close();
	}
	public static String binario(int num, String resultado){
		if(num == 0){
			return resultado+=0;
		}
		if(num == 1){
			return resultado+=1;
		}
		if(num % 2 == 1){
			resultado += "1";
		} else if(num % 2 == 0){
			resultado += "0";
		}
		return binario(num / 2, resultado);
	}

}
