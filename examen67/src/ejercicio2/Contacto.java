package ejercicio2;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */
public class Contacto {
	private String nombre;
	private String apellido;
	private Email correo;
	private Telefono[] telefonos;
	private int contador;
	
	public Contacto(){
		this.telefonos = new Telefono[3];
		this.contador = 0;
	}
	
	public Contacto(String nombre, String apellido, int cantidad_telefonos, Email direccion){
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new Telefono[cantidad_telefonos];
		this.correo = direccion;
		this.contador = 0;
	}
	
	public void agregarTelefono(int numero){
		this.telefonos[this.contador] = new Telefono(numero);
		this.contador++;
	}
	
	public void eliminarTelefono(int numero){
		for(int i = 0; i < contador; i++){
			if(this.telefonos[i].getNumero() == numero){
				this.telefonos[i] = null;
			}
		}
	}
	
	public void cambiarEstadoEmail(){
		if(this.correo.isValidado() == false){
			this.correo.setValidado(true);
		} else {this.correo.setValidado(false);}
	}
	
	public void cambiarEmail(String direccion){
		this.correo.setDireccion(direccion);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Email getCorreo() {
		return correo;
	}
	public void setCorreo(Email correo) {
		this.correo = correo;
	}
	public Telefono[] getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(Telefono[] telefonos) {
		this.telefonos = telefonos;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	
}
