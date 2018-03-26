package Views;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Models.TableroModel;

@SuppressWarnings("serial")
public class SupervivienteEnBatoiView extends JFrame {
	private JOptionPane pane;
	private TableroModel modelo;
	private JButton[][] botones;
	private JButton boton;
	
	public SupervivienteEnBatoiView(TableroModel modelo) {
		this.pane = new JOptionPane();
		this.modelo = modelo;
		this.botones = new JButton[modelo.getFILA()][modelo.getCOLUMNA()];
		this.boton = new JButton();
		darFormato();
	}

	private void darFormato() {
		this.setLayout(new GridLayout(modelo.getFILA(), modelo.getCOLUMNA()));
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				boton = new JButton();
				boton.setName(this.modelo.getCasillas()[i][j].getTipo());
				this.botones[i][j] = boton;
				this.add(boton);
			}
		}
		this.setTitle("SupervivienteEnBatoi");
		this.setSize(750, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JButton[][] getBotones() {
		return botones;
	}

	public void setBotones(JButton[][] botones) {
		this.botones = botones;
	}

	public TableroModel getModelo() {
		return modelo;
	}

	public void setModelo(TableroModel modelo) {
		this.modelo = modelo;
	}

	public JOptionPane getPane() {
		return pane;
	}

	public void setPane(JOptionPane pane) {
		this.pane = pane;
	}

	public JButton getBoton() {
		return boton;
	}

	public void setBoton(JButton boton) {
		this.boton = boton;
	}

}
