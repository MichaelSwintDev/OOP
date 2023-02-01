import java.util.ArrayList;


public class Course {

    private ArrayList<Student> roster; //collection of Student objects

    public Course() {
        roster = new ArrayList<Student>();
    }

    public void dropStudent(String last) {
        for(Student s: roster){
            if(s.getLast().equals(last)){
                roster.remove(s);
                break;
            }
        }
    }

    public void addStudent(Student s) {
        roster.add(s);
    }

    public int countStudents() {
        return roster.size();
    }
}