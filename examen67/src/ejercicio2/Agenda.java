package ejercicio2;

/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */
public class Agenda {
	private Contacto[] contactos;
	private Contacto[] contactosOrd;
	private int contador; //numPersonas
	
	public Agenda(int capacidad_agenda){
		this.contactos = new Contacto[capacidad_agenda];
		this.contactosOrd = new Contacto[capacidad_agenda];
		this.contador = 0;
	}
	
	public void agregarContacto(String nombre, String apellido, int cantidad_telefonos, Email direccion){
		this.contactos[this.contador] = new Contacto(nombre, apellido, cantidad_telefonos, direccion);
		this.contador++;
	}
	
	public void buscarContacto(String nombre, String apellido) {
		boolean semaforo = false;
		for(int i = 0; i < contador; i++) {
			if((this.contactos[i].getNombre() == nombre) && (this.contactos[i].getApellido() == apellido) && semaforo == false) {
				System.out.print("\nContacto: " + this.contactos[i].getNombre() + " " + this.contactos[i].getApellido());
				System.out.print("\nEmail: " + this.contactos[i].getCorreo().getDireccion() + " ");
				if(this.contactos[i].getCorreo().isValidado() == true){
					System.out.print("(VALIDADO)");
				} else {System.out.print("(NO VALIDADO)");}
				System.out.print("\nNúmeros: ");
				for(int j = 0; j < contactos[i].getContador(); j++) {
					if(contactos[i].getTelefonos()[j] != null) {
						System.out.print(this.contactos[i].getTelefonos()[j].getNumero() + "  ");
					}
				}
				System.out.println();
				semaforo = true;
			}
		}
	}
	
	public void ordenar(){
		for(int i = 1; i < contador; i++){
			for(int j = 0;j < contactos[i].getContador()-i;j++){
				if(contactos[j].getNombre().compareToIgnoreCase(contactos[j+1].getNombre()) > 0) {
					contactosOrd[j] = contactos[j+1];
					contactosOrd[j+1] = contactos[j];
				} else {contactosOrd[j] = contactos[j];}
			}
		}
	}
	
	public void mostrarAgenda() {
		ordenar();
		for(int i = 0; i < contador; i++) {
			System.out.print("\nContacto: " + this.contactosOrd[i].getNombre() + " " + this.contactosOrd[i].getApellido());
			System.out.print("\nEmail: " + this.contactosOrd[i].getCorreo().getDireccion() + " ");
			if(this.contactosOrd[i].getCorreo().isValidado() == true) {
				System.out.print("(VALIDADO)");
			} else {System.out.print("(NO VALIDADO)");}
			System.out.print("\nNúmeros: ");
			for(int j = 0; j < contactosOrd[i].getContador(); j++){
				if(contactosOrd[i].getTelefonos()[j] != null){
					System.out.print(this.contactosOrd[i].getTelefonos()[j].getNumero() + "  ");
				}
			}
			System.out.println();
		}
	}

	public Contacto[] getContactos() {
		return contactos;
	}

	public void setContactos(Contacto[] contactos) {
		this.contactos = contactos;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public Contacto[] getContactosOrd() {
		return contactosOrd;
	}

	public void setContactosOrd(Contacto[] contactosOrd) {
		this.contactosOrd = contactosOrd;
	}
	
	
}
