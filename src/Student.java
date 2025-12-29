import java.util.ArrayList;

public class Student implements Registrable {


    private String studentName;
    private String studentSurname;
    private int studentID;
    private String studentPassword;
    private int scholarshipAmount;
    private ArrayList<Course> studentCourses=new ArrayList<>();


     Student(String studentName,String studentSurname,int studentID,String studentPassword,int scholarshipAmount) {
        this.studentName=studentName;
        this.studentSurname=studentSurname;
        this.studentID=studentID;
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
    public String getStudentPassword(){ return studentPassword; }
    public int getScholarshipAmount(){ return scholarshipAmount; }
    public ArrayList<Course> getStudentCourses() {
        return studentCourses;
    }



    public void printStudent(){

        System.out.println("Ögrencinin Adı: "+getStudentName()+" Soyadı: "+getStudentSurname()+" ID'si: "+getStundentID());
        System.out.print("Öğrenci Maili: ");
        printStudentEmail();
        System.out.println("Öğrencinin Bursu: %"+getScholarshipAmount());

    }

    public void printPrice(int studentClass){
         if(studentClass==0&&getScholarshipAmount()==0){
             System.out.println("Derslerin toplam tutarı: "+calculateTuition(getStudentCourses()));
         }
         else if(studentClass>=1&&studentClass<=4){
             System.out.println("Derslerin toplam tutarı: "+calculateTuition(getStudentCourses())+" Burs indirimiyle toplam tutarı: "+scholarshipAmount(calculateTuition(getStudentCourses()),getScholarshipAmount()));
         }
         else{
             System.out.println("Hata!");
         }
    }

    public void printStudentEmail(){
         String lowerStudentName=getStudentName().toLowerCase();
         String lowerStudentSurname=getStudentSurname().toLowerCase();

         System.out.println(lowerStudentName+lowerStudentSurname+"25@istanbularel.edu.tr");
    }


    @Override
    public void registerCourse(Course course){
         this.getStudentCourses().add(course);
    }

    @Override
    public void listCourses(){
         System.out.println("--------- Kayıt Olunan Dersler ---------");
         if(studentCourses.isEmpty()){
             System.out.println("Kayıtlı bir dersiniz yok.");
         }
         else{
             for(Course c: studentCourses){
                 System.out.println("Dersin Adı: "+ c.getCourseName()+" | Dersin Kodu: "+c.getCourseCode()+" | Dersin Kredisi: "+c.getCourseCredit()+" | Dersin Hocası: "+c.getInstructor().getInstructorName()+" "+c.getInstructor().getInstructorSurname());
             }
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

