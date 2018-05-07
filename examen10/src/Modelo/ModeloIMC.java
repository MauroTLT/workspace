package Modelo;

import java.sql.Date;

public class ModeloIMC {

	private String textoMasa;
	private String textoAltura;
	private Date fecha;
	private String valoracion;
	
	public ModeloIMC(){
		this.textoMasa = "";
		this.textoAltura = "";
		this.fecha = new Date(0);
		this.valoracion = "";
	}

	public String getTextoMasa() {
		return textoMasa;
	}

	public void setTextoMasa(String textoMasa) {
		this.textoMasa = textoMasa;
	}

	public String getTextoAltura() {
		return textoAltura;
	}

	public void setTextoAltura(String textoAltura) {
		this.textoAltura = textoAltura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getValoracion() {
		return valoracion;
	}

	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}
}
