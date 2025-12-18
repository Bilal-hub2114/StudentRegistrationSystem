import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main{
    public static void main(String[] args){
        //direkt öğrenci tüm bilgilerini girecek ve sistem ona göre correct vericek

        Scanner scan = new Scanner(System.in);
        Course course = new Course();
        List<Student> studentsList = new ArrayList<>();

        System.out.print("Lütfen Öğrenci ID' nizi giriniz: ");
        int inputstudentID = scan.nextInt();
        System.out.print("Lüften şifrenizi giriniz: ");
        String inputstudentPassword = scan.next();

        Student student = new Student("Bilal","Ay","bilalay25@istanbularel.edu.tr",240309006,1,"bilalay321");
        Student student2 = new Student("Arda","Abacı","ardaabacı24@istanbularel.edu.tr",240309007,2,"ardaabacı321");
        Student student3 = new Student("Şevval Esma","Çoban","şevvalcoban23@istanbularel.edu.tr",240309005,3,"şevvalçoban321");
        Student student4 = new Student("Tuba Süeda","Aytan","tubaaytan22@istanbularel.edu.tr",240309008,4,"tubaaytan321");

        studentsList.add(student);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);


        // sistem direkt ne kadar bursu olduğunu göstersin ve hesaplayın tutarı yazsın..


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


        System.out.println("Lütfen yapmak istediğiniz işlem türünü seçiniz: ");
        System.out.println("1 - Ders Ekle/Çıkar");
        System.out.println("2 - Ders Listesi Görüntüle");
        System.out.println("3 - Ders Kayıt Olma");
        System.out.println("Seçiminiz: ");
        int select = scan.nextInt();

        switch(select){
            case 1:
                course.courseInput();
                break;
            case 2:
                //kaçıncı sınıf olduğunu göster ve o sınıfa göre ekrana o dönemin derslerini printle liste şeklinde.
                break;
            case 3:
                ArrayList<String> benimliste = course.courseInput();
                course.printList(benimliste);
                ArrayList<String> selectedcourses = course.courseInput();
                double sum = course.calculateTuition(selectedcourses);
                System.out.println("Dönemin Toplam Ücreti: "+sum);
                break;
        }
    }
}