import java.util.ArrayList;

public class Student implements Registrable {


    private String studentName;
    private String studentSurname;
    private String studentEmail;
    private int studentID;
    private String studentPassword;
    private int scholarshipAmount;
    private ArrayList<Course> studentCourses=new ArrayList<>();


     Student(String studentName,String studentSurname,String studentEmail,int studentID,String studentPassword,int scholarshipAmount) {
        this.studentName=studentName;
        this.studentSurname=studentSurname;
        this.studentID=studentID;
        this.studentEmail=studentEmail;
        this.studentPassword=studentPassword;
        this.scholarshipAmount=scholarshipAmount;
        this.studentCourses=new ArrayList<>();
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
    public ArrayList<Course> getStudentCourses() {
        return studentCourses;
    }



    public void printStudent(){

        System.out.println("Ögrencinin Adı: "+getStudentName()+" Soyadı: "+getStudentSurname()+" ID'si: "+getStundentID());
        System.out.println("Öğrenci Maili: "+ getStudentEmail()+" Öğrencinin Bursu: %"+getScholarshipAmount());

    }


    public void getStudentLevel(int studentYear){
         if(studentYear>4&& studentYear<=8){
             System.out.println("Lisansüstü");
         }
         else if (studentYear>=1 && studentYear<=4){
             System.out.println("Lisans");
         }
         else {
             System.out.println("Hata! Geçersiz sınıf girdiniz.");
         }
    }
    public double calculateTuition(ArrayList<Course> course) {

        double price=0;
        for(Course c: course){
            price+=c.getPrice();
        }

        return price;
    }
    public double scholarshipAmount(double price,double scholarshipAmount){
        double discount = (price * scholarshipAmount) / 100;
        return price - discount;
    }
}

