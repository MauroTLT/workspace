package pong;

public class Contrincante implements Runnable {

	private PongVista ventana;
	private Thread hilo;
	
	public Contrincante(PongVista ventana) {
		this.hilo = new Thread(this);
		this.ventana = ventana;
		this.hilo.start();
	}

	@Override
	public void run() {
		while (true) {
			if(this.ventana.getBola().getY() < this.ventana.getDerecha().getY()+this.ventana.getDerecha().getHeight()/2) {
				if(!(this.ventana.getDerecha().getY() <= this.ventana.getArriba().getY()+this.ventana.getArriba().getHeight())) {
					this.ventana.getDerecha().setLocation(this.ventana.getDerecha().getX(), this.ventana.getDerecha().getY()-3);
				}
			} else {
				if(!(this.ventana.getDerecha().getY()+this.ventana.getDerecha().getHeight() >= this.ventana.getAbajo().getY())) {
					this.ventana.getDerecha().setLocation(this.ventana.getDerecha().getX(), this.ventana.getDerecha().getY()+3);
				}
			}
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.ventana.getDerecha().revalidate();
			this.ventana.getDerecha().repaint();
		}
		
	}

}
