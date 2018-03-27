package model;

/* This class is a transaction class between the Casual Staff and Approver*/
public class Request {
	/* Variables */
	private String staffID;
	private Boolean isApproved;
	
	/* Allowing Requests to be made by Casual Staff */
	public Request(String staffID, Boolean isApproved){
		setStaffID(staffID);
		setIsApproved(isApproved);
	}

	/* Accessors */
	public String getStaffID() {
		return staffID;
	}

	public Boolean getIsApproved() {
		return isApproved;
	}

	/* Mutators */
	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}
	
}
