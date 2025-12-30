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

        System.out.println("--------------ÖĞRENCİ KAYIT PANELİ--------------");
        System.out.print("Adınız: ");
        String studentName = scan.nextLine();
        System.out.print("Soyisminiz: ");
        String studentSurname = scan.nextLine();
        System.out.print("Okul ID' niz: ");
        int studentID = scan.nextInt();
        scan.nextLine();
        System.out.print("Şifreniz: ");
        String studentPassword = scan.nextLine();
        System.out.print("Burs Oranınız (%): ");
        int scholarshipAmount =scan.nextInt();


        System.out.print("Lütfen Öğrenci ID' nizi giriniz: ");
        int inputstudentID = scan.nextInt();
        System.out.print("Lüften şifrenizi giriniz: ");
        String inputstudentPassword = scan.next();
        scan.nextLine();

        System.out.println("Lisansüstü okuyorsanız (0)' ı / Lisans okuyorsanız kaçıncı sınıf olduğunuzu giriniz");
        int studentClass=scan.nextInt();
        scan.nextLine();

        Student student;
        if(studentClass==0){
            student=new GraduateStudent(studentName,studentSurname,studentID,studentPassword,scholarshipAmount);
        }else{
            student = new Student(studentName,studentSurname,studentID,studentPassword,scholarshipAmount);

        }
        studentsList.add(student);


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
                course.listCourseByGrade(studentClass);

                break;
            case 3:
                course.listCourseByGrade(studentClass);
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

                System.out.println();
                System.out.println(inputCourses);
                System.out.println();

                ArrayList<Course> courselist= CourseCatalog.courseInput(inputCourses);
                for(Course newCourse: courselist){
                    if(Registration.checkCopy(student.getStudentCourses(),newCourse)==false){
                        student.registerCourse(newCourse);
                        System.out.println("(+) "+newCourse.getCourseName()+" başarıyla dersiniz eklendi.");
                    }
                    else{
                        System.out.println("Hata! "+newCourse.getCourseName()+newCourse.getCourseCode()+ " dersi daha önceden eklenmiş.");
                    }
                }
                System.out.println("-----------------------------------------------------");

                student.printPrice(studentClass);
                student.listCourses();
                student.printGPA(scan);

                break;
        }
    }
}
