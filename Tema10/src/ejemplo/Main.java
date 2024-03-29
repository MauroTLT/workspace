package ejemplo;

import javax.swing.*;

@SuppressWarnings("serial")
public class Main extends JFrame {
	
	public static void main(String[] args) {
		new Main();
		new Main("Hola Jose");
	}
	
	public Main() {
		setTitle("Hola!!!");
		setSize(600, 400);
		setVisible(true);
		setResizable(false);
		setState(JFrame.NORMAL);
		setLocationRelativeTo(null);
	}
	
	public Main(String mensaje) {
		setTitle(mensaje);
		setSize(600, 400);
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}