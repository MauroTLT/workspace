package ejemplo11;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class TestBoxLayout extends JFrame {
	public static void main(String[] args) {
		String[] opciones = { "Arriba", "Abajo", "Derecha", "Izquierda", "Todas las direcciones" };
		//JComboBox<Object> cb = new JComboBox<Object>(opciones);
		TestBoxLayout f = new TestBoxLayout();
		Container container = f.getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		// Orient. Horiz.
		
		((JPanel) container).setBorder(BorderFactory.createTitledBorder("Demo BoxLayout"));
		JPanel panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder("Panel1"));
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		JPanel panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createTitledBorder("Panel2"));
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

		for (int i = 1; i <= 3; i++) {
			panel1.add(new JButton("Botón número " + i));
			panel2.add(new JButton("Botón número " + i));
		}
		
		container.add(panel1);
		container.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setBorder(BorderFactory.createTitledBorder("Panel3"));
		panel3.add(new JComboBox<Object>(opciones));
		JPanel panel4 = new JPanel();
		panel4.setBorder(BorderFactory.createTitledBorder("Panel4"));
		panel4.add(new JComboBox<Object>(opciones));
		
		container.add(panel3);
		container.add(panel4);
		f.setSize(350, 400);
		f.setTitle("Demo BoxLayout");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}