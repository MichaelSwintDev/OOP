import java.util.ArrayList;

public class Course {

    private ArrayList<Student> roster; //collection of Student objects

    public Course() {
        roster = new ArrayList<Student>();
    }

    public Student findStudentHighestGpa() {
        double max = 0.0;
        Student highest = null;
        for(Student s: roster){
            if(s.getGPA() > max){
                max = s.getGPA();
                highest = s;
            }
        }
        return highest;
    }

    public void addStudent(Student s) {
        roster.add(s);
    }
}