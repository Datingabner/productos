package com.productos.repository;

import org.springframework.data.repository.CrudRepository;

import com.productos.modelo.Productos;

public interface ProductoRepository extends CrudRepository<Productos, Integer>{

}
