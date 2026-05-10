package com.krakedev.examen_mateo_molina.test.JUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen_mateo_molina.entidades.VendedorComision;

public class TestVendedorComision {

    @Test
    void testCalculoComision() {
        VendedorComision v = new VendedorComision("015056");
        v.setNumeroVentas(10);
        v.setComisionPorVenta(5);

        assertEquals(50, v.calcularSueldo());
    }
}