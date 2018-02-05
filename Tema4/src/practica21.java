import java.util.Scanner;

public class practica21 {

	public static final String PALABRA_SECRETA = "Alcachofa";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "";
		boolean acabar = false;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("¿Cual es la palabra secreta?");
		texto = entradaTeclado.nextLine();
		while (acabar==false) {
			if(texto.equals(PALABRA_SECRETA)) {
				System.out.println("Correcto has acertado");
				acabar = true;
			} else {
				System.out.println("Mal, prueba otra vez");
				texto = entradaTeclado.nextLine();
			}
		}
		entradaTeclado.close();
	}

}