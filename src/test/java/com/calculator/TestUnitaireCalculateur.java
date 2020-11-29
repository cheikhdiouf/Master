package com.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUnitaireCalculateur {

	calculateur calculatrice;

	@Test
	public void testmaxElement() {
		int[] list = new int[] { 7, 8, 19 };
		calculateur calculateur = new calculateur();
<<<<<<< HEAD
<<<<<<< Updated upstream
		int beggest = calculateur.maxElement(list);
		assertEquals(19, beggest);
=======
		int biggest = calculateur.maxElement(list);
		assertEquals(19, biggest);
>>>>>>> Stashed changes
=======
		int biggest = calculateur.maxElement(list);
		assertEquals(19, biggest);

>>>>>>> 67dd8a321326031cbf468e004f87b5a64ec0a2c2
	}

	@Test
	public void testminElement() {
		int[] list = new int[] { -6, -8, -9 };
		calculateur calculateur = new calculateur();
		int biggest = calculateur.minElement(list);
		assertEquals(-9, biggest);
	}

	@Test
	public void testSum() {
		int x = 12;
		int y = 5;
		assertEquals(17, calculateur.Sum(x, y));

		int a = -27;
		int b = 5;
		assertEquals(-22, calculateur.Sum(a,b));
	}

	@Test
	public void testminus() {
		int x = 12;
		int y = 5;
		assertEquals(7, calculateur.minus(x, y));

		int a = -39;
		int b = 8;
		assertEquals(-47, calculateur.minus(a, b));

	}


	@Test
	public void testdivide() {
		int x = -12;
		int y = 3;
		assertEquals(-4, calculateur.divide(x, y));

		int a = 12;
		int b = 2;
		assertEquals(6, calculateur.divide(a, b));
	}

	@Test
	public void testmultiply() {
		int x = 2;
		int y = -9;
		assertEquals(-18, calculateur.multiply(x, y));

		int a = -12;
		int b = -3;
		assertEquals(36, calculateur.multiply(a, b));
	}

	@Test
	public void testmin() {
		int x = 26;
		int y = 90;
		assertEquals(26, calculateur.min(x, y));

	}

	@Test
	public void testmax() {
		int x = 26;
		int y = 90;
		assertEquals(90, calculateur.max(x, y));

	}

}
