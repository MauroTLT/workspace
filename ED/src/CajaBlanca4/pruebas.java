package CajaBlanca4;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

/** Casos de prueba
 * Camino1: entrada="eureka", acierto=false, INTENTOS = -1----> false
 * Camino2: entrada="eureka", acierto=false, INTENTOS = 3----> true
 * Camino3: entrada="hola", acierto=false, INTENTOS = 3----> false
 * Camino4: entrada="hola", acierto=true, INTENTOS = 3----> true
 */

public class pruebas {
	Scanner sc = new Scanner(System.in);
	@Test
	public void camino1() {
		Contraseña cont = new Contraseña();
		assertEquals(false, cont.Intentos("eureka", false, -1));
	}
	@Test
	public void camino2() {
		Contraseña cont = new Contraseña();
		assertEquals(true, cont.Intentos("eureka", false, 3));
	}
	@Test
	public void camino3() {
		Contraseña cont = new Contraseña();
		assertEquals(false, cont.Intentos("hola", false, 3));
	}
	@Test
	public void camino4() {
		Contraseña cont = new Contraseña();
		assertEquals(true, cont.Intentos("hola", true, 3));
	}
}