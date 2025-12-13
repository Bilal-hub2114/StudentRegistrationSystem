import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Course course=new Course();
        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen Öğrenci ID' nizi giriniz: ");
        int inputstudentID=scan.nextInt();

        Student student= new Student("Bilal","Ay","bilalay24@istanbularel.eduu.tr",240309006,2,"545 909 14 21");

        if(inputstudentID==student.getStundentID()){
            System.out.println("Hoşgeldin Bilal Ay...");
            System.out.println();
            student.printStudent();

        System.out.println("Lütfen yapmak istediğiniz işlem türünü seçiniz: ");
        System.out.println("1 - Ders Ekle/Çıkar");
        System.out.println("2 - Ders Listesi Görüntüle");
        System.out.println("3 - Ders Kayıt Olma");
        System.out.println("Seçiminiz: ");
        int select=scan.nextInt();

        switch(select){
            case 1:
                course.courseInput();
                break;
            case 2:
                break;
            case 3:
                break;
        }
        }
        else{
            System.out.println("Eksik ya da yanlış tuşladınız...");
        }



    }
}