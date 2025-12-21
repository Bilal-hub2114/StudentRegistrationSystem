import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main{
    public static void main(String[] args){
        //direkt öğrenci tüm bilgilerini girecek ve sistem ona göre correct vericek

        Scanner scan = new Scanner(System.in);
        CourseCatalog course = new CourseCatalog();
        List<Student> studentsList = new ArrayList<>();
        ArrayList<String> selectCoursesList = new ArrayList<>();

        System.out.print("Lütfen Öğrenci ID' nizi giriniz: ");
        int inputstudentID = scan.nextInt();
        System.out.print("Lüften şifrenizi giriniz: ");
        String inputstudentPassword = scan.next();

        Student student = new Student("Bilal","Ay","bilalay25@istanbularel.edu.tr",240309006,"bilalay321",25);
        Student student2 = new Student("Arda","Abacı","ardaabacı24@istanbularel.edu.tr",240309007,"ardaabacı321",50);
        Student student3 = new Student("Şevval Esma","Çoban","şevvalcoban23@istanbularel.edu.tr",240309005,"şevvalçoban321",100);
        Student student4 = new Student("Tuba Süeda","Aytan","tubaaytan22@istanbularel.edu.tr",240309008,"tubaaytan321",100);

        studentsList.add(student);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);


        boolean found = false;

        for(Student s: studentsList){
            if(s.getStundentID() == inputstudentID && s.getStudentPassword().equals(inputstudentPassword)) {
                System.out.println("Hoşgeldin " + s.getStudentName() + " " + s.getStudentSurname());
                System.out.println();
                s.printStudent();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Hata! "+ inputstudentID+ " Numaralı öğrenci bulunamadı...");
        }
        System.out.print("Kaçıncı sınıf olduğunuzu giriniz: ");
        int studentGreade=scan.nextInt();

        System.out.println();
        System.out.println("Lütfen yapmak istediğiniz işlem türünü seçiniz: ");
        System.out.println("1 - Ders Ekle/Çıkar");
        System.out.println("2 - Ders Listesi Görüntüle");
        System.out.println("3 - Ders Kayıt Olma");
        System.out.print("Seçiminiz: ");
        int select = scan.nextInt();

        switch(select){
            case 1:
                course.courseInput();
                break;
            case 2:
                if(studentGreade == 1){
                    System.out.println("1.Sınıfların Alabileceği Ders Listesi");
                    System.out.println(CourseCatalog.greade1List);
                }
                else if(studentGreade == 2){
                    System.out.println("2. Sınıfların Alabileceği Ders Listesi");
                    System.out.println(CourseCatalog.greade2List);
                }
                else if(studentGreade == 3){
                    System.out.println("3. Sınıfların Alabileceği Ders Listesi");
                    System.out.println(CourseCatalog.greade3List);
                }
                else if(studentGreade == 4){
                    System.out.println("4. Sınıfların Alabileceği Ders Listesi");
                    System.out.println(CourseCatalog.greade4List);
                }

                break;
            case 3:
                if(studentGreade == 1){
                    System.out.println("1.Sınıfların Alabileceği Ders Listesi");
                    System.out.println(CourseCatalog.greade1List);
                    selectCoursesList=course.courseInput();
                    double sum = student.calculateTuition(selectCoursesList);
                    System.out.println("Derslerin Toplam Ücreti: "+sum+" TL | "+ " Burs İndirimli Güncel Tutar: "+ student.scholarshipAmount(sum,student.getScholarshipAmount())+ " TL");

                }
                else if(studentGreade == 2){
                    System.out.println("2. Sınıfların Alabileceği Ders Listesi");
                    System.out.println(CourseCatalog.greade2List);
                    selectCoursesList=course.courseInput();
                    double sum = student.calculateTuition(selectCoursesList);
                    System.out.println("Derslerin Toplam Ücreti: "+sum+" TL | "+ " Burs İndirimli Güncel Tutar: "+ student.scholarshipAmount(sum,student.getScholarshipAmount())+ " TL");


                }
                else if(studentGreade == 3){
                    System.out.println("3. Sınıfların Alabileceği Ders Listesi");
                    System.out.println(CourseCatalog.greade3List);
                    selectCoursesList=course.courseInput();
                    double sum = student.calculateTuition(selectCoursesList);
                    System.out.println("Derslerin Toplam Ücreti: "+sum+" TL | "+ " Burs İndirimli Güncel Tutar: "+ student.scholarshipAmount(sum,student.getScholarshipAmount())+ " TL");

                }
                else if(studentGreade == 4){
                    System.out.println("4. Sınıfların Alabileceği Ders Listesi");
                    System.out.println(CourseCatalog.greade4List);
                    selectCoursesList=course.courseInput();
                    double sum = student.calculateTuition(selectCoursesList);
                    System.out.println("Derslerin Toplam Ücreti: "+sum+" TL | "+ " Burs İndirimli Güncel Tutar: "+ student.scholarshipAmount(sum,student.getScholarshipAmount())+ " TL");
                }
                break;
        }
    }
}