package pong;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class PongVista extends JFrame {
	
	private final Random r = new Random();
	private final static int ANCHO = 1200;
	private final static int ALTO = 800;
	private JLabel fondo, arriba, abajo, izquierda, derecha, bola, puntos1, puntos2;
	private JLabel[] colisiones;
	
	public PongVista() {
		this.fondo = new JLabel();
		this.arriba = new JLabel();
		this.abajo = new JLabel();
		this.izquierda = new JLabel();
		this.derecha = new JLabel();
		this.bola = new JLabel();
		this.puntos1 = new JLabel();
		this.puntos2 = new JLabel();
		this.colisiones = new JLabel[4];
		darFormato();
	}

	private void darFormato() {
		this.fondo.setBackground(Color.black);
		this.fondo.setOpaque(true);
		this.setContentPane(fondo);
		this.setLayout(null);
		
		this.izquierda.setBounds(25, 300, 30, 110);
		this.izquierda.setBackground(Color.white);
		this.izquierda.setOpaque(true);
		this.colisiones[0] = this.izquierda;
		this.add(izquierda);
		
		this.derecha.setBounds(ANCHO-70, 300, 30, 110);
		this.derecha.setBackground(Color.white);
		this.derecha.setOpaque(true);
		this.colisiones[1] = this.derecha;
		this.add(derecha);
		
		this.arriba.setBounds(0, 0, ANCHO, 25);
		this.arriba.setBackground(Color.white);
		this.arriba.setOpaque(true);
		this.colisiones[0] = this.arriba;
		this.add(arriba);
		
		this.abajo.setBounds(0, ALTO-50, ANCHO, 25);
		this.abajo.setBackground(Color.white);
		this.abajo.setOpaque(true);
		this.colisiones[0] = this.abajo;
		this.add(abajo);
		
		this.bola.setBounds(500, 400, 25, 25);
		this.bola.setBackground(Color.white);
		this.bola.setOpaque(true);
		this.add(bola);
		
		this.setSize(ANCHO, ALTO);
		this.setTitle("Pong");
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

	public JLabel getArriba() {
		return arriba;
	}

	public void setArriba(JLabel arriba) {
		this.arriba = arriba;
	}

	public JLabel getAbajo() {
		return abajo;
	}

	public void setAbajo(JLabel abajo) {
		this.abajo = abajo;
	}

	public JLabel getIzquierda() {
		return izquierda;
	}

	public void setIzquierda(JLabel izquierda) {
		this.izquierda = izquierda;
	}

	public JLabel getDerecha() {
		return derecha;
	}

	public void setDerecha(JLabel derecha) {
		this.derecha = derecha;
	}

	public JLabel getBola() {
		return bola;
	}

	public void setBola(JLabel bola) {
		this.bola = bola;
	}

	public JLabel getPuntos1() {
		return puntos1;
	}

	public void setPuntos1(JLabel puntos1) {
		this.puntos1 = puntos1;
	}

	public JLabel getPuntos2() {
		return puntos2;
	}

	public void setPuntos2(JLabel puntos2) {
		this.puntos2 = puntos2;
	}

	public JLabel[] getColisiones() {
		return colisiones;
	}

	public void setColisiones(JLabel[] colisiones) {
		this.colisiones = colisiones;
	}

}
