package com.dxc.pms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(
			name = "findProductByName",
			query = "from Product p where p.productName = :prodName"
			)
})

@Entity
public class Product {

	@Id
	private int productId;
	@Column(name = "ProductName")
	private String productName;
	@Column(name = "Quantity")
	private int quantityOnHand;
	@Column
	private int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int quantityOnHand, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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
		return "\nProduct [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + quantityOnHand;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (price != other.price)
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (quantityOnHand != other.quantityOnHand)
			return false;
		return true;
	}

	
}
