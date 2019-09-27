package oop;

public class MainProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product();
		
		System.out.println(product1.getProductName());
		
		Product product[] = new Product[5];
		for (int i = 0; i < product.length; i++) {
			product[i] = new Product();
		}
		System.out.println(product[4].getProductName());
	}

}
