
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;

public class ControlerIMC implements ActionListener {
	private static final String FICHEROIMC = "registroIMC.txt";
	private ModeloIMC modelo;
	private VistaIMC vista;
	private final float PESO_BAJO = 18.5F, PESO_NORMAL = 24.9F, SOBREPESO = 29.9F, OBESIDAD1 = 34.9F, OBESIDAD2 = 39.9F;
	private BufferedWriter ficheroSalida;
	private Date fechaActual;

	public ControlerIMC() {
		ficheroSalida = null;
		fechaActual = new Date();
		modelo = new ModeloIMC();
		vista = new VistaIMC(modelo.getTextoAltura(), modelo.getTextoMasa());
		initControler();
	}

	private void initControler() {
		vista.getBotonCalcular().addActionListener(this);
		vista.getBotonLimpiar().addActionListener(this);
		vista.getBotonMostrar().addActionListener(this);
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		try {
			if (source.getText().equals("Calcular")) {
				Double res = Double.parseDouble(vista.getTextMasa().getText())
						/ Math.pow(Double.parseDouble(vista.getTextAltura().getText()), 2);
				vista.getLabelResNumero().setText(String.valueOf(res));
				/*
				 * vista.getLabelTextRes().setText((res < PESO_BAJO) ? "Peso bajo" :
				 * (res>PESO_NORMAL || res<SOBREPESO) ? "Sobrepeso" : (res>OBESIDAD1 || res<
				 * OBESIDAD2) ? "Obesidad 2" : "Obesidad 3");
				 */

				if (res < PESO_BAJO) {
					vista.getLabelTextRes().setText("Peso bajo");
				} else if (res > PESO_BAJO && res < PESO_NORMAL) {
					vista.getLabelTextRes().setText("Peso Normal");
				} else if (res > PESO_NORMAL && res < SOBREPESO) {
					vista.getLabelTextRes().setText("Sobrepeso");
				} else if (res > SOBREPESO && res < OBESIDAD1) {
					vista.getLabelTextRes().setText("Obesidad 1");
				} else if (res > OBESIDAD1 && res < OBESIDAD2) {
					vista.getLabelTextRes().setText("Obesidad 2");
				} else {
					vista.getLabelTextRes().setText("Obesidad 3");
				}
				saveReg(this.vista.getLabelResNumero().getText(), this.vista.getLabelTextRes().getText());
			} else if (source.getText().equals("Mostrar")) {
				vista.mostaRegistro(FICHEROIMC);
			} else {
				vista.getLabelResNumero().setText("");
				vista.getTextAltura().setText("");
				vista.getLabelTextRes().setText("");
				vista.getTextMasa().setText("");
			}
		} catch (NumberFormatException e1) {
			vista.getMensaje().showMessageDialog(null, "Datos no validos");
		}
	}

	@SuppressWarnings("static-access")
	public void saveReg(String tipo, String IMC) {
		try {
			this.ficheroSalida = new BufferedWriter(new FileWriter(new File(FICHEROIMC), true));
			this.ficheroSalida.write(new SimpleDateFormat("dd/MM/yyyy").format(fechaActual) + " " + tipo + " " + IMC);
			this.ficheroSalida.newLine();
			ficheroSalida.close();
		} catch (IOException errorDeFichero) {
			vista.getMensaje().showMessageDialog(null, "Ha habido problemas: " + errorDeFichero.getMessage());
		}
	}

	public BufferedWriter getFicheroSalida() {
		return ficheroSalida;
	}

	public void setFicheroSalida(BufferedWriter ficheroSalida) {
		this.ficheroSalida = ficheroSalida;
	}
}