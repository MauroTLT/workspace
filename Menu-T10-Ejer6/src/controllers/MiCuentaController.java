package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import views.MiCuentaView;

public class MiCuentaController implements ActionListener{
	private MiCuentaView ventana;
	
	public MiCuentaController() {
		this.ventana = new MiCuentaView();
		setActions();
	}
	
	private void setActions() {
		this.ventana.getSalir().addActionListener(this);
		this.ventana.getAceptar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.ventana.getAceptar()) {
			String pass = new String(this.ventana.getPasswordTxt().getPassword());
			if(contrasenia()) {
				JOptionPane.showMessageDialog(null, "Usuario: " + this.ventana.getNombreTxt().getText() + "\nContraseña: " + pass);
			}
		} else if(e.getSource() == this.ventana.getSalir()) {
			System.exit(0);
		}
	}
	
	private boolean contrasenia() {
		String _password = new String(this.ventana.getPasswordTxt().getPassword());
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
			} else {return true;}
		}
		return false;
	}

	public MiCuentaView getVentana() {
		return ventana;
	}

	public void setVentana(MiCuentaView ventana) {
		this.ventana = ventana;
	}
}
