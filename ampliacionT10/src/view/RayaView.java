package view;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.BoardModel;

@SuppressWarnings("serial")
public class RayaView extends JFrame {
	private BoardModel mapa;
	private JLabel titulo;
	private JButton reset;
	
	public RayaView() {
		this.mapa = new BoardModel();
		this.titulo = new JLabel("Turno del Jugador 1");
		this.reset = new JButton("Nueva Partida");
		darFormato();
	}

	private void darFormato() {
		this.setLayout(null);
		this.titulo.setBorder(BorderFactory.createLoweredBevelBorder());
		this.titulo.setFont(new Font("Tahoma", 0, 24));
		this.titulo.setHorizontalAlignment(SwingConstants.CENTER);
		this.titulo.setBounds(100, 10, 300, 50);
		this.reset.setBounds(150, 465, 200, 100);
		this.add(titulo);
		this.add(reset);
		this.add(mapa);
		this.setSize(500, 600);
		this.setLocationRelativeTo(null);
		this.setTitle("Tres en Raya");
		this.setVisible(true);
		
	}

	public BoardModel getMapa() {
		return mapa;
	}

	public void setMapa(BoardModel mapa) {
		this.mapa = mapa;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JButton getReset() {
		return reset;
	}

	public void setReset(JButton reset) {
		this.reset = reset;
	}
}
