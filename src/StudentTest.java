import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class StudentTest {

    @Test
    public void testCalculateGPA(){
        Student student = new Student("Bilal","Ay","240309006","bilalay321",50);
        Course c1= new Course("Matematik","MAT101","PAZARTESİ","09.00",4,1,24000,null);
        c1.setStudentGrade(90);

        student.registerCourse(c1);
        assertEquals(90.0,student.calculateGPA(),0.01);
    }

    @Test
    public void testCalculateTuition(){
        Student student = new Student("Bilal","Ay","240309006","bilalay321",50);
        ArrayList<Course> courses = new ArrayList<>();

        courses.add(new Course("Proje Test","PRJT234","CUMA","13.00",3,1,20000,null));
        courses.add(new Course("Fen Bilimleri","FEN198","ÇARŞAMBA","15.00",5,1,26000,null));

        assertEquals(46000,student.calculateTuition(courses),0.01);

    }
    @Test
    public void testScholarshipAmount(){
        Student student =new Student("Bilal","Ay","240309006","bilalay321",60);

        double mainPrice=30000;
        double mainscholarshipAmount=60;

        double expected = 12000;
        double realresult = student.scholarshipAmount(mainPrice,mainscholarshipAmount);

        assertEquals(expected,realresult,0.01);

    }

}
