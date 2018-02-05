package CajaBlanca4;

public class ContraseniaApp {
	public static void main(String[] args) {
		String contraseña = "eureka";
		final int INTENTOS= 3;
		Contraseña contr = new Contraseña();
		System.out.println(contr.Intentos(contraseña, false, INTENTOS));
	}
}