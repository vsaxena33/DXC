package assignment;

import java.util.Scanner;

public class GetProduct {
	
	static Scanner scan = new Scanner(System.in);
	
	int productId;
	String productName;
	int quantity;
	int price;

	public GetProduct(int productId, String productName, int quantity, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	@Override
	public String toString() {
		return "GetProduct [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetProduct product[] = new GetProduct[5];
		product[0] = new GetProduct(1, "xyz", 100, 10);
		product[1] = new GetProduct(2, "xyz", 100, 10);
		product[2] = new GetProduct(3, "xyz", 100, 10);
		product[3] = new GetProduct(4, "xyz", 100, 10);
		product[4] = new GetProduct(5, "xyz", 100, 10);
		int checkProduct = scan.nextInt();
		int i = 0;
		do {
			if (product[i].productId == checkProduct) {
				System.out.println(product[i].toString());
				break;
			}
			i++;
		} while (i < product.length);
		if (i == 5) {
			System.out.println("Product not found");
		}
	}

}
