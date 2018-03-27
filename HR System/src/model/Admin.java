package model;

/* This is a class dedicated to instantiating an Admin to do work on the system */
public class Admin extends Staff{
	public Admin(String staffID, String firstName, String lastName, String address, String phoneNumber) {
		super(staffID, firstName, lastName, address, phoneNumber);
	}
}
