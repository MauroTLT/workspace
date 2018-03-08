package ejemplo10;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class TestGridLayout extends JFrame {
	public static void main(String[] args) {
		TestGridLayout frame = new TestGridLayout();
		Container container = frame.getContentPane();
		int X = 3;
		int Y = 3;
		container.setLayout(new GridLayout(X, Y));
		for (int i = 1; i <= X; i++) {
			for (int j = 1; j <= Y; j++) {
				container.add(new JButton(i + "x" + j));
			}

		}
		JButton prueba = (JButton) container.getComponent(1);
		System.out.println(prueba.getText());
		frame.setSize(350, 250);
		frame.setTitle("Prueba de BorderLayoutLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
