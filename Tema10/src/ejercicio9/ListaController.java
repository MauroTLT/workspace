package ejercicio9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaController implements ActionListener {
	private ListaView ventana;
	private ListaModel model;
	
	public ListaController() {
		this.model = new ListaModel();
		this.ventana = new ListaView(model);
		setActions();
	}

	private void setActions() {
		this.ventana.getAgregar().addActionListener(this);
		this.ventana.getEliminar().addActionListener(this);
		this.ventana.getBorrar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.ventana.getAgregar()) {
			if(!this.ventana.getAreaTxt().getText().isEmpty()) {
				this.model.addElement(this.ventana.getAreaTxt().getText());
				this.ventana.getAreaTxt().setText("");
				this.ventana.getMensaje().setText("Se agregó un nuevo elemento.");
			} else {this.ventana.getMensaje().setText("Debe escribir algo para poder agregar.");}
		} else if(e.getSource() == this.ventana.getEliminar()) {
			if(this.ventana.getLista().getSelectedIndex() != -1) {
				this.model.removeElementAt(((this.ventana.getLista().getSelectedIndex())));
				this.ventana.getMensaje().setText("Se eliminó un elemento.");
			} else {this.ventana.getMensaje().setText("Ningun elemento seleccionado.");}
		} else {
			this.model.clear();
		}
	}

	public ListaModel getModel() {
		return model;
	}

	public void setModel(ListaModel model) {
		this.model = model;
	}

}
