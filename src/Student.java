import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Registrable {


    private String studentName;
    private String studentSurname;
    private String studentID;
    private String studentPassword;
    private int scholarshipAmount;
    private ArrayList<Course> studentCourses=new ArrayList<>();


     Student(String studentName,String studentSurname,String studentID,String studentPassword,int scholarshipAmount) {
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
    public String getStudentID(){
        return studentID;
    }
    public String getStudentPassword(){ return studentPassword; }
    public int getScholarshipAmount(){ return scholarshipAmount; }
    public ArrayList<Course> getStudentCourses() {
        return studentCourses;
    }


    public void printStudent(){

        System.out.println("Ögrencinin Adı: "+getStudentName()+" Soyadı: "+getStudentSurname()+" | ID: "+getStudentID());
        System.out.print("Öğrenci Maili: ");
        printStudentEmail();
        System.out.println("Öğrencinin Bursu: %"+getScholarshipAmount());

    }

    public void printNoCourseWarning(){
        System.out.println("======================================================");
        System.out.println("[UYARI]: Henüz bir ders kaydınız bulunmamaktadır.");
        System.out.println("Lütfen kayıt için 3. seçeneği tuşlayınız.");
        System.out.println("                   MENÜYE DÖNÜLÜYOR...");
        System.out.println("======================================================");
    }

    public void printReturnToMenu(){
        System.out.println("======================================================");
        System.out.println("                   MENÜYE DÖNÜLÜYOR...");
        System.out.println("======================================================");
    }


    public void printPrice(int studentClass){
         if(studentClass ==0 ){
             System.out.println("Derslerin toplam tutarı: "+calculateTuition(getStudentCourses())+" TL");
         }
         else if(studentClass >=1 && studentClass <=4 && getScholarshipAmount() >0 ){
                 System.out.println("Derslerin toplam tutarı: "+calculateTuition(getStudentCourses())+" Burs indirimiyle toplam tutarı: "+scholarshipAmount(calculateTuition(getStudentCourses()),getScholarshipAmount())+" TL");
         }
         else if(studentClass >= 1 && studentClass <=4 && getScholarshipAmount() ==0 ){
             System.out.println("Bursunuz bulunmamaktadır, derslerin toplam tutarı: "+calculateTuition(getStudentCourses())+" TL");

         }
         else{
             System.out.println("[UYARI]: Hata!");
         }
         System.out.println();
    }

    public void printStudentEmail(){
         String lowerStudentName=getStudentName().toLowerCase();
         String lowerStudentSurname=getStudentSurname().toLowerCase();

         System.out.println(lowerStudentName+lowerStudentSurname+"25@istanbularel.edu.tr");
    }


    public void printGPA(Scanner scan){

        System.out.println("------------DÖNEM SONU NOT GİRİŞ PANELİ------------");
        System.out.println("Seçilen derslerin notlarını giriniz: ");
        for(Course c: getStudentCourses()) {
            System.out.print(c.getCourseName() + " (" + c.getCourseCode() + ") [" + c.getCourseCredit() + "] " + "Notu: ");
            int grade = scan.nextInt();
            c.setStudentGrade(grade);
            if (grade >= 90) {
                System.out.println("Ders Notu Harfiniz = AA.");
            } else if (grade >= 80) {
                System.out.println("Ders Notu Harfiniz = BA.");
            }
            else if(grade >= 70){System.out.println("Ders Notu Harfiniz = BB.");}
            else if(grade >= 60){System.out.println("Ders Notu Harfiniz = CB.");}
            else if(grade >= 50){System.out.println("Ders Notu Harfiniz = CC.");}
            else if(grade >= 45){System.out.println("Ders Notu Harfiniz = DC.");}
            else if(grade >= 40){System.out.println("Ders Notu Harfiniz = DD.");}
            else{
                System.out.println("Ders Notu Harfiniz = FF.");
            }
        }
        System.out.println("---------------------------------------------------");

        String newStudentName=getStudentName().toUpperCase();
        String newStudentSurname=getStudentSurname().toUpperCase();
        System.out.println(newStudentName+" "+newStudentSurname+" Genel Ortalamanız (GPA): "+calculateGPA());
    }


    @Override
    public void registerCourse(Course course){
         this.getStudentCourses().add(course);
    }

    @Override
    public void listCourses(){
         System.out.println("------------- Kayıt Olunan Dersler -------------");
         int totalCredits=0;

             for(Course c: studentCourses){
                 System.out.println("Dersin Adı: "+ c.getCourseName()+" | Dersin Kodu: "+c.getCourseCode()+" | Dersin Kredisi: "+c.getCourseCredit()+" | Dersin Hocası: "+c.getInstructor().getInstructorName()+" "+c.getInstructor().getInstructorSurname());
                 totalCredits+=c.getCourseCredit();
             }
             if(totalCredits>60){
                 System.out.println("[UYARI]: Maksimum alabileceğiniz krediyi geçtiniz.");
             }

        System.out.println();
        System.out.println("Toplam Ders Sayısı: "+this.studentCourses.size()+ " Toplam Dönem Kredisi : "+ totalCredits+" | 60");
        System.out.println();
    }


    public double calculateGPA() {

        double totalPoints = 0;
        int totalCredits = 0;
        for (Course c : studentCourses) {
            totalPoints += c.getStudentGrade() * c.getCourseCredit();
            totalCredits += c.getCourseCredit();

        }
        if(totalCredits==0){ return totalPoints / totalCredits; }

        return totalPoints / totalCredits;
    }


    public void reductionOfCourses(String inputName){
         boolean found = false;
         for(int i =0; i<studentCourses.size();i++){
             if(studentCourses.get(i).getCourseName().equalsIgnoreCase(inputName)){
                 studentCourses.remove(i);
                 System.out.println("(-) ["+inputName+"] dersi başarıyla çıkarıldı.");
                 found = true;
                 i--;
                 break;
             }
         }
         if(found == false){
             System.out.println("[UYARI]: Hata! Ders listenizde ["+inputName+"] adında bir ders bulunamadı");
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

