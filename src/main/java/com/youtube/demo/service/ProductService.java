package com.youtube.demo.service;

import java.util.List;

import com.youtube.demo.model.Product;

public interface ProductService {

	/**
	 * Guarda un producto
	 * 
	 * @param product
	 * @return el producto guardado
	 */
	Product save(Product product);
	
	/**
	 * Recupera la lista de productos
	 * @return lista de productos
	 */
	List<Product> findAll();
	
	/**
	 * Recupera la lista de productos con el idStatus solicitados 
	 * (Activo, Inactivo, eliminado, Temporal)
	 * @return lista de productos con el idStatus solicitados 
	 */
	List<Product> findAllStatus(Integer idStatus);
	
	/**
	 * Elimina un producto con el id recibido
	 * 
	 * @param id
	 */
	void deleteProduct(Long id);
	
	/**
	 * Cambia el estatus (Activo, Inactivo, eliminado, Temporal) 
	 * de un producto con el id del producto recibido y el idStatus a cambiar
	 * 
	 * @param id
	 */	
	void changeStatusProduct(Long id, Integer idStatus);
}
