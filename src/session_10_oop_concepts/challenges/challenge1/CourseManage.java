package session_10_oop_concepts.challenges.challenge1;

import java.util.ArrayList;
import java.util.List;

public class CourseManage {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course getCourse(int courseId) {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                return course;
            }
        }
        return null;
    }

    public void updateCourse(Course updatedCourse) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId() == updatedCourse.getCourseId()) {
                courses.set(i, updatedCourse);
                break;
            }
        }
    }

    public void deleteCourse(int courseId) {
        courses.removeIf(course -> course.getCourseId() == courseId);
    }

    public List<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }

    public void assignProfessorToCourse(int courseId, Professors professor) {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                course.setAssignedProfessor(professor);
                break;
            }
        }
    }

    public String getCourseDetails(int courseId) {
        Course course = getCourse(courseId);
        if (course != null) {
            Professors professor = course.getAssignedProfessor();
            return "Course: " + course.getCourseName() + "\n"
                    + "Schedule: " + course.getSchedule() + "\n"
                    + "Duration: " + course.getDuration() + "\n"
                    + "Description: " + course.getDescription() + "\n"
                    + "Assigned Professor: " + professor.getFirstName() + " " + professor.getLastName();
        }
        return "Course not found.";
    }
}