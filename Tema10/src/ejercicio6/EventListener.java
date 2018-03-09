package ejercicio6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventListener implements ActionListener {
	private Menu ventana;
	
	public EventListener() {
		this.ventana = new Menu();
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
			this.ventana.setContentPane(this.ventana.getPanelC());
		} else if(e.getSource() == this.ventana.getLista()) {
			this.ventana.setContentPane(this.ventana.getPanelL());
		} else if(e.getSource() == this.ventana.getSalir()) {
			this.ventana.setContentPane(this.ventana.getPanelS());
		} else if(e.getSource() == this.ventana.getComprar()) {
			this.ventana.setContentPane(this.ventana.getPanelCC());
		} else if(e.getSource() == this.ventana.getVender()) {
			this.ventana.setContentPane(this.ventana.getPanelCV());
		}
		this.ventana.revalidate();
	}

}
