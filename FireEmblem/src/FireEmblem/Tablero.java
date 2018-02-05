package FireEmblem;

public class Tablero {
	private String nombre;
	private Casilla[][] mapa;
	
	public Tablero() {

	}
	
	public Tablero(String nombre, Casilla[][] mapa) {
		this.nombre = nombre;
		this.mapa = mapa;
	}
	
	public void visualizar() {
		System.out.println("\t\t\t\t\t\t\t  0 1 2 3 4 5");
		System.out.println("\t\t\t\t\t\t\t ┏———————————┓");
		for(int j = 0; j < mapa.length; j++) {
			System.out.print("\t\t\t\t\t\t\t" + j + "┃");
			for(int k = 0; k < mapa[j].length; k++) {
				if(k == mapa[j].length - 1) {
					if(mapa[j][k].getPersonaje() == null) {
						System.out.print(mapa[j][k].getSimbolo());
					} else {System.out.print(mapa[j][k].getPersonaje().getSimbolo());}
				} else {
					if(mapa[j][k].getPersonaje() == null) {
						System.out.print(mapa[j][k].getSimbolo() + " ");
					} else {System.out.print(mapa[j][k].getPersonaje().getSimbolo() + " ");}
				}
			}
			System.out.print("┃");
			System.out.println();
		}
		System.out.println("\t\t\t\t\t\t\t ┗―——————————┛\n");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Casilla[][] getMapa() {
		return mapa;
	}

	public void setMapa(Casilla[][] mapa) {
		this.mapa = mapa;
	}
}
