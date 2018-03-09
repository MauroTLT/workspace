package ejemplo12;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class VentanaBase extends JFrame {
	public VentanaBase() {
		setTitle("Evento WindowClosing");
		setSize(new Dimension(300, 200));
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "El programa" + " finalizara cuando pulse Aceptar");
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new VentanaBase().setVisible(true);
	}
}