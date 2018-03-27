package view;

import model.Login;

/* The main method of the system */
public class HRSystemDriver {
	public static void main(String[] args) {
		/* Use this menu to run program */
		Menu menu = new Menu();
		menu.HelloWorld();
		
		/* Example of Useful Things to know */
		String[] field = {"Role","Username","Password"};
		String[][] data = new String[2][3];
		data[0][0] = "Admin";
		data[0][1] = "e12345";
		data[0][2] = "helloworld";
		data[1][0] = "Casual Staff";
		data[1][1] = "e12345";
		data[1][2] = "helloworld";
		
		/* Instantiating Objects */
		Login login = new Login(2, field, data);
		/*
		PayRate payrate = new PayRate(#, #, #);
		CS cs = new CS(#, #, #);
		FTS fts = new FTS(#, #, #);
		CourseReq cr = new CourseReq(#, #, #);
		*/
		
		System.out.println();
		/* Iterating through data */
		for(int i = 0; i<login.getFieldNames().length;i++){
			System.out.print(login.getFieldNames()[i]+" ");
		}
		System.out.println();
		/* Iterating through data 2 */
		for(int i=0; i<login.getNumOfRows();i++){
			for(int j=0; j<login.getFieldNames().length; j++){
				System.out.print(login.getData()[i][j]+" ");
			}
			System.out.println();
		}
		/* Do not remove this comment until we are ready to remove the stuff above! */
		// menu.exit(login, payrate, cs, fts, cr);
	}
}
