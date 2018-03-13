package tresRayaIA;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RayaController implements MouseListener {
	private random rng;
	private int[][] eleccion;
	private String[][] array;
	private RayaView ventana;
	private int turno;
	private ImageIcon x;
	private ImageIcon o;
	
	public RayaController() {
		this.rng = new random();
		this.x = new ImageIcon(getClass().getResource("../resources/X.png"));
		this.o = new ImageIcon(getClass().getResource("../resources/O.png"));
		this.eleccion = new int[3][3];
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
						if(label.getIcon() == null) {
							label.setIcon(this.x);
							this.array[i][j] = "x";
							this.ventana.getTitulo().setText("Turno de Jugador 1");
							if(this.turno == 0) {
								IA1(label);
							} else if(this.turno == 1) {
								IA2();
							} else if(this.turno == 2) {
								IA3();
							} else if(this.turno == 3) {
								IA4();
							}
							this.turno++;
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
	
	private void IA1(JLabel label) {
		int aux = rng.aleatorioIntSeed(4);
		if(this.array[0][0] == "x") { 						// Principio Esquinas
			if(aux == 1) {
				this.array[0][2] = "o";
				this.ventana.getTablero()[0][2].setIcon(o);
				this.eleccion[0][1] = 0;
				this.eleccion[0][2] = 2;
			} else if(aux == 2) {
				this.array[2][0] = "o";
				this.ventana.getTablero()[2][0].setIcon(o);
				this.eleccion[0][1] = 2;
				this.eleccion[0][2] = 0;
			} else if(aux == 3) {
				this.array[2][2] = "o";
				this.ventana.getTablero()[2][2].setIcon(o);
				this.eleccion[0][1] = 2;
				this.eleccion[0][2] = 2;
			} else if(aux == 4) {
				this.array[1][1] = "o";
				this.ventana.getTablero()[1][1].setIcon(o);
				this.eleccion[0][1] = 1;
				this.eleccion[0][2] = 1;
			}
			this.eleccion[0][0] = 1;
		} else if(this.array[0][2] == "x") {
			if(aux == 1) {
				this.array[0][0] = "o";
				this.ventana.getTablero()[0][0].setIcon(o);
				this.eleccion[0][1] = 0;
				this.eleccion[0][2] = 0;
			} else if(aux == 2) {
				this.array[2][0] = "o";
				this.ventana.getTablero()[2][0].setIcon(o);
				this.eleccion[0][1] = 2;
				this.eleccion[0][2] = 0;
			} else if(aux == 3) {
				this.array[2][2] = "o";
				this.ventana.getTablero()[2][2].setIcon(o);
				this.eleccion[0][1] = 2;
				this.eleccion[0][2] = 2;
			} else if(aux == 4) {
				this.array[1][1] = "o";
				this.ventana.getTablero()[1][1].setIcon(o);
				this.eleccion[0][1] = 1;
				this.eleccion[0][2] = 1;
			}
			this.eleccion[0][0] = 2;
		} else if(this.array[2][0] == "x") {
			if(aux == 1) {
				this.array[0][0] = "o";
				this.ventana.getTablero()[0][0].setIcon(o);
				this.eleccion[0][1] = 0;
				this.eleccion[0][2] = 0;
			} else if(aux == 2) {
				this.array[0][2] = "o";
				this.ventana.getTablero()[0][2].setIcon(o);
				this.eleccion[0][1] = 0;
				this.eleccion[0][2] = 2;
			} else if(aux == 3) {
				this.array[2][2] = "o";
				this.ventana.getTablero()[2][2].setIcon(o);
				this.eleccion[0][1] = 2;
				this.eleccion[0][2] = 2;
			} else if(aux == 4) {
				this.array[1][1] = "o";
				this.ventana.getTablero()[1][1].setIcon(o);
				this.eleccion[0][1] = 1;
				this.eleccion[0][2] = 1;
			}
			this.eleccion[0][0] = 3;
		} else if(this.array[2][2] == "x") {
			if(aux == 1) {
				this.array[0][0] = "o";
				this.ventana.getTablero()[0][0].setIcon(o);
				this.eleccion[0][1] = 0;
				this.eleccion[0][2] = 0;
			} else if(aux == 2) {
				this.array[0][2] = "o";
				this.ventana.getTablero()[0][2].setIcon(o);
				this.eleccion[0][1] = 0;
				this.eleccion[0][2] = 2;
			} else if(aux == 3) {
				this.array[2][0] = "o";
				this.ventana.getTablero()[2][0].setIcon(o);
				this.eleccion[0][1] = 2;
				this.eleccion[0][2] = 0;
			} else if(aux == 4) {
				this.array[1][1] = "o";
				this.ventana.getTablero()[1][1].setIcon(o);
				this.eleccion[0][1] = 1;
				this.eleccion[0][2] = 1;
			} 												//Fin Principio Esquinas
			this.eleccion[0][0] = 4;
		} else if(this.array[0][1] == "x") {				//Empieza Centros Laterales
			this.array[2][1] = "o";
			this.ventana.getTablero()[2][1].setIcon(o);
			this.eleccion[0][1] = 2;
			this.eleccion[0][2] = 1;
			this.eleccion[0][0] = 5;
		} else if(this.array[2][1] == "x") {
			this.array[0][1] = "o";
			this.ventana.getTablero()[0][1].setIcon(o);
			this.eleccion[0][1] = 0;
			this.eleccion[0][2] = 1;
			this.eleccion[0][0] = 6;
		} else if(this.array[1][0] == "x") {
			this.array[1][2] = "o";
			this.ventana.getTablero()[1][2].setIcon(o);
			this.eleccion[0][1] = 1;
			this.eleccion[0][2] = 2;
			this.eleccion[0][0] = 7;
		} else if(this.array[1][2] == "x") {
			this.array[1][0] = "o";
			this.ventana.getTablero()[1][0].setIcon(o);		//Fin Centros Laterales
			this.eleccion[0][1] = 1;
			this.eleccion[0][2] = 0;
			this.eleccion[0][0] = 8;
		} else if(this.array[1][1] == "x") {				//Empieza Centro
			if(aux == 1) {
				this.array[0][0] = "o";
				this.ventana.getTablero()[0][0].setIcon(o);
				this.eleccion[0][1] = 0;
				this.eleccion[0][2] = 0;
			} else if(aux == 2) {
				this.array[0][2] = "o";
				this.ventana.getTablero()[0][2].setIcon(o);
				this.eleccion[0][1] = 0;
				this.eleccion[0][2] = 2;
			} else if(aux == 3) {
				this.array[2][0] = "o";
				this.ventana.getTablero()[2][0].setIcon(o);
				this.eleccion[0][1] = 2;
				this.eleccion[0][2] = 0;
			} else if(aux == 4) {
				this.array[2][2] = "o";
				this.ventana.getTablero()[2][2].setIcon(o);
				this.eleccion[0][1] = 2;
				this.eleccion[0][2] = 2;
			}												//Fin Centro
			this.eleccion[0][0] = 9;
		}
		
	}
	
	private void IA2() {
		int aux = rng.aleatorioIntSeed(4);
		int opcion = this.eleccion[0][0];
		int fila = this.eleccion[0][1];
		int columna = this.eleccion[0][2];
		if(opcion == 1) {						//Comienzo opcion 1 (esquina arriba izquierda)
			if(fila == 0 && columna == 2) {						//Comienzo esquina arriba derecha en paso 1
				aux = rng.aleatorioIntSeed(2);
				if(this.array[0][1] == "x") {
					this.array[1][2] = "o";
					this.ventana.getTablero()[1][2].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 2;
				} else if(this.array[1][0] == "x") {
					this.array[2][0] = "o";
					this.ventana.getTablero()[2][0].setIcon(o);
					this.eleccion[1][1] = 2;
					this.eleccion[1][2] = 0;
				} else if(this.array[1][1] == "x") {
					this.array[2][2] = "o";
					this.ventana.getTablero()[2][2].setIcon(o);
					this.eleccion[1][1] = 2;
					this.eleccion[1][2] = 2;
				} else if(this.array[1][2] == "x") {
					if(aux == 1) {
						this.array[1][0] = "o";
						this.ventana.getTablero()[1][0].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 0;
					} else {
						this.array[1][1] = "o";
						this.ventana.getTablero()[1][1].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 1;
					}
				} else if(this.array[2][0] == "x") {
					this.array[1][0] = "o";
					this.ventana.getTablero()[1][0].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 0;
				} else if(this.array[2][1] == "x") {
					if(aux == 1) {
						this.array[2][2] = "o";
						this.ventana.getTablero()[2][2].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 2;
					} else {
						this.array[1][1] = "o";
						this.ventana.getTablero()[1][1].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 1;
					}
				} else if(this.array[2][2] == "x") {
					this.array[1][1] = "o";
					this.ventana.getTablero()[1][1].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 1;
				}													//Fin esquina derecha arriba en paso 1
			} else if(fila == 2 && columna == 0) {						//Comienzo esquina abajo izquierda en paso 1
				aux = rng.aleatorioIntSeed(2);
				if(this.array[1][0] == "x") {
					this.array[1][2] = "o";
					this.ventana.getTablero()[2][1].setIcon(o);
					this.eleccion[1][1] = 2;
					this.eleccion[1][2] = 1;
				} else if(this.array[0][1] == "x") {
					this.array[0][2] = "o";
					this.ventana.getTablero()[0][2].setIcon(o);
					this.eleccion[1][1] = 0;
					this.eleccion[1][2] = 2;
				} else if(this.array[1][1] == "x") {
					this.array[2][2] = "o";
					this.ventana.getTablero()[2][2].setIcon(o);
					this.eleccion[1][1] = 2;
					this.eleccion[1][2] = 2;
				} else if(this.array[1][2] == "x") {
					if(aux == 1) {
						this.array[2][0] = "o";
						this.ventana.getTablero()[2][2].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 2;
					} else if(aux == 2) {
						this.array[1][1] = "o";
						this.ventana.getTablero()[1][1].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 1;
					}
				} else if(this.array[0][2] == "x") {
					this.array[0][1] = "o";
					this.ventana.getTablero()[0][1].setIcon(o);
					this.eleccion[1][1] = 0;
					this.eleccion[1][2] = 1;
				} else if(this.array[2][1] == "x") {
					aux = rng.aleatorioIntSeed(3);
					if(aux == 1) {
						this.array[1][1] = "o";
						this.ventana.getTablero()[1][1].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 1;
					} else if(aux == 2) {
						this.array[0][1] = "o";
						this.ventana.getTablero()[0][1].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 1;
					} else if(aux == 3) {
						this.array[2][2] = "o";
						this.ventana.getTablero()[2][2].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 2;
					}
				} else if(this.array[2][2] == "x") {
					this.array[1][1] = "o";
					this.ventana.getTablero()[1][1].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 1;
				}													//Fin esquina abajo izquierda en paso 1
			} else if(fila == 2 && columna == 2) {					//Comienzo esquina abajo derecha en paso 1 (contraria)
				if(this.array[0][1] == "x") {
					this.array[0][2] = "o";
					this.ventana.getTablero()[0][2].setIcon(o);
					this.eleccion[1][1] = 0;
					this.eleccion[1][2] = 2;
				} else if(this.array[0][2] == "x") {
					this.array[0][1] = "o";
					this.ventana.getTablero()[0][1].setIcon(o);
					this.eleccion[1][1] = 0;
					this.eleccion[1][2] = 1;
				} else if(this.array[1][0] == "x") {
					this.array[2][0] = "o";
					this.ventana.getTablero()[2][0].setIcon(o);
					this.eleccion[1][1] = 2;
					this.eleccion[1][2] = 0;
				} else if(this.array[1][1] == "x") {
					aux = rng.aleatorioIntSeed(2);
					if(aux == 1) {
						this.array[2][0] = "o";
						this.ventana.getTablero()[2][0].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 0;
					} else if(aux == 2) {
						this.array[0][2] = "o";
						this.ventana.getTablero()[0][2].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 2;
					}
				} else if(this.array[1][2] == "x") {
					aux = rng.aleatorioIntSeed(3);
					if(aux == 1) {
						this.array[1][0] = "o";
						this.ventana.getTablero()[1][0].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 0;
					} else if(aux == 2) {
						this.array[2][0] = "o";
						this.ventana.getTablero()[2][0].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 0;
					} else if(aux == 3) {
						this.array[1][1] = "o";
						this.ventana.getTablero()[1][1].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 1;
					}
				} else if(this.array[2][0] == "x") {
					this.array[1][0] = "o";
					this.ventana.getTablero()[1][0].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 0;
				} else if(this.array[2][1] == "x") {
					aux = rng.aleatorioIntSeed(3);
					if(aux == 1) {
						this.array[0][1] = "o";
						this.ventana.getTablero()[0][1].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 1;
					} else if(aux == 2) {
						this.array[0][2] = "o";
						this.ventana.getTablero()[0][2].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 2;
					} else if(aux == 3) {
						this.array[1][1] = "o";
						this.ventana.getTablero()[1][1].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 1;
					}
				}												//Fin esquina abajo derecha en paso 1 (contraria)
			} else if(fila == 1 && columna == 1) {					//Comienzo centro en paso 1
				if(this.array[0][1] == "x") {
					this.array[0][2] = "o";
					this.ventana.getTablero()[0][2].setIcon(o);
					this.eleccion[1][1] = 0;
					this.eleccion[1][2] = 2;
				} else if(this.array[0][2] == "x") {
					this.array[0][1] = "o";
					this.ventana.getTablero()[0][1].setIcon(o);
					this.eleccion[1][1] = 0;
					this.eleccion[1][2] = 1;
				} else if(this.array[1][0] == "x") {
					this.array[2][0] = "o";
					this.ventana.getTablero()[2][0].setIcon(o);
					this.eleccion[1][1] = 2;
					this.eleccion[1][2] = 0;
				} else if(this.array[1][2] == "x") {
					aux = rng.aleatorioIntSeed(3);
					if(aux == 1) {
						this.array[0][1] = "o";
						this.ventana.getTablero()[0][1].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 1;
					} else if(aux == 2) {
						this.array[0][2] = "o";
						this.ventana.getTablero()[0][2].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 2;
					} else if(aux == 3) {
						this.array[2][2] = "o";
						this.ventana.getTablero()[2][2].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 2;
					}
				} else if(this.array[2][0] == "x") {
					this.array[1][0] = "o";
					this.ventana.getTablero()[1][0].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 0;
				} else if (this.array[2][1] == "x") {
					aux = rng.aleatorioIntSeed(3);
					if(aux == 1) {
						this.array[1][0] = "o";
						this.ventana.getTablero()[1][0].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 0;
					} else if(aux == 2) {
						this.array[2][0] = "o";
						this.ventana.getTablero()[2][0].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 0;
					} else if(aux == 3) {
						this.array[2][2] = "o";
						this.ventana.getTablero()[2][2].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 2;
					}
				} else if (this.array[2][2] == "x") {
					aux = rng.aleatorioIntSeed(4);
					if(aux == 1) {
						this.array[0][1] = "o";
						this.ventana.getTablero()[0][1].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 1;
					} else if(aux == 2) {
						this.array[1][0] = "o";
						this.ventana.getTablero()[1][0].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 0;
					} else if(aux == 3) {
						this.array[1][2] = "o";
						this.ventana.getTablero()[1][2].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 2;
					} else if(aux == 4) {
						this.array[2][1] = "o";
						this.ventana.getTablero()[2][1].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 1;
					}
				}													
			}											//Fin centro en paso 1
			this.eleccion[1][0] = 1;						//Fin opcion 1 (esquina arriba izquierda)
		} else if(opcion == 2) {							//Comienzo opcion 2 (esquina arriba derecha)
			if(fila == 0 && columna == 0) {
				if(this.array[0][1] == "x") {
					this.array[1][0] = "o";
					this.ventana.getTablero()[1][0].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 0;
				} else if(this.array[1][0] == "x") {
					aux = rng.aleatorioIntSeed(3);
					if(aux == 1) {
						this.array[1][1] = "o";
						this.ventana.getTablero()[1][1].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 1;
					} else if(aux == 2) {
						this.array[1][2] = "o";
						this.ventana.getTablero()[1][2].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 2;
					} else if(aux == 3) {
						this.array[2][0] = "o";
						this.ventana.getTablero()[2][0].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 0;
					}
				} else if(this.array[1][1] == "x") {
					this.array[2][0] = "o";
					this.ventana.getTablero()[2][0].setIcon(o);
					this.eleccion[1][1] = 2;
					this.eleccion[1][2] = 0;
				} else if(this.array[1][2] == "x") {
					this.array[2][2] = "o";
					this.ventana.getTablero()[2][2].setIcon(o);
					this.eleccion[1][1] = 2;
					this.eleccion[1][2] = 2;
				} else if(this.array[2][0] == "x") {
					this.array[1][1] = "o";
					this.ventana.getTablero()[1][1].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 1;
				} else if(this.array[2][1] == "x") {
					aux = rng.aleatorioIntSeed(3);
					if(aux == 1) {
						this.array[1][1] = "o";
						this.ventana.getTablero()[1][1].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 1;
					} else if(aux == 2) {
						this.array[0][1] = "o";
						this.ventana.getTablero()[0][1].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 1;
					} else if(aux == 3) {
						this.array[2][0] = "o";
						this.ventana.getTablero()[2][0].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 0;
					}
				} else if(this.array[2][2] == "x") {
					this.array[1][2] = "o";
					this.ventana.getTablero()[1][2].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 2;
				}
			} else if(fila == 2 && columna == 0) {
				if(this.array[0][0] == "x") {
					this.array[0][1] = "o";
					this.ventana.getTablero()[0][1].setIcon(o);
					this.eleccion[1][1] = 0;
					this.eleccion[1][2] = 1;
				} else if(this.array[0][1] == "x") {
					this.array[0][0] = "o";
					this.ventana.getTablero()[0][0].setIcon(o);
					this.eleccion[1][1] = 0;
					this.eleccion[1][2] = 0;
				} else if(this.array[1][0] == "x") {
					this.array[1][1] = "o";
					this.ventana.getTablero()[1][1].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 1;
				} else if(this.array[1][1] == "x") {
					aux = rng.aleatorioIntSeed(2);
					if(aux == 1) {
						this.array[0][0] = "o";
						this.ventana.getTablero()[0][0].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 0;
					} else if(aux == 2) {
						this.array[2][2] = "o";
						this.ventana.getTablero()[2][2].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 2;
					}
				} else if(this.array[1][2] == "x") {
					this.array[2][2] = "o";
					this.ventana.getTablero()[2][2].setIcon(o);
					this.eleccion[1][1] = 2;
					this.eleccion[1][2] = 2;
				} else if(this.array[2][1] == "x") {
					this.array[1][1] = "o";
					this.ventana.getTablero()[1][1].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 1;
				} else if(this.array[2][2] == "x") {
					this.array[1][2] = "o";
					this.ventana.getTablero()[1][2].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 2;
				}
			} else if(fila == 2 && columna == 2) {
				if(this.array[0][0] == "x") {
					this.array[0][1] = "o";
					this.ventana.getTablero()[0][1].setIcon(o);
					this.eleccion[1][1] = 0;
					this.eleccion[1][2] = 1;
				} else if(this.array[0][1] == "x") {
					this.array[0][0] = "o";
					this.ventana.getTablero()[0][0].setIcon(o);
					this.eleccion[1][1] = 0;
					this.eleccion[1][2] = 0;
				} else if(this.array[1][0] == "x") {
					this.array[2][0] = "o";
					this.ventana.getTablero()[2][0].setIcon(o);
					this.eleccion[1][1] = 2;
					this.eleccion[1][2] = 0;
				} else if(this.array[1][1] == "x") {
					this.array[2][0] = "o";
					this.ventana.getTablero()[2][0].setIcon(o);
					this.eleccion[1][1] = 2;
					this.eleccion[1][2] = 0;
				} else if(this.array[1][2] == "x") {
					aux = rng.aleatorioIntSeed(3);
					if(aux == 1) {
						this.array[1][1] = "o";
						this.ventana.getTablero()[1][1].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 1;
					} else if(aux == 2) {
						this.array[1][0] = "o";
						this.ventana.getTablero()[1][0].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 0;
					} else if(aux == 3) {
						this.array[2][0] = "o";
						this.ventana.getTablero()[2][0].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 0;
					}
				} else if(this.array[2][0] == "x") {
					this.array[1][1] = "o";
					this.ventana.getTablero()[1][1].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 1;
				} else if(this.array[2][1] == "x") {
					aux = rng.aleatorioIntSeed(3);
					if(aux == 1) {
						this.array[1][1] = "o";
						this.ventana.getTablero()[1][1].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 1;
					} else if(aux == 2) {
						this.array[0][1] = "o";
						this.ventana.getTablero()[0][1].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 1;
					} else if(aux == 3) {
						this.array[2][0] = "o";
						this.ventana.getTablero()[2][0].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 0;
					}
				}
			} else if(fila == 1 && columna == 1) {
				if(this.array[0][0] == "x") {
					this.array[0][1] = "o";
					this.ventana.getTablero()[0][1].setIcon(o);
					this.eleccion[1][1] = 0;
					this.eleccion[1][2] = 1;
				} else if(this.array[0][1] == "x") {
					this.array[0][0] = "o";
					this.ventana.getTablero()[0][0].setIcon(o);
					this.eleccion[1][1] = 0;
					this.eleccion[1][2] = 0;
				} else if(this.array[1][0] == "x") {
					aux = rng.aleatorioIntSeed(3);
					if(aux == 1) {
						this.array[0][0] = "o";
						this.ventana.getTablero()[0][0].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 0;
					} else if(aux == 2) {
						this.array[0][1] = "o";
						this.ventana.getTablero()[0][1].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 1;
					} else if(aux == 3) {
						this.array[2][0] = "o";
						this.ventana.getTablero()[2][0].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 0;
					}
				} else if(this.array[1][2] == "x") {
					this.array[2][2] = "o";
					this.ventana.getTablero()[2][2].setIcon(o);
					this.eleccion[1][1] = 2;
					this.eleccion[1][2] = 2;
				} else if(this.array[2][0] == "x") {
					aux = rng.aleatorioIntSeed(4);
					if(aux == 1) {
						this.array[0][1] = "o";
						this.ventana.getTablero()[0][1].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 1;
					} else if(aux == 2) {
						this.array[1][0] = "o";
						this.ventana.getTablero()[1][0].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 0;
					} else if(aux == 3) {
						this.array[1][2] = "o";
						this.ventana.getTablero()[1][2].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 2;
					} else if(aux == 4) {
						this.array[2][1] = "o";
						this.ventana.getTablero()[2][1].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 1;
					}
				} else if(this.array[2][1] == "x") {
					aux = rng.aleatorioIntSeed(3);
					if(aux == 1) {
						this.array[0][1] = "o";
						this.ventana.getTablero()[0][1].setIcon(o);
						this.eleccion[1][1] = 0;
						this.eleccion[1][2] = 1;
					} else if(aux == 2) {
						this.array[1][2] = "o";
						this.ventana.getTablero()[1][2].setIcon(o);
						this.eleccion[1][1] = 1;
						this.eleccion[1][2] = 2;
					} else if(aux == 3) {
						this.array[2][2] = "o";
						this.ventana.getTablero()[2][2].setIcon(o);
						this.eleccion[1][1] = 2;
						this.eleccion[1][2] = 2;
					}
				} else if(this.array[2][2] == "x") {
					this.array[1][2] = "o";
					this.ventana.getTablero()[1][2].setIcon(o);
					this.eleccion[1][1] = 1;
					this.eleccion[1][2] = 2;
				}
			}
			this.eleccion[1][0] = 2;						//Fin opcion 2 (esquina arriba derecha)
		} else if(opcion == 3) {							//Comienzo opcion 3 (esquina abajo izquierda)
			if(fila == 0 && columna == 0) {
				
			} else if(fila == 0 && columna == 2) {
				
			} else if(fila == 2 && columna == 2) {
				
			} else if(fila == 1 && columna == 1) {
				
			}
			this.eleccion[1][0] = 3;						//Fin opcion 3 (esquina abajo izquierda)
		} else if(opcion == 4) {							//Comienzo opcion 4 (esquina abajo derecha)
			if(fila == 0 && columna == 0) {
				
			} else if(fila == 0 && columna == 2) {
				
			} else if(fila == 2 && columna == 0) {
				
			} else if(fila == 1 && columna == 1) {
				
			}
			this.eleccion[1][0] = 4;						//Fin opcion 4 (esquina abajo derecha)
		} else if(opcion == 5) {
			
			this.eleccion[1][0] = 5;
		} else if(opcion == 6) {
			
			this.eleccion[1][0] = 6;
		} else if(opcion == 7) {
			
			this.eleccion[1][0] = 7;
		} else if(opcion == 8) {
			
			this.eleccion[1][0] = 8;
		} else if(opcion == 9) {
			
			this.eleccion[1][0] = 9;
		}
	}
	
	private void IA3() {
		
	}
	
	private void IA4() {
		
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

	public int[][] getEleccion() {
		return eleccion;
	}

	public void setEleccion(int[][] eleccion) {
		this.eleccion = eleccion;
	}

}
