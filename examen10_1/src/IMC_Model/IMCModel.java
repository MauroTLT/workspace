package IMC_Model;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */

public class IMCModel {
	
	private final String[] array;
	private double altura, masa;
	
	public IMCModel() {
		this.array = new String[] {"Peso bajo","Peso Normal","Sobrepeso","Obesidad grado 1","Obesidad grado 2","Obesidad grado 3"};
		this.altura = 0.0;
		this.masa = 0.0;
	}

	public String[] getArray() {
		return array;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

}
