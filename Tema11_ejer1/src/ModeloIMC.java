
public class ModeloIMC {

	private String textoMasa;
	private String textoAltura;
	
	public ModeloIMC(){
		textoMasa = new String("");
		textoAltura = new String("");
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
}