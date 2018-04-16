package Vista;

import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class HistorialView extends JDialog {
	private JScrollPane scroll;
	private JPanel container;
	
	public HistorialView(BufferedReader ficheroEntrada) {
		this.scroll = new JScrollPane();
		this.container = new JPanel();
		darFormato(ficheroEntrada);
	}

	private void darFormato(BufferedReader ficheroEntrada) {
		String linea = null;
		this.container.setLayout(new BoxLayout(this.container, BoxLayout.Y_AXIS));
		try {
			while ((linea = ficheroEntrada.readLine()) != null) {
				this.container.add(new JLabel(linea));
			}
			this.scroll.setViewportView(container);
			this.add(scroll);
			ficheroEntrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
