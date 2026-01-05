
public class Course {

    private String courseName;
    private String courseCode;
    private int studentClass;
    private double price;
    private int courseCredit;
    private double studentGrade;
    private String courseDay;
    private String courseStartTime;


    private Instructor instructor;

    Course(String courseName,String courseCode,String courseDay,String courseStartTime,int courseCredit,int studentClass,double price,Instructor instructor){
        this.courseName=courseName;
        this.courseCode=courseCode;
        this.courseDay=courseDay;
        this.courseStartTime=courseStartTime;
        this.studentClass=studentClass;
        this.price=price;
        this.courseCredit=courseCredit;
        this.instructor=instructor;
    }
    public double getStudentGrade(){ return  studentGrade;}
    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getStudentClass() { return studentClass; }
    public double getPrice() { return price; }
    public int getCourseCredit() { return courseCredit; }
    public String getCourseDay() { return courseDay; }
    public String getCourseStartTime(){ return courseStartTime; }
    public Instructor getInstructor(){ return instructor; }

    public void setStudentGrade(double studentGrade){ this.studentGrade=studentGrade;}

}
