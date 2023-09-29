package studentenrollmentsystem;

import java.util.List;

public class Student {
    private int studentID;
    private String studentName;
    private String studentEmail;
    private List<Course> enrollCourses;

    public Student(int studentID,String studentEmail,String studentName,List<Course> enrollCourses){
        this.studentID=studentID;
        this.studentName=studentName;
        this.studentEmail=studentEmail;
        this.enrollCourses=enrollCourses;
    }
    public List<Course>  getCourse(){
        return enrollCourses;
    }

    public String getStudentName(){
        return studentName;
    }

    public void dropCourse(Course course){
        enrollCourses.remove(course);
    }
    public void enrollCourse (Course course){
        enrollCourses.add(course);

    }



}
