package views;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ComprarView {
	private JPanel comprar;
	private Container centro, abajo;
	private JLabel titulo, cantidad;
	private JComboBox<Object> lista;
	private JButton aceptar, salir;
	
	public ComprarView() {
		String[] items = {"", "100", "500", "1000"};
		this.comprar = new JPanel();
		this.centro = new Container();
		this.abajo = new Container();
		this.cantidad = new JLabel("Cantidad", SwingConstants.CENTER);
		this.titulo = new JLabel("Comprar");
		this.lista = new JComboBox<Object>(items);
		this.aceptar = new JButton("Aceptar");
		this.salir = new JButton("Salir");
		darFormato();
	}

	private void darFormato() {
		this.comprar.setLayout(new GridLayout(3,1));
		this.comprar.add(titulo, BorderLayout.NORTH);
		this.centro.setLayout(new GridLayout(1, 2));
		this.abajo.setLayout(new GridLayout(1, 2));
		this.centro.add(cantidad);
		this.centro.add(lista);
		this.abajo.add(aceptar, BorderLayout.WEST);
		this.abajo.add(salir, BorderLayout.EAST);
		this.comprar.add(centro, BorderLayout.CENTER);
		this.comprar.add(abajo, BorderLayout.SOUTH);
	}

	public JPanel getComprar() {
		return comprar;
	}

	public void setComprar(JPanel comprar) {
		this.comprar = comprar;
	}

	public Container getCentro() {
		return centro;
	}

	public void setCentro(Container centro) {
		this.centro = centro;
	}

	public Container getAbajo() {
		return abajo;
	}

	public void setAbajo(Container abajo) {
		this.abajo = abajo;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getCantidad() {
		return cantidad;
	}

	public void setCantidad(JLabel cantidad) {
		this.cantidad = cantidad;
	}

	public JComboBox<Object> getLista() {
		return lista;
	}

	public void setLista(JComboBox<Object> lista) {
		this.lista = lista;
	}

	public JButton getAceptar() {
		return aceptar;
	}

	public void setAceptar(JButton aceptar) {
		this.aceptar = aceptar;
	}

	public JButton getSalir() {
		return salir;
	}

	public void setSalir(JButton salir) {
		this.salir = salir;
	}
}
