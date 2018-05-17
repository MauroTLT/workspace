package ImageToText;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageToText {

	public static void main(String[] args) {
		try {
			File file = new File("coche.bmp");
			BufferedImage image = ImageIO.read(file);
			BufferedWriter ficheroSalida = new BufferedWriter(new FileWriter(new File("fichero.txt"),true));
			for (int i = 0; i < image.getHeight(); i++) {
				for (int j = 0; j < image.getWidth(); j++) {
					int color = image.getRGB(j, i);
					String clr = Integer.toHexString(color).substring(2);
					ficheroSalida.write(clr.charAt(0)+" ");
				}
				ficheroSalida.newLine();
			}
			ficheroSalida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
