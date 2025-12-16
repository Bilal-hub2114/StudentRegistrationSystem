import java.util.ArrayList;
import java.util.Scanner;
public class Course {


    public void courseInput() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> liste = new ArrayList<>();
        System.out.println("Almak istediğiniz dersleri giriniz.");
        while (true) {
            System.out.print("Ders: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("bitir")) {
                break;
            }
            liste.add(input);
            System.out.println("Ders eklemeyi bitirmek için 'bitir' yazınız.");

        }
        System.out.println("Eklenen dersler: " + liste);
        // bu bloğu öğrencinin kaçıncı sınıf olduğuna göre
        //değişiklik göstermel


    }

    double calculateTuition(ArrayList<String> liste) {
        double price = 0;
        for (int i = 0; i < liste.size(); i++) {
            switch (liste.get(i)) {
                case "Matematik-I":
                    price += 30000;
                    break;
                case "ingilizce-I":
                    price += 15000;
                    break;
                case "Türk Dili-I":
                    price += 15000;
                    break;
                case "Fizik-I":
                    price += 25000;
                    break;
                case "Bilgisayar Mühendisliğe Giriş":
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
