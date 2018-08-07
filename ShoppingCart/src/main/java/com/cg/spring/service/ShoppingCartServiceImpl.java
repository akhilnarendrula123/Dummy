package com.cg.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.spring.dto.Product;
import com.cg.spring.repo.IShoppingCartRepo;
import com.cg.spring.repo.ShoppingCartRepoImpl;

@Service("productservice")
public class ShoppingCartServiceImpl implements IShoppingCartService {

	@Autowired
	private IShoppingCartRepo dao;

	@Override
	public List<Product> getAllProduct() {
		return dao.getAllProduct();
	}

	@Override
	public Product getProductById(String id) {

		return dao.getProductById(id);
	}

	@Override
	public void addProduct(Product product) {
		dao.addProduct(product);
	}

	@Override
	public void UpdateProduct(String id, Product product) {
		dao.UpdateProduct(id, product);

	}

	@Override
	public void DeleteProduct(String id) {
		dao.DeleteProduct(id);
	}

}
