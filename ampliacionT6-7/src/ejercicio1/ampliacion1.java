package ejercicio1;

public class ampliacion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proyecto p1 = new Proyecto("Proyecto 1", "Batman", 3, true);
		System.out.println("Visualización de p1");
		p1.imprimirProyecto();
		
		p1.descargar();
		System.out.println("\nVisualización de p1");
		p1.imprimirProyecto();
		
		p1.cambiarEstado();
		p1.descargar();
		System.out.println("\nVisualización de p1");
		p1.imprimirProyecto();
	}
}
