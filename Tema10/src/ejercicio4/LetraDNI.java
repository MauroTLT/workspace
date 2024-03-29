package ejercicio4;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class LetraDNI extends JFrame {
	private EventListener eventListener;
	private JTextField areaTxt;
	private JButton button;
	private JLabel txt;
	
	public LetraDNI() {
		this.eventListener = new EventListener(this);
		this.areaTxt = new JTextField(10);
		this.button = new JButton("Letra");
		this.txt = new JLabel("Resultado", SwingConstants.CENTER);
		darFormato();
	}
	
	private void darFormato() {
		this.button.addActionListener(eventListener);
		this.areaTxt.setPreferredSize(new Dimension(150, this.getHeight()));
		this.add(areaTxt, BorderLayout.WEST);
		this.add(button, BorderLayout.CENTER);
		this.txt.setPreferredSize(new Dimension(130, this.getHeight()));
		this.add(txt, BorderLayout.EAST);
	}
	
	public JTextField getAreaTxt() {
		return areaTxt;
	}

	public void setAreaTxt(JTextField areaTxt) {
		this.areaTxt = areaTxt;
	}

	public JLabel getTxt() {
		return txt;
	}

	public void setTxt(JLabel txt) {
		this.txt = txt;
	}

	public static void main(String[] args) {
		LetraDNI frame = new LetraDNI();
		frame.setSize(410, 160);
		frame.setTitle("Conversor");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
