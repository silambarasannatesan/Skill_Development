package org.siimbu.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.siimbu.java.dto.FourWheeler;
import org.siimbu.java.dto.TwoWheeler;
import org.siimbu.java.dto.Vehicle;

/**
 * @author silambarasan
 *
 */
public class HibernateTest {
	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.setVehiclename("Vehicle 1");

		TwoWheeler bike = new TwoWheeler();
		bike.setVehiclename("Bike");
		bike.setSteeringHandler("Bike Steering Handle");

		FourWheeler car = new FourWheeler();
		car.setVehiclename("Car");
		car.setSteeringWheel("Car Steering Handle");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		session.save(vehicle);
		session.save(bike);
		session.save(car);

		session.getTransaction().commit();
		session.close();

	}
}
