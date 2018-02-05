package ejercicioClase2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		int tam = 0;
		double precipHora;
		int dia, mes, año, hora;
		
		System.out.println("¿Tamaño de la lista?");
		tam = entradaTeclado.nextInt();
		DatosPluviometro datos = new DatosPluviometro(tam);
		
		for(int i = 0; i < tam; i++){
			System.out.println("¿Precipitación por hora?");
			precipHora = entradaTeclado.nextDouble();
			System.out.println("¿Dia?");
			dia = entradaTeclado.nextInt();
			System.out.println("¿Mes?");
			mes = entradaTeclado.nextInt();
			System.out.println("¿Año?");
			año = entradaTeclado.nextInt();
			System.out.println("¿Hora?");
			hora = entradaTeclado.nextInt();
			
			datos.agregar(precipHora, dia, mes, año, hora);
		}
		
		System.out.println("¿Mes?");
		mes = entradaTeclado.nextInt();
		System.out.println("¿Año?");
		año = entradaTeclado.nextInt();
		
		datos.listarMes(mes, año);
		entradaTeclado.close();
		
	}

}