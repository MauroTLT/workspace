
import java.io.*;
import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		String nomfich="";
		String nompalabra="";
		String[] division;
		boolean flag=false;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero a leer: ");
		nomfich=input.nextLine();
		
		System.out.println("Introduce la palabra a buscar: ");
		nompalabra=input.nextLine();
	
		
		if (!(new File(nomfich)).exists()) {
			System.out.println("No he encontrado el fichero");
			input.close();
			return;
		}
		System.out.println("Buscando en fichero de texto...");
		try {
			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(new File(nomfich)));
			
			String linea = null;
			while ((linea = ficheroEntrada.readLine()) != null) {
				division=linea.split(" ");
				for (int i=0; i<division.length && flag==false; i++){
					if (division[i].equals(nompalabra)){
						flag=true;
						System.out.println(linea);
					}
				}

				
			}
			ficheroEntrada.close();

		} catch (IOException errorDeFichero) {
			System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
		}
		
		input.close();
	}
}