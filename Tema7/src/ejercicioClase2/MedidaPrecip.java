package ejercicioClase2;

public class MedidaPrecip {

	private double precipHora;
	private int dia, mes, año, hora;
	private double temperatura;
	
	public MedidaPrecip(){
	}
	
	public MedidaPrecip(double precipHora, int dia, int mes, int año, int hora){
		this.precipHora = precipHora;
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.hora = hora;
	}
	
	public double getPrecipHora() {
		return precipHora;
	}

	public void setPrecipHora(double precipHora) {
		this.precipHora = precipHora;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
}