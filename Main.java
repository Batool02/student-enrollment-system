package studentenrollmentsystem;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Student firstStudent = new Student(12115673, "batool@gmail.com", "Batool", new ArrayList<>());
        Student secondStudent = new Student(12115969, "Raghad@gmail.com", "Raghad", new ArrayList<>());
        Student thirdStudent = new Student(12117895, "Ahmad@gmail.com", "Ahmad", new ArrayList<>());
        Student fourthStudent = new Student(12117835, "Hary@gmail.com", "Hary", new ArrayList<>());

        Course firstCourse = new Course("D011", "Data Structure", "Aysar", 59);
        Course secondCourse = new Course("101", "English", "Faten", 90);
        Course thirdCourse = new Course("102D", "Discrete", "Yamama", 30);
        Course fourthCourse = new Course("107c", "Database", "Emmad", 80);

        //We don't have database so we enter the information manually
        // Add Students In University
        university.addStudent(firstStudent);
        university.addStudent(secondStudent);
        university.addStudent(thirdStudent);
        university.addStudent(fourthStudent);
        // Add Course In University
        university.addCourse(firstCourse);
        university.addCourse(fourthCourse);
        university.addCourse(secondCourse);
        university.addCourse(thirdCourse);



        university.enrollStudentInCourse(firstStudent, firstCourse);
        university.enrollStudentInCourse(secondStudent, secondCourse);
        university.enrollStudentInCourse(thirdStudent, thirdCourse);
        university.enrollStudentInCourse(firstStudent, secondCourse);
        university.enrollStudentInCourse(fourthStudent, fourthCourse);
        university.enrollStudentInCourse(firstStudent, fourthCourse);
        university.enrollStudentInCourse(thirdStudent, secondCourse);

        university.dropStudentFromCourse(firstStudent,firstCourse);



        //  All Available Courses In The University
        List<Course> getAvaliableCourses = university.getAvaliableCourses();
        System.out.println(" All Available Courses In The University :");
        for (Course course : getAvaliableCourses) {
            System.out.println(course.getCourseName());
        }

//Students Enrolled in Specific Course
        List<Student> courseStudents = university.getCourseStudents(secondCourse);
        System.out.println(" Students Enrolled in Specific Course " + secondCourse.getCourseName());
        for (Student student : courseStudents) {
            System.out.println(student.getStudentName());
        }

//Course For Specific Student
        List<Course> studentCourse = university.getStudentAvalibaleCourses(firstStudent);
        System.out.println("Course For Specific Student " + firstStudent.getStudentName());
        for (Course course : studentCourse) {
            System.out.println(course.getCourseName());
        }



    }
}