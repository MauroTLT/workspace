package View;

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

import Model.ListaModel;

@SuppressWarnings("serial")
public class ListaView extends JFrame{
	private Container contenedor;
	private JButton agregar, eliminar, borrar;
	private JLabel titulo, mensaje;
	private JTextField areaTxt;
	private DefaultListModel<String> modelo;
	private JList<String> lista;
	private JScrollPane scroll;

	public ListaView(ListaModel model) {
		this.contenedor = new Container();
		this.agregar = new JButton("Agregar");
		this.eliminar = new JButton("Eliminar");
		this.borrar = new JButton("Borrar Lista");
		this.titulo = new JLabel("JList");
		this.mensaje = new JLabel();
		this.areaTxt = new JTextField();
		this.modelo = new DefaultListModel<String>();
		aniadir(model);
		this.lista = new JList<String>(modelo);
		this.scroll = new JScrollPane();
		darFormato();
	}

	public void aniadir(ListaModel model) {
		for (int i = 0; i < model.getLista().size(); i++) {
			if(!this.modelo.contains(model.getLista().get(i))) {
				this.modelo.addElement(model.getLista().get(i));
			}
		}
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

	public JList<String> getLista() {
		return lista;
	}

	public void setLista(JList<String> lista) {
		this.lista = lista;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	public DefaultListModel<String> getModelo() {
		return modelo;
	}

	public void setModelo(DefaultListModel<String> modelo) {
		this.modelo = modelo;
	}
}
