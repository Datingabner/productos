package com.productos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productos.modelo.Productos;
import com.productos.service.ProductoServiceImpl;
import org.springframework.web.bind.annotation.PutMapping;


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
	
	@GetMapping("/producto/{id}")
	public ResponseEntity<Productos> obtenerProductoPorId(@PathVariable int id) {
		Optional<Productos> producto = productoService.buscarProductoPorId(id);
		if(producto.isPresent()&&producto.get().getId()>0) {
			return ResponseEntity.ok(producto.get());
		}else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@PostMapping("/crear-producto")
	public ResponseEntity<Productos> crearProducto(@RequestBody Productos producto) {
		producto = productoService.guardaProductos(producto);
		return new ResponseEntity<>(producto,HttpStatus.CREATED);
	}
	
	@PutMapping("actualizar/{id}")
	public ResponseEntity<Productos> actualizarProductoById(@PathVariable int id, @RequestBody Productos producto){
		producto.setId(id);
		if(producto.getId()>0&&productoService.buscarProductoPorId(id).isPresent()) {
			producto=productoService.guardaProductos(producto);
			return new ResponseEntity<>(producto, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminarProducto(@PathVariable int id) {
		Optional<Productos> producto = productoService.buscarProductoPorId(id);
		if (producto.isPresent() && producto.get().getId() > 0) {
			productoService.eliminarProducto(id);
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
