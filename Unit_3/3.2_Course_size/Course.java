import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster;  //collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

	public int courseSize() {
		return roster.size();
	}
	
	public void addStudent(Student s) {
		roster.add(s);
	}
}