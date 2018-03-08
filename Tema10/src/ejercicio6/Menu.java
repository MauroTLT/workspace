package ejercicio6;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Menu extends JFrame {
	private JPanel panel;
	private JLabel txt;
	private EventListener actionListener;
	private JMenuBar menu;
	private JMenuItem cuenta;
	private JMenu operar;
	private JMenuItem lista;
	private JMenuItem salir;
	private JMenuItem comprar;
	private JMenuItem vender;
	
	public Menu() {
		this.panel = new JPanel();
		this.txt = new JLabel();
		this.actionListener = new EventListener(this);
		this.menu = new JMenuBar();
		this.cuenta = new JMenuItem("Mi Cuenta");
		this.operar = new JMenu("Operar");
		this.lista = new JMenuItem("Listado Movimientos");
		this.salir = new JMenuItem("Salir");
		this.comprar = new JMenuItem("Comprar");
		this.vender = new JMenuItem("Vender");
		darFormato();
	}

	private void darFormato() {
		this.panel.add(txt);
		this.operar.addActionListener(actionListener);
		this.lista.addActionListener(actionListener);
		this.cuenta.addActionListener(actionListener);
		this.salir.addActionListener(actionListener);
		this.comprar.addActionListener(actionListener);
		this.vender.addActionListener(actionListener);
		this.operar.add(comprar);
		this.operar.add(vender);
		this.cuenta.setPreferredSize(new Dimension(90, 20));
		this.menu.add(cuenta);
		this.operar.setPreferredSize(new Dimension(80, 20));
		this.menu.add(operar);
		this.lista.setPreferredSize(new Dimension(180, 20));
		this.menu.add(lista);
		this.salir.setPreferredSize(new Dimension(80, 20));
		this.menu.add(salir);
		this.add(menu, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
	}
	
	public JMenuBar getMenu() {
		return menu;
	}

	public void setMenu(JMenuBar menu) {
		this.menu = menu;
	}

	public JMenuItem getCuenta() {
		return cuenta;
	}

	public void setCuenta(JMenuItem cuenta) {
		this.cuenta = cuenta;
	}

	public JMenu getOperar() {
		return operar;
	}

	public void setOperar(JMenu operar) {
		this.operar = operar;
	}

	public JMenuItem getLista() {
		return lista;
	}

	public void setLista(JMenuItem lista) {
		this.lista = lista;
	}

	public JMenuItem getSalir() {
		return salir;
	}

	public void setSalir(JMenuItem salir) {
		this.salir = salir;
	}

	public JMenuItem getComprar() {
		return comprar;
	}

	public void setComprar(JMenuItem comprar) {
		this.comprar = comprar;
	}

	public JMenuItem getVender() {
		return vender;
	}

	public void setVender(JMenuItem vender) {
		this.vender = vender;
	}
	
	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getTxt() {
		return txt;
	}

	public void setTxt(JLabel txt) {
		this.txt = txt;
	}

	public static void main(String[] args) {
		Menu frame = new Menu();
		frame.setSize(430, 160);
		frame.setTitle("Menu");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
