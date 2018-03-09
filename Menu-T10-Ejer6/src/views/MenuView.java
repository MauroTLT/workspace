package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import controllers.ComprarController;
import controllers.MiCuentaController;

@SuppressWarnings("serial")
public class MenuView extends JFrame {
	private MiCuentaController cuentaCont;
	private ComprarController comprarCont;
	private JPanel panelL;
	private JMenuBar menu;
	private JMenuItem cuenta;
	private JMenu operar;
	private JMenuItem lista;
	private JMenuItem salir;
	private JMenuItem comprar;
	private JMenuItem vender;
	
	public MenuView() {
		this.cuentaCont = new MiCuentaController();
		this.comprarCont = new ComprarController();
		this.panelL = new JPanel();
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
		this.panelL.setBackground(Color.CYAN);
		this.setSize(430, 200);
		this.setTitle("Menu");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setJMenuBar(menu);
	}
	
	public MiCuentaController getCuentaCont() {
		return cuentaCont;
	}

	public void setCuentaCont(MiCuentaController cuentaCont) {
		this.cuentaCont = cuentaCont;
	}

	public ComprarController getComprarCont() {
		return comprarCont;
	}

	public void setComprarCont(ComprarController comprarCont) {
		this.comprarCont = comprarCont;
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

	public JPanel getPanelL() {
		return panelL;
	}

	public void setPanelL(JPanel panelL) {
		this.panelL = panelL;
	}

}
