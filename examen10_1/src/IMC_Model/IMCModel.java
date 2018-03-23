package IMC_Model;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */

public class IMCModel {
	
	private String[] array;
	
	public IMCModel() {
		this.array = new String[] {"Peso bajo","Peso Normal","Sobrepeso","Obesidad grado 1","Obesidad grado 2","Obesidad grado 3"};
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

}
