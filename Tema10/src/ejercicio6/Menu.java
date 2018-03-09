package ejercicio6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Menu extends JFrame {
	private JPanel panelC, panelL, panelS, panelCC, panelCV;
	private JLabel txt, txt2, txt3, txt4, txt5;
	private JMenuBar menu;
	private JMenuItem cuenta;
	private JMenu operar;
	private JMenuItem lista;
	private JMenuItem salir;
	private JMenuItem comprar;
	private JMenuItem vender;
	
	public Menu() {
		this.panelC = new JPanel();
		this.panelL = new JPanel();
		this.panelS = new JPanel();
		this.panelCC = new JPanel();
		this.panelCV = new JPanel();
		this.txt = new JLabel("Estas en Salir");
		this.txt2 = new JLabel("Estas en Cuenta");
		this.txt3 = new JLabel("Estas en Lista Movimientos");
		this.txt4 = new JLabel("Estas en Comprar");
		this.txt5 = new JLabel("Estas en Vender");
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
		this.panelC.add(txt2);
		this.panelL.add(txt3);
		this.panelS.add(txt);
		this.panelCC.add(txt4);
		this.panelCV.add(txt5);
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
		this.panelC.setBackground(Color.YELLOW);
		this.panelL.setBackground(Color.CYAN);
		this.panelS.setBackground(Color.RED);
		this.panelCC.setBackground(Color.GREEN);
		this.panelCV.setBackground(Color.ORANGE);
		this.setSize(430, 160);
		this.setTitle("Menu");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setJMenuBar(menu);
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

	public JPanel getPanelC() {
		return panelC;
	}

	public void setPanelC(JPanel panelC) {
		this.panelC = panelC;
	}

	public JPanel getPanelL() {
		return panelL;
	}

	public void setPanelL(JPanel panelL) {
		this.panelL = panelL;
	}

	public JPanel getPanelS() {
		return panelS;
	}

	public void setPanelS(JPanel panelS) {
		this.panelS = panelS;
	}

	public JLabel getTxt() {
		return txt;
	}

	public void setTxt(JLabel txt) {
		this.txt = txt;
	}

	public JLabel getTxt2() {
		return txt2;
	}

	public void setTxt2(JLabel txt2) {
		this.txt2 = txt2;
	}

	public JLabel getTxt3() {
		return txt3;
	}

	public void setTxt3(JLabel txt3) {
		this.txt3 = txt3;
	}

	public JPanel getPanelCC() {
		return panelCC;
	}

	public void setPanelCC(JPanel panelCC) {
		this.panelCC = panelCC;
	}

	public JPanel getPanelCV() {
		return panelCV;
	}

	public void setPanelCV(JPanel panelCV) {
		this.panelCV = panelCV;
	}

	public JLabel getTxt4() {
		return txt4;
	}

	public void setTxt4(JLabel txt4) {
		this.txt4 = txt4;
	}

	public JLabel getTxt5() {
		return txt5;
	}

	public void setTxt5(JLabel txt5) {
		this.txt5 = txt5;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		EventListener frame = new EventListener();
	}

}