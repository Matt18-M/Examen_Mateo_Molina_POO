package com.krakedev.examen_mateo_molina;

import com.krakedev.examen_mateo_molina.entidades.Vendedor;
import com.krakedev.examen_mateo_molina.servicios.AdminVentas;

public class ProvocarNullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AdminVentas admin = new AdminVentas();
		Vendedor v = new Vendedor("015056","V");
		admin.agregar(v);
	}

}
