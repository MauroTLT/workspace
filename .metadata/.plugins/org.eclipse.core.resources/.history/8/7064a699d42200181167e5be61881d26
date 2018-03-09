package ejercicio6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventListener implements ActionListener {
	private Menu ventana;
	
	public EventListener(Menu ventana) {
		this.ventana = ventana;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.ventana.getCuenta()) {
			this.ventana.getTxt().setText("Estas en " + this.ventana.getCuenta().getText());
		} else if(e.getSource() == this.ventana.getLista()) {
			this.ventana.getTxt().setText("Estas en " + this.ventana.getLista().getText());
		} else if(e.getSource() == this.ventana.getSalir()) {
			this.ventana.getTxt().setText("Estas en " + this.ventana.getSalir().getText());
		} else if(e.getSource() == this.ventana.getOperar()) {
			this.ventana.getTxt().setText("Estas en " + this.ventana.getOperar().getText());
		} else if(e.getSource() == this.ventana.getComprar()) {
			this.ventana.getTxt().setText("Estas en " + this.ventana.getComprar().getText());
		} else if(e.getSource() == this.ventana.getVender()) {
			this.ventana.getTxt().setText("Estas en " + this.ventana.getVender().getText());
		}
	}

}
