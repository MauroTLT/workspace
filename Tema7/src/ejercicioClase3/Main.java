package ejercicioClase3;

import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		int tam = 0;
		Telefono t1 = new Telefono(998, 669);
		Telefono t2 = new Telefono(997, 668);
		Telefono t3 = new Telefono(996, 667);
		Telefono t4 = new Telefono(995, 666);
		Telefono t5 = new Telefono(994, 665);
		
		Dispositivo d1 = new Dispositivo("1", "Teclado", "Periferico");
		Dispositivo d2 = new Dispositivo("2", "PC", "Terminal");
		Dispositivo d3 = new Dispositivo("3", "HDD", "Componente");
		Dispositivo d4 = new Dispositivo("4", "Portatil", "Terminal");
		Dispositivo d5 = new Dispositivo("5", "iPad", "Terminal");
		
		System.out.println("¿Tamaño de la lista?");
		tam = entradaTeclado.nextInt();
		entradaTeclado.close();
		Tecnico Tecnico1 = new Tecnico("Mauro", "Pérez Moliner", t1, tam);
		
		Tecnico1.recibirDispositivo(d1);
		Tecnico1.recibirDispositivo(d3);
		Tecnico1.recibirDispositivo(d4);
		Tecnico1.recibirDispositivo(d5);
		
		Tecnico1.mostrarDispositivos();
		
		Tecnico1.repararDispositivo("1");
		Tecnico1.repararDispositivo("3");
		Tecnico1.repararDispositivo("5");
		Tecnico1.mostrarDispositivos();
		
		Tecnico1.averiarDispositivo();
		Tecnico1.mostrarDispositivos();
	}
}
