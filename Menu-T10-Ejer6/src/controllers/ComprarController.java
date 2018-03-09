package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import views.ComprarView;

public class ComprarController implements ActionListener {
private ComprarView ventana;
	
	public ComprarController() {
		this.ventana = new ComprarView();
		setActions();
	}
	
	private void setActions() {
		this.ventana.getSalir().addActionListener(this);
		this.ventana.getAceptar().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.ventana.getAceptar()) {
			JOptionPane.showMessageDialog(null, "Cantidad: " + this.ventana.getLista().getSelectedItem());
		} else if(e.getSource() == this.ventana.getSalir()) {
			System.exit(0);
		}
	}

	public ComprarView getVentana() {
		return ventana;
	}

	public void setVentana(ComprarView ventana) {
		this.ventana = ventana;
	}

}
