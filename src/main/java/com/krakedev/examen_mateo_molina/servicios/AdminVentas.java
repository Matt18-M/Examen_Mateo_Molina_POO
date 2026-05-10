package com.krakedev.examen_mateo_molina.servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.examen_mateo_molina.entidades.Vendedor;
import com.krakedev.examen_mateo_molina.entidades.VendedorComision;
import com.krakedev.examen_mateo_molina.entidades.VendedorMixto;

@Service
public class AdminVentas {

	private ArrayList<Vendedor> vendedores;
	
	public AdminVentas() {
		this.vendedores = new ArrayList<>();
	}
	
	public Vendedor agregar(Vendedor vendedor) {
		
		Vendedor nuevo = null;
		String tipo = vendedor.getTipo();
		
		if (tipo.equals("V")) {
			nuevo = new Vendedor(vendedor.getCedula(), "V");
			nuevo.setSueldoFijo(vendedor.getSueldoFijo());
		}
		
		else if (tipo.equals("C")) {
			nuevo = new VendedorComision(vendedor.getCedula(), "C");
			nuevo.setNumeroVentas(vendedor.getNumeroVentas());
			nuevo.setComisionPorVenta(vendedor.getComisionPorVenta());
		}
		
		else if (tipo.equals("M")) {
			nuevo = new VendedorMixto(vendedor.getCedula(), "M");
			nuevo.setSueldoFijo(vendedor.getSueldoFijo());
			nuevo.setNumeroVentas(vendedor.getNumeroVentas());
		}
		else {
			return null;
		}
		vendedores.add(nuevo);
		
		return nuevo;
	}
	
	public Double calcularSueldo(String cedula) {
		for (Vendedor v : vendedores) {
			if (v.getCedula().equals(cedula)) {
				return v.calcularSueldo();
			}
		}
		return null;
	}
	
	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}
	
}