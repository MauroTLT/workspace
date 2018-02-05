package ejercicio1;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafetera c1 = new Cafetera(20, 0);
		Cafetera c2 = new Cafetera(40, 20);
		
		System.out.println("Capacidad Maxima: " + c1.getCapacidadMaxima() + "\tCantidad Actual: " + c1.getCantidadActual());
		c1.llenarCafetera();
		System.out.println("Capacidad Maxima: " + c1.getCapacidadMaxima() + "\tCantidad Actual: " + c1.getCantidadActual());
		
		c1.vaciarCafetera();
		System.out.println("Capacidad Maxima: " + c1.getCapacidadMaxima() + "\tCantidad Actual: " + c1.getCantidadActual());
		
		
		System.out.println("Capacidad Maxima: " + c2.getCapacidadMaxima() + "\tCantidad Actual: " + c2.getCantidadActual());
		c2.agregarCafe(10);
		System.out.println("Capacidad Maxima: " + c2.getCapacidadMaxima() + "\tCantidad Actual: " + c2.getCantidadActual());
		
		c2.servirTaza(10);
		System.out.println("Capacidad Maxima: " + c2.getCapacidadMaxima() + "\tCantidad Actual: " + c2.getCantidadActual());
	}
}