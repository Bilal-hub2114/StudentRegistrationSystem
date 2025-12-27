import java.util.ArrayList;

public class Registration {
    public static boolean checkCopy(ArrayList<Course> selectedCourse,Course newCourse ){
        for(Course c: selectedCourse){
            if(c.getCourseCode().equals(newCourse.getCourseCode())){
                return true;
            }
        }
        return false;
    }
}
