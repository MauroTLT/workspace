package asteroids;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class AsteroidVista extends JFrame {
	
	private final static int ANCHO = 1200;
	private final static int ALTO = 700;
	private RotatedIcon rImg;
	private RotatedIcon rImgF;
	private JLabel fondo, nave, asteroide1, asteroide2;
	
	public AsteroidVista() {
		this.rImg = new RotatedIcon(new ImageIcon(getClass().getResource("../resources/nave.png")), 0,true);
		this.rImgF = new RotatedIcon(new ImageIcon(getClass().getResource("../resources/naveF.png")), 0,true);
		this.fondo = new JLabel();
		this.nave = new JLabel();
		this.asteroide1 = new JLabel();
		this.asteroide2 = new JLabel();
		darFormato();
	}

	private void darFormato() {
		this.fondo.setBackground(Color.gray);
		this.fondo.setOpaque(true);
		this.setContentPane(fondo);
		this.setLayout(null);
		
		this.asteroide1.setHorizontalAlignment(SwingConstants.CENTER);
		this.asteroide1.setBounds(550, -100, 100, 100);
		this.asteroide1.setIcon(new ImageIcon(getClass().getResource("../resources/asteroide1.png")));
		this.add(asteroide1);
		
		this.asteroide2.setHorizontalAlignment(SwingConstants.CENTER);
		this.asteroide2.setBounds(200, -100, 100, 100);
		this.asteroide2.setIcon(new ImageIcon(getClass().getResource("../resources/asteroide1.png")));
		this.add(asteroide2);
		
		this.nave.setHorizontalAlignment(SwingConstants.CENTER);
		this.nave.setBounds(350, 350, 70, 70);
		this.nave.setIcon(rImg);
		this.add(nave);		
		
		this.setSize(ANCHO, ALTO);
		this.setTitle("Asteroids");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JLabel getNave() {
		return nave;
	}

	public void setNave(JLabel nave) {
		this.nave = nave;
	}

	public JLabel getAsteroide1() {
		return asteroide1;
	}

	public void setAsteroide1(JLabel asteroide1) {
		this.asteroide1 = asteroide1;
	}

	public JLabel getAsteroide2() {
		return asteroide2;
	}

	public void setAsteroide2(JLabel asteroide2) {
		this.asteroide2 = asteroide2;
	}

	public RotatedIcon getrImg() {
		return rImg;
	}

	public void setrImg(RotatedIcon rImg) {
		this.rImg = rImg;
	}

	public RotatedIcon getrImgF() {
		return rImgF;
	}

	public void setrImgF(RotatedIcon rImgF) {
		this.rImgF = rImgF;
	}

	public static int getAncho() {
		return ANCHO;
	}

	public static int getAlto() {
		return ALTO;
	}

}
