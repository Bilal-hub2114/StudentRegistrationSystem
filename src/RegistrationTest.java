import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class RegistrationTest {
    @Test
    public void testControlCourseTime(){
        ArrayList<Course> studentCourses = new ArrayList<>();
        Course courses1 = new Course("Müzik Tarihi","MZK214","ÇARŞAMBA","11.00",3,4,56000,null);
        studentCourses.add(courses1);
        Course courses2 = new Course("Tıbbi Biyokimya","TBİ345","ÇARŞAMBA","11.00",3,4,60000,null);
        
        boolean conflict= Registration.controlCourseTime(studentCourses,courses2);

        assertTrue("Hata! Sistem aynı gün ve saattaki ders çakışmasını yakalayamadı.",conflict);


    }
    @Test
    public void testCheckCopy(){
        ArrayList<Course> selectedCourse = new ArrayList<>();

        Course course1= new Course("Yabancı Dil-I","UOZYD1","PAZARTESİ","09.00",4,1,24000,null);
        selectedCourse.add(course1);

        boolean checkCopy = Registration.checkCopy(selectedCourse,course1);
        assertTrue("Hata! Aynı dersin tekrar eklenmesini sistem fark etmedi.",checkCopy);
    }
}
