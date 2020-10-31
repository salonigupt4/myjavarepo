package com.demo.dao;

import com.demo.bean.Product;

public interface ProductDao {
	void addProduct(Product p);

	Product searchByid(int id);
	
	void  displayAll();

	void delete(int id1);
	

	Product modifyByid(int id4, String name4, int qty4);

	Product displayByid(int id2);

}
