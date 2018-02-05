package CajaBlanca2;

import static org.junit.Assert.*;

import org.junit.Test;

/** Casos de prueba
 * Camino1: cadena.charAt(i)= "a" ----> 1
 * Camino2: cadena.charAt(i)= "e" ----> 1
 * Camino3: cadena.charAt(i)= "i" ----> 1
 * Camino4: cadena.charAt(i)= "o" ----> 1
 * Camino5: cadena.charAt(i)= "u" ----> 1
 * Camino6: cadena.charAt(i)= "g" ----> 0
 * Camino7: cadena.charAt(i)= ""  ----> 0
 */

public class pruebas {

	@Test
	public void camino1() {
		Contador cont = new Contador();
		assertEquals(1, cont.carac("a"));
	}
	@Test
	public void camino2() {
		Contador cont = new Contador();
		assertEquals(1, cont.carac("e"));
	}
	@Test
	public void camino3() {
		Contador cont = new Contador();
		assertEquals(1, cont.carac("i"));
	}
	@Test
	public void camino4() {
		Contador cont = new Contador();
		assertEquals(1, cont.carac("o"));
	}
	@Test
	public void camino5() {
		Contador cont = new Contador();
		assertEquals(1, cont.carac("u"));
	}
	@Test
	public void camino6() {
		Contador cont = new Contador();
		assertEquals(0, cont.carac("g"));
	}
	@Test
	public void camino7() {
		Contador cont = new Contador();
		assertEquals(0, cont.carac(""));
	}
}
