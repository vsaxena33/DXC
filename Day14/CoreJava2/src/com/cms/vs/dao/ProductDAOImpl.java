package com.cms.vs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cms.vs.dbconnection.DBConnection;
import com.cms.vs.model.Product;

public class ProductDAOImpl implements ProductDAO {

	
	Connection connection = DBConnection.getConnection();
	private static final String FETCH_PRODUCT_ALL = "select * from product";
	public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product getProduct(int productId) {
		Product product = new Product();
		try {
			// TODO Auto-generated method stub
			//		Product product = allProducts.
			//				parallelStream().filter(n -> n.getProductId() == productId).findFirst().get();
			PreparedStatement statement = connection.prepareStatement("select * from product where productId = ?");
			statement.setInt(1, productId);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			product.setProductId(resultSet.getInt(1));
			product.setProductName(resultSet.getString(2));
			product.setQuantityOnHand(resultSet.getInt(3));
			product.setPrice(resultSet.getInt(4));
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> allProducts = new ArrayList<Product>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSets = statement.executeQuery(FETCH_PRODUCT_ALL);
			while(resultSets.next()) {
				Product product = new Product();
				product.setProductId(resultSets.getInt(1));
				product.setProductName(resultSets.getString(2));
				product.setQuantityOnHand(resultSets.getInt(3));
				product.setPrice(resultSets.getInt(4));
				allProducts.add(product);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return allProducts;
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
//		allProducts.add(product);
		try {
			PreparedStatement preparedStatement = 
					connection.prepareStatement("insert into product values (?,?,?,?)");
			preparedStatement.setInt(1, product.getProductId());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setInt(3, product.getQuantityOnHand());
			preparedStatement.setInt(4, product.getPrice());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

//	@Override
//	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
//		allProducts.removeIf(g -> g.getProductId() == productId);

//	}

//	@Override
//	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < allProducts.size(); i++) {
//			if(product.getProductId() == allProducts.get(i).getProductId()) {
//				allProducts.set(i, product);
//			}
//		}

//	}

}
