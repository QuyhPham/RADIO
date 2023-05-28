package ServiceClient;

public class Users {
	String username;
	int ID;
	
	public Users() {
		username = null;
	}
	

	public Users(String username, int iD) {
		
		this.username = username;
		ID = iD;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}
	
	

}
