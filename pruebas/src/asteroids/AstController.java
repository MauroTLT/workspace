package asteroids;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JOptionPane;

public class AstController implements KeyListener, Runnable {
	
	private final Random r = new Random();
	private int xVel, yVel;
	private Thread hilo;
	private AsteroidVista ventana;
	@SuppressWarnings("unused")
	private Move mover;
	
	public AstController() {
		this.xVel = 0;
		this.yVel = 0;
		this.hilo = new Thread(this);
		this.ventana = new AsteroidVista();
		this.mover = new Move(ventana);
		this.ventana.addKeyListener(this);
		this.ventana.requestFocus();
		for (int i = 0; i < this.ventana.getGrupo().length; i++) {
			new AsteroideController(r.nextInt(30)-15, r.nextInt(30)-15, this.ventana.getGrupo()[i]);
		}
		this.hilo.start();
	}
	
	@Override
	public void run() {
		while (true) {
			this.ventana.getNave().setLocation(this.ventana.getNave().getX()+(xVel/3), this.ventana.getNave().getY()+(yVel/3));
			
			if (this.ventana.getNave().getLocation().getX()+this.ventana.getNave().getSize().getWidth() < 0) {
				this.ventana.getNave().setLocation(this.ventana.getWidth(),(int)this.ventana.getNave().getLocation().getY());
			} else if (this.ventana.getNave().getLocation().getX() > this.ventana.getWidth()) {
				this.ventana.getNave().setLocation((int)(0-this.ventana.getNave().getSize().getWidth()),(int)this.ventana.getNave().getLocation().getY());
			}
			if (this.ventana.getNave().getLocation().getY()+this.ventana.getNave().getSize().getHeight() < 0) {
				this.ventana.getNave().setLocation((int)this.ventana.getNave().getLocation().getX(),this.ventana.getHeight());
			} else if (this.ventana.getNave().getLocation().getY() > this.ventana.getHeight()) {
				this.ventana.getNave().setLocation((int)this.ventana.getNave().getLocation().getX(),(int)(0-this.ventana.getNave().getSize().getHeight()));
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < this.ventana.getGrupo().length; i++) {
				Point p = new Point(this.ventana.getNave().getX()+(this.ventana.getNave().getWidth()/2),this.ventana.getNave().getY()+(this.ventana.getNave().getHeight()/2));
				Point p2 = new Point(this.ventana.getGrupo()[i].getX()+(this.ventana.getGrupo()[i].getWidth()/2),this.ventana.getGrupo()[i].getY()+(this.ventana.getGrupo()[i].getHeight()/2));
				if (p2.distance(p) < 100) {
					JOptionPane.showMessageDialog(null, "Te has estrellado.");
					System.exit(0);
				}
			}
			this.ventana.getNave().revalidate();
			this.ventana.getNave().repaint();
		}
		
	}
	
