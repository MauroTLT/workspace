package ejemplo14;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class VentanaMouse extends JFrame implements MouseListener {
	private final JPanel panel1;
	private final JButton boton;
	
	public VentanaMouse() {
		setTitle("Evento Mouse");
		setSize(new Dimension(250, 150));
		setLocationRelativeTo(null);
		this.panel1 = new JPanel();
		panel1.setBackground(Color.gray);
		this.boton = new JButton("Boton");
		panel1.addMouseListener(this);
		boton.addMouseListener(this);
		panel1.add(boton);
		this.add(panel1);
		setVisible(true);
	}

	public static void main(String[] args) {
		new VentanaMouse();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == boton) {
			System.exit(0);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == boton) {
			boton.setCursor(new Cursor(Cursor.MOVE_CURSOR));
		}
		if(e.getSource() == panel1) {
			panel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
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
}