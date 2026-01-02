import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main{

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        CourseCatalog course = new CourseCatalog();
        List<Student> studentsList = new ArrayList<>();
        ArrayList<String> inputCourses = new ArrayList<>();

        System.out.println("================ ÖĞRENCİ KAYIT PANELİ ================");
        System.out.print("Adınız: ");
        String studentName = scan.nextLine();
        System.out.print("Soyisminiz: ");
        String studentSurname = scan.nextLine();
        System.out.print("Okul ID' niz: ");
        String studentID = scan.nextLine();
        System.out.print("Şifreniz: ");
        String studentPassword = scan.nextLine();
        System.out.print("Burs Oranınız (%): ");
        int scholarshipAmount =scan.nextInt();
        System.out.println("Lisansüstü okuyorsanız (0)' ı / Lisans okuyorsanız kaçıncı sınıf olduğunuzu giriniz");
        System.out.print("Seçiminiz: ");
        int studentClass=scan.nextInt();
        scan.nextLine();

        Student student;
        if(studentClass==0){
            student=new GraduateStudent(studentName,studentSurname,studentID,studentPassword,scholarshipAmount);
        }else{
            student = new Student(studentName,studentSurname,studentID,studentPassword,scholarshipAmount);
        }
        studentsList.add(student);

        student.controlStudentID(studentID);

        System.out.print("Lütfen Öğrenci ID' nizi giriniz: ");
        String inputstudentID = scan.nextLine();
        System.out.print("Lüften şifrenizi giriniz: ");
        String inputstudentPassword = scan.next();
        scan.nextLine();

        student.controlStudentID(inputstudentID);

        System.out.println();
        boolean found = false;
        for(Student s: studentsList){
            if(s.getStudentID().equals(inputstudentID) && s.getStudentPassword().equals(inputstudentPassword)) {
                System.out.println("================ Hoşgeldin " + s.getStudentName() + " " + s.getStudentSurname()+" ================");
                System.out.println();
                s.printStudent();
                found = true;

                break;
            }
        if(!found){
            // hata, öğrenci ıd si ya da şifre eksik ya da yanlış tuşladınız... gibi bir şey mi olmalı?
            System.out.println("[UYARI]: Hata! "+ inputstudentID+ " Numaralı öğrenci bulunamadı...");
            System.exit(0);
        }
        }


        while(true) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Lütfen yapmak istediğiniz işlem türünü seçiniz: ");
            System.out.println("1 - Ders Ekle");
            System.out.println("2 - Ders Çıkar");
            System.out.println("3 - Ders Listesi Görüntüle");
            System.out.println("4 - Ders Kayıt Olma");
            System.out.println("5 - Ders Notu Hesaplama");
            System.out.println("6 - Menüden Güvenli Çıkış");

            System.out.print("Seçiminiz: ");
            int select = scan.nextInt();
            scan.nextLine();
            System.out.println("------------------------------------------------------");

            switch (select) {

                case 1:
                    if(student.getStudentCourses().isEmpty()) {
                        System.out.println("======================================================");
                        System.out.println("[UYARI]: Henüz bir ders kaydınız bulunmamaktadır.");
                        System.out.println("Lütfen kayıt için 3. seçeneği tuşlayınız.");
                        System.out.println("                   MENÜYE DÖNÜLÜYOR...");
                        System.out.println("======================================================");
                        break;
                    }
                    else{
                        System.out.println("================ Ders ekleyemeyi bitirmek için 'bitir' yazınız ================");
                        while (true) {
                            System.out.print("Dersin Adı: ");
                            String name = scan.nextLine();

                            if (name.equalsIgnoreCase("bitir")) {
                                break;
                            }
                            inputCourses.add(name);
                        }
                        System.out.println("======================================================");
                        System.out.println("                   MENÜYE DÖNÜLÜYOR...");
                        System.out.println("======================================================");
                        break;
                    }
                case 2:
                    if(student.getStudentCourses().isEmpty()) {
                        System.out.println("======================================================");
                        System.out.println("[UYARI]: Henüz bir ders kaydınız bulunmamaktadır.");
                        System.out.println("Lütfen kayıt için 3. seçeneği tuşlayınız.");
                        System.out.println("                   MENÜYE DÖNÜLÜYOR...");
                        System.out.println("======================================================");
                        break;
                    }
                    else{
                        System.out.println("================ Mevcut Ders Programı ================");
                        student.listCourses();
                        System.out.println("================ Ders çıkarmayı bitirmek için 'bitir' yazınız ================");

                        while(true){
                        System.out.print("Çıkarmak istediğiniz dersi yazınız: ");

                        String inputCourseName= scan.nextLine();
                            if (inputCourseName.equalsIgnoreCase("bitir")) {
                                break;
                            }

                         student.reductionOfCourses(inputCourseName);
                        }
                    }

                    break;

                case 3:
                    if(student.getStudentCourses().isEmpty()) {
                        System.out.println("======================================================");
                        System.out.println("[UYARI]: Henüz bir ders kaydınız bulunmamaktadır.");
                        System.out.println("Lütfen kayıt için 3. seçeneği tuşlayınız.");
                        System.out.println("                   MENÜYE DÖNÜLÜYOR...");
                        System.out.println("======================================================");
                        break;
                    }
                    else{
                        student.listCourses();
                    break;
                    }
                case 4:
                    course.listCourseByGrade(studentClass);
                    inputCourses.clear();



                    System.out.println("================ Ders ekleyemeyi bitirmek için 'bitir' yazınız ================");
                    while (true) {
                        System.out.print("Dersin Adı: ");
                        String name = scan.nextLine();

                        if (name.equalsIgnoreCase("bitir")) {
                            break;
                        }

                        if(name.isEmpty()==false){
                            inputCourses.add(name);
                        }

                    }

                    System.out.println();
                    System.out.println(inputCourses);
                    System.out.println();

                    ArrayList<Course> courselist = CourseCatalog.courseInput(inputCourses);
                    for (Course newCourse : courselist) {
                        if (Registration.checkCopy(student.getStudentCourses(), newCourse) == false) {
                            if (Registration.controlCourseTime(student.getStudentCourses(), newCourse) == false) {
                                student.registerCourse(newCourse);
                                System.out.println("(+) [" + newCourse.getCourseName() + "] dersiniz başarıyla eklendi.");
                            } else {
                                System.out.println("[UYARI]: Hata! " + newCourse.getCourseName() + " dersinin saati: " + newCourse.getCourseStartTime() + " " + newCourse.getCourseDay() + " başka bir dersiniz ile çakışıyor.");
                            }
                        } else {
                            System.out.println("[UYARI]: Hata! " + newCourse.getCourseName() + newCourse.getCourseCode() + " dersi daha önceden eklenmiş.");
                        }
                    }
                    System.out.println();
                    student.listCourses();
                    student.printPrice(studentClass);

                    System.out.println("======================================================");
                    System.out.println("                   MENÜYE DÖNÜLÜYOR...");
                    System.out.println("======================================================");


                    break;
                case 5:
                    if(student.getStudentCourses().isEmpty()) {
                    System.out.println("======================================================");
                    System.out.println("[UYARI]: Henüz bir ders kaydınız bulunmamaktadır.");
                    System.out.println("Lütfen kayıt için 3. seçeneği tuşlayınız.");
                    System.out.println("                   MENÜYE DÖNÜLÜYOR...");
                    System.out.println("======================================================");
                }
                    else{
                     student.printGPA(scan);
                }

                    break;
             case 6:
                 System.out.println("[OBS]: Güvenli çıkış başarıyla yapıldı. İYİ DERSLER...");
                System.exit(0);

            }

        }
    }
}
