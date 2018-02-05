package unidad7.practica11;

public class practica11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("00000000","Jose", 33);
		Persona p2 = new Persona();
		System.out.println("Visualización de persona p1");
		p1.visualizar();
		System.out.println("Visualización de persona p2");
		p2.visualizar();
		Persona p3 = new Persona(p1);
		System.out.println("Visualización de persona p3");
		p3.visualizar();
		
		Persona p4 = p3.clonar();
		System.out.println("Visualización de persona p4");
		p4.visualizar();
		
		Persona p5 = new Persona(p1, p2);
		System.out.println("Visualización de persona p5");
		p5.visualizar();
	}
}
