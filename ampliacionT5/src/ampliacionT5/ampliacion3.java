package ampliacionT5;

import java.util.Scanner;

public class ampliacion3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ampliacion3 programa = new ampliacion3();
		programa.inici();
	}
	public void inici() {
		Scanner entradaTeclado = new Scanner(System.in);
		int tam = 0;
		tam = longLista(entradaTeclado, tam);
		String[][] lista = new String[tam][2];
		llenar(lista);
		tratarOpcion(entradaTeclado, lista);
		entradaTeclado.close();
	}
	public void llenar(String[][] lista){
		for(int i = 0; i < lista.length; i++) {
			lista[i][0]= "";
			lista[i][1]= "[ ]";
		}
	}
	public void tratarOpcion(Scanner entradaTeclado, String[][] lista) {
		int opcion = 0;
		opcion = menu(entradaTeclado, opcion);
		switch(opcion) {
		case 1:
			if(lista[lista.length - 1][0] != ""){
				System.out.println("Lista llena");
			} else {
				añadir(entradaTeclado, lista);
			}
			break;
		case 2:
			ordenar(entradaTeclado, lista);
			break;
		case 3:
			modificar(entradaTeclado, lista);
			break;
		case 4:
			representar(lista);
			break;
		case 5:
			salir();
		}
		tratarOpcion(entradaTeclado, lista);
	}
	public void añadir(Scanner entradaTeclado, String[][]lista){
		System.out.println("¿Que objeto desea añadir?");
		for(int i = 0; i < lista.length; i++) {
			if(lista[i][0] == "") {
				lista[i][0] = entradaTeclado.nextLine();
				i = lista.length - 1;
			}
		}
	}
	public void ordenar(Scanner entradaTeclado, String[][]lista){
		String aux = "";
		String aux2 = "";
		for(int i = 0;i < (lista.length-1);i++) {
			for(int j = i+1;j <lista.length;j++) {
				if(lista[i][0].compareToIgnoreCase(lista[j][0])>0){
					aux=lista[i][0];
					aux2=lista[i][1];
					lista[i][0]=lista[j][0];
					lista[i][1]=lista[j][1];
					lista[j][0]=aux;
					lista[j][1]=aux2;
				}
			}
		}
	}
	public void modificar(Scanner entradaTeclado, String[][]lista){
		int numeroL = 0;
		int cambio = 0;
		boolean semaforo = false;
		System.out.println("¿Que numero de la lista quieres modificar?");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
		numeroL = entradaTeclado.nextInt();
		while(numeroL < 1 || numeroL > lista.length) {
			System.out.println("El numero es demasiado grande");
			while (!entradaTeclado.hasNextInt()){
				System.out.println("Formato Incorrecto, prueba otra vez");
				entradaTeclado.next();
			}
			numeroL = entradaTeclado.nextInt();
		}
		numeroL--;
		while (semaforo == false){
			System.out.println("¿Quieres modificar el nombre(1), marcarlo como que ya lo tienes(2) o desmarcarlo(3)?");
			while (!entradaTeclado.hasNextInt()){
				System.out.println("Formato Incorrecto, prueba otra vez");
				entradaTeclado.next();
			}
			cambio = entradaTeclado.nextInt();
			entradaTeclado.nextLine();
			switch(cambio) {
				case 1:
					System.out.println("Escribe con que lo quieres cambiar");
					lista[numeroL][0] = entradaTeclado.nextLine();
					semaforo = true;
					break;
				case 2:
					if(lista[numeroL][0] == ""){
						System.out.println("No puedes marcar un objeto que todavia no has añadido");
					} else {
					lista[numeroL][1] = "[X]";
					semaforo = true;
					}
					break;
				case 3:
					lista[numeroL][1] = "[ ]";
					semaforo = true;
					break;
				default:
					System.out.println("Entrada Incorrecta");
					semaforo = false;
			}
		}
	}
	public int longLista(Scanner entradaTeclado, int tam){
		System.out.println("Tamaño de la lista");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
		tam = entradaTeclado.nextInt();
		return tam;
	}
	public void salir(){
		System.out.println("Finalizando programa");
		System.exit(0);
	}
	public int menu(Scanner entradaTeclado, int opcion) {
		System.out.println("          Lista de la compra");
		System.out.println("--------------------------------------");
		System.out.println("[1] -  Añadir artículos");
		System.out.println("[2] -  Ordenar lista");
		System.out.println("[3] -  Modificar lista");
		System.out.println("[4] -  Ver la lista");
		System.out.println("[5] -  Finalizar programa");
		while (!entradaTeclado.hasNextInt()){
			System.out.println("Formato Incorrecto, prueba otra vez");
			entradaTeclado.next();
		}
		opcion = entradaTeclado.nextInt();
		entradaTeclado.nextLine();
		while(opcion < 1 || opcion > 5) {
			System.out.println("El numero es demasiado grande");
			while (!entradaTeclado.hasNextInt()){
				System.out.println("Formato Incorrecto, prueba otra vez");
				entradaTeclado.next();
			}
			opcion = entradaTeclado.nextInt();
		}
		return opcion;
	}
	public void representar(String[][] lista) {
		for(int i = 0; i < lista.length; i++) {
			System.out.print(1+i + ")" + lista[i][0] + "\t");
			System.out.print(lista[i][1]);
			System.out.println();
		}
	}
}