package tresRaya;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RayaController implements MouseListener {
	private RayaView ventana;
	private int turno;
	
	public RayaController() {
		this.ventana = new RayaView();
		setActions();
	}
	
	private void setActions() {
		for (int i = 0; i < this.ventana.getTablero().length; i++) {
			for (int j = 0; j < this.ventana.getTablero()[i].length; j++) {
				this.ventana.getTablero()[i][j].addMouseListener(this);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel label = (JLabel)e.getSource();
		ImageIcon x = new ImageIcon(getClass().getResource("../resources/X.png"));
		ImageIcon o = new ImageIcon(getClass().getResource("../resources/O.png"));
		if(this.turno % 2 == 0) {
			if(label.getIcon() == null) {
				label.setIcon(x);
				this.ventana.getTitulo().setText("Turno de Jugador 1");
				this.turno++;
			}
		} else {
			if(label.getIcon() == null) {
				label.setIcon(o);
				this.ventana.getTitulo().setText("Turno de Jugador 2");
				this.turno++;
			}
		}
		if(this.turno == 9) {
			this.ventana.getTitulo().setText("Partida Finalizada");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public RayaView getVentana() {
		return ventana;
	}

	public void setVentana(RayaView ventana) {
		this.ventana = ventana;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

}
