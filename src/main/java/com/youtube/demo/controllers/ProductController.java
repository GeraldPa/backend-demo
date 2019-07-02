package com.youtube.demo.controllers;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
//import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.youtube.demo.model.Product;
import com.youtube.demo.service.ProductService;
import com.youtube.demo.util.RestResponse;

@RestController
public class ProductController {

	@Autowired
	protected ProductService productService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value="/saveOrUpdateProduct", method= RequestMethod.POST)
	public RestResponse saveOrUpdateProduct(@RequestBody String productJson) 
			throws JsonParseException, JsonMappingException, IOException {
		
		this.mapper = new ObjectMapper();
		
		Product product = this.mapper.readValue(productJson, Product.class);
		
		if(!this.validate(product)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), 
					"Los campos obligatorios no estan diligenciados");
		}
		
		this.productService.save(product);
		
		return new RestResponse(HttpStatus.OK.value(), "Operacion Existosa");
	}
	
	private boolean validate(Product product) {
		boolean isValid = true;
		
		if(StringUtils.trimToNull(Integer.toString(product.getIdStatus())) == null) {
			isValid = false;
		}
		else if(StringUtils.trimToNull(Integer.toString(product.getIdFamily())) == null) {
			isValid = false;
		}
		else if(StringUtils.trimToNull(product.getName()) == null) {
			isValid = false;
		}
		else if(StringUtils.trimToNull(Double.toString(product.getPrice()))  == null){
			isValid = false;
		}
		else if(StringUtils.trimToNull(Double.toString(product.getIva()))  == null){
			isValid = false;
		}
		else if(StringUtils.trimToNull(Double.toString(product.getTotal()))  == null){
			isValid = false;
		}
		else if(StringUtils.trimToNull(product.getCreated_at().toString()) == null) {
			isValid = false;
		}
		
		return isValid;
	}

	@RequestMapping(value="/getProducts", method= RequestMethod.GET)
	public List<Product> getProducts() {
		
		return this.productService.findAll();
		
	}
	
	@RequestMapping(value="/getProductActivo", method= RequestMethod.GET)
	public List<Product> getProductActivo() {
		
		return this.productService.findAllStatus(1);
		
	}	

	@RequestMapping(value="/deleteProduct", method= RequestMethod.POST)
	public void deleteProduct(@RequestBody String productJson) throws Exception {
		
		this.mapper = new ObjectMapper();
		
		Product product = this.mapper.readValue(productJson, Product.class);
		
		if(product.getId() == null) {
			throw new Exception("El id esta Nulo");
		}
		
		this.productService.deleteProduct(product.getId());
	}

	@RequestMapping(value="/deleteProductChangeStatus", method= RequestMethod.POST)
	public void deleteProductChangeStatus(@RequestBody String productJson) throws Exception{
		
		this.mapper = new ObjectMapper();
		
		Product product = this.mapper.readValue(productJson, Product.class);
		
		if(product.getId() == null) {
			throw new Exception("El id esta Nulo");
		}
		
		this.productService.changeStatusProduct(product.getId(), 3);
	}		
}
