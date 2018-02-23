package prueba1;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Comprobador extends JFrame implements MouseListener{
	private JPanel panel;
	private JButton boton;
	private JTextField txt;
	private JLabel texto;
	
	public Comprobador() {
		this.texto = new JLabel("Numero");
		this.txt = new JTextField(3);
		this.boton = new JButton("Comprobar");
		this.panel = new JPanel();
		crear();
	}
	
	public void crear() {
		boton.addMouseListener(this);
		this.txt.setFont(new Font("Courier", Font.PLAIN, 18));
		this.panel.add(texto);
		this.panel.add(txt);
		this.panel.add(boton);
		this.setContentPane(panel);
		this.setSize(new Dimension(500, 150));
	}
	
	public static void main(String[] args) {
		new Comprobador().setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		double num = (int) Math.random() * 10 + 1;
		if(e.getSource() == boton) {
			
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
	
}

