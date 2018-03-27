package model;

public abstract class Staff {
	/* Variables */
	private String staffID;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	
	/* Making inheritance possible */
	public Staff(String staffID, String firstName, String lastName, String address, String phoneNumber){
		setStaffID(staffID);
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setPhoneNumber(phoneNumber);
	}
	
	/* Accessors */
	public String getStaffID(){
		return staffID;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	/* Mutators */
	public void setStaffID(String staffID){
		this.staffID = staffID;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	
}
