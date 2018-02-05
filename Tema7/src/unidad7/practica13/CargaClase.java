package unidad7.practica13;

public class CargaClase {

	public static void main(String[] args) {
		System.out.println("Punto 1. Antes de declarar la variable obj");
		@SuppressWarnings("unused")
		EjemploUsosStatic obj;
		System.out.println("Punto 2. Despues de declarar la variable obj");
		System.out.println("y antes de invocar al metodo static");
		System.out.println("Vamos a invocar al metodo static: " + EjemploUsosStatic.numeroObjetosCreados());
	}

}