package ejercicio1;

public class Proyecto {
	private String titulo;
	private String autor;
	private int vecesDes;
	private boolean disponible;
	
	public Proyecto(){
		
	}
	
	public Proyecto(String titulo, String autor, int vecesDes, boolean disponible){
		this.titulo = titulo;
		this.autor = autor;
		this.vecesDes = vecesDes;
		this.disponible = disponible;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getVecesDes() {
		return vecesDes;
	}
	
	public void setVecesDes(int vecesDes) {
		this.vecesDes = vecesDes;
	}
	
	public boolean isDisponible() {
		return disponible;
	}
	
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public boolean descargar(){
		if(this.disponible == true){
			this.vecesDes++;
			return true;
		} else {return false;}
	}
	
	public boolean cambiarEstado(){
		if(this.disponible == true) {
			this.disponible = false;
		} else {this.disponible = true;}
	
		return this.disponible;
	}
	
	public void imprimirProyecto(){
		System.out.println(this.titulo);
		System.out.println(this.vecesDes);
		System.out.println(this.disponible);
	}
}
