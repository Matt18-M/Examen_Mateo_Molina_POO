package com.krakedev.examen_mateo_molina.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;

import com.krakedev.examen_mateo_molina.entidades.Vendedor;
import com.krakedev.examen_mateo_molina.servicios.AdminVentas;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {

    private final AdminVentas adminVentas;

    public VendedorController(AdminVentas adminVentas) {
        this.adminVentas = adminVentas;
    }

    @PostMapping
    public Vendedor agregar(@RequestBody Vendedor vendReq) {
        return adminVentas.agregar(vendReq);
    }

    @GetMapping("/{cedula}")
    public Double calcular(@PathVariable String cedula) {
        return adminVentas.calcularSueldo(cedula);
    }

    @GetMapping
    public ArrayList<Vendedor> listar() {
        return adminVentas.getVendedores();
    }

}