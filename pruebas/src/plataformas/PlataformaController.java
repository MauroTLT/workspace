package plataformas;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlataformaController implements KeyListener {

	private boolean semaforo;
	private PlataformaView ventana;
	private Prota prota;
	
	public PlataformaController() {
		semaforo = false;
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
			this.prota.setyVel(1);
			this.prota.setEnElAire(true);
			semaforo = false;
		} else if (e.getKeyChar() == 'a') {
			if (this.prota.getxVel() >= 0) {
				this.prota.setxVel(-1);
			}
		} else if (e.getKeyChar() == 'd') {
			if (this.prota.getxVel() <= 0) {
				this.prota.setxVel(1);
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyChar() == ' ' && this.prota.isEnElAire() && !semaforo) {
			this.prota.setSalto(this.prota.getSalto()+80);
			semaforo = true;
		} else if (e.getKeyChar() == 'a') {
			this.prota.setxVel(0);
		} else if (e.getKeyChar() == 'd') {
			this.prota.setxVel(0);
		}
	}
	
}
