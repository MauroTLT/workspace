package Singleton;

public class Main {
	public static void main(String[] args) {
		LogSingleton.getInstance().log("Probando....");
		LogSingleton.getInstance().log("La clase singleton");
	}
}