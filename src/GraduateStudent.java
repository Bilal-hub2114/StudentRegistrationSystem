import java.util.ArrayList;
class GraduateStudent extends Student{
    public GraduateStudent(String studentName,String studentSurname,String studentEmail,int studentID,String studentPassword,int scholarshipAmount){
        super(studentName,studentSurname,studentEmail,studentID,studentPassword, scholarshipAmount);
    }

    @Override
    public double calculateTuition(ArrayList<Course> course){
        double basePrice=super.calculateTuition(course);

        return (basePrice*120)/100;
    }
}
