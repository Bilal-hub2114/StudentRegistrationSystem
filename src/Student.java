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

    public Student(String studentName,String studentSurname,String studentEmail,int studentID,String studentPassword,int scholarshipAmount) {
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


    Scanner sc=new Scanner(System.in);
    ArrayList<String> student=new ArrayList<String>();


    public void printStudent(){

        System.out.println("Ögrencinin Adı: "+getStudentName()+" Soyadı: "+getStudentSurname()+" ID'si: "+getStundentID());
        System.out.println("Öğrenci "+". "+ "sınıfta"+" Maili: "+ getStudentEmail()+" Öğrencinin Bursu: %"+getScholarshipAmount());

    }

}
