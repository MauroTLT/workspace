package Vista;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaIMC extends JFrame{
	private static final long serialVersionUID = 1L;
	//a
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
	private JButton botonHistorial;
	private JLabel labelResNumero;
	
	//b
	private JPanel panelResultado;
	private JLabel labelTextRes;
	
	private JOptionPane mensaje;
	public VistaIMC(String altura, String masa){
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
		botonHistorial = new JButton("Mostrar Historial");
		
		textAltura = new JTextField(altura);
		textMasa = new JTextField(masa);
		organizar();
	}
	
	private void organizar(){
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
		panelBotones.add(botonHistorial);
		panelBotones.add(botonLimpiar);
		
		panelIMC.add(labelResNumero);
		this.add(panelIMC);
		panelResultado.setBorder(BorderFactory.createTitledBorder("Resultado"));
		panelResultado.add(labelTextRes);
		this.add(panelResultado);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		this.setVisible(true);
		
		
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

	public JButton getBotonHistorial() {
		return botonHistorial;
	}

	public void setBotonHistorial(JButton botonHistorial) {
		this.botonHistorial = botonHistorial;
	}
	
}
