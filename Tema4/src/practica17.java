import java.util.Scanner;

public class practica17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "";
		int i= 0;
		Scanner entradaTeclado = new Scanner (System.in);
		System.out.println("Escribe un texto");
		texto = entradaTeclado.nextLine();
		System.out.println(texto);
		
		for(i = texto.length() - 1; i >= 0; i--){
			System.out.print(texto.charAt(i));
		}
		entradaTeclado.close();
	}

}
