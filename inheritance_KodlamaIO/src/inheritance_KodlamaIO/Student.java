package inheritance_KodlamaIO;

public class Student extends User{
	
	private Courses[] enrolledCourses;

	public Student(int id, String FirstName, String LastName, String Email, String Password,Courses[] enrolledCourses) {
		super(id, FirstName, LastName, Email, Password);
		this.enrolledCourses = enrolledCourses;
	}

	public Courses[] getEnrolledCourses() {
		return enrolledCourses;
	}

	public void setEnrolledCourses(Courses[] enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
	
}
