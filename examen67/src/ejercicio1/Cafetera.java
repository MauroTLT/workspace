package ejercicio1;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */
public class Cafetera {
	private float capacidadMaxima;
	private float cantidadActual;
	
	public Cafetera(){
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}
	
	public Cafetera(float capacidadMaxima, float cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
	}
	public void llenarCafetera(){
		this.cantidadActual = this.capacidadMaxima;
	}
	
	public void servirTaza(float capacidad){
		this.capacidadMaxima = capacidad;
		if(this.capacidadMaxima < this.cantidadActual){
			this.cantidadActual = this.capacidadMaxima;
		}
	}
	
	public void vaciarCafetera(){
		this.cantidadActual = 0;
	}
	
	public void agregarCafe(float cantidad){
		if((this.cantidadActual + cantidad) <= this.capacidadMaxima){
			this.cantidadActual += cantidad;
		} else {this.cantidadActual = this.capacidadMaxima;}
	}
	
	public float getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(float capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public float getCantidadActual() {
		return cantidadActual;
	}
	public void setCantidadActual(float cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
}
