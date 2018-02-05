package ejercicio3;

import java.util.Date;

public class Factura {
	private Date fecha;
	private String numeroFactura;
	private int numeroItems;
	private String ordenDeCompra;
	private Item[] vector;
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getNumeroFactura() {
		return numeroFactura;
	}
	
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	
	public int getNumeroItems() {
		return numeroItems;
	}
	
	public void setNumeroItems(int numeroItems) {
		this.numeroItems = numeroItems;
	}
	
	public String getOrdenDeCompra() {
		return ordenDeCompra;
	}
	
	public void setOrdenDeCompra(String ordenDeCompra) {
		this.ordenDeCompra = ordenDeCompra;
	}
	
	public Item[] getVector() {
		return vector;
	}

	public void setVector(Item[] vector) {
		this.vector = vector;
	}
}
