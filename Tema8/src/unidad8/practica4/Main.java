package unidad8.practica4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secretario s1 = new Secretario("Mauro", "Pérez", "2168", "Calle Falsa", 999, 500, true, "Fax");
		Vendedor v1 = new Vendedor("Pepe", "Martinez", "2177", "Calle de atras", 998, 750, 669, "Alguna", 0.10);
		Vendedor v2 = new Vendedor("Antonio", "Martinez", "2144", "Calle de delante", 996, 750, 669, "Alguna", 0.10);
		JefeZona j1 = new JefeZona("Manolo", "Ortega", "2155", "Una calle", 997, 1000, true);
		
		Clientes c1 = new Clientes("Cliente 1");
		Clientes c2 = new Clientes("Cliente 2");
		
		s1.setSupervisor(v1);
		
		v1.agregarCliente(c1);
		v1.agregarCliente(c2);
		v1.eliminarCliente(c1);
		
		j1.agregarVendedor(v1);
		j1.agregarVendedor(v2);
		
		System.out.println(v1.toString());
		v1.incrementarSalario();
		System.out.println(v1.toString());
		System.out.println();
		System.out.println(s1.toString());
		s1.incrementarSalario();
		System.out.println(s1.toString());
		System.out.println();
		System.out.println(j1.toString());
		j1.incrementarSalario();
		System.out.println(j1.toString());
	}

}
