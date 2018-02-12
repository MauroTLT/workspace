package unidad8.practica5;

@SuppressWarnings("serial")
public class Excepciones extends Exception {
	private String mensaje;
	private int valor;
	
	public Excepciones(int x){
		this.valor = x;
	}
	
	public String toString() {
		switch(valor){
		case 1:
			mensaje = "Matricula repetida";
			break;
		case 2:
			mensaje = "Matricula no encontrada";
			break;
		case 3:
			mensaje = "Lista vacia";
			break;
		case 4:
			mensaje = "No existen reparaciones de ese tipo";
			break;
		}
		return "Error del tipo: " + mensaje;
	}
}