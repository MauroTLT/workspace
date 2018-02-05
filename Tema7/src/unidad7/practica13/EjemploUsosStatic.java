package unidad7.practica13;

public class EjemploUsosStatic {
	private static int contador = 0;
	private int numeroSerie;
	
	static { System.out.println("Iniciador \"static\" que se ejecuta al cargar la clase"); }
	
	{ System.out.println("Iniciador que se ejecuta en la creación de cada objeto"); }
	
	public EjemploUsosStatic(){
		contador++;
		numeroSerie = contador;
		System.out.println("Se acaba de crear el objeto numero " + numeroSerie);
		
	}
	
	public static int numeroObjetosCreados() {
		return contador;
	}
	
	public static void main(String args[]){
		EjemploUsosStatic d1 = new EjemploUsosStatic();
		EjemploUsosStatic d2;
		d2 = new EjemploUsosStatic();
		System.out.println("Numero de serie de d1 = " +d1.numeroSerie);
		System.out.println("Numero de serie de d2 = " +d2.numeroSerie);
		System.out.println("Objetos creados: " + numeroObjetosCreados());
	}
}
