import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String studentName;
    private String studentSurname;
    private String studentEmail;
    private int studentID;
    private int studentGrade;
    private String studentPassword;

    public Student(String studentName,String studentSurname,String studentEmail,int studentID,int studentGrade,String studentPassword) {
        this.studentName=studentName;
        this.studentSurname=studentSurname;
        this.studentID=studentID;
        this.studentEmail=studentEmail;
        this.studentGrade=studentGrade;
        this.studentPassword=studentPassword;
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
    public int getStudentGrade(){
        return studentGrade;
    }
    public String getStudentEmail(){ return studentEmail; }
    public String getStudentPassword(){ return studentPassword; }


    Scanner sc=new Scanner(System.in);
    ArrayList<String> student=new ArrayList<String>();


    public void printStudent(){

        System.out.println("Ögrencinin Adı: "+getStudentName()+" Soyadı: "+getStudentSurname()+" ID'si: "+getStundentID());
        System.out.println("Öğrenci "+getStudentGrade()+". "+ "sınıfta"+" Maili: "+ getStudentEmail());

    }
}
