package ejemplo13;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class EjemploItemListener extends JFrame implements ItemListener {
	private JPanel panel;
	private JCheckBox bold;
	private JCheckBox italic;
	private JTextField txt;
	private ButtonGroup bg;
	private JRadioButton rb1;
	private JRadioButton rb2;
	private int valBold;
	private int valItalic;
	private int veintcuatro;
	private int doce;

	public EjemploItemListener() {
		this.panel = new JPanel();
		this.bold = new JCheckBox("Bold");
		this.italic = new JCheckBox("Italic");
		this.txt = new JTextField(20);
		this.bg = new ButtonGroup();
		this.rb1 = new JRadioButton("12");
		this.rb2 = new JRadioButton("24");
		this.valBold = Font.PLAIN;
		this.valItalic = Font.PLAIN;
		this.veintcuatro = 5;
		this.doce = 5;
		crear();
	}
	
	public void crear(){
		bold.addItemListener(this);
		italic.addItemListener(this);
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		txt.setText("Esto es un ejemplo");
		txt.setFont(new Font("Courier", Font.PLAIN, 36));
		panel.add(txt);
		panel.add(bold);
		panel.add(italic);
		bg.add(rb1);
		bg.add(rb2);
		panel.add(rb1);
		panel.add(rb2);
		this.setContentPane(panel);
		this.setSize(new Dimension(500, 150));
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == bold) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				valBold = Font.BOLD;
			} else {
				valBold = Font.PLAIN;
			}
		}
		if (e.getSource() == italic) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				valItalic = Font.ITALIC;
			} else {
				valItalic = Font.PLAIN;
			}
		}
		if (e.getSource() == rb1) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				doce = 12;
			} 
		}
		if (e.getSource() == rb2) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				veintcuatro = 24;
			} else {
				veintcuatro = 5;
			}
		}
		Font font = new Font("Courier", valBold | valItalic, doce | veintcuatro);
		txt.setFont(font);
	}

	public static void main(String[] args) {
		new EjemploItemListener().setVisible(true);
	}
}
