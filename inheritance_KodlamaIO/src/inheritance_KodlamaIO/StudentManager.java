package inheritance_KodlamaIO;

public class StudentManager extends UserManager{
	public void enrollCourse(Student student, Courses courses) {
		System.out.println(student.getFirstName()+" adl� ��renci "+courses.getCourseName()+" adl� kursa kaydoldu");
	}
	
	public void quitCourse(Student student,Courses courses) {
		System.out.println(student.getFirstName()+" adl� ��renci "+courses.getCourseName()+" adl� kursdan ��kt�");
	}
	
	public void giveScoreToCourse(Student student, Courses courses, double score) {
		System.out.println(student.getFirstName()+" adl� ��renci "+courses.getCourseName()+" adl� kursa "+score+ "puan verdi");
	}
}
