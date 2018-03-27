package view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import model.CS;
import model.CourseReq;
import model.FTS;
import model.Login;
import model.PayRate;
import model.Table;

/* This class is the entrance to the software. The role of each actor will 
 * determine the menu they recieve. With their menu they will have their own
 * useable functions accompanied by an exit method that will save all information
 * back into it's respected tabular form.
 */
public class Menu {
	public final String LOGIN_DATA = "login.txt";
	public final String PAYRATE_DATA = "pay_rate.txt";
	public final String CASUAL_STAFF_DATA = "casual_staff.txt";
	public final String FULL_TIME_STAFF_DATA = "full_time_staff.txt";
	public final String COURSE_REQ_DATA = "course_req.txt";
	/* login() */
	public void exit(Login login, PayRate payrate, CS cs, FTS fts, CourseReq cr){
		saveData(login, LOGIN_DATA);
		saveData(payrate, PAYRATE_DATA);
		saveData(cs, CASUAL_STAFF_DATA);
		saveData(fts, FULL_TIME_STAFF_DATA);
		saveData(cr, COURSE_REQ_DATA);
	}
	/* viewApplication() */
	/* viewCasualStaffInformation() */
	/* defineCourseRequirement()s */
	/* viewPayRate() */
	/* viewSchedule() */
	/* sendApplication() */
	/* viewCourseInformatio() */
	/* approveReqest() */
	/* editCourseRequirements() */
	/* maintainCasualStaffList() */
	/* maintainPayRateTable() */
	/* addRow() */
	/* deleteRow() */
	/* updateRow() */
	
	/* Saves the Login Object into the .txt file */
	public void saveData(Table object, String string){
		/* Writing to File */
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(new FileWriter(string));
			for(int i = 0; i<object.getFieldNames().length;i++){
				if(i==object.getFieldNames().length-1){
					outputStream.println(object.getFieldNames()[i]+"");
					break;
				}
				outputStream.print(object.getFieldNames()[i]+", ");
			}
			for(int i=0; i<object.getNumOfRows();i++){
				for(int j=0; j<object.getFieldNames().length; j++){
					if(j==object.getFieldNames().length-1){
						outputStream.print(object.getData()[i][j]);
					} else {
						outputStream.print(object.getData()[i][j]+", ");
					}
				}
				outputStream.println();
			}
		} catch (IOException e) {
			System.out.println("Error opening the file.");
			System.exit(0);
			// closing everything down		
		}  finally {
			// Closing output stream
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
	
	/* Just a Hello World */
	public void HelloWorld(){
		System.out.println("Hello World");
	}
}