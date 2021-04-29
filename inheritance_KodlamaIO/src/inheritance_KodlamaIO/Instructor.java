package inheritance_KodlamaIO;

public class Instructor extends User{
	
	
	private Courses[] createdCourses;
	
	public  Instructor(int id, String FirstName, String LastName, String Email, String Password, Courses[] createdCourses) {
		super(id,FirstName,LastName,Email,Password);
		this.createdCourses = createdCourses;
	}
	
	public Courses[] getCreatedCourses() {
		return createdCourses;
	}
	
	public void setCreatedCourses(Courses[] createdCourses) {
		this.createdCourses = createdCourses;
	}
}
