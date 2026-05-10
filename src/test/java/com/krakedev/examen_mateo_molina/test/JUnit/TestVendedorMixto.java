package com.krakedev.examen_mateo_molina.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen_mateo_molina.entidades.VendedorMixto;

public class TestVendedorMixto {

	@Test
	void testCalculoMixto() {
		VendedorMixto v = new VendedorMixto("01506","M");
		v.setSueldoFijo(400);
		v.setNumeroVentas(5);

		assertEquals(400 + (400 * 0.01 * 5), v.calcularSueldo());
	}
}