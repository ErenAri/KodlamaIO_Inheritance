package inheritance_KodlamaIO;

public class User {
	private int id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	

	public  User(int id, String FirstName, String LastName, String Email, String Password) {
		this.id=id;
		this.FirstName =FirstName;
		this.LastName = LastName;
		this.Email =Email;
		this.Password =Password;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
