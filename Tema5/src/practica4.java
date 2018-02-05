import java.util.Scanner;

public class practica4 {
	// variable global
	private float[] temperaturas = new float [364] ;
	private int dia = 0;
	private int mes = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practica4 programa = new practica4();
		programa.inici();
	}
	public void inici() {
		menu();
		entrarRegistro();
		mostrarTMedia();
		mostrarTMedia();
	}
	public void menu(){
	}
	public void tratarOrden(){
		entrarRegistro();
		mostrarTMedia();
		mostrarDMedia();
	}
	public void entrarRegistro(){
		leerTemperatura();
		actualizarFecha();
	}
	public void leerTemperatura(){
	}
	public void actualizarFecha(){
	}
	public void mostrarTMedia(){
		mostrarFecha();
		calcularMedia();
	}
	public void mostrarFecha(){
	}
	public void calcularMedia(){
	}
	public void mostrarDMedia(){
		mostrarFecha();
		calcularMedia();
	}
}