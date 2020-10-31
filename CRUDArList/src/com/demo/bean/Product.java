package com.demo.bean;

public class Product {
	private int id;
	private String name;
	private int qty;
	
	    //Default Constructor
		public Product() {
			super();
		}
		
		//Parameterized Constructor
		public Product(int id, String name, int qty) {
			super();
			this.id = id;
			this.name = name;
			this.qty = qty;
		}
		
		//setter getter method
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		
		//equals
		
		@Override
		public boolean equals(Object ob) {
			if(id ==((Product)ob).id) {
				return true;
			}
			else 
				return false;
		}
		//ToString
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", qty=" + qty + "]";
		}
	
	
}
