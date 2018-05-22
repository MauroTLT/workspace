package ejercicio2;

import java.util.ArrayList;
/**
 * @author Mauro Pérez Moliner 1ºDAM Mañana
 *
 */
public interface BonolotoDAO {
	
	public int insertarApuesta(BonolotoModel apuesta);
	
	public ArrayList<BonolotoModel> listarApuestas();
}
