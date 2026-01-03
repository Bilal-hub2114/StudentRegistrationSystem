import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GraduateStudentTest {

    @Test
    public void testGraduateCalculateTuition(){
        GraduateStudent graduate = new GraduateStudent("Mehmet","Şimşek","240309001","fikirlerölmez321",0);
        ArrayList<Course> courses =new  ArrayList<>();

        courses.add(new Course("Genel Muhasebe","TR101","PERŞEMBE","12.00",3,0,30000,null));

        double expected= 36000;
        double realresult= graduate.calculateTuition(courses);
        assertEquals("Derslerin tutarı %20 zamlı hesaplanmadı.",expected,realresult,0.01);

    }
}
