package ejercicio7;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Ajedrez extends JFrame {
	private GridLayout grid;
	private JLabel label;
	private ArrayList<JLabel> array;
	
	public Ajedrez() {
		this.grid = new GridLayout(8, 8);
		this.label = new JLabel();
		this.array = new ArrayList<JLabel>();
		darFormato();
	}
	private void darFormato() {
		this.setLayout(grid);
		for (int i = 1; i <= this.grid.getRows(); i++) {
			for (int j = 1; j <= this.grid.getColumns(); j++) {
				this.label = new JLabel();
				this.label.setName(i + "" + j);
				//this.label.setPreferredSize(new Dimension(65, 65));
				if((i + j) % 2 != 0) {
					this.label.setBackground(Color.BLACK);
				} else {
					this.label.setBackground(Color.WHITE);
				}
				this.array.add(label);
				this.label.setOpaque(true);
				this.add(label);
			}

		}
	}
	
	public JLabel getLabel() {
		return label;
	}
	
	public void setLabel(JLabel label) {
		this.label = label;
	}
	
	public ArrayList<JLabel> getArray() {
		return array;
	}
	
	public void setArray(ArrayList<JLabel> array) {
		this.array = array;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseAdapter frame = new MouseAdapter();
	}

}
