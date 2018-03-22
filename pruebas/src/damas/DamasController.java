package damas;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DamasController implements MouseListener {
	
	private int aux, aux2;
	private JLabel primero;
	private boolean turno;
	private ImageIcon x;
	private ImageIcon o;
	private DamasView ventana;

	public DamasController() {
		this.aux = 0;
		this.aux2 = 0;
		this.primero = null;
		this.x = new ImageIcon(getClass().getResource("../resources/X.png"));
		this.o = new ImageIcon(getClass().getResource("../resources/O.png"));
		this.turno = true;
		this.ventana = new DamasView();
		setActions();
	}

	private void setActions() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				this.ventana.getCasillas()[i][j].addMouseListener(this);
			}
		}
	}

	public DamasView getVentana() {
		return ventana;
	}

	public void setVentana(DamasView ventana) {
		this.ventana = ventana;
	}

	public boolean isTurno() {
		return turno;
	}

	public void setTurno(boolean turno) {
		this.turno = turno;
	}

	public ImageIcon getX() {
		return x;
	}

	public void setX(ImageIcon x) {
		this.x = x;
	}

	public ImageIcon getO() {
		return o;
	}

	public void setO(ImageIcon o) {
		this.o = o;
	}

	public JLabel getPrimero() {
		return primero;
	}

	public void setPrimero(JLabel primero) {
		this.primero = primero;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel label = (JLabel) e.getSource();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(this.ventana.getCasillas()[i][j] == label) {
					if(primero == null && label.getIcon() != null) {
						this.aux = i;
						this.aux2 = j;
						this.primero = label;
						System.out.println("guardado");
					} else {
						if(turno) {
							if(this.ventana.getCasillas()[i+1][j+1] == primero && this.ventana.getCasillas()[i][j].getIcon() == null) {
								System.out.println("oI");
								label.setIcon(o);
								primero.setIcon(null);
							} else if(this.ventana.getCasillas()[i+1][j-1] == primero && this.ventana.getCasillas()[i][j].getIcon() == null) {
								System.out.println("oD");
								label.setIcon(o);
								primero.setIcon(null);
							}
							turno = false;
						} else {
							if(this.ventana.getCasillas()[i-1][j-1] == primero && this.ventana.getCasillas()[i][j].getIcon() == null) {
								System.out.println("xI");
								label.setIcon(x);
								primero.setIcon(null);
							} else if(this.ventana.getCasillas()[i-1][j+1] == primero && this.ventana.getCasillas()[i][j].getIcon() == null) {
								System.out.println("xD");
								label.setIcon(x);
								primero.setIcon(null);
							}
							turno = true;
						}
						primero = null;
					}
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
