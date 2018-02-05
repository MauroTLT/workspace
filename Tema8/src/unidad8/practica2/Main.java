package unidad8.practica2;

import java.util.Scanner;

public class Main {
	Garaje garaje = new Garaje();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		Main programa = new Main();
		programa.inici(entradaTeclado);
		
	}

	public void inici(Scanner entradaTeclado) {
		menu(entradaTeclado);
	}

	public void menu(Scanner entradaTeclado) {
		String matricula = "";
		String direccionD = "";
		String palabraClave = "";
		String descripcion = "";
		int kms = 0;
		System.out.println("\nAñadir Coche(1)  |  Buscar Coche(2)  |  Asociar Reparación(3)  |  Ultima Reparación(4)  |  Finalizar Programa(5)");
		switch(entradaTeclado.next()) {
			case "1":
				System.out.println("¿Matricula?");
				matricula = entradaTeclado.next(); entradaTeclado.nextLine();
				System.out.println("¿Direccion del Dueño?");
				direccionD = entradaTeclado.nextLine();
				garaje.añadeCoche(new Coche(matricula, direccionD));
				break;
			case "2": 	
				System.out.println("¿Matricula?");
				matricula = entradaTeclado.next();
				if(garaje.buscaCoche(matricula) != null) {
					garaje.buscaCoche(matricula).visualizar();
					System.out.println("¿Palabra Clave?");
					palabraClave = entradaTeclado.next();
					garaje.buscaCoche(matricula).buscaReparaciones(palabraClave);
				}
				break;
			case "3":
				System.out.println("¿Matricula?");
				matricula = entradaTeclado.next(); entradaTeclado.nextLine();
				if(garaje.buscaCoche(matricula) != null) {
					System.out.println("¿Descripcion?");
					descripcion = entradaTeclado.nextLine();
					System.out.println("¿Kms?");
					while (!entradaTeclado.hasNextInt()){
						System.out.println("Formato Incorrecto, prueba otra vez");
						entradaTeclado.next();
					}
					kms = entradaTeclado.nextInt();
					garaje.buscaCoche(matricula).añadeReparacion(new Reparacion(descripcion, kms));
				}
				break;
			case "4": 	
				System.out.println("¿Matricula?");
				matricula = entradaTeclado.next();
				if(garaje.buscaCoche(matricula) != null) {
					if(garaje.buscaCoche(matricula).ultimaReparacion() != null) {
						garaje.buscaCoche(matricula).ultimaReparacion().visualizar();
					}
				}
				break;
			case "5":
				System.out.println("Se procede a finalizar el programa");
				System.exit(0);
				break;
			default:
				System.out.println("Entrada Incorrecta");
				menu(entradaTeclado);
		}
		menu(entradaTeclado);
	}

}
