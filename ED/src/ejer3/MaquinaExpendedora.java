package ejer3;

public class MaquinaExpendedora {
	public static void main(String args[]) {
		Maquina maquina = new Maquina();
		maquina.setEstrategia(new HablaFrances());
		maquina.saludar();
		maquina.setEstrategia(new HablaIngles());
		maquina.saludar();
		maquina.setEstrategia(new HablaEspanyol());
		maquina.saludar();
		maquina.setEstrategia(new HablaAleman());
		maquina.saludar();
	}
}