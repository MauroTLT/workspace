package pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongController implements KeyListener {

	private PongVista ventana;
	
	public PongController() {
		this.ventana = new PongVista();
		this.ventana.addKeyListener(this);
		this.ventana.requestFocus();
		new Bola(ventana);
		new Contrincante(ventana);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			if(!(this.ventana.getIzquierda().getY() <= this.ventana.getArriba().getY()+this.ventana.getArriba().getHeight())) {
				this.ventana.getIzquierda().setLocation(this.ventana.getIzquierda().getX(), this.ventana.getIzquierda().getY()-9);
			}
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			if(!(this.ventana.getIzquierda().getY()+this.ventana.getIzquierda().getHeight() >= this.ventana.getAbajo().getY())) {
				this.ventana.getIzquierda().setLocation(this.ventana.getIzquierda().getX(), this.ventana.getIzquierda().getY()+9);
			}
		}
		this.ventana.getIzquierda().revalidate();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public PongVista getVentana() {
		return ventana;
	}

	public void setVentana(PongVista ventana) {
		this.ventana = ventana;
	}

}
