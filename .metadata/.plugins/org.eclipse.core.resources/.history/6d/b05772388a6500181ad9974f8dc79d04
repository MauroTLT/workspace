package asteroids;

import javax.swing.JLabel;

public class AsteroideController implements Runnable {
	
	private int velX, velY;
	private Thread hilo;
	private JLabel asteroide;
	
	public AsteroideController(int velX,int velY, JLabel asteroide) {
		this.velX = velX;
		this.velY = velY;
		this.asteroide = asteroide;
		this.hilo = new Thread(this);
		this.hilo.start();
	}

	@Override
	public void run() {
		while (true) {
			this.asteroide.setLocation(this.asteroide.getX()+velX, this.asteroide.getY()+velY);
			
			if (this.asteroide.getLocation().getX()+this.asteroide.getSize().getWidth() < 0) {
				this.asteroide.setLocation(AsteroidVista.getAncho(),(int)this.asteroide.getLocation().getY());
			} else if (this.asteroide.getLocation().getX() > AsteroidVista.getAncho()) {
				this.asteroide.setLocation((int)(0-this.asteroide.getSize().getWidth()),(int)this.asteroide.getLocation().getY());
			}
			if (this.asteroide.getLocation().getY()+this.asteroide.getSize().getHeight() < 0) {
				this.asteroide.setLocation((int)this.asteroide.getLocation().getX(),AsteroidVista.getAlto());
			} else if (this.asteroide.getLocation().getY() > AsteroidVista.getAlto()) {
				this.asteroide.setLocation((int)this.asteroide.getLocation().getX(),(int)(0-this.asteroide.getSize().getHeight()));
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.asteroide.revalidate();
			this.asteroide.repaint();
		}
	}
}
