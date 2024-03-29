package ejercicio8;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class Tabla extends JFrame{
	private String[] titulos;
	private String[][] content;
	private JTable table;
	//private JScrollPane scroll = new JScrollPane();
	
	public Tabla() {
		titulos = new String[]{"Nombre", "Apellido", "Curso"};
		content = new String[][]{{"Jaime", "Martinez Juan", "1DAM"},{"Carmen","Diaz Sanz","2DAW"},{"Carlos", "Faez Tudons", "2SMX"}};
		this.table = new JTable(content, titulos);
		//this.scroll = new JScrollPane(table);
		darFormato();
	}
	
	private void darFormato() {
		this.table.setDefaultEditor(Object.class, null);
		//this.table.setEnabled(false);
		this.add(table.getTableHeader(), BorderLayout.PAGE_START);
		this.add(table);
		this.setTitle("Tabla");
		this.setSize(500, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
}
