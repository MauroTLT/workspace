package ampliacionT8;

import java.util.Scanner;

public class Main {
	CentroDocente batoi = new CentroDocente();
	
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
		String nombre, apellido, dni, estado, aux, elec = "";
		int anios = 0;
		double salario = 0.0;
		System.out.println("\nDar de Alta(1)  |  Dar de Baja(2)  |  Imprimir Listado(3)  |  Imprimir Nominas(4)  |  Finalizar Programa(5)");
		switch(entradaTeclado.next()) {
			case "1":
				System.out.println("¿Que clase de persona?");
				System.out.println("Profesor(1)  |  Persona de Servicio(2)  |  Estudiante(3)");
				elec = entradaTeclado.next();
				System.out.println("¿Nombre?");
				nombre = entradaTeclado.next(); entradaTeclado.nextLine();
				System.out.println("¿Apellidos?");
				apellido = entradaTeclado.nextLine();
				System.out.println("¿DNI?");
				dni = entradaTeclado.next();
				System.out.println("¿Estado Civil?");
				estado = entradaTeclado.next();
				switch(elec) {
					case "1":
						System.out.println("¿Año de incorporación?");
						while (!entradaTeclado.hasNextInt()) {
							System.out.println("Formato Incorrecto, prueba otra vez");
							entradaTeclado.next();
						}
						anios = entradaTeclado.nextInt();
						System.out.println("¿Salario?");
						while (!entradaTeclado.hasNextDouble()){
							System.out.println("Formato Incorrecto, prueba otra vez");
							entradaTeclado.next();
						}
						salario = entradaTeclado.nextDouble();
						System.out.println("¿Departamento?");
						aux = entradaTeclado.next();
						Persona profesor = new Profesor(nombre, apellido, dni, estado, anios, salario, aux);
						batoi.darAlta(profesor);
						break;
					case "2":
						System.out.println("¿Año de incorporación?");
						while (!entradaTeclado.hasNextInt()){
							System.out.println("Formato Incorrecto, prueba otra vez");
							entradaTeclado.next();
						}
						anios = entradaTeclado.nextInt();
						System.out.println("¿Salario?");
						while (!entradaTeclado.hasNextDouble()){
							System.out.println("Formato Incorrecto, prueba otra vez");
							entradaTeclado.next();
						}
						salario = entradaTeclado.nextDouble();
						System.out.println("¿Sección?");
						aux = entradaTeclado.next();
						Persona servicio = new PersonalServicio(nombre, apellido, dni, estado, anios, salario, aux);
						batoi.darAlta(servicio);
						break;
					case "3":
						System.out.println("¿Curso?");
						aux = entradaTeclado.next();
						Persona estudiante = new Estudiante(nombre, apellido, dni, estado, aux);
						System.out.println("¿Añadir mas cursos?\nEscribir Si, cuaquier otra cosa para No");
						while(entradaTeclado.next().equalsIgnoreCase("Si")) {
							System.out.println("Nombre del curso");
							aux = entradaTeclado.next();
							((Estudiante) estudiante).matricular(aux);
							System.out.println("¿Añadir mas cursos?\nEscribir Si o No");
						}
						batoi.darAlta(estudiante);
						break;
					default:
						System.out.println("Entrada Incorrecta");
				}
				break;
			case "2":
				System.out.println("¿El DNI de la persona?");
				dni = entradaTeclado.next();
				if(batoi.getPersonas().isEmpty()) {
					System.out.println("No hay miembros activos");
				} else {batoi.darBaja(dni);}
				break;
			case "3":
				if(batoi.getPersonas().isEmpty()) {
					System.out.println("No hay miembros activos");
				} else {batoi.visualizar();}
				break;
			case "4":
				if(batoi.getPersonas().isEmpty()) {
					System.out.println("No hay miembros activos");
				} else {batoi.visualizarSalario();}
				break;
			case "5":
				System.out.println("Se procede a finalizar el programa");
				System.exit(0);
			default:
				System.out.println("Entrada Incorrecta");
		}
		menu(entradaTeclado);
	}

}
