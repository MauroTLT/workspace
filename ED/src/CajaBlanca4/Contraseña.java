package CajaBlanca4;

public class Contraseña {
	public boolean Intentos(String intento, boolean acierto, int intentos){
		String contraseña = "eureka";
		for(int i = 0; i < intentos && !acierto; i++) {
			System.out.println("Introduce una contraseña");
			if(intento.equals(contraseña)) {
				System.out.println("Enhorabuena, acertaste");
				acierto = true;
			}
		}
		return acierto;
	}
}
