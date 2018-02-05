import java.util.Scanner;

public class practica3 {
	// variable global
	private int[] llistaEnters = null;
	Scanner entradaTeclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practica3 programa = new practica3();
		programa.inici();
	}
	public void inici() {
		preguntarTotal();
		llegirLlista();
		ordenarLlista();
		mostrarLlista();
	}
	public void preguntarTotal(){
		System.out.println("Escribe cuantos numeros vas a escribir");
		while (!entradaTeclado.hasNextInt()) {
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		llistaEnters = new int [entradaTeclado.nextInt()];
	}
	public void llegirLlista() {
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