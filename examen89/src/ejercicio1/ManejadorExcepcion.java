package ejercicio1;
/**
 * 
 * @author Mauro Pérez 1DAM MAÑANA
 *
 */
@SuppressWarnings("serial")
public class ManejadorExcepcion extends Exception{
	private int tipo;

	public ManejadorExcepcion(int tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		String mensaje = "";
		switch(tipo) {
			case 1:
				mensaje = "Debe introducir un valor mayor que cero en el denominador";
			break;
			case 2:
				mensaje = "No has introducido un valor entero";
			break;
		}
		return mensaje;
	}
	
	
}
