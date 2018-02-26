package prueba1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Comprobador extends JFrame implements MouseListener, KeyListener{
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
		panel.addMouseListener(this);
		txt.addKeyListener(this);
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
		random r = new random();
		String num = Integer.toString((int) (Math.random() * 10) + 1);
		if(e.getSource() == boton) {
			if(txt.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Escribe un numero para poder hacer la comprobación");
			} else if(num.equals(txt.getText())) {
				JOptionPane.showMessageDialog(null, "El " + num + " es Correcto, enhorabuena!");
			} else {JOptionPane.showMessageDialog(null, "El " + txt.getText() + " es Incorrecto, era el " + num);}
		}
		if(e.getSource() == panel) {
			panel.setBackground(new Color(r.aleatorioIntSeed(255), r.aleatorioIntSeed(255), r.aleatorioIntSeed(255)));
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == boton) {
			boton.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
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

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char carac = e.getKeyChar();
		if(((carac < '0') || (carac > '9')) && (carac != '\b')) {
			e.consume();
		}
	}
	
}
