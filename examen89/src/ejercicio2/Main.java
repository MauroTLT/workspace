package ejercicio2;
/**
 * 
 * @author Mauro Pérez 1DAM MAÑANA
 *
 */
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Forma> figuras = new ArrayList<Forma>();
		Forma max = null;
		Forma min = null;
		Forma rect1 = new Rectangulo("#FA2BF3", new Punto(5,6), "Rectangulo 1", 10, 20);
		Forma rect2 = new Rectangulo("#CC1CC2", new Punto(10,4), "Rectangulo 2", 4, 8);
		Forma elip1 = new Elipse("#123456", new Punto(16,10), "Elipse 1", 7, 5);
		Forma elip2 = new Elipse("#654321", new Punto(10,15), "Elipse 2", 14, 11);
		
		figuras.add(rect1); figuras.add(rect2); figuras.add(elip1); figuras.add(elip2);
		
		for(Forma i : figuras) {
			if(figuras.indexOf(i) == 0) {
				max = i;
				min = i;
			}
			i.setColor("#FF2FF3");
			i.setCoordenadas(new Punto(15, 15));
			System.out.print("\n" + i.toString());
			System.out.print("Area: " + i.calcularAreaFigura());
			if(i instanceof Rectangulo) {
				if(max.calcularAreaFigura() < ((Rectangulo) i).calcularAreaFigura()) {
					max = ((Rectangulo) i);
				} else if(min.calcularAreaFigura() > ((Rectangulo) i).calcularAreaFigura()) {
					min = ((Rectangulo) i);
				}
			} else if(i instanceof Elipse) {
				if(max.calcularAreaFigura() < ((Elipse) i).calcularAreaFigura()) {
					max = ((Elipse) i);
				} else if(min.calcularAreaFigura() > ((Elipse) i).calcularAreaFigura()) {
					min = ((Elipse) i);
				}
			}
		}
		System.out.println("\n\n\nArea Mayor y Menor");
		System.out.println("\nMenor");
		if(min instanceof Rectangulo) {
			System.out.println(((Rectangulo)min).toString() + "\nArea: " + ((Rectangulo) min).calcularAreaFigura());
			min.escalarFigura(2.0);
			System.out.println("Escalada");
			System.out.println(((Rectangulo)min).toString() + "\nArea: " + ((Rectangulo) min).calcularAreaFigura());
		} else {
			System.out.println(((Elipse)min).toString() + "\nArea: " + ((Elipse) min).calcularAreaFigura());
			min.escalarFigura(2.0);
			System.out.println("Escalada");
			System.out.println(((Elipse)min).toString() + "\nArea: " + ((Elipse) min).calcularAreaFigura());
		}
		System.out.println("\nMayor");
		if(max instanceof Rectangulo) {
			System.out.println(((Rectangulo)max).toString() + "\nArea: " + ((Rectangulo) max).calcularAreaFigura());
			max.escalarFigura(2.0);
			System.out.println("Escalada");
			System.out.println(((Rectangulo)max).toString() + "\nArea: " + ((Rectangulo) max).calcularAreaFigura());
		} else {
			System.out.println(((Elipse)max).toString() + "\nArea: " + ((Elipse) max).calcularAreaFigura());
			max.escalarFigura(2.0);
			System.out.println("Escalada");
			System.out.println(((Elipse)max).toString() + "\nArea: " + ((Elipse) max).calcularAreaFigura());

		}
	}
}
