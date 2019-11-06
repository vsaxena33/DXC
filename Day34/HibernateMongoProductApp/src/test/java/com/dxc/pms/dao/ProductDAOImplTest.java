package com.dxc.pms.dao;

import java.util.List;

import com.dxc.pms.model.Product;

import junit.framework.TestCase;

public class ProductDAOImplTest extends TestCase {

	ProductDAOImpl impl;

	protected void setUp() throws Exception {
		impl = new ProductDAOImpl();
	}

	public void testGetProduct() {
		Product product = new Product(138951, "productName", 1, 1);
		impl.addProduct(product);
		Product product2 = impl.getProduct(138951);
		assertEquals(product, product2);
	}

	public void testGetAllProducts() {
//		List<Product> allProducts1 = impl.getAllProducts();
//		Product product1 = new Product(2001, "productName1", 1, 1);
//		impl.addProduct(product1);
//		Product product2 = new Product(2002, "productName2", 1, 1);
//		impl.addProduct(product2);
//		Product product3 = new Product(2003, "productName3", 1, 1);
//		impl.addProduct(product3);
//		List<Product> allProducts2 = impl.getAllProducts();
//		assertEquals(allProducts1.size() + 3, allProducts2.size());
		List<Product> pnames = impl.getAllProducts("prodName");
		System.out.println(pnames);
		assertEquals(pnames.size(), 2);
	}
//
//	public void testAddProduct() {
//		Product product = new Product(1000, "product", 1, 1);
//		List<Product> allProducts1 = impl.getAllProducts();
//		impl.addProduct(product);
//		List<Product> allProducts2 = impl.getAllProducts();
//		assertEquals(allProducts1.size() + 1, allProducts2.size());
//	}

//	public void testDeleteProduct() {
//
//		List<Product> allProducts1 = impl.getAllProducts();
//		impl.deleteProduct(1000);
//		List<Product> allProducts2 = impl.getAllProducts();
//		assertEquals(allProducts1.size() - 1, allProducts2.size());
//	}

	public void testUpdateProduct() {
		Product product = new Product(10003, "product", 1, 1);
		impl.addProduct(product);
		Product newProduct = new Product(10003, "NewProduct", 2, 3);
		impl.updateProduct(newProduct);
		assertNotSame(product, newProduct);
	}

	public void testIsProductExists() {
		Product product = new Product(10004, "product", 1, 1);
		impl.addProduct(product);
		boolean value = impl.isProductExists(1000 );
		assertEquals(true, value);
		
	}

//	public void testGetAllProductNames() {
//		List<Product> product = impl.getAllProducts();
//		List <String> pnames = impl.getAllNames();
//		assertEquals(pnames.size(), product.size());
//	}
	
}
