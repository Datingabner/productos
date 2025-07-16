package com.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productos.modelo.Productos;
import com.productos.service.ProductoServiceImpl;

@RestController
@RequestMapping("/api/produtos2")
public class ProductosController {
	@Autowired
	private ProductoServiceImpl productoService;

	// Aquí puedes agregar los endpoints para manejar las operaciones CRUD de
	// productos
	@GetMapping("/listar-productos")
	public List<Productos> listarProductos() {
		return productoService.listarProductos();
	}

}
