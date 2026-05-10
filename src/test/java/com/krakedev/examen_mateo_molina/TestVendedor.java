package com.krakedev.examen_mateo_molina;

import com.krakedev.examen_mateo_molina.entidades.Vendedor;

public class TestVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vendedor v = new Vendedor("015056");
		v.setSueldoFijo(450);
		
		System.out.println(v);
	}

}
