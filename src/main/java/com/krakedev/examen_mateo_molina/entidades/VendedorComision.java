package com.krakedev.examen_mateo_molina.entidades;

public class VendedorComision extends Vendedor {

	public VendedorComision (String cedula) {
		super(cedula);
	}
	
	@Override
	public double calcularSueldo() {
		return getComisionPorVenta() * getNumeroVentas();
	}
	
}
