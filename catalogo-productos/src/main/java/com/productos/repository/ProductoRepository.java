package com.productos.repository;

import org.springframework.data.repository.CrudRepository;

import com.productos.modelo.Productos;

public interface ProductoRepository extends CrudRepository<Productos, Integer>{
/*
 * Este es el repositorio de productos que extiende de CrudRepository
 * permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre la entidad Productos.
 */
}
