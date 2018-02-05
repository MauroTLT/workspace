import java.util.Scanner;

public class practica18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto ="";
		char letra=0;
		Scanner entradaTeclado = new Scanner (System.in);
		System.out.println("Escribe un texto");
		texto = entradaTeclado.nextLine();
		entradaTeclado.close();
		for(int i = 0; i< texto.length(); i++){
			letra = texto.charAt(i);
			if(letra >= 'A'&& letra <= 'Z' || letra == ' '){
				System.out.print(texto.charAt(i));
			}else if(letra >= 'a'&& letra <= 'z'){
				letra = (char)(letra - 'a' + 'A');
				System.out.print(letra);
			}else if(letra == 'ñ'){
				letra = 'Ñ';
				System.out.print(letra);
			}
		}
	}

}
