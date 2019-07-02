package com.youtube.demo.dao;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.youtube.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

	@SuppressWarnings("unchecked")
	Product save(Product product);
	
	//@Query(value = "select * from Product where id_status = 1", nativeQuery = true)
	@Query("select u from Product u where u.idStatus = ?1")	
	List<Product> findAllStatus(Integer idStatus);
	
	@Modifying
	@Transactional
	@Query("update Product u set u.idStatus = ?2 where u.id = ?1")
	void changeStatusProduct(Long id, Integer idStatus);
}
