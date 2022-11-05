package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import db.Connection;
import entity.OrderDetail;

public class OrderDetailDAO {
	
	private SessionFactory  factory;
	
	public OrderDetailDAO() {
		factory = Connection.getInstance().getSessionFactory();
	}
	
	public boolean addOrderDetail(OrderDetail detail) {
		Session session = factory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		try {
			transaction.begin();
			session.saveOrUpdate(detail);
			transaction.commit();
		}catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}
	
	public OrderDetail find(int orderId, int productId) {
		Session session = factory.openSession();
		return session.createNativeQuery("select * from order_detail where order_id = :order_id and product_id = :product_id",OrderDetail.class)
				.setParameter("order_id",orderId)
				.setParameter("product_id",productId)
				.getSingleResultOrNull();
	}
	
}
