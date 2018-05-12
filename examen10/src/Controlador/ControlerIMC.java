package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Modelo.ModeloIMC;
import Vista.VistaIMC;

public class ControlerIMC implements ActionListener{
	private ModeloIMC modelo;
	private VistaIMC vista;
	private JDBCIMCDAO imcDAO;
	private final float PESO_BAJO=18.5F,PESO_NORMAL=24.9F, SOBREPESO=29.9F, OBESIDAD1=34.9F,OBESIDAD2=39.9F;
	
	public ControlerIMC(){
		this.imcDAO = new JDBCIMCDAO();
		this.modelo = new ModeloIMC();
		this.vista = new VistaIMC(modelo.getTextoAltura(), modelo.getTextoMasa());
		initControler();
	}
	private void initControler(){
		this.vista.getBotonCalcular().addActionListener(this);
		this.vista.getBotonLimpiar().addActionListener(this);
	}
	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton)e.getSource();
		try{
			if(source.getText().equals("Calcular")){
				Double res= Double.parseDouble(vista.getTextMasa().getText())/Math.pow(Double.parseDouble(vista.getTextAltura().getText()), 2);
				vista.getLabelResNumero().setText(String.valueOf(res));
				String texto = "";
				if(res<PESO_BAJO){
					vista.getLabelTextRes().setText("Peso bajo");
					texto = "Peso bajo";
				}else if(res>PESO_BAJO || res<PESO_NORMAL){
					vista.getLabelTextRes().setText("Peso Normal");
					texto = "Peso Normal";
				}else if(res>PESO_NORMAL || res<SOBREPESO){
					vista.getLabelTextRes().setText("Sobrepeso");
					texto = "Sobrepeso";
				}else if(res>SOBREPESO || res<OBESIDAD1){
					vista.getLabelTextRes().setText("Obesidad 1");
					texto = "Obesidad 1";
				}else if (res>OBESIDAD1 || res< OBESIDAD2){
					vista.getLabelTextRes().setText("Obesidad 2");
					texto = "Obesidad 2";
				}else{
					vista.getLabelTextRes().setText("Obesidad 3");
					texto = "Obesidad 3";
				}
				this.imcDAO.insertar(Double.parseDouble(vista.getTextMasa().getText()), Double.parseDouble(vista.getTextAltura().getText()), res, texto);
			}else{
				vista.getLabelResNumero().setText("");
				vista.getTextAltura().setText("");
				vista.getLabelTextRes().setText("");
				vista.getTextMasa().setText("");
			}
		}catch(NumberFormatException e1){
			vista.getMensaje().showMessageDialog(null, "Datos no validos");
		}
	}
}