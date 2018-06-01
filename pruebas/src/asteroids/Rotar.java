package asteroids;

public class Rotar implements Runnable {

	private int num;
	private Thread hilo;
	private AsteroidVista ventana;
	
	public Rotar(AsteroidVista ventana, int num) {
		this.num = num;
		this.hilo = new Thread(this);
		this.ventana = ventana;
		hilo.start();
	}

	@Override
	public void run() {
		while(AstController.isRotando()) {
			this.ventana.getrImg().setDegrees(this.ventana.getrImg().getDegrees()+num);
			if (this.ventana.getrImg().getDegrees() < 0) {
				this.ventana.getrImg().setDegrees(350);
			}
			if (this.ventana.getrImg().getDegrees() > 360) {
				this.ventana.getrImg().setDegrees(10);
			}
			this.ventana.getrImgF().setDegrees(this.ventana.getrImg().getDegrees());
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
