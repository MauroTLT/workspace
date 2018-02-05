package ejercicio4;

public class ampliacion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContadorDeTiempo c1 = new ContadorDeTiempo();
		ContadorDeTiempo c2 = new ContadorDeTiempo(5);
		ContadorDeTiempo c3 = new ContadorDeTiempo();
		c3.copia(c2);
		
		System.out.println("Contador 1: " + c1.getCont());
		System.out.println("Contador 2: " + c2.getCont());
		System.out.println("Contador 3: " + c3.getCont());
		
		c1.incrementarTiempo();
		c2.decrementarTiempo();
		c3.decrementarTiempo();
		c3.decrementarTiempo();
		
		System.out.println("\nContador 1: " + c1.getCont());
		System.out.println("Contador 2: " + c2.getCont());
		System.out.println("Contador 3: " + c3.getCont());
	}

}
