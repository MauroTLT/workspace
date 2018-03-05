package ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class EventListener implements ActionListener {
	private LetraDNI ventana;
	
	public EventListener(LetraDNI ventana) {
		this.ventana = ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.ventana.getAreaTxt().getText().length() == 8) {
			try {
				String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKET";
				int modulo= Integer.parseInt(this.ventana.getAreaTxt().getText()) % 23;
				char letra = juegoCaracteres.charAt(modulo);
				this.ventana.getTxt().setText(String.valueOf(letra));
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Fallo al calcular, comprueba que has escrito bien el DNI.");
			}
		} else {JOptionPane.showMessageDialog(null, "Escribe un DNI correcto, faltan o sobran numeros");}
	}

	public LetraDNI getVentana() {
		return ventana;
	}

	public void setVentana(LetraDNI ventana) {
		this.ventana = ventana;
	}

}
