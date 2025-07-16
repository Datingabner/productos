package com.productos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productos.modelo.Productos;
import com.productos.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<Productos> listarProductos() {
		return (List<Productos>) productoRepository.findAll();
	}

	@Override
	public Optional<Productos> buscarProductoPorId(int id) {
		return productoRepository.findById(id);
	}

	@Override
	public Productos guardaProductos(Productos producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Productos actualizarProducto(Productos producto) {
		return productoRepository.save(producto);
	}

	@Override
	public void eliminarProducto(int id) {
		productoRepository.deleteById(id);
	}

}
