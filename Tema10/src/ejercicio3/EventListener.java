package ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class EventListener implements ActionListener {
	private Conversor ventana;
	
	public EventListener(Conversor ventana) {
		this.setVentana(ventana);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		double cantidad = 0;
		double resultado = 0;
		try {
			switch(source.getText()) {
			case "€ -> $": // euro - dolar
				cantidad = Double.parseDouble(this.ventana.getAreaTxt().getText());
				this.ventana.getIzquierda().setText(String.format(Locale.ENGLISH, "%.2f", cantidad) + "€");
				resultado = cantidad * 1.13;
				this.ventana.getDerecha().setText(String.format(Locale.ENGLISH, "%.2f", resultado) + "$");
				break;
			case "$ -> €": // dolar - euro
				cantidad = Double.parseDouble(this.ventana.getAreaTxt().getText());
				this.ventana.getIzquierda().setText(String.format(Locale.ENGLISH, "%.2f", cantidad) + "$");
				resultado = cantidad / 1.13;
				this.ventana.getDerecha().setText(String.format(Locale.ENGLISH, "%.2f", resultado) + "€");
				break;
			}
		} catch (NumberFormatException e1) {
			if(this.ventana.getAreaTxt().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Escribe algo para poder hacer la conversión.");
			} else {
				JOptionPane.showMessageDialog(null, "El valor " + this.ventana.getAreaTxt().getText() + " es Incorrecto, escribe un numero.");
				this.ventana.getAreaTxt().setText("");
			}
		}
	}

	public Conversor getVentana() {
		return ventana;
	}

	public void setVentana(Conversor ventana) {
		this.ventana = ventana;
	}

}
