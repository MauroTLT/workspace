package FireEmblem;

public class Casilla {
	private String nombre;
	private String tipo;
	private boolean ocupado;
	private String simbolo;
	private Personaje personaje;
	private int fila;
	private int columna;
	
	public Casilla() {
		
	}

	public Casilla(String nombre, boolean ocupado, String simbolo) {
		this.nombre = nombre;
		this.ocupado = ocupado;
		this.simbolo = simbolo;
	}
	
	public Casilla(Casilla casilla , int fila, int columna) {
		this.nombre = casilla.getNombre();
		this.ocupado = casilla.isOcupado();
		this.simbolo = casilla.getSimbolo();
		if(casilla.getSimbolo() == "♣") {
			this.tipo = "Arboleda";
		} else if(casilla.getSimbolo() == "■") {
			this.tipo = "Montaña";
		} else if(casilla.getSimbolo() == "■") {
			this.tipo = "Pradera";
		}
		this.fila = fila;
		this.columna = columna;
	}
	
	public void visualizar() {
		System.out.println("Casilla " + this.fila + " " + this.columna);
		System.out.println(this.nombre);
		if(this.ocupado == true) {
			System.out.println("Ocupado por " + this.personaje.getNombre() + " Simbolo: " + "("+this.personaje.getSimbolo()+")");
		} else {
			System.out.println("Sin ocupar " + "Simbolo: " + "("+this.simbolo+")");
		}
		System.out.println();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
		if(personaje == null) {
			this.ocupado = false;
		} else {this.ocupado = true;}
	}
	
	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}
}
