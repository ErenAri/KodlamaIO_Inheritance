package inheritance_KodlamaIO;

public class InstructorManager extends UserManager{
	public void createCourse(Instructor instructor, Courses courses) {
		System.out.println("Sayýn "+instructor.getFirstName()+" yeni kursunuz oluþturuldu");
	}
	
	public void removeCourse(Instructor instructor, Courses courses) {
		System.out.println("Sayýn "+instructor.getFirstName()+"  kursunuz kaldýrýldý");
	}
}
