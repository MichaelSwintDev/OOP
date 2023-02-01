import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster; // collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

	public ArrayList<Student> getDeansList() {
		ArrayList<Student> deans = new ArrayList<Student>();
		for (Student s : roster) {
			if (s.getGPA() >= 3.5) {
				deans.add(s);
			}
		}
		return deans;
	}

	public void addStudent(Student s) {
		roster.add(s);
	}
}