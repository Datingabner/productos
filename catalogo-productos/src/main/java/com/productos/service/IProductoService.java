package com.productos.service;

import java.util.List;
import java.util.Optional;

import com.productos.modelo.Productos;


public interface IProductoService {

	List<Productos> listarProductos();
	Optional<Productos> buscarProductoPorId(int id);
	Productos guardaProductos(Productos producto);
	Productos actualizarProducto(Productos producto);
	void eliminarProducto(int id);
}
