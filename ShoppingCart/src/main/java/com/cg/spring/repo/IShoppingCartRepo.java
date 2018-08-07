package com.cg.spring.repo;

import java.util.List;

import com.cg.spring.dto.Product;

public interface IShoppingCartRepo {

	public List<Product> getAllProduct();

	public Product getProductById(String id);

	public void addProduct(Product product);

	public void UpdateProduct(String id,Product product);

	public void DeleteProduct(String id);

}
