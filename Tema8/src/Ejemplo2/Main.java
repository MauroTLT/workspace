package Ejemplo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("998", "Mauro", 18);
		Alumno a1 = new Alumno(p1, 'B');
		
		System.out.println(p1.equals(a1));
	}
}
