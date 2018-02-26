package ejemplo7;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class EjemploLayoutNull extends JFrame {
	public EjemploLayoutNull() {
		setSize(300, 200);
		Container contenedor = getContentPane();
		contenedor.setLayout(null);
		// Eliminamos el layout
		JButton boton = new JButton("Click");
		contenedor.add(boton);
		// Añadimos el botón
		boton.setBounds(50, 100, 100, 20);
		// Botón en posicion 50,100 con ancho 40 pixels y alto 20
		setVisible(true);
	}

	public static void main(String[] args) {
		new EjemploLayoutNull();
	}
}