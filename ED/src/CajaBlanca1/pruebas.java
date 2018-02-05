package CajaBlanca1;

import static org.junit.Assert.*;

import org.junit.Test;

/** Casos de prueba
 * Camino1: case +, operando1 = 2.0, operando2 = 2.0 ----> 4.0
 * Camino2: case -, operando1 = 2.0, operando2 = 2.0 ----> 0.0
 * Camino3: case *, operando1 = 2.0, operando2 = 2.0 ----> 4.0
 * Camino4: case /, operando1 = 2.0, operando2 = 2.0 ----> 1.0
 * Camino5: case %, operando1 = 2.0, operando2 = 2.0 ----> 0.0
 * Camino6: case ^, operando1 = 2.0, operando2 = 2.0 ----> 4.0
 * Camino7: case default, operando1 = 2.0, operando2 = 2.0 ----> 0.0
 */
public class pruebas {

	@Test
	public void camino1() {
		CalculadoraPolacaInversa calculadora = new CalculadoraPolacaInversa();
		assertEquals(4.0, calculadora.calcular(2.0, 2.0, "+"), 2);
	}
	@Test
	public void camino2() {
		CalculadoraPolacaInversa calculadora = new CalculadoraPolacaInversa();
		assertEquals(0.0, calculadora.calcular(2.0, 2.0, "-"), 2);
	}
	@Test
	public void camino3() {
		CalculadoraPolacaInversa calculadora = new CalculadoraPolacaInversa();
		assertEquals(4.0, calculadora.calcular(2.0, 2.0, "*"), 2);
	}
	@Test
	public void camino4() {
		CalculadoraPolacaInversa calculadora = new CalculadoraPolacaInversa();
		assertEquals(1.0, calculadora.calcular(2.0, 2.0, "/"), 2);
	}
	@Test
	public void camino5() {
		CalculadoraPolacaInversa calculadora = new CalculadoraPolacaInversa();
		assertEquals(4.0, calculadora.calcular(2.0, 2.0, "^"), 2);
	}
	@Test
	public void camino6() {
		CalculadoraPolacaInversa calculadora = new CalculadoraPolacaInversa();
		assertEquals(0.0, calculadora.calcular(2.0, 2.0, "%"), 2);
	}
	@Test
	public void camino7() {
		CalculadoraPolacaInversa calculadora = new CalculadoraPolacaInversa();
		assertEquals(0.0, calculadora.calcular(2.0, 2.0, " "), 2);
	}
}
