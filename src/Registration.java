import java.util.ArrayList;

public class Registration {
    public static boolean controlCourseTime(ArrayList<Course> studentCourses,Course newCourse){
        for(Course courses: studentCourses ){
            boolean sameDay= courses.getCourseDay().equals(newCourse.getCourseDay());
            boolean sameTime= courses.getCourseStartTime().equals(newCourse.getCourseStartTime());

            if(sameDay&&sameTime){
            return true;
            }
        }

        return false;
    }
    public static boolean checkCopy(ArrayList<Course> selectedCourse,Course newCourse ){
        for(Course c: selectedCourse){
            if(c.getCourseCode().equals(newCourse.getCourseCode())){
                return true;
            }
        }
        return false;
    }
}
