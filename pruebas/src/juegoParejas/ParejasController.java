package juegoParejas;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class ParejasController implements MouseListener{
	private int aux;
	private CasillaModel primera;
	private ParejasView ventana;
	
	public ParejasController() {
		this.aux = 0;
		this.primera = null;
		this.ventana = new ParejasView();
		setActions();
	}

	private void setActions() {
		for (int i = 0; i < this.ventana.getTablero().getComponentCount(); i++) {
			this.ventana.getTablero().getComponent(i).addMouseListener(this);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		CasillaModel label = (CasillaModel) e.getSource();
		if(primera == null) {
			if(label.getBackground() == Color.WHITE) {
				primera = label;
				label.setBackground(label.getColor());
			}
		} else if(primera != null) {
			if(primera != label){
				if(label.getColor() == primera.getColor()) {
					label.setBackground(label.getColor());
					primera = null;
					aux++;
				} else {
					if(label.getBackground() == Color.WHITE){
						label.setBackground(label.getColor());
						JOptionPane.showMessageDialog(null, "Error");
						label.setBackground(Color.WHITE);
						primera.setBackground(Color.WHITE);
						primera = null;
					}
				}
				if(aux == 8) {
					JOptionPane.showMessageDialog(null, "Has ganado");
					System.exit(0);
				}
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public ParejasView getVentana() {
		return ventana;
	}

	public void setVentana(ParejasView ventana) {
		this.ventana = ventana;
	}


}
