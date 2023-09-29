package studentenrollmentsystem;

import java.util.List;
import java.util.ArrayList;


public class Course {
    private  String courseCode;
    private   String courseName;
    private   String instructor;
    private   int maxCapacity;
    private  List<Student> enrollstudents;
    public Course( String courseCode,String courseName,String instructor,int maxCapacity){
        this.courseCode=courseCode;
        this.maxCapacity=maxCapacity;
        this.instructor=instructor;
        this.courseName=courseName;
        this.enrollstudents=new ArrayList<>();
    }

    public String getCourseName(){
        return courseName;
    }
public void enrollStudent (Student student){
    enrollstudents.add(student);
}
public void dropStudent (Student student){
    enrollstudents.remove(student);
}
public List<Student> getStudents(){
return enrollstudents;
    }
public String getInstructor(){
        return instructor;
}
    public String getCourseCode(){
        return courseCode;
    }
public int getCurrntMaxCapacity(){
        return maxCapacity;
}







}

