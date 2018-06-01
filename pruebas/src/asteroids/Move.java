package asteroids;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Move implements KeyListener {

	private AsteroidVista ventana;
	
	public Move(AsteroidVista ventana) {
		this.ventana = ventana;
		this.ventana.addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent k) {
		if(k.getKeyCode() == KeyEvent.VK_LEFT) {
			this.ventana.getrImg().setDegrees(this.ventana.getrImg().getDegrees()-5);
			if (this.ventana.getrImg().getDegrees() < 0) {
				this.ventana.getrImg().setDegrees(350);
			}
			this.ventana.getrImgF().setDegrees(this.ventana.getrImg().getDegrees());
		} else if(k.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.ventana.getrImg().setDegrees(this.ventana.getrImg().getDegrees()+5);
			if (this.ventana.getrImg().getDegrees() > 360) {
				this.ventana.getrImg().setDegrees(10);
			}
			this.ventana.getrImgF().setDegrees(this.ventana.getrImg().getDegrees());
		}
	}

	@Override
	public void keyReleased(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}

}
