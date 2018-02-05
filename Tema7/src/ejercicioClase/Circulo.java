package ejercicioClase;

public class Circulo {
	private static final double PI = 3.1416;
	private double radio;
	
	/*public Circulo(double radio){
		this.radio = radio;
	}*/
	public void setRadio(double radio){
		this.radio = radio;
	}
	public double getRadio(){
		return this.radio;
	}
	public double getPI(){
		return PI;
	}
	public double areaCirculo(){
		return PI * Math.pow(this.radio, 2);
	}
	public double longCirculo(){
		return 2 * PI * this.radio;
	}
}
