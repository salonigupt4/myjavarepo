package com.demo.service;

import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	private ProductDao productDao;
	
   public ProductServiceImpl() {
		productDao = new ProductDaoImpl();	
	}
   
	@Override
	public void addProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Id");
		int id = sc.nextInt();
		System.out.println("Enetr name");
		String name = sc.next();
		System.out.println("Enetr qty");
		int qty = sc.nextInt();
		Product p = new Product(id, name,qty);
		productDao.addProduct(p);
			
	}

	@Override
	public Product searchByid(int id) {
		
		return productDao.searchByid(id);
	}

	@Override
	public void displayAll() {
		productDao.displayAll();
	}
	@Override
	public void deleteProduct(int id1) {
		productDao.delete(id1);
	}

	@Override
	public Product modifyByid(int id4, String name4, int qty4) {
		return productDao.modifyByid(id4,name4,qty4);
		
	}
	@Override
	public Product displayByid(int id2) {
		return productDao.displayByid(id2);
	}

}
