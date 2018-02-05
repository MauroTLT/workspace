package ejercicioClase3;

public class Tecnico {
	private String nombre, apellidos;
	private Telefono telefono;
	private int tam;
	private Dispositivo[] dispositivos;
	private int contador;

	public Tecnico(){
		this.dispositivos = new Dispositivo[5];
		contador = 0;
		tam = 0;
	}

	public Tecnico(String nombre, String apellidos, Telefono telefono, int tam) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.dispositivos = new Dispositivo[tam];
		this.tam = tam;
		contador = 0;
	}
	
	public void recibirDispositivo(Dispositivo aparato){
		boolean semaforo = false;
		if(contador != tam){
			if(contador == 0){
				dispositivos[contador] = aparato;
				contador++;
			} else {
				for(int i = 0; i < contador && semaforo == false; i++){
					if(dispositivos[i].getCodigo().equals(aparato.getCodigo())){
						System.out.println("El dispositivo con codigo " + dispositivos[i].getCodigo() + " esta ya en la lista");
						semaforo = true;
					} else if(i == contador - 1) {
						dispositivos[contador] = aparato;
						contador++;
						semaforo = true;
					}
				}
				semaforo = false;
			}
		} else {
			System.out.println("El objeto con codigo " + aparato.getCodigo() + " no cabe en el array");
		}
	}
	
	public void mostrarDispositivos(){
		System.out.println("Codigo\t\tNombre\t\tTipo\t\tEstado");
		for(int i = 0; i < contador; i++){
			System.out.print(dispositivos[i].getCodigo() + "\t\t" + dispositivos[i].getNombre() + "\t\t" + dispositivos[i].getTipo());
			if(dispositivos[i].isEstado() == false){
				System.out.print("\tOK\n");
			} else {
				System.out.print("\tAveriado\n");
			}
		}
		System.out.println();
	}
	
	public void repararDispositivo(String codigo){
		for(int i = 0; i < contador; i++){
			if(dispositivos[i].getCodigo().equals(codigo)){
				if(dispositivos[i].isEstado() == true){
					dispositivos[i].setEstado(false);
				}
			}
		}
	}
	
	public void averiarDispositivo(){
		random random = new random();
		int aux = random.randomInt(contador);
		for(int i = 0; i < contador; i++){
			if(i == aux){
				if(dispositivos[i].isEstado() == false){
					dispositivos[i].setEstado(true);
				}
			}
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public Dispositivo[] getDispositivos() {
		return dispositivos;
	}

	public void setDispositivos(Dispositivo[] dispositivos) {
		this.dispositivos = dispositivos;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
}
