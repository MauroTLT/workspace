package Controllers;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Models.TableroModel;
import Views.SupervivienteEnBatoiView;

public class SupervivienteEnBatoiController implements ActionListener {
	
	
	private int personas;
	private TableroModel modelo;
	private SupervivienteEnBatoiView ventana;
	
	public SupervivienteEnBatoiController() {
		this.personas = 0;
		this.modelo = new TableroModel();
		this.ventana = new SupervivienteEnBatoiView(modelo);
		setActions();
	}

	private void setActions() {
		for (int i = 0; i < this.ventana.getBotones().length; i++) {
			for (int j = 0; j < this.ventana.getBotones()[i].length; j++) {
				this.ventana.getBotones()[i][j].addActionListener(this);
			}
		}
	}
	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton)e.getSource();
		if(boton.isEnabled()) {
			if (boton.getName().equals("*")) {
				boton.setEnabled(false);
				boton.setBackground(Color.BLACK);
				this.ventana.getPane().showMessageDialog(null, "Has pulsado en una bomba\nGAME OVER");
				System.exit(0);
			} else if (boton.getName().equals("A")) {
				boton.setEnabled(false);
				boton.setBackground(Color.BLUE);
				this.modelo.getPuntos().setPunto(this.modelo.getPuntos().getPunto() - 1);
				this.ventana.getPane().showMessageDialog(null, "Has pulsado en una casilla de agua\nAhora tienes " + this.modelo.getPuntos().getPunto() + " puntos.");
			} else if (boton.getName().equals("T")) {
				boton.setEnabled(false);
				boton.setBackground(Color.ORANGE);
				this.ventana.getPane().showMessageDialog(null, "Has pulsado en una casilla de tierra\nAhora tienes " + this.modelo.getPuntos().getPunto() + " puntos.");
			} else if (boton.getName().equals("P")) {
				this.personas++;
				boton.setEnabled(false);
				boton.setBackground(Color.WHITE);
				this.modelo.getPuntos().setPunto(this.modelo.getPuntos().getPunto() + 1);
				this.ventana.getPane().showMessageDialog(null, "Has pulsado en una casilla de persona\nAhora tienes " + this.modelo.getPuntos().getPunto() + " puntos.");
			} 
		}
		if(this.modelo.getPuntos().getPunto() < 0) {
			this.ventana.getPane().showMessageDialog(null, "Tu puntuación es negativa\nGAME OVER");
			System.exit(0);
		}
		if(this.personas == 5) {
			this.ventana.getPane().showMessageDialog(null, "Has encontrado a todas las personas. Bien Hecho!!!\nTu puntuación final es de " + this.modelo.getPuntos().getPunto() + " puntos.");
			System.exit(0);
		}
		
	}

	public TableroModel getModelo() {
		return modelo;
	}

	public void setModelo(TableroModel modelo) {
		this.modelo = modelo;
	}

	public SupervivienteEnBatoiView getVentana() {
		return ventana;
	}

	public void setVentana(SupervivienteEnBatoiView ventana) {
		this.ventana = ventana;
	}

}
