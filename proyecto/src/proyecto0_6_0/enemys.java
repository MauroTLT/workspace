package proyecto0_6_0;

public class enemys {
	random random = new random();
	int[] enemy = new int[2];
	public void generate(String[][][][] mapa, int[]ahora){
		int fila = random.randomInt(5) + 1, columna = random.randomInt(7) + 1;
		boolean semaforo = false;
		while(semaforo == false) {
			if(mapa[0][ahora[1]][fila][columna] == " ") {
				mapa[0][ahora[1]][fila][columna] = "#";
				enemy[0] = fila;
				enemy[1] = columna;
				semaforo = true;
			} else {
				fila = random.randomInt(5) + 1;
				columna = random.randomInt(7) + 1;
			}
		}
	}
	public void delete(String[][][][] mapa, int[]ahora){
		for(int i = 0; i < mapa[0][ahora[1]].length; i++) {
			for(int j = 0; j < mapa[0][ahora[1]][i].length; j++) {
				if(mapa[0][ahora[1]][i][j] == "#") {
					mapa[0][ahora[1]][i][j] = " ";
				}
			}
		}
	}
	public void moverE(String[][][][] mapa, int[]ahora){
		int dir = random.randomInt(5);
		boolean semaforo = false;
		for(int i = 0; i < mapa[0][ahora[1]].length; i++) {
			for(int j = 0; j < mapa[0][ahora[1]][i].length; j++) {
				if(mapa[0][ahora[1]][i][j] == "#") {
					semaforo = true;
				}
			}
		}
		if(dir == 0 && semaforo == true) {
		} else if(dir == 1 && semaforo == true) {
			if(enemy[0] == 6 || mapa[0][ahora[1]][enemy[0] + 1][enemy[1]] != " ") {
			} else {
				mapa[0][ahora[1]][enemy[0]][enemy[1]] = " ";
				mapa[0][ahora[1]][enemy[0] + 1][enemy[1]] = "#";
				enemy[0] += 1;
			}
		} else if(dir == 2 && semaforo == true) {
			if(enemy[0] == 0 || mapa[0][ahora[1]][enemy[0] - 1][enemy[1]] != " ") {
			} else {
				mapa[0][ahora[1]][enemy[0]][enemy[1]] = " ";
				mapa[0][ahora[1]][enemy[0] - 1][enemy[1]] = "#";
				enemy[0] -= 1;
			}
		} else if(dir == 3 && semaforo == true) {
			if(enemy[1] == 0 || mapa[0][ahora[1]][enemy[0]][enemy[1] - 1] != " ") {
			} else {
				mapa[0][ahora[1]][enemy[0]][enemy[1]] = " ";
				mapa[0][ahora[1]][enemy[0]][enemy[1] - 1] = "#";
				enemy[1] -= 1;
			}
		} else if(dir == 4 && semaforo == true) {
			if(enemy[1] == 8 || mapa[0][ahora[1]][enemy[0]][enemy[1] + 1] != " ") {
			} else {
				mapa[0][ahora[1]][enemy[0]][enemy[1]] = " ";
				mapa[0][ahora[1]][enemy[0]][enemy[1] + 1] = "#";
				enemy[1] += 1;
			}
		}
	}
	
}