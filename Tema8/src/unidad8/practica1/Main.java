package unidad8.practica1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("998", "Mauro", 18);
		Alumno a1 = new Alumno(p1, 'B');
		
		p1.visualizar();
		System.out.println("\n"+p1.toString()+"\n");
		
		a1.visualizar();
		System.out.println("\n"+a1.toString()+"\n");
	}
}
