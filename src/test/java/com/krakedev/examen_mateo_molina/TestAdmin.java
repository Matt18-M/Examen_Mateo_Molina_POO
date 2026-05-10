package com.krakedev.examen_mateo_molina;

import com.krakedev.examen_mateo_molina.entidades.Vendedor;
import com.krakedev.examen_mateo_molina.entidades.VendedorComision;
import com.krakedev.examen_mateo_molina.entidades.VendedorMixto;
import com.krakedev.examen_mateo_molina.servicios.AdminVentas;

public class TestAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminVentas admin = new AdminVentas();
		
		 Vendedor v1 = new Vendedor("11111");
	        v1.setSueldoFijo(650);
	        v1.setNumeroVentas(3);
	        v1.setComisionPorVenta(50);

	        VendedorComision v2 = new VendedorComision("22222");
	        v2.setComisionPorVenta(150);
	        v2.setNumeroVentas(10);

	        VendedorMixto v3 = new VendedorMixto("33333");
	        v3.setSueldoFijo(700);
	        v3.setNumeroVentas(7);	
		
	        
	        admin.agregar(v1);
	        admin.agregar(v2);
	        admin.agregar(v3);
	        
	        
	        System.out.println("Sueldo v1: " + admin.calcularSueldo("11111"));
	        System.out.println("Sueldo v2: " + admin.calcularSueldo("22222"));
	        System.out.println("Sueldo v3: " + admin.calcularSueldo("33333"));
	        
	        
	        System.out.println("Sueldo cedula inexistente: " + admin.calcularSueldo("111111111"));
	        
		
	}

}
