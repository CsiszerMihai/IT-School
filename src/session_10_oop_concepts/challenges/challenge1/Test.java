package session_10_oop_concepts.challenges.challenge1;

public class Test {
    public static void main(String[] args) {
        StudentManage studentManagement = new StudentManage();
        ProfessorManage professorManagement = new ProfessorManage();
        CourseManage courseManagement = new CourseManage();

        studentManagement.addStudent(new Students(1, "John", "Doe", 'M', 20, "2004-01-15", "1234567891234", "123 Elm Street"));
        studentManagement.addStudent(new Students(2, "Jane", "Smith", 'F', 21, "2003-02-20", "9876543211234", "456 Oak Avenue"));

        Professors prof1 = new Professors(1, "Dr. Alice", "Johnson", 'F', 45, "1979-03-10", "1122334451234", "789 Pine Road");
        professorManagement.addProfessor(prof1);

        Professors prof2 = new Professors(2, "Dr. Bob", "Williams", 'M', 50, "1974-04-22", "2233445561234", "101 Maple Drive");
        professorManagement.addProfessor(prof2);

        Course course1 = new Course(1, "Math", "MWF 9-10 AM", "1 semester", "Basic Mathematics", prof1);
        courseManagement.addCourse(course1);

        Course course2 = new Course(2, "Computer Science", "TTh 2-3:30 PM", "1 semester", "Introduction to Computer Science", prof2);
        courseManagement.addCourse(course2);

        courseManagement.assignProfessorToCourse(1, prof1);
        courseManagement.assignProfessorToCourse(2, prof2);

        System.out.println(courseManagement.getCourseDetails(1));
        System.out.println(courseManagement.getCourseDetails(2));
    }
}