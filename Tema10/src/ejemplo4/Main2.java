package ejemplo4;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main2 extends JFrame {
	public Main2() {
		setTitle("Hola!!!");
		setSize(600, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		Container contentpane = getContentPane();
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		panel2.setBackground(Color.RED);
		panel2.add(new JButton("Click aquí"));
		contentpane.add(panel2);
		setVisible(true);
		panel2.setLocation(0, 0);
		panel2.setSize(300,500);
		
		
		panel3.setBackground(Color.ORANGE);
		panel3.add(new JButton("Java gratis"));
		contentpane.add(panel3);
		setVisible(true);
		panel3.setLocation(300, 0);
		panel3.setSize(300,500);
		
		contentpane.add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main2();
	}
}
