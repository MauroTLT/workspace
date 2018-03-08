package ejercicio7;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Ajedrez extends JFrame {
	private MouseAdapter mouseListener;
	private GridLayout grid;
	private JLabel label;
	
	public Ajedrez() {
		this.mouseListener = new MouseAdapter();
		this.grid = new GridLayout(8, 8);
		this.label = new JLabel();
		darFormato();
	}
	private void darFormato() {
		this.setLayout(grid);
		for (int i = 1; i <= this.grid.getRows(); i++) {
			for (int j = 1; j <= this.grid.getColumns(); j++) {
				label = new JLabel(i + "" + j);
				//this.label.setPreferredSize(new Dimension(65, 65));
				if((i + j) % 2 != 0) {
					this.label.setBackground(Color.BLACK);
					this.label.setForeground(Color.BLACK);
				} else {
					this.label.setBackground(Color.WHITE);
					this.label.setForeground(Color.WHITE);
				}
				this.label.addMouseListener(mouseListener);
				this.label.setOpaque(true);
				this.add(label);
			}

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ajedrez frame = new Ajedrez();
		frame.setSize(520, 520);
		frame.setTitle("Menu");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
