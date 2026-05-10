package com.krakedev.examen_mateo_molina.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen_mateo_molina.entidades.Vendedor;

public class TestCalcularSueldoJUnit {

	@Test
    void testCalculoSueldo() {
        Vendedor v = new Vendedor("015056");
        v.setSueldoFijo(500);

        assertEquals(500, v.calcularSueldo());
    }
}