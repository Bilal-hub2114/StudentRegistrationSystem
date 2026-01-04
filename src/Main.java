import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main{

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        CourseCatalog course = new CourseCatalog();
        List<Student> studentsList = new ArrayList<>();
        ArrayList<String> inputCourses = new ArrayList<>();
        SecurityControl control = new SecurityControl();
        Student student;

        System.out.println("================ ÖĞRENCİ KAYIT PANELİ ================");
        System.out.print("Adınız: ");
        String studentName = scan.nextLine();
        System.out.print("Soyisminiz: ");
        String studentSurname = scan.nextLine();
        System.out.print("Okul ID' niz: ");
        String studentID = scan.nextLine();
        control.controlStudentID(studentID);

        System.out.print("Şifreniz: ");
        String studentPassword = scan.nextLine();
        System.out.print("Burs Oranınız (%): ");
        int scholarshipAmount =scan.nextInt();
        control.controlScholarshipAmount(scholarshipAmount);

        System.out.println("Lisansüstü okuyorsanız (0)' ı / Lisans okuyorsanız kaçıncı sınıf olduğunuzu giriniz");
        System.out.print("Seçiminiz: ");
        int studentClass=scan.nextInt();
        scan.nextLine();


        if(studentClass==0){
            student=new GraduateStudent(studentName,studentSurname,studentID,studentPassword,scholarshipAmount);
        }else{
            student = new Student(studentName,studentSurname,studentID,studentPassword,scholarshipAmount);
        }
        studentsList.add(student);


        String csvData = student.getStudentID() + "," + student.getStudentName() + "," + student.getStudentSurname() + "," + student.getScholarshipAmount();
        CsvCrud.create("students.csv", csvData);
        System.out.println("[BİLGİ]: Bilgileriniz 'students.csv' dosyasına kaydedilmiştir.");

        System.out.print("Lütfen Öğrenci ID' nizi giriniz: ");
        String inputstudentID = scan.nextLine();
        control.controlStudentID(inputstudentID);

        System.out.print("Lüften şifrenizi giriniz: ");
        String inputstudentPassword = scan.next();
        scan.nextLine();


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
            System.out.println("[UYARI]: Hata! Eksik ya da yanlış tuşladınız...");
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
                    student.printNoCourseWarning();
                        break;
                    }
                    else{
                        System.out.println("================ Mevcut Ders Listesi ================");
                        course.listCourseByGrade(studentClass);
                        System.out.println("================ Ders ekleyemeyi bitirmek için 'bitir' yazınız ================");
                        while (true) {
                            System.out.print("Dersin Adı: ");
                            String name = scan.nextLine();

                            if (name.equalsIgnoreCase("bitir")) {
                                break;
                            }
                            inputCourses.add(name);
                        }
                        student.printReturnToMenu();
                        break;
                    }
                case 2:
                    if(student.getStudentCourses().isEmpty()) {
                        student.printNoCourseWarning();
                        break;
                    }
                    else{
                        System.out.println("================ Mevcut Ders Listesi ================");
                        course.listCourseByGrade(studentClass);
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
                        student.printNoCourseWarning();
                        break;
                    }
                    else{
                        course.listCourseByGrade(studentClass);
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
                                String regData = student.getStudentID()+ ","+ newCourse.getCourseCode()+","+newCourse.getCourseName();
                                CsvCrud.create("registrations.csv",regData);
                                System.out.println("[BİLGİ]: "+newCourse.getCourseName()+" dersi 'registrations.csv' dosyasına kaydedilmiştir...");
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

                    student.printReturnToMenu();
                    break;

                case 5:
                    if(student.getStudentCourses().isEmpty()) {
                        student.printNoCourseWarning();
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
