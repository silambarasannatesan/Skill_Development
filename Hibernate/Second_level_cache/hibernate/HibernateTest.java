package org.siimbu.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.siimbu.java.dto.UserDetails;

/**
 * @author silambarasan
 *
 */
public class HibernateTest {
	public static void main(String[] args) {
		UserDetails userDetails = new UserDetails();
		userDetails.setUserName("Test User");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();

//		session.save(userDetails);

		session.getTransaction().commit();
		session.close();

	}
}
