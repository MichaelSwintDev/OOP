public class LabProgram {
    public static void main(String[] args) {
        Course course = new Course();
        int honorsCount;

        // Example students for testing
        course.addStudent(new Student("Henry", "Cabot", 3.2));
        course.addStudent(new Student("Brenda", "Stern", 2.9));
        course.addStudent(new Student("Lynda", "Robison", 3.6));
        course.addStudent(new Student("Jane", "Flynn", 1.8));

        honorsCount = course.countHonors();
        System.out.println("Honors count: " + honorsCount);
    }
}