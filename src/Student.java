public class Student {

    private String studentName;
    private String studentSurname;
    private String studentEmail;
    private String studentPhoneNumber;
    private int studentID;
    private int studentClass;

    public Student(String studentName,String studentSurname,String studentEmail,int studentID,int studentClass,String StudentPhoneNumber){
        this.studentName=studentName;
        this.studentSurname=studentSurname;
        this.studentID=studentID;
        this.studentEmail=studentEmail;
        this.studentClass=studentClass;
        this.studentPhoneNumber=studentPhoneNumber;
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
    public int getStudentClass(){
        return studentClass;
    }
    public String getStudentPhoneNumber(){
        return studentPhoneNumber;
    }
    public String getStudentEmail(){
        return studentEmail;
    }


    public void printStudent(){

        System.out.println("Ögrencinin Adı: "+getStudentName());
        System.out.println("Ögrencinin Soyadı: "+getStudentSurname());
        System.out.println("Öğrencinin "+getStundentID());
    }
}
