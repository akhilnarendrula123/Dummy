package com.cg.spring.dto;

public class Product {
	private String id;
	private String name;
	private String model;
	private int price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String id, String name, String model, int price) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
