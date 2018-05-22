package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Mauro Pérez Moliner 1ºDAM Mañana
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JDBCBonolotoDAO jdbc = new JDBCBonolotoDAO();
		menu(sc, jdbc);
	}

	private static void menu(Scanner sc, JDBCBonolotoDAO jdbc) {
		int c1,c2,c3,c4,c5,c6,compl,reint;
		BonolotoModel model = null;
		System.out.println("\nApuestas de Bonoloto\nMenu: \n\t1. Introducir y guardar apuesta\n\t2. Mostrar Histórico apuestas");
		switch (sc.next()) {
		case "1":
			int num = 0;
			System.out.println("Introduce tu combinación");
			c1 = sc.nextInt();
			c2 = sc.nextInt();
			c3 = sc.nextInt();
			c4 = sc.nextInt();
			c5 = sc.nextInt();
			c6 = sc.nextInt();
			System.out.println("Introduce tu numero complementario");
			compl = sc.nextInt();
			System.out.println("Introduce tu reintegro");
			reint = sc.nextInt();
			model = new BonolotoModel(c1,c2,c3,c4,c5,c6,compl,reint);

			num = jdbc.insertarApuesta(model);
			if (num > 0) {
				System.out.println("Guardada");
			} else {
				System.out.println("No guardada");
			}
			break;
		case "2":
			ArrayList<BonolotoModel> array = jdbc.listarApuestas();
			System.out.println("Historico");
			for (int i = 0; i < array.size(); i++) {
				System.out.println(array.get(i).toString());
			}
			break;
		}
		menu(sc, jdbc);
	}

}
