package juegoParejas;

import java.util.*;

public class random {
	Random aleatorio = new Random();
	public long aleatorioInt() {
		long num = aleatorio.nextInt();
		return num;
	}
	
	public int aleatorioIntSeed(int seed) {
		int num = aleatorio.nextInt(seed);
		return num;
	}
	
	public double aleatorioFloat() {
		double num = aleatorio.nextFloat() * 100;
		return num;
	}
	public long aleatorioLong(long num) {
		aleatorio.setSeed(num);
		num = aleatorio.nextLong();
		return num;
	}
}