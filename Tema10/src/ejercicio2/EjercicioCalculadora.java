package ejercicio2;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class EjercicioCalculadora extends JFrame {
	private JTextField visor;
	private String operador1, operador2, operando;
	private Container container;
	//NumericListener numericListener; //En realidad no hace falta usar esto para nada
	private OperatorListener operatorListener;
	private JPanel panelCentro;
	private JButton buttonSuma, buttonResta, buttonIgual, buttonAC, buttonMultip, buttonDivi, button0, button;

	public EjercicioCalculadora() {
		this.visor  = new JTextField(30);
		this.operador1 = "";
		this.operador2 = "";
		this.operando = "";
		this.container = this.getContentPane();
		//numericListener = new NumericListener(this);
		this.operatorListener = new OperatorListener(this);
		this.panelCentro = new JPanel();
		this.buttonSuma = new JButton("+");
		this.buttonResta = new JButton("-");
		this.buttonIgual = new JButton("=");
		this.buttonAC = new JButton("AC");
		this.buttonMultip = new JButton("*");
		this.buttonDivi = new JButton("/");
		this.button0 = new JButton("0");
		darFormato();
	}
	public void darFormato() {
		container.add(visor, BorderLayout.NORTH);
		container.add(panelCentro, BorderLayout.CENTER);
		buttonSuma.addActionListener(operatorListener);
		buttonResta.addActionListener(operatorListener);
		buttonIgual.addActionListener(operatorListener);
		buttonAC.addActionListener(operatorListener);
		buttonMultip.addActionListener(operatorListener);
		buttonDivi.addActionListener(operatorListener);
		button0.addActionListener(operatorListener);
		for(int i = 1; i < 10; i++) {
			button = new JButton(Integer.toString(i));
			button.addActionListener(operatorListener);
			panelCentro.add(button);
			if(i == 3) {
				panelCentro.add(buttonSuma);
			} else if(i == 6) {
				panelCentro.add(buttonResta);
			}
		}
		panelCentro.add(buttonMultip);
		panelCentro.add(buttonAC);
		panelCentro.add(button0);
		panelCentro.add(buttonIgual);
		panelCentro.add(buttonDivi);
	}
	
	public JTextField getVisor() {
		return visor;
	}
	public void setVisor(JTextField visor) {
		this.visor = visor;
	}
	public String getOperador1() {
		return operador1;
	}
	public void setOperador1(String operador1) {
		this.operador1 = operador1;
	}
	public String getOperador2() {
		return operador2;
	}
	public void setOperador2(String operador2) {
		this.operador2 = operador2;
	}
	public String getOperando() {
		return operando;
	}
	public void setOperando(String operando) {
		this.operando = operando;
	}

	public static void main(String[] args) {
		EjercicioCalculadora frame = new EjercicioCalculadora();
		frame.setSize(210, 200);
		frame.setTitle("Calculadora");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
