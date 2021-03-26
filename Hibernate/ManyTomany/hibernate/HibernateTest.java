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
		user.getVehicle().add(vehicle);

		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehiclename("Vehicle 2");
		user.getVehicle().add(vehicle2);
		vehicle.getUserDetailsList().add(user);
		vehicle2.getUserDetailsList().add(user);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.save(vehicle2);
		session.getTransaction().commit();
		session.close();

	}
}
