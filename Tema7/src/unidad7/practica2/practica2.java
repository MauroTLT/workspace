package unidad7.practica2;

public class practica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();  
		Persona p2 = new Persona();
		p1.setDni("00000000");
		p1.setNombre("Pepe Gotera");  
		p1.setEdad(33);
		System.out.println("Visualización de persona p1:");
		p1.visualizar();
		System.out.println("El dni de p1 es " + p1.getDni());  
		System.out.println("El nombre de p1 es " + p1.getNombre());  
		System.out.println("La edad de p1 es " + p1.getEdad());  
		System.out.println("Visualización de persona p2:"); 
		p2.visualizar();
	}
}
