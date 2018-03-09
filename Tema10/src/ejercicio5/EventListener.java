package ejercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class EventListener implements ActionListener {
	private Contrasenia ventana;

	public EventListener(Contrasenia ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String _password = this.ventana.getAreaTxt().getText();
		String numeros = "0123456789";
		boolean contieneNumero = false;
		boolean contieneMayuscula = false;
		if(_password.length() < 8) {
			JOptionPane.showMessageDialog(null, "Debe tener una longitud de al menos 8 caracteres.");
		} else {
			for (int i = 0; i < _password.length(); i++) {
				if (numeros.contains("" + _password.charAt(i))) {
					contieneNumero = true;
				} else if(_password.charAt(i) > 40 && _password.charAt(i) <= 90) {
					contieneMayuscula = true;
				}
			}
			if (!contieneNumero) {
				JOptionPane.showMessageDialog(null, "Debe tener al menos un numero.");
			} else if(!contieneMayuscula) {
				JOptionPane.showMessageDialog(null, "Debe tener al menos una mayuscula.");
			} else {JOptionPane.showMessageDialog(null, "Contraseña bien formada.");}
		}
	}

	public Contrasenia getVentana() {
		return ventana;
	}

	public void setVentana(Contrasenia ventana) {
		this.ventana = ventana;
	}

}