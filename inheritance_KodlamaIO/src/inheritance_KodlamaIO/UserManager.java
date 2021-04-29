package inheritance_KodlamaIO;

public class UserManager {
	void add(User user) {
		System.out.println(user.getFirstName()+" sekt�re ho�geldin!");
	}
	
	void remove(User user) {
		System.out.println(user.getFirstName()+" Kullan�c� silindi");
	}
	
	void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
		
	}
}
