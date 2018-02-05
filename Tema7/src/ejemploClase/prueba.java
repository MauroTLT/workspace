package ejemploClase;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticStuff s1,	s2;
		s1 = new StaticStuff();
		s2 = new StaticStuff();
		s1.staticDouble = 3.7;
		System.out.println(s1.staticDouble);
		System.out.println(s2.staticDouble);
		s1.staticString = "abc";
		s2.staticString = "xyz";
		System.out.println(s1.staticString);
		System.out.println(s2.staticString);
	}
}
