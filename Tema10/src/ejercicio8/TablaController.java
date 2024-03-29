package ejercicio8;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;

public class TablaController implements MouseListener {
	private Tabla ventana;
	
	public TablaController() {
		
		this.ventana = new Tabla();
		setActions();
	}

	private void setActions() {
		this.ventana.getTable().addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
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

	@Override
	public void mousePressed(MouseEvent e) {
		JTable tabla = (JTable)e.getSource();
		String dato = String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), tabla.getSelectedColumn()));
		JOptionPane.showMessageDialog(null, dato);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public Tabla getVentana() {
		return ventana;
	}

	public void setVentana(Tabla ventana) {
		this.ventana = ventana;
	}
}
