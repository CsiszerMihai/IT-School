package session_10_oop_concepts.challenges.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private String name;
    private Sex sex;
    private int age;
    private String dateOfBirth;
    private String cnp;
    private Adress address;
    private List<Double> grades;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        this.grades = new ArrayList<>();
    }

    public List<Double> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }
    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentID +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", cnp='" + cnp + '\'' +
                ", address=" + address +
                ", grades=" + grades + + '\'' +
                ", grade average=" + calculateAverage() +
                '}';
    }
}