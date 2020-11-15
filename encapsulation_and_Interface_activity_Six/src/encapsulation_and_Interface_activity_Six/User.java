package encapsulation_and_Interface_activity_Six;

public class User {
	
	
	
	private String name;
	private String login;
	private String passworld;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.toUpperCase();
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login.toLowerCase();
	}
	public String getPassworld() {
		return passworld;
	}
	public void setPassworld(String passworld) {
		
		if(passworld.length() < 17)
			this.passworld = passworld;
		else 
			System.out.println("invalid password try again");
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", login=" + login + ", passworld=" + passworld + "]";
	}
	
	

}
