package ejercicioClase;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("00000000","Jose", 33);
		System.out.println("Visualización de persona p1");
		p1.visualizar();
		
		Persona p2 = new Persona(24, "55566677", "Pepe");
		System.out.println("Visualización de persona p2");
		p2.visualizar();
		
		Persona p3 = new Persona("99988877", 13, "Poto");
		System.out.println("Visualización de persona p3");
		p3.visualizar();
		
		Persona p4 = p1.clonar(p2, p3);
		System.out.println("Visualización de persona p4");
		p4.visualizar();
	}
}