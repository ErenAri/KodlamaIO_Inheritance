package inheritance_KodlamaIO;

public class StudentManager extends UserManager{
	public void enrollCourse(Student student, Courses courses) {
		System.out.println(student.getFirstName()+" adlı öğrenci "+courses.getCourseName()+" adlı kursa kaydoldu");
	}
	
	public void quitCourse(Student student,Courses courses) {
		System.out.println(student.getFirstName()+" adlı öğrenci "+courses.getCourseName()+" adlı kursdan çıktı");
	}
	
	public void giveScoreToCourse(Student student, Courses courses, double score) {
		System.out.println(student.getFirstName()+" adlı öğrenci "+courses.getCourseName()+" adlı kursa "+score+ "puan verdi");
	}
}
