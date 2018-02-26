package prueba2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NumericListener implements ActionListener {
	EjercicioCalculadora ventana = null;

	public NumericListener(EjercicioCalculadora ventana) {
		super();
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.ventana.visor.setText(this.ventana.visor.getText() + ((JButton) e.getSource()).getText());
	}
}

class OperatorListener implements ActionListener {
	EjercicioCalculadora ventana = null;

	public OperatorListener(EjercicioCalculadora ventana) {
		super();
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		String _operator = source.getText();
		switch (_operator) {
		case "+":
			if((this.ventana.operando.equals("") || this.ventana.operando.equals("-")) && !(this.ventana.operador1.equals(""))) {
				this.ventana.operando = "+";
				this.ventana.visor.setText("+");
			}
			break;
		case "-":
			if((this.ventana.operando.equals("") || this.ventana.operando.equals("+")) && !(this.ventana.operador1.equals(""))) {
				this.ventana.operando = "-";
				this.ventana.visor.setText("-");
			}
			if(this.ventana.operador1.equals("")) {
				this.ventana.operador1 += "-";
			}
			if(this.ventana.operador2.equals("")) {
				this.ventana.operador2 += "-";
			}
			break;
		case "=":
			int result = 0;
			if(this.ventana.operador2.equals("")) {
				this.ventana.operador2 = "0";
			}
			if(this.ventana.operando.equals("+")) {
				result = Integer.parseInt(this.ventana.operador1) + Integer.parseInt(this.ventana.operador2);
			} else if(this.ventana.operando.equals("-")) {
				result = Integer.parseInt(this.ventana.operador1) - Integer.parseInt(this.ventana.operador2);
			}
			this.ventana.visor.setText("" + result);
			this.ventana.operador1 = "";
			this.ventana.operador2 = "";
			this.ventana.operando = "";
			break;
		case "AC":
			this.ventana.visor.setText("");
			this.ventana.operador1 = "";
			this.ventana.operador2 = "";
			this.ventana.operando = "";
			break;
		case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9": case "0":
		if(this.ventana.operando.equals("")) {
			this.ventana.operador1 += source.getText();
			this.ventana.visor.setText(this.ventana.operador1);
		} else {
			this.ventana.operador2 += source.getText();
			this.ventana.visor.setText(this.ventana.operador2);
		}
		break;
		}
	}
}

@SuppressWarnings("serial")
public class EjercicioCalculadora extends JFrame {
	JTextField visor = new JTextField(30);
	String operador1 = "";
	String operador2 = "";
	String operando = "";

	public EjercicioCalculadora() {
		Container container = this.getContentPane();
		@SuppressWarnings("unused")
		NumericListener numericListener = new NumericListener(this);
		OperatorListener operatorListener = new OperatorListener(this);
		container.add(visor, BorderLayout.NORTH);
		JPanel panelCentro = new JPanel();
		container.add(panelCentro, BorderLayout.CENTER);
		JButton buttonSuma = new JButton("+");
		buttonSuma.addActionListener(operatorListener);
		JButton buttonResta = new JButton("-");
		buttonResta.addActionListener(operatorListener);
		JButton buttonIgual = new JButton("=");
		buttonIgual.addActionListener(operatorListener);
		JButton buttonAC = new JButton("AC");
		buttonAC.addActionListener(operatorListener);
		JButton buttonVacio = new JButton("\b\b");
		JButton buttonVacio2 = new JButton("\b");
		JButton button0 = new JButton("0");
		button0.addActionListener(operatorListener);
		for(int i = 1; i < 10; i++) {
			JButton button = new JButton(Integer.toString(i));
			button.addActionListener(operatorListener);
			panelCentro.add(button);
			if(i == 3) {
				panelCentro.add(buttonSuma);
			} else if(i == 6) {
				panelCentro.add(buttonResta);
			}
		}
		panelCentro.add(buttonVacio);
		panelCentro.add(buttonAC);
		panelCentro.add(button0);
		panelCentro.add(buttonVacio2);
		panelCentro.add(buttonIgual);
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