package com.cms.vs.client;

import java.util.Scanner;

import com.cms.vs.dao.ProductDAO;
import com.cms.vs.dao.ProductDAOImpl;
import com.cms.vs.model.Product;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDAO productDAO = new ProductDAOImpl();
		while (true) {
			System.out.println("M.E.N.U");
			System.out.println("1. Add the product");
			System.out.println("2. Get all the product");
			System.out.println("3. E X I T");
			Scanner scanner = new Scanner(System.in);
			int choice = 0;
			System.out.println("Please enter your choice: (1-3)");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Please enter product id: ");
				int productId = scanner.nextInt();
				System.out.println("Please enter product Name: ");
				String productName = scanner.next();
				System.out.println("Please enter product quantity: ");
				int quantityOnHand = scanner.nextInt();
				System.out.println("Please enter product price: ");
				int price = scanner.nextInt();
				Product product = new Product(productId, productName, quantityOnHand, price);
				ProductDAO.addProduct(product);
				break;
			case 2:
                System.out.println(productDAO.getAllProducts());
                break;
            case 3:
                System.out.println("Thanks for using my app");
                System.exit(0);
			default:
				System.out.println("R U drunk milk. Please enter (1-3)");
			}
		}

	}

}
