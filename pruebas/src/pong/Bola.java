package pong;

public class Bola implements Runnable {

	private PongVista ventana;
	private Thread hilo;
	private int xVel,yVel;
	
	public Bola(PongVista ventana) {
		this.hilo = new Thread(this);
		this.ventana = ventana;
		this.xVel = -5;
		this.yVel = 5;
		this.hilo.start();
	}

	@Override
	public void run() {
		while (true) {
			this.ventana.getBola().setLocation(this.ventana.getBola().getX()+xVel, this.ventana.getBola().getY()+yVel);
			
			if (this.ventana.getBola().getLocation().getX()+this.ventana.getBola().getWidth() < 0) {
				this.ventana.getPuntos2().setText(""+(Integer.parseInt(this.ventana.getPuntos2().getText())+1));
				this.ventana.getBola().setLocation(600,400);
			} else if (this.ventana.getBola().getLocation().getX() > PongVista.getAncho()) {
				this.ventana.getPuntos1().setText(""+(Integer.parseInt(this.ventana.getPuntos1().getText())+1));
				this.ventana.getBola().setLocation(600,400);
			}
			if (this.ventana.getBola().getY() <= this.ventana.getArriba().getY()+this.ventana.getArriba().getHeight()) { //Por Arriba
				this.yVel += 10;
			} else if (this.ventana.getBola().getY()+this.ventana.getBola().getHeight() >= this.ventana.getAbajo().getY()) { // Por Abajo
				this.yVel -= 10;
			}
			if (this.ventana.getBola().getX() <= this.ventana.getIzquierda().getX()+this.ventana.getIzquierda().getWidth()) { //Por Izquierda
				if (this.ventana.getBola().getY() > this.ventana.getIzquierda().getY() && this.ventana.getBola().getY() < this.ventana.getIzquierda().getY()+this.ventana.getIzquierda().getHeight()) {
					if (!(this.ventana.getBola().getX() < this.ventana.getIzquierda().getX())) {
						this.xVel += 10;
						if (this.ventana.getBola().getY() < this.ventana.getIzquierda().getY()+this.ventana.getIzquierda().getHeight()/2 && this.yVel > 0) {
							this.yVel -= 10;
						} else if(this.ventana.getBola().getY() > this.ventana.getIzquierda().getY()+this.ventana.getIzquierda().getHeight()/2 && this.yVel < 0) {
							this.yVel += 10;
						}
					}
				}
			} else if (this.ventana.getBola().getX()+this.ventana.getBola().getWidth() >= this.ventana.getDerecha().getX()) { //Por Derecha
				if (this.ventana.getBola().getY() > this.ventana.getDerecha().getY() && this.ventana.getBola().getY() < this.ventana.getDerecha().getY()+this.ventana.getDerecha().getHeight()) {
					if (!(this.ventana.getBola().getX() > this.ventana.getDerecha().getX())) {
						this.xVel -= 10;
						if (this.ventana.getBola().getY() < this.ventana.getDerecha().getY()+this.ventana.getDerecha().getHeight()/2 && this.yVel > 0) {
							this.yVel -= 10;
						} else if(this.ventana.getBola().getY() > this.ventana.getDerecha().getY()+this.ventana.getDerecha().getHeight()/2 && this.yVel < 0) {
							this.yVel += 10;
						}
					}
				}
			}
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.ventana.getBola().revalidate();
			this.ventana.getBola().repaint();
		}
		
	}

}
