package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import db.Connection;
import entity.Product;

public class ProductDAO {
	private SessionFactory factory ;
	
	public ProductDAO() {
		factory = Connection.getInstance().getSessionFactory();
	}
	
	public boolean addProduct(Product product) {
		Session session = factory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		try {
			transaction.begin();
			session.persist(product);
			transaction.commit();
			session.close();
		}catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}
	
	public Product find(int id) {
		Session session = factory.openSession();
		return session.find(Product.class, id);
	}
}
