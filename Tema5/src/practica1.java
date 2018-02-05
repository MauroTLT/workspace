import java.util.*;

public class practica1 {
	// variable global
	private int[] llistaEnters = new int[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practica1 programa = new practica1();
		programa.inici();
	}
	public void inici() {
		llegirLlista();
		ordenarLlista();
		mostrarLlista();
	}
	public void llegirLlista() {
		Scanner entradaTeclado = new Scanner(System.in);
		for (int i = 0; i < llistaEnters.length; i++) {
			System.out.println("Escribe un numero");
			while (!entradaTeclado.hasNextInt()) {
				System.out.println("Formato Incorrecto");
				entradaTeclado.next();
			}
			llistaEnters[i] = entradaTeclado.nextInt();
			System.out.println(llistaEnters[i] + "	");
		}
		entradaTeclado.close();
	}
	public void ordenarLlista() {
		for (int i = 0; i < llistaEnters.length - 1;i++){
			for (int j = i + 1; j < llistaEnters.length; j++){
				if (llistaEnters[i] > llistaEnters[j]){
					int canvi = llistaEnters[i];
					llistaEnters[i] = llistaEnters[j];
					llistaEnters[j] = canvi;
				}
			}
		}
	}
	public void mostrarLlista() {
		for (int i = 0; i < llistaEnters.length; i++) {
			System.out.print(llistaEnters[i] + "	");
		}
	}
}