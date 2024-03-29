package Ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String dni, nombre, fecha, direccion;
		int telefono;
		Scanner entradaTeclado = new Scanner(System.in);
		JDBCUsuarioDAO usuarioJDBC = new JDBCUsuarioDAO();
		JDBCCensoDAO censoJDBC = new JDBCCensoDAO();
		new CensoModel();
		boolean autentificar = false;
		int elec = 0;
		
		while(!autentificar) {
			String nick, pass;
			System.out.println("Escribe tu Usuario: ");
			nick = entradaTeclado.next();
			System.out.println("Escribe la Contraseña: ");
			pass = entradaTeclado.next();
			autentificar = usuarioJDBC.consulta(nick, pass);
			if(!autentificar) {
				System.out.println("Fallo al autentificar, prueba otra vez");
			} else {
				UsuarioModel.getInstance().setUsername(nick);
				UsuarioModel.getInstance().setPassword(pass);
			}
		}
		
		System.out.println("Elige una operacion");
		while(!entradaTeclado.hasNextInt()) {
			System.out.println("Formato Incorrecto");
			entradaTeclado.next();
		}
		elec = entradaTeclado.nextInt();
		
		switch(elec) {
		case 1: //Select
			System.out.println("Dime el DNI");
			Persona per = censoJDBC.consulta(entradaTeclado.next());
			if(per != null) {
				System.out.println(per.toString());
			} else {
				System.out.println("usuario no encontrado");
			}
			break;
		case 2: //Insert
			System.out.println("Dime el DNI");
			dni = entradaTeclado.next();
			System.out.println("Dime el Nombre");
			nombre = entradaTeclado.next();
			System.out.println("Dime la fecha de Nacimiento");
			fecha = entradaTeclado.next();
			System.out.println("Dime la Direccion");
			direccion = entradaTeclado.next();
			System.out.println("Dime el Telefono");
			while(!entradaTeclado.hasNextInt()) {
				System.out.println("Formato Incorrecto");
				entradaTeclado.next();
			}
			telefono = entradaTeclado.nextInt();
			censoJDBC.insertPersona(new Persona(dni, nombre, fecha, direccion, telefono));
			break;
		case 3: //Delete
			System.out.println("Dime el DNI");
			dni = entradaTeclado.next();
			censoJDBC.removePersona(dni);
			break;
		case 4: //Modify
			System.out.println("Dime el DNI");
			dni = entradaTeclado.next();
			System.out.println("Dime el Campo a cambiar");
			nombre = entradaTeclado.next();
			System.out.println("Dime el cambio");
			fecha = entradaTeclado.next();
			censoJDBC.modify(dni, nombre, fecha);
			break;
		}
		entradaTeclado.close();
	}

}
