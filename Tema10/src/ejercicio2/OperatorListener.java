package ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class OperatorListener implements ActionListener {
	EjercicioCalculadora ventana = null;

	public OperatorListener(EjercicioCalculadora ventana) {
		super();
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton source = (JButton) event.getSource();
		String _operator = source.getText();
		switch (_operator) {
		case "+":
			if(!(this.ventana.getOperador1().equals(""))) {
				this.ventana.setOperando("+");
				this.ventana.getVisor().setText("+");
			}
			break;
		case "-":
			if(!(this.ventana.getOperador1().equals("")) && this.ventana.getOperador2().equals("") && this.ventana.getOperando().equals("")) {
				this.ventana.setOperando("-");
				this.ventana.getVisor().setText("-");
			} else if(this.ventana.getOperador1().equals("")) {
				this.ventana.setOperador1(this.ventana.getOperador1() + "-");
				this.ventana.getVisor().setText("-");
			} else if(this.ventana.getOperador2().equals("")) {
				this.ventana.setOperador2(this.ventana.getOperador2() + "-");
				this.ventana.getVisor().setText("-");
			}
			break;
		case "*":
			if(this.ventana.getOperador2().equals("")) {
				this.ventana.setOperando("*");
				this.ventana.getVisor().setText("*");
			}
			break;
		case "/":
			if(this.ventana.getOperador2().equals("")) {
				this.ventana.setOperando("/");
				this.ventana.getVisor().setText("/");
			}
			break;
		case "=":
			int result = 0;
			try {
				if(!this.ventana.getOperador1().equals("") && this.ventana.getOperador2().equals("")) {
					result = Integer.parseInt(this.ventana.getOperador1());
				} else {
					if(this.ventana.getOperando().equals("+")) {
						result = Integer.parseInt(this.ventana.getOperador1()) + Integer.parseInt(this.ventana.getOperador2());
					} else if(this.ventana.getOperando().equals("-")) {
						result = Integer.parseInt(this.ventana.getOperador1()) - Integer.parseInt(this.ventana.getOperador2());
					} else if(this.ventana.getOperando().equals("*")) {
						result = Integer.parseInt(this.ventana.getOperador1()) * Integer.parseInt(this.ventana.getOperador2());
					} else if(this.ventana.getOperando().equals("/")) {
						result = Integer.parseInt(this.ventana.getOperador1()) / Integer.parseInt(this.ventana.getOperador2());
					}
				}
				this.ventana.getVisor().setText("" + result);
				this.ventana.setOperador1(Integer.toString(result));
				this.ventana.setOperador2("");
				this.ventana.setOperando("");
			} catch (ArithmeticException e) {
				this.ventana.getVisor().setText("No se puede dividir entre 0");
				this.ventana.setOperador1("");
				this.ventana.setOperador2("");
				this.ventana.setOperando("");
			}
			
			break;
		case "AC":
			this.ventana.getVisor().setText("");
			this.ventana.setOperador1("");
			this.ventana.setOperador2("");
			this.ventana.setOperando("");
			break;
		case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9": case "0":
		if(this.ventana.getOperando().equals("")) {
			this.ventana.setOperador1(this.ventana.getOperador1() + source.getText());
			this.ventana.getVisor().setText(this.ventana.getOperador1());
		} else {
			this.ventana.setOperador2(this.ventana.getOperador2() + source.getText());
			this.ventana.getVisor().setText(this.ventana.getOperador2());
		}
		break;
		}
	}
}
