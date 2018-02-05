package Ejemplo2;

public class Alumno extends Persona {
	private char nivel;

	public Alumno(){
		
	}
	
	public Alumno(String dni, String nombre, int edad, char nivel) {
		super(dni, nombre, edad);
		this.nivel = validarNivel(nivel);
	}
	
	public Alumno(Persona p, char nivel){
		super(p);
		this.nivel = validarNivel(nivel);
	}
	
	public Alumno(Persona p){
		this(p, '?');
	}
	
	public Alumno(String dni, String nombre, int edad) {
		this(dni, nombre, edad, '?');
	}
	
	public Alumno(Alumno a){
		this(a.dni, a.nombre, a.edad, a.nivel);
	}

	public char validarNivel(char nivel) {
		if(nivel == 'B' || nivel == 'M' || nivel == 'S' || nivel == '?'){
			return nivel;
		} else {return '?';}
	}
	
	public void visualizar(){
		super.visualizar();
		System.out.println(nivel);
	}

	public char getNivel() {
		return nivel;
	}

	public void setNivel(char nivel) {
		this.nivel = nivel;
	}

	public String toString() {
		return "Alumno [dni=" + this.dni + ", nombre=" + this.nombre + ", edad=" + this.edad + ", nivel=" + this.nivel + "]";
	}
}
