package asteroids;

import javax.swing.JLabel;

public class Disparo implements Runnable {

	private Thread hilo;
	private JLabel disparo;
	private int yVel, xVel;
	
	public Disparo(JLabel disparo, int yVel, int xVel) {
		this.hilo = new Thread(this);
		this.disparo = disparo;
		
		this.yVel = yVel*3;
		this.xVel = xVel*3;
		this.hilo.start();
	}

	@Override
	public void run() {
		while (!(((this.disparo.getLocation().getX()+this.disparo.getSize().getWidth() < 0) || (this.disparo.getLocation().getX() > AsteroidVista.getAncho())) || ((this.disparo.getLocation().getY()+this.disparo.getSize().getHeight() < 0) || this.disparo.getLocation().getY() > AsteroidVista.getAlto()))) {
			this.disparo.setLocation(this.disparo.getX()+this.xVel, this.disparo.getY()+this.yVel);
			
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.disparo.revalidate();
			this.disparo.repaint();
		}
		this.disparo.setVisible(false);
	}
	
}
