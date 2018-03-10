package ejemplo2;

import javax.swing.*;

@SuppressWarnings("serial")
public class Main extends JFrame {
	// el constuctor
	public Main() {
		setTitle("Ejemplo ventana con dialog enfrente!");
		setSize(300, 200);
		setVisible(true);
		setLocationRelativeTo(null);
		JDialog cuadroDialogo = new JDialog(this, true);
		cuadroDialogo.setSize(100, 100);
		cuadroDialogo.setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}
}