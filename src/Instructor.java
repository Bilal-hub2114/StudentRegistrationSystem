import java.util.ArrayList;

public class Instructor {
    private String instructorName;
    private String instructorSurname;
    private String instructorDepartment;
    private ArrayList<Course>  instructorCourse;

    Instructor(String instructorName,String instructorSurname,String instructorDepartment){
        this.instructorName=instructorName;
        this.instructorSurname=instructorSurname;
        this.instructorDepartment=instructorDepartment;
        this.instructorCourse=new ArrayList<>();
    }

    public String getInstructorName(){ return instructorName; }
    public String getInstructorSurname() { return instructorSurname; }
    public String getInstructorDepartment(){ return instructorDepartment; }
    public ArrayList<Course> getInstructorCourse(){ return instructorCourse; }
}
