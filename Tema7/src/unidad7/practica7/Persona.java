package unidad7.practica7;

public class Persona {
	private String dni;
	private String nombre;
	private int edad;
	
	{
		this.dni = "66122233";
		this.nombre = "Mauro Pérez";
		this.edad = 28;
	}
	public Persona(String sDni, String sNombre, int nEdad) {
		this.dni = sDni;
		this.nombre = sNombre;
		if (nEdad >= 0 && nEdad <= 150) {
			this.edad = nEdad;
		}
	}
	public Persona clonar(){
		return new Persona (this);
	}
	public Persona(Persona p){
		this(p.dni, p.nombre, p.edad);
	}
	public Persona() {
		this.dni = "11122233";
		/*this.nombre = "Mauro";
		this.edad = 18;*/
	}
	public void setDni(String nuevoDni) {
		this.dni=nuevoDni;
	}

	public void setNombre(String nuevoNombre) {
		this.nombre=nuevoNombre;
	}

	public void setEdad(int nuevaEdad) {
		this.edad=nuevaEdad;
	}
	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public void visualizar() {
		System.out.println(this.dni);
		System.out.println(this.nombre);
		System.out.println(this.edad+"\n");
	}
}
