package Singleton;

public class LogSingleton {
	int DEBUG = 1;
	/** objeto Singleton */
	private static LogSingleton miLogSingleton = new LogSingleton();

	private LogSingleton() {
		log("Eventos de Usuario:");
		log("");
	}

	public static LogSingleton getInstance() {
		return miLogSingleton;
	}

	public void log(String contenido) {
		if (DEBUG == 1) {
			System.out.println(contenido);
		}
	}
}
