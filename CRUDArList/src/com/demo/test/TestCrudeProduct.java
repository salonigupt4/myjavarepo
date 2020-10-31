package com.demo.test;

import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestCrudeProduct {

	public static void main(String[] args) {
		// 
		Scanner sc  = new Scanner(System.in);
		int choice = 0;
		ProductService productService = new ProductServiceImpl();
		do {
			System.out.println("1. add \n2.search\n3. display all\n4.delete\n5.Display By id \n6. modify qty\n7. exit");
			System.out.println("Enter Choice No. :");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				productService.addProduct();
				break;
			case 2:
				System.out.println("Enter id No. to Search:");
				int id = sc.nextInt();
				Product p = productService.searchByid(id);
				if(p != null) {
					System.out.println(p);
				}
				else {
					System.out.println("Not Found");
				}
				break;
			case 3:
				productService.displayAll();
				break;
			case 4:
				System.out.println("Enter id No. to delete:");
				int id1 = sc.nextInt();
				productService.deleteProduct(id1);
				break;
			case 5:
				System.out.println("Enter Product id - to display:");
				int id2 = sc.nextInt();
				Product p2 = productService.displayByid(id2);
				if(p2 != null) {
					System.out.println(p2);
				}
				else {
					System.out.println("Not Found");
				}
				
				break;
			/*
			 * case 6: System.out.println("Enter id to modify:"); int id3 = sc.nextInt();
			 * System.out.println("What do you want to modify \n 1. Name \n 2. Qty:");
			 * System.out.println("Enter Choice No. :"); int choice1 = sc.nextInt();
			 * if(choice ==1) { System.out.println("Enetr Required Name :"); String nm1 =
			 * sc.next(); Product p2 = productService.modifyByidName(id3,nm1); } else {
			 * System.out.println("Enetr Required Qty :"); int qty1 = sc.nextInt(); Product
			 * p2 = productService.modifyByidQty(id3,qty1); }
			 * 
			 * 
			 * if(p2 != null) { System.out.println(p2); } else {
			 * System.out.println("Not Found"); }
			 * 
			 * break;
			 */
				
			case 6:
				System.out.println("Enter id for Modification");
				int id4 = sc.nextInt();
				System.out.println("Enter modified name");
				String name4 = sc.next();
				System.out.println("Enter modified quantity");
				int qty4 = sc.nextInt();
				Product p4 = productService.modifyByid(id4,name4,qty4);
				if(p4 != null) {
					System.out.println("Modification Successfull");
				}
				else {
					System.out.println("Modification Failed : Invalid Id");
				}
				
				break;
				
			case 7:
				sc.close();
				System.exit(0);
				break;
			}
		}while(choice!=7);
		

	}

}
