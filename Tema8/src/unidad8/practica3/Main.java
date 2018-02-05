package unidad8.practica3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo(1, 2, 10, 20);
		Rectangulo r2 = new Rectangulo(2, 4, 20, 40);
		Circulo c1 = new Circulo(1, 2, 10);
		Circulo c2 = new Circulo(2, 4, 20);
		Linea l1 = new Linea(1, 10);
		Linea l2 = new Linea(2, 20);
		
		r1.dibujar();
		r2.dibujar();
		
		c1.dibujar();
		c2.dibujar();
		
		l1.dibujar();
		l2.dibujar();
		
		System.out.println("\nFiguras hechas: " + Figura.getCont());
	}

}
