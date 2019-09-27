package oop;

public class Product {
	private String privateId;
	private String productName;
	private int quantityOnHand;
	private int price;
	
	public Product(String privateId, String productName, int quantityOnHand, int price) {
		super();
		this.privateId = privateId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}
	public Product() {
		// TODO Auto-generated constructor stub
		productName = "Product Name not available";
	}
	public String getPrivateId() {
		return privateId;
	}
	public void setPrivateId(String privateId) {
		this.privateId = privateId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [privateId=" + privateId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + "]";
	}

}
