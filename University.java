package studentenrollmentsystem;

import java.util.ArrayList;
import java.util.List;

public class University {
    private  final List<Student> students=new ArrayList<>();
    private  final List<Course> courses=new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void enrollStudentInCourse(Student student, Course course) {

        if (course.getStudents().size() < course.getCurrntMaxCapacity()) {
            course.enrollStudent(student);
            student.enrollCourse(course);
        } else {
            System.out.println("We Reach The Maximum Capacity Of Students");
        }

    }


    public void dropStudentFromCourse(Student student, Course course) {
        if (students.contains(student) && courses.contains(course)) {
            course.dropStudent(student);
            student.dropCourse(course);
            System.out.println("The Student Has been Dropped.");
        } else System.out.println("Error, Not Existed .");

    }

    public List<Course> getAvaliableCourses() {
        return courses;
    }


    public List<Course> getStudentAvalibaleCourses(Student student) {
        List<Course> TheStudentInCourse = new ArrayList<>();
        if (students.contains(student)){
            for (Course course : courses) {
                if (course.getStudents().contains(student)) {
                    TheStudentInCourse.add(course);
                }
            }}
        return TheStudentInCourse;
    }

public List<Student> getCourseStudents(Course course){

        List<Student> TheCourseStudentEnrolled = new ArrayList<>();
        if (courses.contains(course)){
            for (Student student :students){
                if (student.getCourse().contains(course)){
                    TheCourseStudentEnrolled.add(student);
                }
            }
        }
        return TheCourseStudentEnrolled;

}


}




























