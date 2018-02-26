package ejemplo9;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestBorderLayout extends JFrame {
	public static void main(String[] args) {
		TestBorderLayout frame = new TestBorderLayout();
		Container panel = frame.getContentPane();
		JButton norte = new JButton("Norte");
		JButton sur = new JButton("Sur");
		JButton este = new JButton("Este");
		JButton oeste = new JButton("Oeste");
		JButton centro = new JButton("Esto no es el centro");
		panel.add(norte, BorderLayout.SOUTH);
		panel.add(sur, BorderLayout.NORTH);
		panel.add(este, BorderLayout.WEST);
		panel.add(oeste, BorderLayout.EAST);
		panel.add(centro, BorderLayout.CENTER);
		frame.setSize(350, 250);
		frame.setTitle("Prueba de BorderLayoutLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}