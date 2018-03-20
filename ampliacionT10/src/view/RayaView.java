package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.BoardModel;

@SuppressWarnings("serial")
public class RayaView extends JFrame {
	private BoardModel mapa;
	private JLabel titulo, player1, player2, cont1, cont2;
	private JButton reset;
	
	public RayaView(BoardModel mapa) {
		this.mapa = mapa;
		this.titulo = new JLabel("Turno del Jugador 1 (X)");
		this.player1 = new JLabel("Jugador 1 (X)");
		this.player2 = new JLabel("Jugador 2 (O)");
		this.cont1 = new JLabel("0");
		this.cont2 = new JLabel("0");
		this.reset = new JButton("Nueva Partida");
		darFormato();
	}

	private void darFormato() {
		this.setContentPane(new JLabel(new ImageIcon(getClass().getResource("../resources/bg.jpg"))));
		this.setLayout(null);
		this.titulo.setBorder(BorderFactory.createLoweredBevelBorder());
		this.titulo.setFont(new Font("Tahoma", 0, 24));
		this.titulo.setHorizontalAlignment(SwingConstants.CENTER);
		this.titulo.setBounds(300, 10, 300, 50);
		this.titulo.setOpaque(true);
		this.titulo.setBackground(Color.LIGHT_GRAY);
		this.player1.setBorder(BorderFactory.createRaisedBevelBorder());
		this.player1.setFont(new Font("Tahoma", 0, 20));
		this.player1.setHorizontalAlignment(SwingConstants.CENTER);
		this.player1.setBounds(75, 150, 150, 50);
		this.player1.setOpaque(true);
		this.player1.setBackground(Color.CYAN);
		this.cont1.setBorder(BorderFactory.createRaisedBevelBorder());
		this.cont1.setFont(new Font("Tahoma", 0, 20));
		this.cont1.setHorizontalAlignment(SwingConstants.CENTER);
		this.cont1.setBounds(125, 225, 50, 50);
		this.cont1.setOpaque(true);
		this.cont1.setBackground(Color.CYAN);
		this.player2.setBorder(BorderFactory.createRaisedBevelBorder());
		this.player2.setFont(new Font("Tahoma", 0, 20));
		this.player2.setHorizontalAlignment(SwingConstants.CENTER);
		this.player2.setBounds(685, 150, 150, 50);
		this.player2.setOpaque(true);
		this.player2.setBackground(Color.CYAN);
		this.cont2.setBorder(BorderFactory.createRaisedBevelBorder());
		this.cont2.setFont(new Font("Tahoma", 0, 20));
		this.cont2.setHorizontalAlignment(SwingConstants.CENTER);
		this.cont2.setBounds(735, 225, 50, 50);
		this.cont2.setOpaque(true);
		this.cont2.setBackground(Color.CYAN);
		this.reset.setBounds(350, 465, 200, 100);
		this.add(player1);
		this.add(player2);
		this.add(cont1);
		this.add(cont2);
		this.add(titulo);
		this.add(reset);
		this.add(mapa);
		this.setSize(900, 600);
		this.setLocationRelativeTo(null);
		this.setTitle("Tres en Raya");
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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

	public JLabel getPlayer1() {
		return player1;
	}

	public void setPlayer1(JLabel player1) {
		this.player1 = player1;
	}

	public JLabel getPlayer2() {
		return player2;
	}

	public void setPlayer2(JLabel player2) {
		this.player2 = player2;
	}

	public JLabel getCont1() {
		return cont1;
	}

	public void setCont1(JLabel cont1) {
		this.cont1 = cont1;
	}

	public JLabel getCont2() {
		return cont2;
	}

	public void setCont2(JLabel cont2) {
		this.cont2 = cont2;
	}
}