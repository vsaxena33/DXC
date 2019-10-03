package com.cms.vs.dao;

import java.util.ArrayList;
import java.util.List;

import com.cms.vs.model.Product;

public class ProductDAOImpl implements ProductDAO {

	public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	List<Product> allProducts = new ArrayList<Product>();
	
	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return allProducts;
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		allProducts.add(product);
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub

	}

}
