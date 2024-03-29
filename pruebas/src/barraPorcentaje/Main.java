package barraPorcentaje;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Main implements MouseListener, Runnable {
	
	JProgressBar bar = new JProgressBar(0,100);
	public static void main(String[] args) {
		Main main = new Main();
		main.inici();
	}

	private void inici() {
		JFrame ventana = new JFrame();
		JButton boton = new JButton();
		boton.addMouseListener(this);
		ventana.add(boton);
		
		
		ventana.setSize(250, 250);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		Thread hilo = new Thread(this);
		JDialog dialog = new JDialog();
		
		bar.setString("Barra");
		bar.setStringPainted(true);
		bar.setBackground(Color.BLUE);
		bar.setForeground(Color.GREEN);
		dialog.add(bar);
		
		dialog.setSize(350, 250);
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
		hilo.start();
	}
	
	public void run() {
		while (bar.getValue()< bar.getMaximum()) {
			bar.setValue(bar.getValue()+5);
			bar.setForeground(new Color((int)bar.getForeground().getRed(), (int)bar.getForeground().getGreen()-10, (int)bar.getForeground().getBlue()+10));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
