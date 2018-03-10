package ejercicio9;

import java.awt.Container;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ListaView extends JFrame{
	private Container contenedor;
	private JButton agregar, eliminar, borrar;
	private JLabel titulo, mensaje;
	private JTextField areaTxt;
	private JList<Object> lista;
	private DefaultListModel<Object> model;
	private JScrollPane scroll;
	
	public ListaView() {
		this.contenedor = new Container();
		this.agregar = new JButton("Agregar");
		this.eliminar = new JButton("Eliminar");
		this.borrar = new JButton("Borrar Lista");
		this.titulo = new JLabel("JList");
		this.mensaje = new JLabel();
		this.areaTxt = new JTextField();
		this.lista = new JList<Object>();
		this.model = new DefaultListModel<Object>();
		this.scroll = new JScrollPane();
		darFormato();
	}

	private void darFormato() {
		this.setContentPane(contenedor);
		this.contenedor.setLayout(null);
		this.agregar.setBounds(190, 80, 140, 30);
		this.eliminar.setBounds(20, 240,120, 30);
		this.borrar.setBounds(170, 240, 160, 30);
		this.areaTxt.setBounds(20, 80, 160, 30);
		this.titulo.setBorder(BorderFactory.createLoweredBevelBorder());
		this.titulo.setFont(new Font("Tahoma", 0, 28));
		this.titulo.setHorizontalAlignment(SwingConstants.CENTER);
		this.titulo.setBounds(80, 20, 180, 43);
		this.mensaje.setBounds(20, 285, 280, 30);
		this.lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.scroll.setBounds(20, 135, 310, 90);
	    this.scroll.setViewportView(lista);
	    this.lista.setModel(model);
	    this.model.addElement("Cristian David");
	    this.model.addElement("Ana Milena");
	    this.model.addElement("Miguel Angel");
		this.contenedor.add(titulo);
		this.contenedor.add(areaTxt);
		this.contenedor.add(agregar);
		this.contenedor.add(eliminar);
		this.contenedor.add(borrar);
		this.contenedor.add(mensaje);
		this.contenedor.add(scroll);
		this.setTitle("Lista");
		this.setSize(350, 360);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
	}

	public Container getContenedor() {
		return contenedor;
	}

	public void setContenedor(Container contenedor) {
		this.contenedor = contenedor;
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JButton getBorrar() {
		return borrar;
	}

	public void setBorrar(JButton borrar) {
		this.borrar = borrar;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getMensaje() {
		return mensaje;
	}

	public void setMensaje(JLabel mensaje) {
		this.mensaje = mensaje;
	}

	public JTextField getAreaTxt() {
		return areaTxt;
	}

	public void setAreaTxt(JTextField areaTxt) {
		this.areaTxt = areaTxt;
	}

	public JList<Object> getLista() {
		return lista;
	}

	public void setLista(JList<Object> lista) {
		this.lista = lista;
	}

	public DefaultListModel<Object> getModel() {
		return model;
	}

	public void setModel(DefaultListModel<Object> model) {
		this.model = model;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}
}
