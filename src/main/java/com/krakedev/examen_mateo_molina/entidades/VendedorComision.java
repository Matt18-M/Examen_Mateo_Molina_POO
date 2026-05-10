package com.krakedev.examen_mateo_molina.entidades;

public class VendedorComision extends Vendedor {

	public VendedorComision (String cedula,String tipo) {
		super(cedula,tipo);
	}
	
	@Override
	public double calcularSueldo() {
		return getComisionPorVenta() * getNumeroVentas();
	}
	
}
