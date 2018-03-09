package ejercicio5;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Contrasenia extends JFrame {
	private EventListener eventListener;
	private JTextField areaTxt;
	private JButton button;
	
	public Contrasenia() {
		this.eventListener = new EventListener(this);
		this.areaTxt = new JTextField(10);
		this.button = new JButton("Validar");
		darFormato();
	}
	
	private void darFormato() {
		this.button.addActionListener(eventListener);
		this.add(areaTxt, BorderLayout.CENTER);
		this.add(button, BorderLayout.EAST);
	}
	
	public JTextField getAreaTxt() {
		return areaTxt;
	}

	public void setAreaTxt(JTextField areaTxt) {
		this.areaTxt = areaTxt;
	}

	public static void main(String[] args) {
		Contrasenia frame = new Contrasenia();
		frame.setSize(310, 160);
		frame.setTitle("Conversor");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}