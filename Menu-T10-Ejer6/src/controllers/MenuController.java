package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.MenuView;

public class MenuController implements ActionListener {
	private MenuView ventana;
	
	public MenuController() {
		this.ventana = new MenuView();
		setActions();
	}
	
	private void setActions() {
		this.ventana.getOperar().addActionListener(this);
		this.ventana.getLista().addActionListener(this);
		this.ventana.getCuenta().addActionListener(this);
		this.ventana.getSalir().addActionListener(this);
		this.ventana.getComprar().addActionListener(this);
		this.ventana.getVender().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.ventana.getCuenta()) {
			this.ventana.setContentPane(this.ventana.getCuentaCont().getVentana().getCuenta());
			this.ventana.getCuentaCont().getVentana().getNombreTxt().setText("");
			this.ventana.getCuentaCont().getVentana().getPasswordTxt().setText("");
		} else if(e.getSource() == this.ventana.getLista()) {
			this.ventana.setContentPane(this.ventana.getPanelL());
		} else if(e.getSource() == this.ventana.getSalir()) {
			System.exit(0);
		} else if(e.getSource() == this.ventana.getComprar()) {
			this.ventana.setContentPane(this.ventana.getComprarCont().getVentana().getComprar());
			this.ventana.getComprarCont().getVentana().getLista().setSelectedItem("");
		} else if(e.getSource() == this.ventana.getVender()) {
				
		}
		this.ventana.revalidate();
	}

}

