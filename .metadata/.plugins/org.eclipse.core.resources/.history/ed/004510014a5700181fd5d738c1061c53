import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaIMC extends JFrame {
	private static final long serialVersionUID = 1L;
	// a
	private JPanel panelIMC;

	private JPanel panelMasa;
	private JLabel labelMasa;
	private JTextField textMasa;

	private JPanel panelAltura;
	private JLabel labelAltura;
	private JTextField textAltura;

	private JPanel panelBotones;
	private JButton botonCalcular;
	private JButton botonLimpiar;
	private JButton botonMostrar;

	private JLabel labelResNumero;

	private JDialog mostrarReg;

	// b
	private JPanel panelResultado;
	private JLabel labelTextRes;

	private JOptionPane mensaje;

	public VistaIMC(String altura, String masa) {
		panelIMC = new JPanel();
		panelMasa = new JPanel();
		panelAltura = new JPanel();
		panelBotones = new JPanel();
		panelResultado = new JPanel();

		labelAltura = new JLabel("Altura (m)");
		labelMasa = new JLabel("Masa (kg)");
		labelResNumero = new JLabel();
		labelTextRes = new JLabel();

		botonCalcular = new JButton("Calcular");
		botonLimpiar = new JButton("Limpiar");
		botonMostrar = new JButton("Mostrar");

		textAltura = new JTextField(altura);
		textMasa = new JTextField(masa);

		mostrarReg = null;
		organizar();
	}

	private void organizar() {
		this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		panelIMC.setLayout(new BoxLayout(panelIMC, BoxLayout.Y_AXIS));
		panelIMC.setBorder(BorderFactory.createTitledBorder("IMC"));
		panelIMC.add(panelMasa);

		panelMasa.add(labelMasa);
		textMasa.setPreferredSize(new Dimension(100, 20));
		panelMasa.add(textMasa);
		panelIMC.add(panelAltura);

		panelAltura.add(labelAltura);
		textAltura.setPreferredSize(new Dimension(100, 20));
		panelAltura.add(textAltura);
		panelIMC.add(panelBotones);

		panelBotones.add(botonCalcular);
		panelBotones.add(botonLimpiar);
		panelBotones.add(botonMostrar);

		panelIMC.add(labelResNumero);
		this.add(panelIMC);
		panelResultado.setBorder(BorderFactory.createTitledBorder("Resultado"));
		panelResultado.add(labelTextRes);
		this.add(panelResultado);
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);

	}

	public void mostaRegistro(String fichero) {
		ArrayList<String> lineas = null;
		String linea = "";
		BufferedReader ficheroEntrada = null;
		String aux = "";
		JLabel registro = new JLabel();
		this.mostrarReg = new JDialog(this, "Registro", true);
		registro.setBorder(BorderFactory.createTitledBorder("Registros"));
		try {
			lineas = new ArrayList<String>();
			ficheroEntrada = new BufferedReader(new FileReader(new File(fichero)));
			do {
				linea = ficheroEntrada.readLine();
				lineas.add(linea);
			} while (linea != null);
			for (int i = 0; i < lineas.size()-1;i++) {
				aux += "\n" + lineas.get(i);
			}
			registro.setText("<html><p>" + aux  + "</p></html>");
			ficheroEntrada.close();
		} catch (IOException errorDeFichero) {
			System.out.println("Ha habido problemas: " + errorDeFichero.getMessage());
		}
		this.mostrarReg.add(registro, BorderLayout.CENTER);
		this.mostrarReg.setSize(500, 300);
		this.mostrarReg.setLocationRelativeTo(null);
		this.mostrarReg.setVisible(true);
		this.mostrarReg.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

	public JTextField getTextMasa() {
		return textMasa;
	}

	public void setTextMasa(JTextField textMasa) {
		this.textMasa = textMasa;
	}

	public JTextField getTextAltura() {
		return textAltura;
	}

	public void setTextAltura(JTextField textAltura) {
		this.textAltura = textAltura;
	}

	public JButton getBotonCalcular() {
		return botonCalcular;
	}

	public void setBotonCalcular(JButton botonCalcular) {
		this.botonCalcular = botonCalcular;
	}

	public JButton getBotonLimpiar() {
		return botonLimpiar;
	}

	public void setBotonLimpiar(JButton botonLimpiar) {
		this.botonLimpiar = botonLimpiar;
	}

	public JLabel getLabelResNumero() {
		return labelResNumero;
	}

	public void setLabelResNumero(JLabel labelResNumero) {
		this.labelResNumero = labelResNumero;
	}

	public JLabel getLabelTextRes() {
		return labelTextRes;
	}

	public void setLabelTextRes(JLabel labelTextRes) {
		this.labelTextRes = labelTextRes;
	}

	public JOptionPane getMensaje() {
		return mensaje;
	}

	public void setMensaje(JOptionPane mensaje) {
		this.mensaje = mensaje;
	}

	public JButton getBotonMostrar() {
		return botonMostrar;
	}

	public void setBotonMostrar(JButton botonMostrar) {
		this.botonMostrar = botonMostrar;
	}

	public JDialog getMostrarReg() {
		return mostrarReg;
	}

	public void setMostrarReg(JDialog mostrarReg) {
		this.mostrarReg = mostrarReg;
	}

}