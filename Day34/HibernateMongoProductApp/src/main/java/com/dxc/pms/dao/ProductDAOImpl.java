package com.dxc.pms.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dxc.pms.model.Product;
import com.dxc.pms.util.HibernateUtil;

public class ProductDAOImpl implements ProductDAO {
	
	SessionFactory sf = HibernateUtil.getSessionFactory();

	@Override
	public Product getProduct(int productId) {
		Session session = sf.openSession();
		Product product = (Product)session.get(Product.class, productId);
		return product;
	}

	@Override
	public List<Product> getAllProducts(String productName) {
		Session session = sf.openSession();
//		Query query = session.createQuery("from Product");
		Query query = session.getNamedQuery("findProductByName");
		query.setString("prodName", productName);
		return query.list();
	}

	@Override
	public void addProduct(Product product) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(product);
		transaction.commit();
		session.close();
		System.out.println(product.getProductName() + "saver successfully");
		
	}

	@Override
	public void deleteProduct(int productId) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Product product = new Product();
		product.setProductId(productId);
		session.delete(product);
		transaction.commit();
		session.close();
		
	}

	@Override
	public void updateProduct(Product newProduct) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
//		Product oldProduct = (Product)session.get(Product.class, newProduct.getProductId());
//		oldProduct.setProductName(newProduct.getProductName());
//		oldProduct.setQuantityOnHand(newProduct.getQuantityOnHand());
//		oldProduct.setPrice(newProduct.getPrice());
		session.update(newProduct);
		transaction.commit();
		session.close();
		
	}

	@Override
	public boolean isProductExists(int productId) {
		Session session = sf.openSession();
		Product product = (Product)session.get(Product.class, productId);
		if(product == null)
			return false;
		else
			return true;
	}

	@Override
	public List<String> getAllNames() {
		Session session = sf.openSession();
		Query query = session.createQuery("select productName from Product");
		List<String> pr = query.list();
		Iterator<String> iterator = pr.iterator();
		
		while(iterator.hasNext()) {
			String p = iterator.next();
			System.out.println(p);
		}
		return pr;
	}
	
}
