package plataformas;

import javax.swing.JLabel;

public class Prota implements Runnable {
	
	private Thread hilo;
	private PlataformaView ventana;
	private JLabel prota;
	private final int GRAVITY = 10;
	private int yVel, xVel, suelo, salto;
	private boolean enElAire;
	
	public Prota(PlataformaView ventana) {
		this.hilo = new Thread(this);
		this.ventana = ventana;
		this.prota = ventana.getPersonaje();
		this.yVel = 0;
		this.xVel = 0;
		this.suelo = 680;
		this.salto = 0;
		this.enElAire = false;
		
		
		this.hilo.start();
	}
	
	@Override
	public void run() {
		while (true) {//680
			while (this.enElAire && salto < 60) { // Parte que controla la altura del salto
				this.prota.setLocation(this.prota.getX()+this.xVel, this.prota.getY()-this.yVel);
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.prota.revalidate();
				this.prota.repaint();
				salto++;
			}
			//Metodo que calcula el suelo al que caer en base a la posicion X del prota
			for (int i = 0; i < this.ventana.getColisiones().length; i++) {
				if (this.prota.getY()+this.prota.getHeight() == this.ventana.getColisiones()[i].getY() && (this.prota.getX() < this.ventana.getColisiones()[i].getX()+this.ventana.getColisiones()[i].getWidth() && this.prota.getX()+this.prota.getWidth() > this.ventana.getColisiones()[i].getX())) {
					this.suelo = this.ventana.getColisiones()[i].getY();
					i = this.ventana.getColisiones().length-1;
				} else {
					this.suelo = 680;
				}
			}
			
			 
			if (this.prota.getY()+this.prota.getHeight() >= suelo && this.enElAire) { //Metodo que aterriza
				this.enElAire = false;
				salto = 0;
			}
			
			
			if (this.prota.getY()+this.prota.getHeight() < suelo) { // Metodo que aplica la gravedad
				this.prota.setLocation(this.prota.getX()+this.xVel, this.prota.getY()+GRAVITY);
			} else { // o que aplica solo el movimiento de izq a der
				this.prota.setLocation(this.prota.getX()+this.xVel, this.prota.getY());
			}
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.prota.revalidate();
			this.prota.repaint();
		}
	}

	public Thread getHilo() {
		return hilo;
	}

	public void setHilo(Thread hilo) {
		this.hilo = hilo;
	}

	public JLabel getProta() {
		return prota;
	}

	public void setProta(JLabel prota) {
		this.prota = prota;
	}

	public int getyVel() {
		return yVel;
	}

	public void setyVel(int yVel) {
		this.yVel = yVel;
	}

	public int getxVel() {
		return xVel;
	}

	public void setxVel(int xVel) {
		this.xVel = xVel;
	}

	public int getGRAVITY() {
		return GRAVITY;
	}

	public int getSalto() {
		return salto;
	}

	public void setSalto(int salto) {
		this.salto = salto;
	}

	public boolean isEnElAire() {
		return enElAire;
	}

	public void setEnElAire(boolean enElAire) {
		this.enElAire = enElAire;
	}

}
