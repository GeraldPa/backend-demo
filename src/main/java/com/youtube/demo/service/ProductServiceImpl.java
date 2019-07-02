package com.youtube.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.youtube.demo.dao.ProductRepository;
import com.youtube.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	protected ProductRepository productRepository;
	
	@Override
	public Product save(Product product) {
		return this.productRepository.save(product);
	}
	
	@Override
	public List<Product> findAll(){
		return this.productRepository.findAll();
	}
	
	@Override
	public void deleteProduct(Long id) {
		this.productRepository.deleteById(id);
	}

	@Override
	public List<Product> findAllStatus(Integer idStatus) {
		return this.productRepository.findAllStatus(idStatus);
	}	
	
	@Override
	public void changeStatusProduct(Long id, Integer idStatus) {
		this.productRepository.changeStatusProduct(id, idStatus);
	}
	
}
