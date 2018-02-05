package ejercicioClase3;

public class Dispositivo {
	private String codigo, nombre, tipo;
	private boolean estado;
	
	public Dispositivo(){
		this.estado = true;
	}

	public Dispositivo(String codigo, String nombre, String tipo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.estado = true;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
