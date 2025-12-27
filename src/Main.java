import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main{

    //kullanıcı her şeyini kendisi girecek ve kayıt olacak sonrasında ismini ve soyismini girdikten sonra metot ile direkt mail adresi oluşturulacak ve yazdıralacak, giriş için ID ve kendi tanımladığı şifre istenecek...

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        CourseCatalog course = new CourseCatalog();
        List<Student> studentsList = new ArrayList<>();
        ArrayList<String> inputCourses = new ArrayList<>();



        System.out.print("Lütfen Öğrenci ID' nizi giriniz: ");
        int inputstudentID = scan.nextInt();
        System.out.print("Lüften şifrenizi giriniz: ");
        String inputstudentPassword = scan.next();

        System.out.println("Lisansüstü okuyorsanız (0)' ı / Lisans okuyorsanız kaçıncı sınıf olduğunuzu giriniz");
        int studentGrade=scan.nextInt();

        Student student = new Student("Bilal","Ay","bilalay25@istanbularel.edu.tr",240309006,"bilalay321",25);
        Student student2 = new Student("Arda","Abacı","ardaabacı24@istanbularel.edu.tr",240309007,"ardaabacı321",50);
        Student student3 = new Student("Şevval Esma","Çoban","şevvalcoban23@istanbularel.edu.tr",240309005,"şevvalçoban321",100);
        Student student4 = new Student("Tuba Süeda","Aytan","tubaaytan22@istanbularel.edu.tr",240309008,"tubaaytan321",100);

        GraduateStudent graduateStudent=new GraduateStudent("Eren","Yılmaz","erenyılmaz21@istanbularel.edu.tr",240502001,"erenyılmaz321",75);


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


        System.out.println("----------------------------------------------------------------");
        System.out.println("Lütfen yapmak istediğiniz işlem türünü seçiniz: ");
        System.out.println("1 - Ders Ekle/Çıkar");
        System.out.println("2 - Ders Listesi Görüntüle");
        System.out.println("3 - Ders Kayıt Olma");

        System.out.print("Seçiminiz: ");
        int select = scan.nextInt();
        System.out.println("----------------------------------------------------------------");

        switch(select){

            case 1:
                break;

            case 2:
                course.listCourseByGrade(studentGrade);

                break;
            case 3:
                course.listCourseByGrade(studentGrade);
                scan.nextLine();
                System.out.println("***** Ders ekleyemeyi bitirmek için 'bitir' yazınız *****");
                while(true){
                    System.out.print("Dersin Adı: ");
                    String name = scan.nextLine();

                    if(name.equalsIgnoreCase("bitir")){
                        break;
                    }
                    inputCourses.add(name);
                }

                System.out.println(inputCourses);

                ArrayList<Course> courselist= CourseCatalog.courseInput(inputCourses);
                for(Course newCourse: courselist){
                    if(Registration.checkCopy(student.getStudentCourses(),newCourse)==false){
                        student.getStudentCourses().add(newCourse);
                        System.out.println(newCourse.getCourseName()+" başarıyla dersiniz eklendi.");
                    }
                    else{
                        System.out.println("Hata! "+newCourse.getCourseCode()+ " dersi daha önceden seçilmiş.");
                    }
                }

                System.out.println("Derslerin toplam tutarı : "+student.calculateTuition(student.getStudentCourses())+" TL | Burs indirimiyle: "+ student.scholarshipAmount(student.calculateTuition(student.getStudentCourses()),student.getScholarshipAmount()));
                break;
        }
    }
}
