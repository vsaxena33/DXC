package assignment;

import java.util.Scanner;

public class Product {
	Scanner scan = new Scanner(System.in);
	static int productId;
	static String productName;
	static int quantity;
	static int price;
	
	public void input() {
		System.out.println("Please enter product ID: ");
		productId = scan.nextInt();
		System.out.println("Please enter product Name: ");
		productName = scan.next();
		System.out.println("Please enter quantity: ");
		quantity = scan.nextInt();
		System.out.println("Please enter price: ");
		price = scan.nextInt();
	}

	public Product(int productId, String productName, int quantity, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product[] = new Product[1];
		for (int i = 0; i < product.length; i++) {
			product[i] = new Product(productId, productName, quantity, price);
			product[i].input();
			if (productId < 0 || quantity < 0 || price < 0) {
				System.out.println("Enter positive number!");
				product[i].input();
			}
			else {
				continue;
			}
		}
		for (int j = 0; j < product.length; j++) {
			System.out.println(product[j].toString());
		}

	}

}
