package ejemplo5;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Main extends JFrame {
	public Main() {
		setTitle("DATOS");
		setSize(300, 200);
		JLabel lbl1 = new JLabel("Nombre");
		JTextField txt1 = new JTextField(18);
		JLabel lbl2 = new JLabel("Edad");
		JTextField txt2 = new JTextField(10);
		Container contentpane = getContentPane();
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.add(lbl1);
		panel.add(txt1);
		panel.add(lbl2);
		panel.add(txt2);
		/* panel.add(new JButton("Click aquí")); */
		contentpane.add(panel);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Main();
	}
}