package app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import dao.OrderDAO;
import dao.OrderDetailDAO;
import dao.ProductDAO;
import db.Connection;
import entity.Order;
import entity.OrderDetail;
import entity.Product;
import jakarta.transaction.Transaction;

public class Main {
	public static void main(String[] args) {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(registry)
				.addAnnotatedClass(entity2.Order.class)
				.addAnnotatedClass(entity2.Product.class)
				.getMetadataBuilder()
				.build();
		SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		System.out.println("done!");
//		Session session = factory.getCurrentSession();
		
//		OrderDAO dao = new OrderDAO();
//		Order order = new Order(new Date());
//		dao.addOrder(order);
//		Order order = dao.findOrder(1);
//		System.out.println(order.toString());
		
//		ProductDAO daProductDAO = new ProductDAO();
//		Product product = new Product("Coca", 10000);
//		daProductDAO.addProduct(product);
//		Product product = daProductDAO.find(1);
//		System.out.println(product.toString());
		
//		OrderDetailDAO dao2 = new OrderDetailDAO();
//		OrderDetail detail = new OrderDetail(order, product, 3);
//		dao2.addOrderDetail(detail);
//		OrderDetail detail = dao2.find(1,1);
//		System.out.println(detail.getProduct().getName());
		
	}
}