package FireEmblem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		int movimientos = 0;
		Arma espada = new Arma("Espada");
		Arma lanza = new Arma("Lanza");
		Arma hacha = new Arma("Hacha", lanza, espada);
		
		espada.setVentaja(hacha);
		espada.setDesventaja(lanza);
		lanza.setVentaja(espada);
		lanza.setDesventaja(hacha);
		
		Casilla a = new Casilla("Arboleda", false, "♣");
		Casilla m = new Casilla("Montaña", false, "■");
		Casilla p = new Casilla("Planicie", false, " ");
		
		Casilla[][] t1 = new Casilla[][]
				{
					{new Casilla(p,0,0), new Casilla(p,0,1), new Casilla(p,0,2), new Casilla(p,0,3), new Casilla(p,0,4), new Casilla(p,0,5)},
					{new Casilla(p,1,0), new Casilla(p,1,1), new Casilla(p,1,2), new Casilla(m,1,3), new Casilla(a,1,4), new Casilla(p,1,5)},
					{new Casilla(p,2,0), new Casilla(a,2,1), new Casilla(m,2,2), new Casilla(m,2,3), new Casilla(p,2,4), new Casilla(p,2,5)},
					{new Casilla(p,3,0), new Casilla(p,3,1), new Casilla(m,3,2), new Casilla(m,3,3), new Casilla(p,3,4), new Casilla(p,3,5)},
					{new Casilla(p,4,0), new Casilla(p,4,1), new Casilla(m,4,2), new Casilla(m,4,3), new Casilla(a,4,4), new Casilla(p,4,5)},
					{new Casilla(p,5,0), new Casilla(a,5,1), new Casilla(m,5,2), new Casilla(m,5,3), new Casilla(p,5,4), new Casilla(p,5,5)},
					{new Casilla(p,6,0), new Casilla(p,6,1), new Casilla(m,6,2), new Casilla(a,6,3), new Casilla(p,6,4), new Casilla(p,6,5)},
					{new Casilla(p,7,0), new Casilla(p,7,1), new Casilla(p,7,2), new Casilla(p,7,3), new Casilla(p,7,4), new Casilla(a,7,5)}
				};
		Tablero tablero1 = new Tablero("Arena 1", t1);

		Personaje p1 = new Personaje("Subaki", "Volador", lanza, 40, 20, 25, tablero1.getMapa()[0][0], "♝", 4);
		Personaje p2 = new Personaje("Marth", "Infanteria", espada, 40, 30, 20, tablero1.getMapa()[1][0], "♜", 2);
		Personaje p3 = new Personaje("Ike", "Infanteria", hacha, 50, 40, 5, tablero1.getMapa()[7][0], "♛", 2);
		Personaje p4 = new Personaje("Frederick", "Caballeria", espada, 45, 30, 15, tablero1.getMapa()[6][0], "♞",4);
		
		Personaje p5 = new Personaje("Cordelia", "Volador", hacha, 40, 20, 25, tablero1.getMapa()[1][5], "♗", 4);
		Personaje p6 = new Personaje("Daraen", "Infanteria", espada, 40, 30, 20, tablero1.getMapa()[2][5], "♖", 2);
		Personaje p7 = new Personaje("Azura", "Infanteria", lanza, 50, 40, 5, tablero1.getMapa()[5][5], "♕", 2);
		Personaje p8 = new Personaje("Abel", "Caballeria", espada, 45, 30, 15, tablero1.getMapa()[6][5], "♘",4);

		tablero1.getMapa()[0][0].setPersonaje(p1);
		tablero1.getMapa()[1][0].setPersonaje(p2);
		tablero1.getMapa()[7][0].setPersonaje(p3);
		tablero1.getMapa()[6][0].setPersonaje(p4);
		tablero1.getMapa()[1][5].setPersonaje(p5);
		tablero1.getMapa()[2][5].setPersonaje(p6);
		tablero1.getMapa()[5][5].setPersonaje(p7);
		tablero1.getMapa()[6][5].setPersonaje(p8);
		
		menu(entradaTeclado, tablero1, movimientos);
		tablero1.getMapa()[0][0].getPersonaje().getArma().getVentaja().getDesventaja().getNombre();
	}
	
	public static void menu(Scanner entradaTeclado, Tablero tablero1, int movimientos) {
		String personaje = "";
		boolean semaforo = false;
		int fila = 0;
		int columna = 0;
		if(movimientos % 2 == 0) {
			System.out.println("\nJugador 1");
		} else {
			System.out.println("\nJugador 2");
		}
		System.out.println("1.Mover\t\t2.Visualizar Personaje\t\t3.Visualizar Casilla\t4.Mapa");
		switch(entradaTeclado.nextInt()) {
		case 1:
			semaforo = false;
			System.out.println("Nombre del personaje a mover: ");
			personaje = entradaTeclado.next();
			for(int j = 0; j < tablero1.getMapa().length && semaforo != true; j++) {
				for(int k = 0; k < tablero1.getMapa()[j].length && semaforo != true; k++) {
					if(tablero1.getMapa()[j][k].getPersonaje() != null) {
						if(tablero1.getMapa()[j][k].getPersonaje().getNombre().equals(personaje)) {
							System.out.println("A la Fila: ");
							while (!entradaTeclado.hasNextInt()){
								System.out.println("Formato Incorrecto, prueba otra vez");
								entradaTeclado.next();
							}
							fila = entradaTeclado.nextInt();
							if(tablero1.getMapa()[j][k].getFila() < fila){
								while(fila - tablero1.getMapa()[j][k].getFila() > tablero1.getMapa()[j][k].getPersonaje().getPasos() || (fila > tablero1.getMapa().length || fila < 0)) {
									System.out.println("El numero es demasiado grande");
									while (!entradaTeclado.hasNextInt()){
										System.out.println("Formato Incorrecto, prueba otra vez");
										entradaTeclado.next();
									}
									fila = entradaTeclado.nextInt();
								}
								System.out.println("A la Columna: ");
								while (!entradaTeclado.hasNextInt()){
									System.out.println("Formato Incorrecto, prueba otra vez");
									entradaTeclado.next();
								}
								columna = entradaTeclado.nextInt();
								if(tablero1.getMapa()[j][k].getColumna() < columna){
									while((columna - tablero1.getMapa()[j][k].getColumna()) > tablero1.getMapa()[j][k].getPersonaje().getPasos() - (tablero1.getMapa()[j][k].getFila() - fila) || (columna > tablero1.getMapa()[j].length || columna < 0)) {
										System.out.println("El numero es demasiado grande");
										while (!entradaTeclado.hasNextInt()){
											System.out.println("Formato Incorrecto, prueba otra vez");
											entradaTeclado.next();
										}
										columna = entradaTeclado.nextInt();
									}
								} else if(tablero1.getMapa()[j][k].getColumna() > columna){
									while((tablero1.getMapa()[j][k].getColumna() - columna) > tablero1.getMapa()[j][k].getPersonaje().getPasos() - (tablero1.getMapa()[j][k].getFila() - fila) || (columna > tablero1.getMapa()[j].length || columna < 0)) {
										System.out.println("El numero es demasiado grande");
										while (!entradaTeclado.hasNextInt()){
											System.out.println("Formato Incorrecto, prueba otra vez");
											entradaTeclado.next();
										}
										columna = entradaTeclado.nextInt();
									}
								}
							} else if(tablero1.getMapa()[j][k].getFila() > fila) {
								while(tablero1.getMapa()[j][k].getFila() - fila > tablero1.getMapa()[j][k].getPersonaje().getPasos() || (fila > tablero1.getMapa().length || fila < 0)) {
									System.out.println("El numero es demasiado grande");
									while (!entradaTeclado.hasNextInt()){
										System.out.println("Formato Incorrecto, prueba otra vez");
										entradaTeclado.next();
									}
									fila = entradaTeclado.nextInt();
								}
								System.out.println("A la Columna: ");
								while (!entradaTeclado.hasNextInt()){
									System.out.println("Formato Incorrecto, prueba otra vez");
									entradaTeclado.next();
								}
								columna = entradaTeclado.nextInt();
								if(tablero1.getMapa()[j][k].getColumna() < columna){
									while((columna - tablero1.getMapa()[j][k].getColumna()) > tablero1.getMapa()[j][k].getPersonaje().getPasos() - (tablero1.getMapa()[j][k].getFila() - fila) || (columna > tablero1.getMapa()[j].length || columna < 0)) {
										System.out.println("El numero es demasiado grande");
										while (!entradaTeclado.hasNextInt()){
											System.out.println("Formato Incorrecto, prueba otra vez");
											entradaTeclado.next();
										}
										columna = entradaTeclado.nextInt();
									}
								} else if(tablero1.getMapa()[j][k].getColumna() > columna){
									while((tablero1.getMapa()[j][k].getColumna() - columna) > tablero1.getMapa()[j][k].getPersonaje().getPasos() - (tablero1.getMapa()[j][k].getFila() - fila) || (columna > tablero1.getMapa()[j].length || columna < 0)) {
										System.out.println("El numero es demasiado grande");
										while (!entradaTeclado.hasNextInt()){
											System.out.println("Formato Incorrecto, prueba otra vez");
											entradaTeclado.next();
										}
										columna = entradaTeclado.nextInt();
									}
								}
							} else {
								System.out.println("A la Columna: ");
								while (!entradaTeclado.hasNextInt()){
									System.out.println("Formato Incorrecto, prueba otra vez");
									entradaTeclado.next();
								}
								columna = entradaTeclado.nextInt();
								if(tablero1.getMapa()[j][k].getColumna() < columna){
									while(((columna - tablero1.getMapa()[j][k].getColumna()) > tablero1.getMapa()[j][k].getPersonaje().getPasos() - 0) || (columna > tablero1.getMapa()[j].length || columna < 0)) {
										System.out.println("El numero es demasiado grande");
										while (!entradaTeclado.hasNextInt()){
											System.out.println("Formato Incorrecto, prueba otra vez");
											entradaTeclado.next();
										}
										columna = entradaTeclado.nextInt();
									}
								} else if(tablero1.getMapa()[j][k].getColumna() > columna){
									while(((tablero1.getMapa()[j][k].getColumna() - columna) > tablero1.getMapa()[j][k].getPersonaje().getPasos() - 0) || (columna > tablero1.getMapa()[j].length || columna < 0)) {
										System.out.println("El numero es demasiado grande");
										while (!entradaTeclado.hasNextInt()){
											System.out.println("Formato Incorrecto, prueba otra vez");
											entradaTeclado.next();
										}
										columna = entradaTeclado.nextInt();
									}
								}
							}
							if(tablero1.getMapa()[fila][columna].getPersonaje() != null) {
								System.out.println("Posicion ya ocupada por " + tablero1.getMapa()[fila][columna].getPersonaje().getNombre());
								semaforo = true;
							} else if(tablero1.getMapa()[fila][columna].getSimbolo().equals("■") && tablero1.getMapa()[j][k].getPersonaje().getTipo().equals("Volador") && semaforo != true) {
								tablero1.getMapa()[j][k].getPersonaje().setCasilla(tablero1.getMapa()[fila][columna]);
								tablero1.getMapa()[fila][columna].setPersonaje(tablero1.getMapa()[j][k].getPersonaje());
								tablero1.getMapa()[j][k].setPersonaje(null);
								movimientos++;
							} else if(tablero1.getMapa()[fila][columna].getSimbolo().equals("♣") && ((tablero1.getMapa()[j][k].getPersonaje().getTipo().equals("Volador")) || (tablero1.getMapa()[j][k].getPersonaje().getTipo().equals("Infanteria"))) && semaforo != true) {
								tablero1.getMapa()[j][k].getPersonaje().setCasilla(tablero1.getMapa()[fila][columna]);
								tablero1.getMapa()[fila][columna].setPersonaje(tablero1.getMapa()[j][k].getPersonaje());
								tablero1.getMapa()[j][k].setPersonaje(null);
								movimientos++;
							} else if(tablero1.getMapa()[fila][columna].getSimbolo().equals(" ") && semaforo != true) {
								tablero1.getMapa()[j][k].getPersonaje().setCasilla(tablero1.getMapa()[fila][columna]);
								tablero1.getMapa()[fila][columna].setPersonaje(tablero1.getMapa()[j][k].getPersonaje());
								tablero1.getMapa()[j][k].setPersonaje(null);
								movimientos++;
							} else {
								System.out.println("Ese personaje no se puede mover a esa posición");
							}
							semaforo = true;
						}
					} else if ((j == tablero1.getMapa().length - 1) && (k == tablero1.getMapa()[j].length - 1) && semaforo != true) {
						System.out.println("Personaje no encontrado");
					}
				}
			}
			break;
		case 2:
			semaforo = false;
			System.out.println("Nombre del personaje: ");
			personaje = entradaTeclado.next();
			for(int j = 0; j < tablero1.getMapa().length && semaforo != true; j++) {
				for(int k = 0; k < tablero1.getMapa()[j].length && semaforo != true; k++) {
					if(tablero1.getMapa()[j][k].getPersonaje() != null) {
						if(tablero1.getMapa()[j][k].getPersonaje().getNombre().equals(personaje)) {
							System.out.println(tablero1.getMapa()[j][k].getPersonaje().toString());
							semaforo = true;
						}
					} else if ((j == tablero1.getMapa().length - 1) && (k == tablero1.getMapa()[j].length - 1) && semaforo != true) {
						System.out.println("Personaje no encontrado");
					}
				}
			}
			break;
		case 3:
			System.out.println("Fila: ");
			fila = entradaTeclado.nextInt();
			System.out.println("Columna: ");
			columna = entradaTeclado.nextInt();
			tablero1.getMapa()[fila][columna].visualizar();
			break;
		case 4:
			tablero1.visualizar();
			break;
		default:
			System.out.println("Orden incorrecta");
			menu(entradaTeclado, tablero1, movimientos);
		}
		System.out.println();
		menu(entradaTeclado, tablero1, movimientos);
	}
	
	public void mover(){
		
	}

}