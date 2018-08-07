package com.cg.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.dto.Product;
import com.cg.spring.service.IShoppingCartService;

@RestController
public class ProductController {

	@Autowired
	private IShoppingCartService service;

	@RequestMapping("/products")
	public List<Product> getAllProduct() {
		return service.getAllProduct();
	}

	/*
	 * @RequestMapping(value = "/id") public Product
	 * searchById(@RequestParam("id")String id) { return service.getProductById(id);
	 * 
	 * }//http://localhost:8082/id?id=A103
	 */
	@RequestMapping(value = "/products/{id}")
	public Product searchById(@PathVariable String id) {
		return service.getProductById(id);

	}

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public void addProduct(@RequestBody Product product) {
		service.addProduct(product);
	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable String id) {
		service.DeleteProduct(id);
	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
	public void UpdateProduct(@PathVariable String id, @RequestBody Product product) {
		service.UpdateProduct(id, product);
	}

}
