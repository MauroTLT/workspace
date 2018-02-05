
public class practica11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practica11 programa = new practica11();
		programa.inicio();
	}
	public void inicio(){
		String cambio = "";
		String cadena ="Hola a todos";
		System.out.println("Cadena: " + cadena);

		modificar(cambio, cadena);

		System.out.println("Cadena cambiada: " + cadena);
	}
	public void modificar(String cambio, String cadena) {
		cambio = "Adios";
		cadena = cambio;
	}
}