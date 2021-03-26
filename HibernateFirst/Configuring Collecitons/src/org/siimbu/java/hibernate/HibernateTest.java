package org.siimbu.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.siimbu.java.dto.Address;
import org.siimbu.java.dto.UserDetails;

/**
 * @author silambarasan
 *
 */
public class HibernateTest {
	public static void main(String[] args) {

		UserDetails user = new UserDetails();
		user.setUserName("First User");

		Address addr1 = new Address();
		addr1.setStreet("First Name");
		addr1.setCity("City Name");
		addr1.setState("First State");
		addr1.setPincode("560043");

		Address addr2 = new Address();
		addr2.setStreet("Second Street");
		addr2.setCity("Second City");
		addr2.setState("Second State");
		addr2.setPincode("120002");

		user.getListOfAddresses().add(addr1);
		user.getListOfAddresses().add(addr2);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();

	}
}
