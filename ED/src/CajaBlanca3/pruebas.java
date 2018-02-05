package CajaBlanca3;

import static org.junit.Assert.*;

import org.junit.Test;

/** Casos de prueba
 * Camino1: num < 100 ----> 100
 * Camino2: num >= 100 ----> num
 */

public class pruebas {

	@Test
	public void camino1() {
		While bucle = new While();
		assertEquals(100, bucle.bucle(1));
	}
	@Test
	public void camino2() {
		While bucle = new While();
		assertEquals(150, bucle.bucle(150));
	}

}