package com.demo.service;

import com.demo.bean.Product;

public interface ProductService {

	void addProduct();

	Product searchByid(int id);

	void displayAll();

	void deleteProduct(int id1);

	Product modifyByid(int id4, String name4, int qty4);

	Product displayByid(int id2);
	
}
