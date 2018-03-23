package IMC_View;
/**
 * @author Mauro Pérez Moliner 1DAM MAÑANA
 *
 */
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class IMCView extends JFrame {
	private JPanel imc, resultado;
	private JLabel masa, altura, calculo, texto;
	private JTextField masaTxt, alturaTxt;
	private JButton calcular, limpiar;
	
	public IMCView() {
		this.imc = new JPanel();
		this.resultado = new JPanel();
		this.masa = new JLabel("Masa (Kg): ");
		this.altura = new JLabel("Altura (m): ");
		this.calculo = new JLabel("Calculo de IMC");
		this.texto = new JLabel("Resultado");
		this.masaTxt = new JTextField(10);
		this.alturaTxt = new JTextField(10);
		this.calcular = new JButton("Calcular");
		this.limpiar = new JButton("Limpiar");
		darFormato();
	}
	
	private void darFormato() {
		this.setLayout(null);
		this.imc.setLayout(null);
		this.imc.setBounds(20,10,250,180);
		this.imc.setBorder(BorderFactory.createTitledBorder("IMC"));
		this.masa.setBounds(10,30,100,20);
		this.masaTxt.setBounds(100, 30, 140, 20);
		this.altura.setBounds(10,55,100,20);
		this.alturaTxt.setBounds(100, 55, 140, 20);
		this.calcular.setBounds(20,90,100,30);
		this.limpiar.setBounds(130, 90, 100, 30);
		this.calculo.setBounds(70, 120, 120, 30);
		this.imc.add(masaTxt);
		this.imc.add(masa);
		this.imc.add(alturaTxt);
		this.imc.add(altura);
		this.imc.add(calcular);
		this.imc.add(limpiar);
		this.imc.add(calculo);
		this.add(imc);
		
		this.resultado.setBounds(20,210,250,90);
		this.resultado.setBorder(BorderFactory.createTitledBorder("Resultado"));
		this.resultado.add(texto);
		this.add(resultado);
		
		this.setTitle("Calculando IMC");
		this.setSize(300, 350);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JPanel getImc() {
		return imc;
	}
	public void setImc(JPanel imc) {
		this.imc = imc;
	}
	public JPanel getResultado() {
		return resultado;
	}
	public void setResultado(JPanel resultado) {
		this.resultado = resultado;
	}
	public JLabel getMasa() {
		return masa;
	}
	public void setMasa(JLabel masa) {
		this.masa = masa;
	}
	public JLabel getAltura() {
		return altura;
	}
	public void setAltura(JLabel altura) {
		this.altura = altura;
	}
	public JLabel getCalculo() {
		return calculo;
	}
	public void setCalculo(JLabel calculo) {
		this.calculo = calculo;
	}
	public JLabel getTexto() {
		return texto;
	}
	public void setTexto(JLabel texto) {
		this.texto = texto;
	}
	public JTextField getMasaTxt() {
		return masaTxt;
	}
	public void setMasaTxt(JTextField masaTxt) {
		this.masaTxt = masaTxt;
	}
	public JTextField getAlturaTxt() {
		return alturaTxt;
	}
	public void setAlturaTxt(JTextField alturaTxt) {
		this.alturaTxt = alturaTxt;
	}
	public JButton getCalcular() {
		return calcular;
	}
	public void setCalcular(JButton calcular) {
		this.calcular = calcular;
	}
	public JButton getLimpiar() {
		return limpiar;
	}
	public void setLimpiar(JButton limpiar) {
		this.limpiar = limpiar;
	}
	
	
}
