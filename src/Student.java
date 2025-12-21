import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {


    private String studentName;
    private String studentSurname;
    private String studentEmail;
    private int studentID;
    private String studentPassword;
    private int scholarshipAmount;

     Student(String studentName,String studentSurname,String studentEmail,int studentID,String studentPassword,int scholarshipAmount) {
        this.studentName=studentName;
        this.studentSurname=studentSurname;
        this.studentID=studentID;
        this.studentEmail=studentEmail;
        this.studentPassword=studentPassword;
        this.scholarshipAmount=scholarshipAmount;
    }

    public String getStudentName(){
        return studentName;
    }
    public String getStudentSurname(){
        return studentSurname;
    }
    public int getStundentID(){
        return studentID;
    }
    public String getStudentEmail(){ return studentEmail; }
    public String getStudentPassword(){ return studentPassword; }
    public int getScholarshipAmount(){ return scholarshipAmount; }


    public void printStudent(){

        System.out.println("Ögrencinin Adı: "+getStudentName()+" Soyadı: "+getStudentSurname()+" ID'si: "+getStundentID());
        System.out.println("Öğrenci Maili: "+ getStudentEmail()+" Öğrencinin Bursu: %"+getScholarshipAmount());

    }
    public double calculateTuition(ArrayList<String> course) {
        double price=0;
        for(String s: course){
            price += CourseCatalog.priceChart.getOrDefault(s,0.0);
        }
        return price;
    }
    public double scholarshipAmount(double price,double scholarshipAmount){
        double bursindirimi = (price * scholarshipAmount) / 100;
        return price - bursindirimi;
    }
}

class GraduateStudent extends Student{
    public GraduateStudent(String studentName,String studentSurname,String studentEmail,int studentID,String studentPassword,int scholarshipAmount){
        super(studentName,studentSurname,studentEmail,studentID,studentPassword, scholarshipAmount);
    }

    @Override
    public double calculateTuition(ArrayList<String> course){
        double basePrice = super.calculateTuition(course);
        return (basePrice*120)/100;
    }
}

