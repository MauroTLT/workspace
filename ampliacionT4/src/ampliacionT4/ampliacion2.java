package ampliacionT4;

import java.util.Scanner;

public class ampliacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "";
		String texto2 = "";
		char letra = 0;
		int i = 0;
		int min = 0, max = 0;
		int elec = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Escriba una cadena");
		texto = entradaTeclado.nextLine();
		System.out.println("Escriba otra cadena");
		texto2 = entradaTeclado.nextLine();
		
		entradaTeclado.close();
		if(texto.length() < texto2.length()) {
			min = texto.length();
			max = texto2.length();
			elec = 1;
		} else if (texto2.length() < texto.length()) {
			max = texto.length();
			min = texto2.length();
			elec = 2;
		} else {
			min = texto.length();
			max = texto.length();
		}
		for (i = 0; i < max; i++) {
			if ((i == min)) {
				if (elec == 1) {
					for (int j = 0; j < (min - max); j++) {
						letra = texto.charAt(i);
						System.out.print(letra);
						i++;
					}
				}else if (elec ==2) {
					for (int j = 0; j < (max - min); j++) {
						letra = texto.charAt(i);
						System.out.print(letra);
						i++;
						}
				}
				break;
			}
			letra = texto.charAt(i);
			if ((letra >= 'A' && letra <= 'Z' || letra == ' ') && (texto.charAt(i) == texto2.charAt(i))) {
				System.out.print(letra);
			} else if ((letra >= 'a' && letra <= 'z' || letra == ' ') && (texto.charAt(i) == texto2.charAt(i))) {								
				letra = (char) (letra - 'a' + 'A' );
				System.out.print(letra);
			} else if((letra == 'ñ') && (texto.charAt(i) == texto2.charAt(i))) {
				letra = 'Ñ';
				System.out.print(letra);
			} else if((letra == 'á') && (texto.charAt(i) == texto2.charAt(i))) {
				letra = 'Á';
				System.out.print(letra);
			} else if((letra == 'é') && (texto.charAt(i) == texto2.charAt(i))) {
				letra = 'É';
				System.out.print(letra);
			} else if((letra == 'í') && (texto.charAt(i) == texto2.charAt(i))) {
				letra = 'Í';
				System.out.print(letra);
			} else if((letra == 'ó') && (texto.charAt(i) == texto2.charAt(i))) {
				letra = 'Ó';
				System.out.print(letra);
			} else if((letra == 'ú') && (texto.charAt(i) == texto2.charAt(i))) {
				letra = 'Ú';
				System.out.print(letra);
			} else {
				System.out.print(letra);
			}
		}
	}
}