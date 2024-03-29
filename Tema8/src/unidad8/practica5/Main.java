package unidad8.practica5;

import java.util.ArrayList;
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
				Coche coche = garaje.buscaCoche(matricula);
				if(coche != null) {
					garaje.buscaCoche(matricula).visualizar();
					System.out.println("¿Palabra Clave?");
					palabraClave = entradaTeclado.next();
					ArrayList<Reparacion> reparaciones = coche.buscaReparaciones(palabraClave);
					for(Reparacion i : reparaciones){
						i.visualizar();
					}
				}
				break;
			case "3":
				System.out.println("¿Matricula?");
				matricula = entradaTeclado.next(); entradaTeclado.nextLine();
				Coche coche2 = garaje.buscaCoche(matricula);
				if(coche2 != null) {
					System.out.println("¿Descripcion?");
					descripcion = entradaTeclado.nextLine();
					System.out.println("¿Kms?");
					while (!entradaTeclado.hasNextInt()){
						System.out.println("Formato Incorrecto, prueba otra vez");
						entradaTeclado.next();
					}
					kms = entradaTeclado.nextInt();
					coche2.añadeReparacion(new Reparacion(descripcion, kms));
				}
				break;
			case "4": 	
				System.out.println("¿Matricula?");
				matricula = entradaTeclado.next();
				Coche coche3 = garaje.buscaCoche(matricula);
				if(coche3 != null) {
					if(coche3.ultimaReparacion() != null) {
						coche3.ultimaReparacion().visualizar();
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
