package examen3;
/**
 * Mauro Pérez Moliner
 * 1ºDAM Mañana
 */
public class ejercicio4 {
	public static final int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int total = 0;
		for (i = 0; total < MAX; i++) {
			if (i % 2 == 0) {
				total = total + 3;
				System.out.println(total);
			} else {
				total = total - 2;
				System.out.println(total);
			}
		}
	}
}