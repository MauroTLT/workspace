import java.util.Scanner;

public class practica2 {
	// variable global

	private int[] llistaEnters = new int[10];
	private int valoresInf = 0;
	private int mayor = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practica2 programa = new practica2();
		programa.inici();
	}
	public void inici() {
		llegirLlista();
		ordenarLlista();
		mostrarLlista();
		valorMedio();
		valoresInferiores();
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
	public void valorMedio(){
		for (int i = 0; i < llistaEnters.length; i++) {
			if(i==1) {
				mayor = llistaEnters[i];
			} else if (llistaEnters[i] > mayor) {
				mayor = llistaEnters[i];
			}
		}
	}
	public void valoresInferiores(){
			for (int j = 0; j < llistaEnters.length; j++) {
				if(llistaEnters[j] < (mayor / 2)){
					valoresInf++;
				}
			}
		System.out.println("\nHay " + valoresInf + " numeros menores que la mitad del mayor.");
	}

}