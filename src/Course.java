import java.util.ArrayList;
import java.util.Scanner;
public class Course {


    void printList( ArrayList<String> list){
        int i=1;
        for(String s: list){
            System.out.println(i+") "+s);
            i++;
        }

    }
    public ArrayList<String> courseInput() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>();
        ArrayList<String> list=new ArrayList<>();

        list.add("Bilgisayar Mühendisliğine Giriş"); list.add("Algoritma ve Programlama-I"); list.add("Matematik-I"); list.add("Fizik-I"); list.add("İngilizce-I"); list.add("Yükseköğretime Giriş");
        list.add("Algoritma ve Programlama-II"); list.add("Matematik-II"); list.add("Lineer Cebir ve Uygulamaları"); list.add("Fizik-II"); list.add("Türk Dili-II"); list.add("İngilizce-II");

       printList(list);

        System.out.println("Almak istediğiniz dersleri giriniz.");
        while (true) {
            System.out.print("Ders: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("bitir")) {
                break;
            }
            courses.add(input);
            System.out.println("Ders eklemeyi bitirmek için 'bitir' yazınız.");

        }
        System.out.println("Eklenen dersler: " + courses);
        // bu bloğu öğrencinin kaçıncı sınıf olduğuna göre
        //değişiklik göstermel
        return courses;

    }

    double calculateTuition(ArrayList<String> courses) {
        double price = 0;
        for (int i = 0; i < courses.size(); i++) {
            switch (courses.get(i)) {
                case "Matematik-I":
                    price += 30000;
                    break;
                case "İngilizce-I":
                    price += 15000;
                    break;
                case "Türk Dili-I":
                    price += 15000;
                    break;
                case "Fizik-I":
                    price += 25000;
                    break;
                case "Bilgisayar Mühendisliğine Giriş":
                    price += 20000;
                    break;
                case "Algoritme ve Programlama-I":
                    price += 35000;
                    break;
                case "Yükseköğretime Giriş ve Kariyer Planlama":
                    price += 15000;
                    break;
                case "Algoritma ve Programlama-II":
                    price += 35000;
                    break;
                case "Matematik-II":
                    price += 30000;
                    break;
                case "Lineer Cebir ve Uygulamaları":
                    price += 20000;
                    break;
                case "Fizik-II":
                    price += 25000;
                    break;
                case "Türk Dili-II":
                    price += 15000;
                    break;
                case "İngilizce-II":
                    price += 15000;
                    break;
            }
        }
        return price;
    }


}
