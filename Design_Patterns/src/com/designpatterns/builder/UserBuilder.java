package com.designpatterns.builder;

import com.designpatterns.builder.User;

public class UserBuilder {
	private final String firstName;
	private final String lastName;
	private int age;
	private String phone;
	private String address;

	public UserBuilder(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public UserBuilder age(int age) {
		this.age = age;
		return this;
	}

	public UserBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}

	public UserBuilder address(String address) {
		this.address = address;
		return this;
	}

	// Return the finally constructed User object
	public User build() {
		User user = new User(this);
		validateUserObject(user);
		return user;
	}

	private void validateUserObject(User user) {
		// Do some basic validations to check
		// if user object does not break any assumption of system
	}

	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Lokesh", "Gupta").age(30).phone("1234567").address("Fake address 1234")
				.build();

		System.out.println(user1);

		User user2 = new User.UserBuilder("Jack", "Reacher").age(40).phone("5655")
				// no address
				.build();

		System.out.println(user2);

		User user3 = new User.UserBuilder("Super", "Man")
				// No age
				// No phone
				// no address
				.build();

		System.out.println(user3);
	}
}