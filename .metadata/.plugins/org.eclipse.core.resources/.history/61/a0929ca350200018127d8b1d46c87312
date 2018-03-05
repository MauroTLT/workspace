package ejercicio3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Conversor extends JFrame {
	private EventListener eventListener;
	private JPanel panelCentro;
	private JTextField areaTxt;
	private JButton euroDolar, dolarEuro;
	private JLabel izquierda, derecha;
	
	public Conversor() {
		this.eventListener = new EventListener(this);
		this.panelCentro = new JPanel();
		this.areaTxt = new JTextField(30);
		this.euroDolar = new JButton("€ -> $");
		this.dolarEuro = new JButton("$ -> €");
		this.izquierda = new JLabel("Valor", SwingConstants.CENTER);
		this.derecha = new JLabel("Resultado", SwingConstants.CENTER);
		darFormato();
	}
	
	public void darFormato() {
		this.euroDolar.addActionListener(eventListener);
		this.dolarEuro.addActionListener(eventListener);
		this.add(areaTxt, BorderLayout.NORTH);
		this.izquierda.setPreferredSize(new Dimension(75, this.getHeight()));
		this.derecha.setPreferredSize(new Dimension(75, this.getHeight()));
		this.add(derecha, BorderLayout.EAST);
		this.add(izquierda, BorderLayout.WEST);
		this.euroDolar.setPreferredSize(new Dimension(257, 50)); //257
		this.dolarEuro.setPreferredSize(new Dimension(257, 50));
		this.panelCentro.add(euroDolar);
		this.panelCentro.add(dolarEuro);
		this.add(panelCentro, BorderLayout.CENTER);
		this.panelCentro.setBackground(new Color(184, 182, 182));
	}
	
	public JTextField getAreaTxt() {
		return areaTxt;
	}

	public void setAreaTxt(JTextField areaTxt) {
		this.areaTxt = areaTxt;
	}

	public JButton getEuroDolar() {
		return euroDolar;
	}

	public void setEuroDolar(JButton euroDolar) {
		this.euroDolar = euroDolar;
	}

	public JButton getDolarEuro() {
		return dolarEuro;
	}

	public void setDolarEuro(JButton dolarEuro) {
		this.dolarEuro = dolarEuro;
	}

	public JLabel getIzquierda() {
		return izquierda;
	}

	public void setIzquierda(JLabel izquierda) {
		this.izquierda = izquierda;
	}

	public JLabel getDerecha() {
		return derecha;
	}

	public void setDerecha(JLabel derecha) {
		this.derecha = derecha;
	}

	public static void main(String[] args) {
		Conversor frame = new Conversor();
		frame.setSize(410, 160);
		frame.setTitle("Conversor");
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
