package FireEmblem;

public class Personaje {
	private String nombre;
	private String tipo;
	private Arma arma;
	private int hp;
	private int atk;
	private int def;
	private Casilla casilla;
	private String simbolo;
	private int pasos;
	
	public Personaje() {
		
	}
	
	public Personaje(String nombre, String tipo, Arma arma, int hp, int atk, int def, Casilla casilla, String simbolo, int pasos) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.arma = arma;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.casilla = casilla;
		this.simbolo = simbolo;
		this.pasos = pasos;
	}

	public String toString() {
		return "Personaje [nombre=" + nombre + ", tipo=" + tipo + ", arma=" + arma.getNombre() + ", hp=" + hp + ", atk=" + atk
				+ ", def=" + def + ", casilla=" + casilla.getFila() + casilla.getColumna() +  ", simbolo=" + simbolo + ", pasos=" + pasos + "]";
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

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public Casilla getCasilla() {
		return casilla;
	}

	public void setCasilla(Casilla casilla) {
		this.casilla = casilla;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public int getPasos() {
		return pasos;
	}

	public void setPasos(int pasos) {
		this.pasos = pasos;
	}
	
}
