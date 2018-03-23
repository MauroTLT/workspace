package Views;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import Models.TableroModel;

@SuppressWarnings("serial")
public class SupervivienteEnBatoiView extends JFrame {
	
	private TableroModel modelo;
	private JButton[][] botones;
	
	public SupervivienteEnBatoiView(TableroModel modelo) {
		this.modelo = modelo;
		this.botones = new JButton[3][5];
		darFormato();
	}

	private void darFormato() {
		this.setLayout(new GridLayout(3,5));
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				JButton button = new JButton();
				button.setName(this.modelo.getCasillas()[i][j].getTipo());
				this.botones[i][j] = button;
				this.add(button);
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

}
