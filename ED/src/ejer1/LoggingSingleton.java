package ejer1;

public class LoggingSingleton {

	private static LoggingSingleton miLogSingleton = new LoggingSingleton();
	
	private LoggingSingleton() {
		log("Eventos de Usuario:");
		log("");
	}

	public static LoggingSingleton getInstance() {
		return miLogSingleton;
	}

	public void log(String contenido) {
		System.out.println(contenido);
	}

}
