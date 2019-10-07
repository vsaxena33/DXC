package com.cms.vs.dao;

import java.util.List;

import com.cms.vs.model.Product;

public interface ProductDAO {
	public Product getProduct(int productId);
	public List<Product> getAllProducts();
	public void addProduct(Product product);
//	public void deleteProduct(int productId);
//	public void updateProduct(Product product);

}
