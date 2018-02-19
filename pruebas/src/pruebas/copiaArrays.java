package pruebas;

import java.util.ArrayList;

public class copiaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("hola");
		lista1.add("adios");
		lista1.add("patata");
		lista1.add("alcachofa");
		System.out.println(lista1.toString());
		ArrayList<String> lista2 = new ArrayList<String>();
		lista2.addAll(lista1);
		lista2.add("1");
		lista2.add("2");
		lista2.add("3");
		lista2.add("4");
		System.out.println(lista2.toString());
		//lista1.remove("hola");
		System.out.println(lista1.toString());
		System.out.println(lista2.toString());
		
		lista1.add(1, lista1.get(1 + 1));
		lista1.remove(lista1.lastIndexOf(lista1.get(1)));
		System.out.println(lista1.toString());
		System.out.println(lista2.toString());
	}

}
