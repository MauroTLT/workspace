package proyecto;

import java.util.*;

public class juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		juego programa = new juego();
		programa.inici();
	}
	public void inici() {
		Scanner entradaTeclado = new Scanner(System.in);
		String[][][] mapa = {
                {//Zona 1
                    {"*","*","*","/","/","/","/"},
                    {"*","*"," ","/","/","/","/"},
                    {"*"," ","¡"," ","/","/","/"},
                    {"*"," "," "," "," "," "," "},
                    {"*","*","*","*","*","*","*"}
                },
                {//Zona 2
                	{"/","/","*","*","*","*","*"},
                    {"/","/"," "," "," ","*","*"},
                    {"/"," "," ","*"," "," ","*"},
                    {" "," "," "," "," "," ","*"},
                    {"*","*","*","*","*"," ","*"}
                },
                {//Zona 3
                	{"*","*","*","*","*","*","*"},
                    {"*"," ","*","$","*"," ","*"},
                    {"*"," ","*","=","*"," ","*"},
                    {"*"," "," "," "," "," ","*"},
                    {"*"," "," "," "," "," ","*"}
                },
                {//Zona 4
                	{"*","*","*","*","*","*","*"},
                    {"/"," "," "," "," "," ","*"},
                    {"/","/"," ","@"," "," "," "},
                    {"/","/"," "," "," "," ","*"},
                    {"/"," "," "," ","*"," "," "}
                },
                {//Zona 5
                	{"*","*","*","*","*"," ","*"},
                    {"*"," "," "," "," "," ","*"},
                    {" "," "," ","/","/"," ","*"},
                    {"*"," ","/","/"," "," ","*"},
                    {" "," "," ","/"," "," ","*"}
                },
                {//Zona 6
                	{"*"," "," "," "," "," ","*"},
                    {"*"," ","*"," ","*"," ","*"},
                    {"*"," "," "," "," "," ","*"},
                    {"*"," ","*"," ","*"," ","*"},
                    {"*"," "," "," "," "," ","*"}
                },
                {//Zona 7
                	{"/"," "," "," ","*"," "," "},
                    {"/"," ","*"," "," "," ","*"},
                    {"/"," "," "," "," "," ","*"},
                    {"/","/","/","/","/"," "," "},
                    {"/","/","/","/","/","/","/"}
                },
                {//Zona 8
                	{" "," "," ","/"," "," ","*"},
                    {"*"," ","/","/"," "," ","*"},
                    {"*"," ","/"," "," "," "," "},
                    {" "," ","/","/","/"," "," "},
                    {"/","/","/","/","/","/","/"}
                },
                {//Zona 9
                	{"*"," "," "," "," "," ","/"},
                    {"*","*","*"," "," "," ","/"},
                    {" ","*","*","*"," "," ","/"},
                    {" "," "," "," "," ","/","/"},
                    {"/","/","/","/","/","/","/"}
                },
                };
		int[]ahora = new int[4];
		boolean gameOver = false;
		int zona = 3;
		int fila = 2;
		int columna = 3;
		//Empieza el juego
		introduccion();
		representar(mapa, zona, fila, columna);
		ahora = mover(entradaTeclado, mapa, zona, fila, columna);
		clear();
		representar(mapa, zona, fila, columna);
		while(gameOver == false) {
			ahora = mover(entradaTeclado, mapa, ahora[0], ahora[1], ahora[2]);
			gameOver = comprobar(mapa);
			clear();
			representar(mapa, ahora[0], fila, columna);
		}
		System.out.println("Enhorabuena has encontrado el tesoro. Con esto acaba tu aventura.");
	}
	public void introduccion() {
		System.out.println("\nBienvenidos a 'nombre de juego provisional'.\n\nEres un buscador de tesoros y has llegado a esta nueva isla en busca de riquezas\ndiviertete explorando los misterios de la isla y encontrando el tesoro que te pertenece.\n");
		System.out.println("-----------------------------------Información--------------------------------------\n");
		System.out.println(" - Muevete con: w(arriba), s(abajo), a(izquierda) y d(derecha) mas un intro. Sin mayusculas.");
		System.out.println(" - Los * son piedras, no puedes traspasarlas, no eres tan impresionante.");
		System.out.println(" - Las / es agua, no puedes pasar por encima, no eres el nuevo mesias.");
		System.out.println(" - El $ simboliza el tesoro, y es posible que encuentres obstaculos como =, deshazte de ellos con un ¡");
		System.out.println(" - Y por último, pero no menos importante, tu eres el simbolo @\n");
		System.out.println("-----------------------------------Información--------------------------------------\n\n");
	}
	public void clear() {
		for( int i = 0; i < 20; i++ ) {
		    System.out.println("");
		}
	}
	public boolean comprobar(String[][][] mapa) {
		boolean gameOver = false;
		if(mapa[2][1][3] == "@") {
			gameOver = true;
		}
		return gameOver;
	}
	public int[] mover(Scanner entradaTeclado, String[][][] mapa, int i, int j, int k) {
		boolean correcto = false;
		String dir = "";
		int[] ahora = new int[3];
		correcto = false;
		while (correcto == false) {
		dir = entradaTeclado.next();
			switch(dir) {
				case "w":
					if(j==0) {
						mapa[i][j][k] = " ";
						i -= 3;
						j = 4;
						if (mapa[i][j][k] == "*" || (mapa[i][j][k] == "/")) {

						} else {
							mapa[i][j][k] = "@";
							ahora[0] = i;
							ahora[1] = j;
							ahora[2] = k;
							correcto = true;
						}
					}
					if (mapa[i][j - 1][k] == "*" || (mapa[i][j - 1][k] == "/") || (mapa[i][j - 1][k] == "=") || correcto == true) {
						
					} else if(mapa[i][j - 1][k] == "¡"){
						mapa[i][j][k] = " ";
						mapa[i][j - 1][k] = "@";
						ahora[0] = i;
						ahora[1] = j - 1;
						ahora[2] = k;
						mapa[2][2][3] = " ";
						
						correcto = true;
					} else {
						mapa[i][j][k] = " ";
						mapa[i][j - 1][k] = "@";
						ahora[0] = i;
						ahora[1] = j - 1;
						ahora[2] = k;
						correcto = true;
					}
					break;
				case "s":
					if(j==4) {
						mapa[i][j][k] = " ";
						i += 3;
						j = 0;
						if (mapa[i][j][k] == "*" || (mapa[i][j][k] == "/")) {
							
						} else {
							mapa[i][j][k] = "@";
							ahora[0] = i;
							ahora[1] = j;
							ahora[2] = k;
							correcto = true;
						}
					}
					if (mapa[i][j + 1][k] == "*" || (mapa[i][j + 1][k] == "/") || correcto == true) {
						
					} else if(mapa[i][j + 1][k] == "¡"){
						mapa[i][j][k] = " ";
						mapa[i][j + 1][k] = "@";
						ahora[0] = i;
						ahora[1] = j + 1;
						ahora[2] = k;
						mapa[2][2][3] = " ";
						
						correcto = true;
					} else {
						mapa[i][j][k] = " ";
						mapa[i][j + 1][k] = "@";
						ahora[0] = i;
						ahora[1] = j + 1;
						ahora[2] = k;
						correcto = true;
					}
					break;
				case "a":
					if(k==0) {
						mapa[i][j][k] = " ";
						i -= 1;
						k = 6;
						if (mapa[i][j][k] == "*" || (mapa[i][j][k] == "/")) {
							
						} else {
							mapa[i][j][k] = "@";
							ahora[0] = i;
							ahora[1] = j;
							ahora[2] = k;
							correcto = true;
						}
					}
					if (mapa[i][j][k - 1] == "*" || (mapa[i][j][k - 1] == "/") || correcto==true) {
						
					} else if(mapa[i][j][k - 1] == "¡"){
						mapa[i][j][k] = " ";
						mapa[i][j][k - 1] = "@";
						ahora[0] = i;
						ahora[1] = j;
						ahora[2] = k - 1;
						mapa[2][2][3] = " ";
						
						correcto = true;
					} else {
						mapa[i][j][k] = " ";
						mapa[i][j][k - 1] = "@";
						ahora[0] = i;
						ahora[1] = j;
						ahora[2] = k - 1;
						correcto = true;
					}
					break;
				case "d":
					if(k==6) {
						mapa[i][j][k] = " ";
						i += 1;
						k = 0;
						if (mapa[i][j][k] == "*" || (mapa[i][j][k] == "/")) {
							
						} else {
							mapa[i][j][k] = "@";
							ahora[0] = i;
							ahora[1] = j;
							ahora[2] = k;
							correcto = true;
						}
					}
					if (mapa[i][j][k + 1] == "*" || (mapa[i][j][k + 1] == "/") || correcto==true) {
						
					} else if(mapa[i][j][k + 1] == "¡"){
						mapa[i][j][k] = " ";
						mapa[i][j][k + 1] = "@";
						ahora[0] = i;
						ahora[1] = j;
						ahora[2] = k + 1;
						mapa[2][2][3] = " ";
						
						correcto = true;
					} else {
						mapa[i][j][k] = " ";
						mapa[i][j][k + 1] = "@";
						ahora[0] = i;
						ahora[1] = j;
						ahora[2] = k + 1;
						correcto = true;
					}
					break;
				default:
					System.out.println("Solo puedes escribir: w,a,s,d");
			}
		}
		return ahora;
	}
	public void representar(String[][][] mapa, int i, int j, int k) {
	//for(int i = 0; i < mapa.length; i++) {//Zona
		System.out.println("------Zona" + (i+1) + "------");
		for(j = 0; j < mapa[i].length; j++) {//Fila
			System.out.print("| ");
			for(k = 0; k < mapa[i][j].length; k++) {//Columna
				System.out.print(mapa[i][j][k] + " ");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.print("-----------------\n\n\n");
	//}
	}
}