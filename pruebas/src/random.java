
import java.util.Random;

public class random {
	Random random = new Random();
	public int randomInt(int seed) {
		int num = 0;
		num = random.nextInt(seed);
			return num;
	}
}
