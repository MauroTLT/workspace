package examen45;

/**
 * @author Mauro Perez 1DAM MAÑANA
 *
 */
public class ejercicio1 {

	final static String CADENA = "Temperatura"; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vocales = {"","","","",""};
		for(int i = 0; i < CADENA.length(); i++){
			if(CADENA.charAt(i) == 'A'|| CADENA.charAt(i) == 'a' || CADENA.charAt(i) == 'Á' || CADENA.charAt(i) == 'á'){
				vocales[0]+= "*";
			} else if(CADENA.charAt(i) == 'E'|| CADENA.charAt(i) == 'e' || CADENA.charAt(i) == 'É' || CADENA.charAt(i) == 'é'){
				vocales[1]+= "*";
			} else if(CADENA.charAt(i) == 'I'|| CADENA.charAt(i) == 'i' || CADENA.charAt(i) == 'Í' || CADENA.charAt(i) == 'í'){
				vocales[2]+= "*";
			} else if(CADENA.charAt(i) == 'O'|| CADENA.charAt(i) == 'o' || CADENA.charAt(i) == 'Ó' || CADENA.charAt(i) == 'ó'){
				vocales[3]+= "*";
			} else if(CADENA.charAt(i) == 'U'|| CADENA.charAt(i) == 'u' || CADENA.charAt(i) == 'Ú' || CADENA.charAt(i) == 'ú'){
				vocales[4]+= "*";
			}
		}
		System.out.println("VOCALES\n----------");
		System.out.println("A " + vocales[0]);
		System.out.println("E " + vocales[1]);
		System.out.println("I " + vocales[2]);
		System.out.println("O " + vocales[3]);
		System.out.println("U " + vocales[4]);
	}
}