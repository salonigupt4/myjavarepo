package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Product;

public class ProductDaoImpl implements ProductDao{
    static List<Product> plist = new ArrayList<>();;

    
	@Override
	public void addProduct(Product p) {
		plist.add(p);
		
	}

	@Override
	public Product searchByid(int id) {
		int pos=plist.indexOf(new Product(id,null,0));
		if(pos!=-1) {
		return plist.get(pos);
		}
		return null;
	}

	@Override
	public void displayAll() {
		for(int i = 0; i<plist.size(); i++) {
			System.out.println(plist.get(i));
		}
	}

	@Override
	public void delete(int id1) {
		plist.remove(id1);
		
	}

	@Override
	public Product modifyByid(int id4, String name4, int qty4) {
		int pos=plist.indexOf(new Product(id4,name4,qty4));
		if(pos!=-1) {
			plist.get(id4).setName(name4);
			plist.get(id4).setQty(qty4);
			return plist.get(pos);
		}
		return null;
		
	}

	@Override
	public Product displayByid(int id2) {
		// TODO Auto-generated method stub
		return searchByid(id2);
	}
    
}
