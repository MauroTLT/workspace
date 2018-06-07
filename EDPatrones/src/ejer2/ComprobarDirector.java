package ejer2;
/**
 * @author Mauro Pérez Moliner 1ºDAM-B Mati
 */
public class ComprobarDirector extends Comprobador {

	private Comprobador sucesor;

	@Override
	public void setSucesor(Comprobador comprobador) {
		this.sucesor = comprobador;
	}

	@Override
	public void comprobar(int i) {
		if (i>100000) {
			System.out.println("El crédito ha sido aprobado por el Director ("+i+"€)");
		} else {
			if (this.sucesor != null) {
				this.sucesor.comprobar(i);
			}
		}
	}

}