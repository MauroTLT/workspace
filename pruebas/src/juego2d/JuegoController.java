package juego2d;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JuegoController implements KeyListener{
	
	private JuegoView ventana;
	
	public JuegoController() {
		this.ventana = new JuegoView();
		setActions();
	}

	private void setActions() {
		this.ventana.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int x = (int) this.ventana.getBola().getLocation().getX();
		int y = (int) this.ventana.getBola().getLocation().getY();
		if(e.getKeyCode() == KeyEvent.VK_W) {
			this.ventana.getBola().setLocation(x, y-2);
		} else if(e.getKeyCode() == KeyEvent.VK_S) {
			this.ventana.getBola().setLocation(x, y+2);
		} else if(e.getKeyCode() == KeyEvent.VK_A) {
			this.ventana.getBola().setLocation(x-2, y);
		} else if(e.getKeyCode() == KeyEvent.VK_D) {
			this.ventana.getBola().setLocation(x+2, y);
		}	
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
	public JuegoView getVentana() {
		return ventana;
	}

	public void setVentana(JuegoView ventana) {
		this.ventana = ventana;
	}

}
