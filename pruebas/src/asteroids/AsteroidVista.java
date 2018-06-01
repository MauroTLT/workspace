package asteroids;

import java.awt.Color;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class AsteroidVista extends JFrame {
	
	private final Random r = new Random();
	private final static int ANCHO = 1200;
	private final static int ALTO = 700;
	private RotatedIcon rImg;
	private RotatedIcon rImgF;
	private JLabel fondo, nave;
	private JLabel[] grupo;
	
	public AsteroidVista() {
		this.rImg = new RotatedIcon(new ImageIcon(getClass().getResource("../resources/nave.png")), 0,true);
		this.rImgF = new RotatedIcon(new ImageIcon(getClass().getResource("../resources/naveF.png")), 0,true);
		this.fondo = new JLabel();
		this.nave = new JLabel();
		this.grupo = new JLabel[8];
		darFormato();
	}

	private void darFormato() {
		this.fondo.setBackground(Color.gray);
		this.fondo.setOpaque(true);
		this.setContentPane(fondo);
		this.setLayout(null);
		
		for (int i = 0; i < grupo.length; i++) {
			JLabel asteroide = new JLabel();
			asteroide.setHorizontalAlignment(SwingConstants.CENTER);
			asteroide.setBounds(r.nextInt(ANCHO), r.nextInt(ANCHO), 100, 100);
			asteroide.setIcon(new ImageIcon(getClass().getResource("../resources/asteroide1.png")));
			asteroide.setBorder(BorderFactory.createLineBorder(Color.black));
			this.grupo[i] = asteroide;
			this.add(grupo[i]);
		}
		
		this.nave.setHorizontalAlignment(SwingConstants.CENTER);
		this.nave.setBounds(570, 350, 70, 70);
		this.nave.setIcon(rImg);
		this.nave.setBorder(BorderFactory.createLineBorder(Color.black));
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

	public JLabel[] getGrupo() {
		return grupo;
	}

	public void setGrupo(JLabel[] grupo) {
		this.grupo = grupo;
	}

}
