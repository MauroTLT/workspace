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
			JOptionPane.showMessageDialog(null, "Usuario: " + this.ventana.getNombreTxt().getText() + "\nContraseña: " + pass);
		} else if(e.getSource() == this.ventana.getSalir()) {
			System.exit(0);
		}
	}

	public MiCuentaView getVentana() {
		return ventana;
	}

	public void setVentana(MiCuentaView ventana) {
		this.ventana = ventana;
	}
}
