package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;

import Modelo.ModeloIMC;
import Vista.VistaIMC;

public class ControlerIMC implements ActionListener{
	private final static Calendar c = new GregorianCalendar();
	private ModeloIMC modelo;
	private VistaIMC vista;
	private final float PESO_BAJO=18.5F,PESO_NORMAL=24.9F, SOBREPESO=29.9F, OBESIDAD1=34.9F,OBESIDAD2=39.9F;
	
	public ControlerIMC(){
		modelo = new ModeloIMC();
		vista = new VistaIMC(modelo.getTextoAltura(), modelo.getTextoMasa());
		initControler();
	}
	private void initControler(){
		vista.getBotonCalcular().addActionListener(this);
		vista.getBotonLimpiar().addActionListener(this);
		vista.getBotonHistorial().addActionListener(this);
	}
	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		BufferedWriter ficheroSalida = null;
		JButton source = (JButton)e.getSource();
		try{
			ficheroSalida = new BufferedWriter(new FileWriter(new File("historial.txt"), true));
			if(source.getText().equals("Calcular")){
				String texto = "";
				Double res= Double.parseDouble(vista.getTextMasa().getText())/Math.pow(Double.parseDouble(vista.getTextAltura().getText()), 2);
				vista.getLabelResNumero().setText(String.valueOf(res));
				/*vista.getLabelTextRes().setText((res < PESO_BAJO) ? "Peso bajo" : (res>PESO_NORMAL || res<SOBREPESO) ? "Sobrepeso" : (res>OBESIDAD1 || res< OBESIDAD2) ? "Obesidad 2" : "Obesidad 3");*/

				if(res<PESO_BAJO){
					texto = "Peso Bajo";
					vista.getLabelTextRes().setText("Peso bajo");
				}else if(res>PESO_BAJO || res<PESO_NORMAL){
					texto = "Peso Normal";
					vista.getLabelTextRes().setText("Peso Normal");
				}else if(res>PESO_NORMAL || res<SOBREPESO){
					texto = "Sobrepeso";
					vista.getLabelTextRes().setText("Sobrepeso");
				}else if(res>SOBREPESO || res<OBESIDAD1){
					texto = "Obesidad 1";
					vista.getLabelTextRes().setText("Obesidad 1");
				}else if (res>OBESIDAD1 || res< OBESIDAD2){
					texto = "Obesidad 2";
					vista.getLabelTextRes().setText("Obesidad 2");
				}else{
					texto = "Obesidad 3";
					vista.getLabelTextRes().setText("Obesidad 3");
				}
				ficheroSalida.write(Integer.toString(c.get(Calendar.DATE)) + "/" + Integer.toString(c.get(Calendar.MONTH)) + "/" + Integer.toString(c.get(Calendar.YEAR)) + " " + res + " " + texto);
				ficheroSalida.newLine();
			} else if(source.getText().equals("Limpiar")) {
				vista.getLabelResNumero().setText("");
				vista.getTextAltura().setText("");
				vista.getLabelTextRes().setText("");
				vista.getTextMasa().setText("");
			} else {
				new HistorialController();
			}
			ficheroSalida.close();
		}catch(NumberFormatException | IOException e1){
			e1.printStackTrace();
			vista.getMensaje().showMessageDialog(null, "Datos no validos");
			
		}
	}
}