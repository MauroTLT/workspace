package ejercicio2;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email e1 = new Email("jorgelopez@gmail.com", false);
		Email e2 = new Email("pepalopez@gmail.com", false);
		
		Agenda a1 = new Agenda(2);
		
		
		a1.agregarContacto("Pepa", "López", 3, e2);
		a1.agregarContacto("Jorge", "López", 2, e1);
		
		//Jorge
		a1.getContactos()[0].agregarTelefono(627030405);
		a1.getContactos()[0].agregarTelefono(662733744);
		a1.getContactos()[0].agregarTelefono(663889933);
		//Pepa
		a1.getContactos()[1].agregarTelefono(667030405);
		a1.getContactos()[1].agregarTelefono(662787744);
		
		a1.getContactos()[1].eliminarTelefono(667030405);
		
		a1.getContactos()[1].cambiarEstadoEmail();
		
		//Visualizar
		a1.buscarContacto("Jorge", "López");
		
		a1.mostrarAgenda();
	}

}
