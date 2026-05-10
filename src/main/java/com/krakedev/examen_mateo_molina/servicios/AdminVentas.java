package com.krakedev.examen_mateo_molina.servicios;

import java.util.ArrayList;

import com.krakedev.examen_mateo_molina.entidades.Vendedor;

public class AdminVentas {

	private ArrayList<Vendedor> vendedores;
	
	public AdminVentas() {
		this.vendedores = new ArrayList <>();
	}
	
	
	public void agregar(Vendedor vendedor) {
		vendedores.add(vendedor);
	}
	
	
	public Double calcularSueldo(String cedula) {
		for (Vendedor v : vendedores) {
			if(v.getCedula().equals(cedula)) {
				return v.calcularSueldo();
			}
		}
		return null;
	}
	
	
	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}
}
