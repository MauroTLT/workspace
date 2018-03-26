package IMC_Controller;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import IMC_Model.IMCModel;
import IMC_View.IMCView;

public class IMCController implements ActionListener{
	private IMCModel modelo;
	private IMCView ventana;
	
	public IMCController() {
		this.modelo = new IMCModel();
		this.ventana = new IMCView();
		setActions();
	}

	private void setActions() {
		this.ventana.getLimpiar().addActionListener(this);
		this.ventana.getCalcular().addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double aux = 0.0;
		if(e.getSource() == this.ventana.getCalcular()) {
			
			this.modelo.setMasa(Double.parseDouble(this.ventana.getMasaTxt().getText()));
			this.modelo.setAltura(Double.parseDouble(this.ventana.getAlturaTxt().getText()));
			
			aux = this.modelo.getMasa() / (Math.pow(this.modelo.getAltura(), 2));
			
			this.ventana.getCalculo().setText(""+aux);
			if(aux < 18.5) {
				this.ventana.getTexto().setText(this.modelo.getArray()[0]);
			} else if(aux >= 18.5 && aux <= 24.9) {
				this.ventana.getTexto().setText(this.modelo.getArray()[1]);
			} else if(aux >= 25 && aux <= 29.9) {
				this.ventana.getTexto().setText(this.modelo.getArray()[2]);
			} else if(aux >= 30 && aux <= 34.9) {
				this.ventana.getTexto().setText(this.modelo.getArray()[3]);
			} else if(aux >= 35 && aux <= 39.9) {
				this.ventana.getTexto().setText(this.modelo.getArray()[4]);
			} else if(aux > 40) {
				this.ventana.getTexto().setText(this.modelo.getArray()[5]);
			}
		} else if(e.getSource() == this.ventana.getLimpiar()) {
			this.ventana.getMasaTxt().setText("");
			this.ventana.getAlturaTxt().setText("");
			this.ventana.getCalculo().setText("Calculo de IMC");
			this.ventana.getTexto().setText("Resultado");
			
		}
		
	}

	public IMCView getVentana() {
		return ventana;
	}

	public void setVentana(IMCView ventana) {
		this.ventana = ventana;
	}

	public IMCModel getModelo() {
		return modelo;
	}

	public void setModelo(IMCModel modelo) {
		this.modelo = modelo;
	}
}
