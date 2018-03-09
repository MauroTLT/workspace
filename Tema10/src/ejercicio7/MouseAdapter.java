package ejercicio7;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MouseAdapter implements MouseListener {
	private Ajedrez ventana;
	
	public MouseAdapter() {
		this.ventana = new Ajedrez();
		this.ventana.setTitle("Ajedrez");
		this.ventana.setSize(550, 550);
		this.ventana.setLocationRelativeTo(null);
		this.ventana.setVisible(true);
		setActions();
	}
	
	public void setActions() {
		for (int i = 0; i < this.ventana.getArray().size() - 1; i++) {
			this.ventana.getArray().get(i).addMouseListener(this);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel label = (JLabel) e.getSource();
		JOptionPane.showMessageDialog(null, "La casilla pulsada esta en la fila " + label.getName().charAt(0) + ", columna " + label.getName().charAt(1));
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
