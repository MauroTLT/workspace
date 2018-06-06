package plataformas;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlataformaController implements KeyListener {

	private PlataformaView ventana;
	private Prota prota;
	
	public PlataformaController() {
		this.ventana = new PlataformaView();
		this.prota = new Prota(this.ventana);
		setActions();
	}

	private void setActions() {
		this.ventana.addKeyListener(this);
		this.ventana.requestFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == ' ' && !this.prota.isEnElAire()) {
			this.prota.setyVel(5);
			this.prota.setEnElAire(true);
		} else if (e.getKeyChar() == 'a') {
			if (this.prota.getxVel() > -5) {
				this.prota.setxVel(this.prota.getxVel()-1);
			}
		} else if (e.getKeyChar() == 'd') {
			if (this.prota.getxVel() < 5) {
				this.prota.setxVel(this.prota.getxVel()+1);
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyChar() == ' ' && this.prota.isEnElAire()) {
			this.prota.setSalto(this.prota.getSalto()+30);
			System.out.println(this.prota.getSalto());
		} else if (e.getKeyChar() == 'a') {
			while (this.prota.getxVel() < 0) {
				this.prota.setxVel(this.prota.getxVel()+1);
			}
		} else if (e.getKeyChar() == 'd') {
			while (this.prota.getxVel() > 0) {
				this.prota.setxVel(this.prota.getxVel()-1);
			}
		}
	}
	
}
