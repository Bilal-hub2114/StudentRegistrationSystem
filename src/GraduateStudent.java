import java.util.ArrayList;
class GraduateStudent extends Student{
    public GraduateStudent(String studentName,String studentSurname,String studentID,String studentPassword,int scholarshipAmount){
        super(studentName,studentSurname,studentID,studentPassword, scholarshipAmount);
    }

    @Override
    public double calculateTuition(ArrayList<Course> course){
        double basePrice=super.calculateTuition(course);

        return (basePrice*120)/100;
    }
}
