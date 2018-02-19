package ejemplo4;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main2 extends JFrame {
	public Main2() {
		setTitle("Hola!!!");
		setSize(1000, 700);
		setLocationRelativeTo(null);
		setResizable(true);
		Container contentpane = getContentPane();
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JLabel label = new JLabel("1 x 7 = 7");
		
		contentpane.add(panel2);
		panel2.setBackground(Color.RED);
		panel2.add(label);
		panel2.add(new JButton("Click aquí"));
		panel2.setSize(this.getWidth() / 2, this.getHeight());
		
		contentpane.add(panel3);
		panel3.setBackground(Color.ORANGE);
		panel3.add(new JButton("Java gratis"));
		panel3.setLocation(panel2.getWidth(), 0);
		panel3.setSize(this.getWidth() / 2, this.getHeight());
		
		contentpane.add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main2();
	}
}
