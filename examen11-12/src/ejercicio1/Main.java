package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Mauro Pérez Moliner 1ºDAM Mañana
 *
 */
public class Main {

	private static FicheroController fc;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fc = new FicheroController();
		String c1,c2,c3,c4,c5,c6,compl,reint;
		ArrayList<String> array = new ArrayList<String>();
		System.out.println("\nApuestas de Bonoloto\nIntroduce la combinación ganadora: ");
		c1 = sc.next();
		array.add(c1);
		c2 = sc.next();
		array.add(c2);
		c3 = sc.next();
		array.add(c3);
		c4 = sc.next();
		array.add(c4);
		c5 = sc.next();
		array.add(c5);
		c6 = sc.next();
		array.add(c6);
		System.out.println("Introduce tu numero complementario");
		compl = sc.next();
		array.add(compl);
		System.out.println("Introduce tu reintegro");
		reint = sc.next();
		array.add(reint);
		comprobar(array);
		sc.close();
	}

	private static void comprobar(ArrayList<String> array) {
		String[][] matriz = fc.leer();
		int num = 0, quinta = 0, cuarta = 0, tercera = 0, segunda = 0, primera = 0, reintegro = 0;
		boolean compl = false, rein = false;
		for (int i = 0; i < matriz.length; i++) {
			num = 0;
			compl = false;
			rein = false;
			for (int j = 0; j < matriz[i].length; j++) {
				if(array.contains(matriz[i][j]) && j < 6) {
					num++;
				} else if(array.contains(matriz[i][j]) && j == 6) {
					compl = true;
				} else if(array.contains(matriz[i][j]) && j == 7) {
					rein = true;
				}
			}
			if(num == 3) {
				quinta++;
			} else if(num == 4) {
				cuarta++;
			} else if(num == 5 && !compl) {
				tercera++;
			} else if(num == 5 && compl) {
				segunda++;
			} else if(num == 6) {
				primera++;
			}
			if(rein) {
				reintegro++;
			}
		}
		fc.escribir(quinta,cuarta,tercera,segunda,primera,reintegro);
	}

}
