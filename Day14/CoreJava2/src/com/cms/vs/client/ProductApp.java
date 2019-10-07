package com.cms.vs.client;

import java.util.Scanner;

import com.cms.vs.dao.ProductDAO;
import com.cms.vs.dao.ProductDAOImpl;
import com.cms.vs.model.Product;

public class ProductApp {
	ProductDAO productDAO;
	int choise = 0;
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	Scanner scanner = new Scanner(System.in);

	public ProductApp() {
		// TODO Auto-generated constructor stub
		this.productDAO = new ProductDAOImpl();
	}
	public void launchProductApp() {
		ProductDAO productDAO = new ProductDAOImpl();
		while (true) {
			System.out.println("M.E.N.U");
			System.out.println("1. Add the product");
			System.out.println("2. Get all the product");
			System.out.println("3. Search product");
			System.out.println("4. Delete product");
			System.out.println("5. Update product");
			System.out.println("6. E X I T");
			int choice = 0;
			System.out.println("Please enter your choice: (1-6)");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Product product = takeProductInput();
				productDAO.addProduct(product);
				break;
			case 2:
                System.out.println(productDAO.getAllProducts());
                break;
			case 3:
				System.out.println("Please enter product id to search: ");
				productId = scanner.nextInt();
				Product searchProduct = productDAO.getProduct(productId);
				System.out.println(searchProduct);
				break;
//			case 4:
//				System.out.println("Please enter product id to delete: ");
//				productId = scanner.nextInt();
//				productDAO.deleteProduct(productId);
//				System.out.println("Product deleted successfully");
//				break;
//			case 5:
//				System.out.println("Welcome to product app");
//				Product productToUpdate = takeProductInput();
//				productDAO.updateProduct(productToUpdate);
//				System.out.println("Your product update successfully");
//				break;
            case 6:
                System.out.println("Thanks for using my app");
                System.exit(0);
			default:
				System.out.println("R U drunk milk. Please enter (1-3)");
			}
		}

	}
	private Product takeProductInput() {
		System.out.println("Please enter product id: ");
		productId = scanner.nextInt();
		System.out.println("Please enter product Name: ");
		String productName = scanner.next();
		System.out.println("Please enter product quantity: ");
		quantityOnHand = scanner.nextInt();
		System.out.println("Please enter product price: ");
		price = scanner.nextInt();
		Product product = new Product(productId, productName, quantityOnHand, price);
		return product;
	}

}
