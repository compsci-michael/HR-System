package model;

/* A class to be used by the driver to allow access to the system */
public class Signin {
	/* Variables */
	private String username;
	private String password;
	
	public Signin(String username, String password){
		setUsername(username);
		setPassword(password);
	}

	/* Accessors */
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	/* Mutators */
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/* Method to check if the entered credentials are true */
	public Boolean verifyLogin(Login data[]){
		
		return false;
	}
	
	/* Use this method to decrypt passwords taken from the Login object
	 * Also use this when saving passwords of new staff (Other milestone) 
	 */
	public String caesarCipher(String password, int offset){
		String str = "";
		return str;
	}
}
