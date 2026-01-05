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
        int scholarshipAmount = control.controlScholarshipAmount(scan);


        System.out.println("Lisansüstü okuyorsanız (0)' ı / Lisans okuyorsanız kaçıncı sınıf olduğunuzu giriniz");
        System.out.print("Seçiminiz: ");
        int studentClass=control.controlInputStudentClass(scan);


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
            int select = control.controlInputSelect(scan);
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
                            System.out.print("Eklemek İstediğiniz Dersin Adı: ");
                            String coursesName = scan.nextLine().trim();

                            if (coursesName.equalsIgnoreCase("bitir")) {
                                break;
                            }
                            inputCourses.clear();
                            inputCourses.add(coursesName);
                            ArrayList<Course> selected = CourseCatalog.courseInput(inputCourses);

                            for(Course c: selected){
                                if (!Registration.checkCopy(student.getStudentCourses(), c)) {
                                  if(!Registration.controlCourseTime(student.getStudentCourses(), c)) {
                                    student.registerCourse(c);
                                    System.out.println("(+) ["+c.getCourseName()+"] dersi listenize eklendi.");
                                  }
                                  else{
                                     System.out.println("[HATA]: Ders saati çakışıyor.");
                                  }

                                }
                            else{
                                System.out.println("[UYARI]: Bu ders daha önceden listenize eklenmiş.");
                            }
                            }

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
                        student.listCourses();
                        System.out.println("================ Ders çıkarmayı bitirmek için 'bitir' yazınız ================");

                        while(true){
                        System.out.print("Çıkarmak İstediğiniz Dersi Yazınız: ");
                        String inputCourseName= scan.nextLine().trim();
                            //BURAYA BAKACAĞIZ AMA NE GİBİ HATA ALIRIZ BİLİNMİYOR ŞUANLIK
                            if (inputCourseName.equalsIgnoreCase("bitir")) {
                                break;
                            }
                         student.reductionOfCourses(inputCourseName);
                        }
                    }
                    student.printReturnToMenu();
                    break;

                case 3:
                    if(student.getStudentCourses().isEmpty()) {
                        student.printNoCourseWarning();
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
                        String name = scan.nextLine().trim();
                        //BURAYA BAKACAĞIZ AMA NE GİBİ HATA ALIRIZ BİLİNMİYOR ŞUANLIK

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
