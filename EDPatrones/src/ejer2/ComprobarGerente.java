package ejer2;
/**
 * @author Mauro Pérez Moliner 1ºDAM-B Mati
 */
public class ComprobarGerente extends Comprobador {

	private Comprobador sucesor;

	@Override
	public void setSucesor(Comprobador comprobador) {
		this.sucesor = comprobador;
	}

	@Override
	public void comprobar(int i) {
		if (i>50000 && i<=100000) {
			System.out.println("El crédito ha sido aprobado por el Gerente ("+i+"€)");
		} else {
			if (this.sucesor != null) {
				this.sucesor.comprobar(i);
			}
		}
	}

}
