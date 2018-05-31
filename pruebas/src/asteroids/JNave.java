package asteroids;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class JNave extends JLabel {
	
	public JNave() {
		super();
		//this.setIcon(new ImageIcon(getClass().getResource("../resources/nave.png")));
	}
	
	@Override
    public Dimension getPreferredSize() {
		try {
			BufferedImage bi = ImageIO.read(new File("nave.png"));
			return new Dimension(bi.getWidth(), bi.getHeight());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
        	System.out.println("pintado otra vez");
			BufferedImage bi = ImageIO.read(new File("nave.png"));
			Graphics2D g2 = (Graphics2D) g;
			g2.rotate(Math.PI / 4, bi.getWidth() / 2, bi.getHeight() / 2);
			g2.drawImage(bi, 0, 0, null);
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
