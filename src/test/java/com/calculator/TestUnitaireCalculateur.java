package com.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUnitaireCalculateur {

	calculateur calculatrice;

// test qui return la plus grand nombre de la liste
	@Test
	public void testmaxElement() {
		int[] list = new int[] { 17, 8, 19 };
		calculateur calculateur = new calculateur();
		int biggest = calculateur.maxElement(list);
		assertEquals(19, biggest);
	}

	@Test
	public void testminElement() {
		int[] list = new int[] { 6, 8, 9 };
		calculateur calculateur = new calculateur();
		int biggest = calculateur.minElement(list);
		assertEquals(6, biggest);
	}

	@Test
	public void testSum() {
		int x = 12;
		int y = 5;
		assertEquals(17, calculateur.Sum(x, y));
	}

	@Test
	public void testminus() {
		int x = 12;
		int y = 5;
		assertEquals(7, calculateur.minus(x, y));

	}

	@Test
	public void testdivide() {
		int x = 12;
		int y = 2;
		assertEquals(6, calculateur.divide(x, y));

	}

	@Test
	public void testmultiply() {
		int x = 22;
		int y = 2;
		assertEquals(44, calculateur.multiply(x, y));

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
