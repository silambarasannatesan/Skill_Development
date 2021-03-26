package org.siimbu.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.siimbu.java.dto.UserDetails;
import org.siimbu.java.dto.Vehicle;

/**
 * @author silambarasan
 *
 */
public class HibernateTest {
	public static void main(String[] args) {
 
		UserDetails user = new UserDetails();
		user.setUserName("First User");

		Vehicle vehicle = new Vehicle();
		vehicle.setVehiclename("Vehicle 1");
		user.setVehicle(vehicle);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.getTransaction().commit();
		session.close();

	}
}
