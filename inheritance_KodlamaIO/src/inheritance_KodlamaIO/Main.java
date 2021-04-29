package inheritance_KodlamaIO;

public class Main {

	public static void main(String[] args) {
			Courses course1 = new Courses();
			course1.setCourseID(1);
			course1.setCourseName("C# Kursu");
			course1.setInstructorName("Engin Demiroğ");
			course1.setPrice(55);
			course1.setRating(4.6);
			
			Courses[] createCourses= {course1};
			
			Instructor EnginDemirog = new Instructor(1,"Engin","Demiroğ","engin@gmail.com","1234",createCourses);
			
			System.out.println(EnginDemirog.getFirstName());
			
			
			InstructorManager instructorManager = new InstructorManager();
			instructorManager.add(EnginDemirog);
			instructorManager.createCourse(EnginDemirog, course1);
			
			Courses[] enrolledCourses = {course1};
			
			Student student1 = new Student(1,"Eren","Arı","erenari@gmail.com","5678",enrolledCourses);
			System.out.println(student1.getFirstName());
			
			StudentManager studentManager = new StudentManager();
			studentManager.add(student1);
			studentManager.remove(student1);
			
			
			
	}

}
