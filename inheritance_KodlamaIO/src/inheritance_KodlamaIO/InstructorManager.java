package inheritance_KodlamaIO;

public class InstructorManager extends UserManager{
	public void createCourse(Instructor instructor, Courses courses) {
		System.out.println("Say�n "+instructor.getFirstName()+" yeni kursunuz olu�turuldu");
	}
	
	public void removeCourse(Instructor instructor, Courses courses) {
		System.out.println("Say�n "+instructor.getFirstName()+"  kursunuz kald�r�ld�");
	}
}
