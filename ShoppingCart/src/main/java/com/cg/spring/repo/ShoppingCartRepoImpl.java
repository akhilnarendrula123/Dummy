package com.cg.spring.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.spring.dto.Product;

@Repository("productrepo")
public class ShoppingCartRepoImpl implements IShoppingCartRepo {

	private static List<Product> list = null;
	static {
		list = new ArrayList<>();
		Product p1 = new Product("A101", "Iphone", "5S", 90000);
		Product p2 = new Product("A102", "Samsung", "Galaxy s", 60000);
		Product p3 = new Product("A103", "MI", "A1", 30000);
		Product p4 = new Product("A104", "oppo", "M1", 15000);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

	}

	@Override
	public List<Product> getAllProduct() {
		return list;
	}

	@Override
	public Product getProductById(String id) {
		Product search = null;
		for (Product product : list) {
			if (id.equals(product.getId())) {
				search = product;
			}
		}
		return search;
	}

	@Override
	public void addProduct(Product product) {
		list.add(product);
	}

	@Override
	public void UpdateProduct(String id, Product product) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				list.set(i, product);
			}
		}
	}

	@Override
	public void DeleteProduct(String id) {
		for (Product product : list) {
			if (id.equals(product.getId())) {
				list.remove(product);
			}
		}
	}

}