	@Override
	public void keyPressed(KeyEvent k) {
		if (k.getKeyCode() == KeyEvent.VK_SPACE) {
			this.ventana.getrImgF().setDegrees(this.ventana.getrImg().getDegrees());
			this.ventana.getNave().setIcon(this.ventana.getrImgF());
			if(this.ventana.getrImg().getDegrees() == 0 || this.ventana.getrImg().getDegrees() == 360) {
				if (yVel > -50) {
					this.yVel -= 4;
				}
				if (xVel > -50) {
					this.xVel -= 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 0 && this.ventana.getrImg().getDegrees() <= 15) {
				if (yVel > -50) {
					this.yVel -= 4;
				}
				if (xVel > -50) {
					this.xVel -= 3;
				}
			} else if(this.ventana.getrImg().getDegrees() > 15 && this.ventana.getrImg().getDegrees() <= 30) {
				if (yVel > -50) {
					this.yVel -= 4;
				}
				if (xVel > -50) {
					this.xVel -= 2;
				}
			} else if(this.ventana.getrImg().getDegrees() > 30 && this.ventana.getrImg().getDegrees() < 45) {
				if (yVel > -50) {
					this.yVel -= 4;
				}
				if (xVel > -50) {
					this.xVel -= 1;
				}
			} else if(this.ventana.getrImg().getDegrees() == 45) {
				if (yVel > -50) {
					this.yVel -= 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 45 && this.ventana.getrImg().getDegrees() <= 60) {
				if (yVel > -50) {
					this.yVel -= 4;
				}
				if (xVel < 50) {
					this.xVel += 1;
				}
			} else if(this.ventana.getrImg().getDegrees() > 60 && this.ventana.getrImg().getDegrees() <= 75) {
				if (yVel > -50) {
					this.yVel -= 4;
				}
				if (xVel < 50) {
					this.xVel += 2;
				}
			} else if(this.ventana.getrImg().getDegrees() > 75 && this.ventana.getrImg().getDegrees() < 90) {
				if (yVel > -50) {
					this.yVel -= 4;
				}
				if (xVel < 50) {
					this.xVel += 1;
				}
			} else if(this.ventana.getrImg().getDegrees() == 90) {
				if (yVel > -50) {
					this.yVel -= 4;
				}
				if (xVel < 50) {
					this.xVel += 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 90 && this.ventana.getrImg().getDegrees() <= 105) {
				if (yVel > -50) {
					this.yVel -= 3;
				}
				if (xVel < 50) {
					this.xVel += 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 105 && this.ventana.getrImg().getDegrees() <= 120) {
				if (yVel > -50) {
					this.yVel -= 2;
				}
				if (xVel < 50) {
					this.xVel += 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 120 && this.ventana.getrImg().getDegrees() < 135) {
				if (yVel > -50) {
					this.yVel -= 1;
				}
				if (xVel < 50) {
					this.xVel += 4;
				}
			} else if(this.ventana.getrImg().getDegrees() == 135) {
				if (xVel < 50) {
					this.xVel += 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 135 && this.ventana.getrImg().getDegrees() <= 150) {
				if (yVel < 50) {
					this.yVel += 1;
				}
				if (xVel < 50) {
					this.xVel += 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 150 && this.ventana.getrImg().getDegrees() <= 165) {
				if (yVel < 50) {
					this.yVel += 2;
				}
				if (xVel < 50) {
					this.xVel += 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 165 && this.ventana.getrImg().getDegrees() < 180) {
				if (yVel < 50) {
					this.yVel += 3;
				}
				if (xVel < 50) {
					this.xVel += 4;
				}
			} else if(this.ventana.getrImg().getDegrees() == 180) {
				if (yVel < 50) {
					this.yVel += 4;
				}
				if (xVel < 50) {
					this.xVel += 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 180 && this.ventana.getrImg().getDegrees() <= 195) {
				if (yVel < 50) {
					this.yVel += 4;
				}
				if (xVel < 50) {
					this.xVel += 3;
				}
			} else if(this.ventana.getrImg().getDegrees() > 195 && this.ventana.getrImg().getDegrees() <= 210) {
				if (yVel < 50) {
					this.yVel += 4;
				}
				if (xVel < 50) {
					this.xVel += 2;
				}
			} else if(this.ventana.getrImg().getDegrees() > 210 && this.ventana.getrImg().getDegrees() < 225) {
				if (yVel < 50) {
					this.yVel += 4;
				}
				if (xVel < 50) {
					this.xVel += 1;
				}
			} else if(this.ventana.getrImg().getDegrees() == 225) {
				if (yVel < 50) {
					this.yVel += 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 225 && this.ventana.getrImg().getDegrees() <= 240) {
				if (yVel < 50) {
					this.yVel += 4;
				}
				if (xVel > -50) {
					this.xVel -= 1;
				}
			} else if(this.ventana.getrImg().getDegrees() > 240 && this.ventana.getrImg().getDegrees() <= 255) {
				if (yVel < 50) {
					this.yVel += 4;
				}
				if (xVel > -50) {
					this.xVel -= 2;
				}
			} else if(this.ventana.getrImg().getDegrees() > 255 && this.ventana.getrImg().getDegrees() < 270) {
				if (yVel < 50) {
					this.yVel += 4;
				}
				if (xVel > -50) {
					this.xVel -= 3;
				}
			} else if(this.ventana.getrImg().getDegrees() == 270) {
				if (yVel < 50) {
					this.yVel += 4;
				}
				if (xVel > -50) {
					this.xVel -= 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 270 && this.ventana.getrImg().getDegrees() <= 285) {
				if (yVel < 50) {
					this.yVel += 3;
				}
				if (xVel > -50) {
					this.xVel -= 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 285 && this.ventana.getrImg().getDegrees() <= 300) {
				if (yVel < 50) {
					this.yVel += 2;
				}
				if (xVel > -50) {
					this.xVel -= 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 300 && this.ventana.getrImg().getDegrees() < 315) {
				if (yVel < 50) {
					this.yVel += 1;
				}
				if (xVel > -50) {
					this.xVel -= 4;
				}
			} else if(this.ventana.getrImg().getDegrees() == 315) {
				if (xVel > -50) {
					this.xVel -= 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 315 && this.ventana.getrImg().getDegrees() <= 330) {
				if (yVel > -50) {
					this.yVel -= 1;
				}
				if (xVel > -50) {
					this.xVel -= 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 330 && this.ventana.getrImg().getDegrees() <= 345) {
				if (yVel > -50) {
					this.yVel -= 2;
				}
				if (xVel > -50) {
					this.xVel -= 4;
				}
			} else if(this.ventana.getrImg().getDegrees() > 345 && this.ventana.getrImg().getDegrees() < 360) {
				if (yVel > -50) {
					this.yVel -= 3;
				}
				if (xVel > -50) {
					this.xVel -= 4;
				}
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			this.ventana.getNave().setIcon(this.ventana.getrImg());
		}
	}

	public AsteroidVista getVentana() {
		return ventana;
	}

	public void setVentana(AsteroidVista ventana) {
		this.ventana = ventana;
	}
	
}
