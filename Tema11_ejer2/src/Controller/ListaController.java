package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import Model.ListaModel;
import View.ListaView;

public class ListaController implements ActionListener {
	private ListaView ventana;
	private ListaModel model;
	private FicheroController fichero;
	
	public ListaController() {
		this.fichero = new FicheroController();
		this.model = new ListaModel(fichero);
		this.fichero.leer(model.getLista());
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
		this.fichero = new FicheroController();
		if(e.getSource() == this.ventana.getAgregar()) {
			if(!this.ventana.getAreaTxt().getText().isEmpty()) {
				this.model.getLista().add(this.ventana.getAreaTxt().getText());
				this.ventana.aniadir(model);
				this.fichero.excribir(this.ventana.getAreaTxt().getText());
				try {
					this.fichero.getFicheroSalida().close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				this.ventana.getAreaTxt().setText("");
				this.ventana.getMensaje().setText("Se agregó un nuevo elemento.");
			} else {this.ventana.getMensaje().setText("Debe escribir algo para poder agregar.");}
		} else if(e.getSource() == this.ventana.getEliminar()) {
			if(this.ventana.getLista().getSelectedIndex() != -1) {
				this.fichero.borrar(this.ventana.getModelo().getElementAt(this.ventana.getLista().getSelectedIndex()));
				this.model.getLista().remove(this.ventana.getLista().getSelectedIndex());
				this.ventana.getModelo().removeElementAt(this.ventana.getLista().getSelectedIndex());
				this.ventana.getMensaje().setText("Se eliminó un elemento.");
			} else {this.ventana.getMensaje().setText("Ningun elemento seleccionado.");}
		} else {
			this.model.getLista().clear();
			this.ventana.getModelo().clear();
			this.fichero.borrarTodo();
		}
	}

	public ListaModel getModel() {
		return model;
	}

	public void setModel(ListaModel model) {
		this.model = model;
	}

	public FicheroController getFichero() {
		return fichero;
	}

	public void setFichero(FicheroController fichero) {
		this.fichero = fichero;
	}

}
