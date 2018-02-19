package ejemplo4;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Main extends JFrame {
	public Main() {
		setTitle("Hola!!!");
		setSize(300, 200);
		Container contentpane = getContentPane();
		JPanel panel = new JPanel();
		contentpane.add(panel);
		panel.setBackground(Color.RED);
		panel.add(new JButton("Click aquí"));
		panel.add(new JButton("No hagas click aquí"));
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}
}