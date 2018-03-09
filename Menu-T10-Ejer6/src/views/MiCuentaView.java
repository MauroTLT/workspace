package views;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MiCuentaView {
	private JPanel cuenta;
	private Container centro, abajo;
	private JLabel titulo, nombre, password;
	private JTextField nombreTxt;
	private JPasswordField passwordTxt;
	private JButton aceptar, salir;
	
	public MiCuentaView() {
		this.cuenta = new JPanel();
		this.centro = new Container();
		this.abajo = new Container();
		this.titulo = new JLabel("Mi Cuenta");
		this.nombre = new JLabel("Nombre --->", SwingConstants.CENTER);
		this.password = new JLabel("Password --->", SwingConstants.CENTER);
		this.nombreTxt = new JTextField();
		this.passwordTxt = new JPasswordField();
		this.aceptar = new JButton("Aceptar");
		this.salir = new JButton("Salir");
		darFormato();
	}
	
	private void darFormato() {
		this.cuenta.setLayout(new GridLayout(3,1));
		this.cuenta.add(titulo, BorderLayout.NORTH);
		this.centro.setLayout(new GridLayout(2, 2));
		this.abajo.setLayout(new GridLayout(1, 2));
		this.centro.add(nombre);
		this.centro.add(nombreTxt);
		this.centro.add(password);
		this.centro.add(passwordTxt);
		this.abajo.add(aceptar, BorderLayout.WEST);
		this.abajo.add(salir, BorderLayout.EAST);
		this.cuenta.add(centro, BorderLayout.CENTER);
		this.cuenta.add(abajo, BorderLayout.SOUTH);
		
	}

	public JPanel getCuenta() {
		return cuenta;
	}

	public void setCuenta(JPanel cuenta) {
		this.cuenta = cuenta;
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

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getPassword() {
		return password;
	}

	public void setPassword(JLabel password) {
		this.password = password;
	}

	public JTextField getNombreTxt() {
		return nombreTxt;
	}

	public void setNombreTxt(JTextField nombreTxt) {
		this.nombreTxt = nombreTxt;
	}

	public JPasswordField getPasswordTxt() {
		return passwordTxt;
	}

	public void setPasswordTxt(JPasswordField passwordTxt) {
		this.passwordTxt = passwordTxt;
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
