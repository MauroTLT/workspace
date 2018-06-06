package plataformas;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class PlataformaView extends JFrame {
	
	private final Random r = new Random();
	private final static int ANCHO = 1200;
	private final static int ALTO = 800;
	private JLabel fondo, suelo, pas1, pas2, personaje;
	private JLabel[] colisiones;
	
	public PlataformaView() {
		this.fondo = new JLabel();
		this.suelo = new JLabel();
		this.pas1 = new JLabel();
		this.pas2 = new JLabel();
		this.personaje = new JLabel();
		this.colisiones = new JLabel[2];
		darFormato();
	}

	private void darFormato() {
		this.fondo.setBackground(Color.black);
		this.fondo.setOpaque(true);
		this.setContentPane(fondo);
		this.setLayout(null);
		
		this.personaje.setBounds(500, 400, 50, 100);
		this.personaje.setBackground(Color.red);
		this.personaje.setOpaque(true);
		this.add(personaje);
		
		this.suelo.setBounds(0, ALTO-120, ANCHO, 100);
		this.suelo.setBackground(Color.white);
		this.suelo.setOpaque(true);
		this.add(suelo);
		
		this.pas1.setBounds(800, 500, 300, 50);
		this.pas1.setBackground(Color.white);
		this.pas1.setOpaque(true);
		this.add(pas1);
		this.colisiones[0] = pas1;
		
		this.pas2.setBounds(100, 250, 450, 50);
		this.pas2.setBackground(Color.white);
		this.pas2.setOpaque(true);
		this.add(pas2);
		this.colisiones[1] = pas2;
		
		this.setSize(ANCHO, ALTO);
		this.setTitle("Super Merio Brus");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public Random getR() {
		return r;
	}

	public static int getAncho() {
		return ANCHO;
	}

	public static int getAlto() {
		return ALTO;
	}

	public JLabel getSuelo() {
		return suelo;
	}

	public void setSuelo(JLabel suelo) {
		this.suelo = suelo;
	}

	public JLabel getPas1() {
		return pas1;
	}

	public void setPas1(JLabel pas1) {
		this.pas1 = pas1;
	}

	public JLabel getPas2() {
		return pas2;
	}

	public void setPas2(JLabel pas2) {
		this.pas2 = pas2;
	}

	public JLabel getPersonaje() {
		return personaje;
	}

	public void setPersonaje(JLabel personaje) {
		this.personaje = personaje;
	}

	public JLabel[] getColisiones() {
		return colisiones;
	}

	public void setColisiones(JLabel[] colisiones) {
		this.colisiones = colisiones;
	}

	
}
