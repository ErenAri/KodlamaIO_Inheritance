package inheritance_KodlamaIO;

public class UserManager {
	void add(User user) {
		System.out.println(user.getFirstName()+" sektöre hoþgeldin!");
	}
	
	void remove(User user) {
		System.out.println(user.getFirstName()+" Kullanýcý silindi");
	}
	
	void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
		
	}
}
