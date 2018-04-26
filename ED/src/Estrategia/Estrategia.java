package Estrategia;

	interface Strategy {
		public void comofrena();
	}

	class Coche {
		Strategy c;

		public void setEstrategia(Strategy c) {
			this.c = c;
		}

		public void frenar() {
			c.comofrena();
		}
	}

	class EstrategiaABS implements Strategy {
		@Override
		public void comofrena() {
			System.out.println("Realizamos un frenado en 5 metros con ABS");
		}
	}

	class EstrategiaSinABS implements Strategy {
		@Override
		public void comofrena() {
			System.out.println("Realizamos un frenado en 10 metros sin ABS");
		}
	}

public class Estrategia {
	public static void main(String args[]) {
		Coche context = new Coche();
		// Usamos la estrategia A
		Strategy estrategia_inicial = new EstrategiaABS();
		context.setEstrategia(estrategia_inicial);
		context.frenar();
		// Decidimos usar la estrategia B
		Strategy estrategia2 = new EstrategiaSinABS();
		context.setEstrategia(estrategia2);
		context.frenar();
		// Finalmente,usamos de nuevo la estrategia A
		context.setEstrategia(estrategia_inicial);
		context.frenar();
	}
}