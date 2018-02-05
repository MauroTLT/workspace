package ampliacion;

import java.util.Scanner;

public class ampliacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		String cadena = "";
		String digito = "";
		int resultado = 0;
		int i = 0;
		
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
        numero = entradaTeclado.nextInt();
        entradaTeclado.close();
        
        cadena = String.valueOf(numero);

        for (i = 0; i <  cadena.length(); i++){
        	digito = cadena.substring(i, i+1);
        	resultado = resultado + Integer.parseInt(digito)*Integer.parseInt(digito)*Integer.parseInt(digito);
        }
        System.out.println("El resultado es: "+ resultado);
        		
	}

}
