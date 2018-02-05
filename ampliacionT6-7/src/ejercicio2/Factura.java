package ejercicio2;

public class Factura {
	private float cantidad;
	private float precio;
	
	public Factura(){
		
	}
	
	public Factura(float cantidad, float precio){
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public double calcularVenta(){
		double subTotal = this.cantidad * this.precio;
		double iva = subTotal * 0.21;
		return subTotal + iva;
	}
}
