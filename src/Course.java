
public class Course {

    private String courseName;
    private String courseCode;
    private int studentClass;
    private double price;
    private int courseCredit;


    Course(String courseName,String courseCode,int courseCredit,int studentClass,double price){
        this.courseName=courseName;
        this.courseCode=courseCode;
        this.studentClass=studentClass;
        this.price=price;
        this.courseCredit=courseCredit;
    }
    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getStudentClass() { return studentClass; }
    public double getPrice() { return price; }
    public int getCourseCredit() { return courseCredit; }
}
