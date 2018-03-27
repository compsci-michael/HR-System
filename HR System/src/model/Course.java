package model;

/* This class will hold information about a specific Course */
public class Course {
	/* Variables */
	private String courseCode;
	private String courseName;
	private String school;
	
	/* Allowing objects to be instantiated as a course */
	public Course(String courseCode, String courseName, String school){
		setCourseCode(courseCode);
		setCourseName(courseName);
		setSchool(school);
	}

	/* Accessors */
	public String getCourseCode() {
		return courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getSchool() {
		return school;
	}
	
	/* Mutators */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
}
