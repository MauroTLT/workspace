package ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NumericListener implements ActionListener {
	EjercicioCalculadora ventana = null;

	public NumericListener(EjercicioCalculadora ventana) {
		super();
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.ventana.getVisor().setText(this.ventana.getVisor().getText() + ((JButton) e.getSource()).getText());
	}
}