import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Course {

    private String courseName;
    private String courseCode;
    private int studentGrade;
    private double price;

    Course(String courseName,String courseCode,int studentGrade,double price){
        this.courseName=courseName;
        this.courseCode=courseCode;
        this.studentGrade=studentGrade;
        this.price=price;
    }
    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getStudentGrade() { return studentGrade; }
    public double getPrice() { return price; }
}
