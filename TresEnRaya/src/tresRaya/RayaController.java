package tresRaya;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RayaController implements MouseListener {
	private String[][] array;
	private RayaView ventana;
	private int turno;
	private ImageIcon x;
	private ImageIcon o;
	
	public RayaController() {
		this.x = new ImageIcon(getClass().getResource("../resources/X.png"));
		this.o = new ImageIcon(getClass().getResource("../resources/O.png"));
		this.array = new String[3][3];
		this.ventana = new RayaView();
		setActions();
	}
	
	private void setActions() {
		this.ventana.getReset().addMouseListener(this);
		for (int i = 0; i < this.ventana.getTablero().length; i++) {
			for (int j = 0; j < this.ventana.getTablero()[i].length; j++) {
				this.ventana.getTablero()[i][j].addMouseListener(this);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == this.ventana.getReset()) {
			reiniciar();
		} else {
			JLabel label = (JLabel)e.getSource();
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if(label == this.ventana.getTablero()[i][j]) {
						if(this.turno % 2 == 0) {
							if(label.getIcon() == null) {
								label.setIcon(this.x);
								this.array[i][j] = "x";
								this.ventana.getTitulo().setText("Turno de Jugador 2");
								this.turno++;
							}
						} else {
							if(label.getIcon() == null) {
								label.setIcon(this.o);
								this.array[i][j] = "o";
								this.ventana.getTitulo().setText("Turno de Jugador 1");
								this.turno++;
							}
						}
						if(this.turno == 9) {
							this.ventana.getTitulo().setText("Partida Finalizada");
						}
					}
				}
			}
			if(comprobarX()) {
				JOptionPane.showMessageDialog(null, "Jugador 1 es el ganador");
				reiniciar();
			} else if(comprobarY()) {
				JOptionPane.showMessageDialog(null, "Jugador 2 es el ganador");
				reiniciar();
			}
			this.ventana.revalidate();
		}
	}
	
	private void reiniciar() {
		this.turno = 0;
		this.ventana.getTitulo().setText("Turno de Jugador 1");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.ventana.getTablero()[i][j].setIcon(null);
				this.array[i][j] = null;
			}
		}
	}
	
	private boolean comprobarX() {
		if(this.array[0][0] == "x" && this.array[1][0] == "x" && this.array[2][0] == "x") {
			return true;
		} else if(this.array[0][1] == "x" && this.array[1][1] == "x" && this.array[2][1] == "x") {
			return true;
		} else if(this.array[0][2] == "x" && this.array[1][2] == "x" && this.array[2][2] == "x") {
			return true;
		} else if(this.array[0][0] == "x" && this.array[0][1] == "x" && this.array[0][2] == "x") {
			return true;
		} else if(this.array[1][0] == "x" && this.array[1][1] == "x" && this.array[1][2] == "x") {
			return true;
		} else if(this.array[2][0] == "x" && this.array[2][1] == "x" && this.array[2][2] == "x") {
			return true;
		} else if(this.array[0][0] == "x" && this.array[1][1] == "x" && this.array[2][2] == "x") {
			return true;
		} else if(this.array[0][2] == "x" && this.array[1][1] == "x" && this.array[2][0] == "x") {
			return true;
		}
		return false;
	}
	
	private boolean comprobarY() {
		if(this.array[0][0] == "o" && this.array[1][0] == "o" && this.array[2][0] == "o") {
			return true;
		} else if(this.array[0][1] == "o" && this.array[1][1] == "o" && this.array[2][1] == "o") {
			return true;
		} else if(this.array[0][2] == "o" && this.array[1][2] == "o" && this.array[2][2] == "o") {
			return true;
		} else if(this.array[0][0] == "o" && this.array[0][1] == "o" && this.array[0][2] == "o") {
			return true;
		} else if(this.array[1][0] == "o" && this.array[1][1] == "o" && this.array[1][2] == "o") {
			return true;
		} else if(this.array[2][0] == "o" && this.array[2][1] == "o" && this.array[2][2] == "o") {
			return true;
		} else if(this.array[0][0] == "o" && this.array[1][1] == "o" && this.array[2][2] == "o") {
			return true;
		} else if(this.array[0][2] == "o" && this.array[1][1] == "o" && this.array[2][0] == "o") {
			return true;
		}
		return false;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
				
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public RayaView getVentana() {
		return ventana;
	}

	public void setVentana(RayaView ventana) {
		this.ventana = ventana;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

}