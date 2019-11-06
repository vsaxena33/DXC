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
		fail("Not yet implemented");
	}

	public void testGetAllProducts() {
		fail("Not yet implemented");
	}

	public void testAddProduct() {
		Product product = new Product(1000, "product", 1, 1);
		List<Product> allProducts1 = impl.getAllProducts();
		impl.addProduct(product);
		List<Product> allProducts2 = impl.getAllProducts();
		assertEquals(allProducts1.size() + 1, allProducts2.size());
	}

	public void testDeleteProduct() {

		List<Product> allProducts1 = impl.getAllProducts();
		impl.deleteProduct(1000);
		List<Product> allProducts2 = impl.getAllProducts();
		assertEquals(allProducts1.size() - 1, allProducts2.size());
	}

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
		boolean value = impl.isProductExists(10004);
		assertEquals(true, value);
		
	}

}
