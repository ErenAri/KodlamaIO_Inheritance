package inheritance_KodlamaIO;

public class Courses {
	private int courseID;
	private String courseName;
	private String instructorName;
	private double price;
	private double rating;
	
	public void Course(int courseID,String courseName,String instructorName,double price,double rating) {
		this.courseID =courseID;
		this.courseName= courseName;
		this.instructorName = instructorName;
		this.price = price;
		this.rating = rating;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
}
