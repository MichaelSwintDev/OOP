import java.util.ArrayList;

public class Course {

    private final ArrayList<Student> roster;  //collection of Student objects

    public Course() {
        roster = new ArrayList<Student>();
    }

    public int countHonors() {
       // code here
        int honors = 0;
        for (Student s: roster) {
            if(s.getGPA() >= 3.0){
                honors++;
            }
        }
        return honors;
    }
    public void addStudent(Student s) {
        roster.add(s);
    }
}