import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Course {
    static ArrayList<String> greade1List = new ArrayList<>();
    static ArrayList<String> greade2List = new ArrayList<>();
    static ArrayList<String> greade3List = new ArrayList<>();
    static ArrayList<String> greade4List = new ArrayList<>();
static Map<Integer,String> sınıfınagöreListe =new HashMap<>();
  static Map<String,Double> fiyatTablosu=new HashMap<>();
  static{
      //1.sınıflar için:
      greade1List.add("Bilgisayar Mühendisliğine Giriş");
      greade1List.add("Algoritma ve Programlama-I");
      greade1List.add("Algoritma ve Programlama-II");
      greade1List.add("Matematik-I");
      greade1List.add("Matematik-II");
      greade1List.add("Fizik-I");
      greade1List.add("Fizik-II");
      greade1List.add("Yükseköğretime Giriş ve Kariyer Planlama");
      greade1List.add("Türk Dili-I");
      greade1List.add("Türk Dili-II");
      greade1List.add("İngilizce-I");
      greade1List.add("İngilizce-II");
      greade1List.add("Lineer Cebir ve Uygulamaları");

      //2. sınıflar için:
      greade2List.add("Veri Yapıları");
      greade2List.add("Nesne Tabanlı Programlama");
      greade2List.add("Elektronik-I");
      greade2List.add("Ayrık Matematik");
      greade2List.add("Diferansiyel Denklemler");
      greade2List.add("Olasılık ve İstatistik");
      greade2List.add("Atatürk İlkeleri ve İnkılap Tarihi-I");
      greade2List.add("Yazılım Mühendisliği");
      greade2List.add("Bilgisayar Organizasyonu");
      greade2List.add("Genel Biyoloji");
      greade2List.add("İşaretler ve Sistemler");
      greade2List.add("Sayısal Tasarıma Giriş");
      greade2List.add("Kuantum Fiziği");
      greade2List.add("Nümerik Analiz ve Uygulamaları");
      greade2List.add("Atatürk İlkeleri ve İnkılap Tarihi-II");

      //3. sınıflar için:
      //zorunlu
      greade3List.add("Veri Haberleşmesi ve Bilgisayar Ağları");
      greade3List.add("Veritabanı Yönetim Sistemleri");
      greade3List.add("Mikroişlemciler");
      greade3List.add("İşletim Sistemleri");
      greade3List.add("Yetkinlik Geliştirme");
      greade3List.add("Eleştirel Düşünme, Yaratıcılık ve Girişimcilik");
      greade3List.add("Sistem Programlama");
      greade3List.add("Görsel Tabanlı Programlama");
      greade3List.add("Bilgisayar Grafikleri");
      greade3List.add("Web Programlama");
      greade3List.add("Sistem Analizi ve Tasarımı");
      greade3List.add("Çevre Koruma, İş Sağlığı ve Güvenliği ");
      greade3List.add("Mesleki Sorumluluk ve Etik");
      greade3List.add("Genel Biyoloji");
      greade3List.add("İşaretler ve Sistemler");
      greade3List.add("Sayısal Tasarıma Giriş");
      greade3List.add("Kuantum Fiziği");
      greade3List.add("Nümerik Analiz ve Uygulamaları");
      greade3List.add("Atatürk İlkeleri ve İnkılap Tarihi-II");

      //bu satırdan sonrası seçmeli ders yani eğer öğrenci 3. sınıfsa seçmeli mi alan dersi mi seçecek onu seçmeli
      greade3List.add("Ağ Programlama");
      greade3List.add("Bilgisayar Ağlarında Güvenlik");
      greade3List.add("Gerçek Zamanlı Sistemler");
      greade3List.add("İleri Nesne Tabanlı Programlama");
      greade3List.add("İleri Veritabanı Sistemleri");
      greade3List.add("Kablosuz Haberleşme");
      greade3List.add("Makine Öğrenmesi");
      greade3List.add("Mühendisler İçin Bilgisayar Programlama");
      greade3List.add("Nöral Ağlar");
      greade3List.add("Semantik Web Teknolojileri");
      greade3List.add("Yazılım Kalite Güvencesi ve Testi");
      greade3List.add("Yapay Zeka");
      greade3List.add("Yazılım Gereksinim Analizi");
      greade3List.add("Güç Sistemlerinde Koruma");
      greade3List.add("Robotik");
      greade3List.add("Derin Öğrenme ve Sınıflandırma Teknikler");
      greade3List.add("Sayısal İşaret işleme");
      greade3List.add("Organik Yapılı Elektronik Sistemler");
      greade3List.add("Yenilenebilir Enerji");
      greade3List.add("Katıhal Elektroniği");
      greade3List.add("Yüksek Gerilim Tekniği");
      greade3List.add("Peakup-Bulut Bilişim");
      greade3List.add("DeFacto Bilgi Güvenliği ve BT Yönetişimi");


      //4. sınıflar için:
      greade4List.add("Formal Diller ve Otomata");
      greade4List.add("Veri Madenciliği");
      greade4List.add("Mühendislikte Disiplinlerarası Proje");

      //seçmeli
      greade4List.add("Ağ Programlama");
      greade4List.add("Bilgisayar Ağlarında Güvenlik");
      greade4List.add("Gerçek Zamanlı Sistemler");
      greade4List.add("İleri Nesne Tabanlı Programlama");
      greade4List.add("İleri Veritabanı Sistemleri");
      greade4List.add("Kablosuz Haberleşme");
      greade4List.add("Makine Öğrenmesi");
      greade4List.add("Mühendisler İçin Bilgisayar Programlama");
      greade4List.add("Nöral Ağlar");
      greade4List.add("Semantik Web Teknolojileri");
      greade4List.add("Yazılım Kalite Güvencesi ve Testi");
      greade4List.add("Yapay Zeka");
      greade4List.add("Yazılım Gereksinim Analizi");
      greade4List.add("Güç Sistemlerinde Koruma");
      greade4List.add("Robotik");
      greade4List.add("Derin Öğrenme ve Sınıflandırma Teknikler");
      greade4List.add("Sayısal İşaret işleme");
      greade4List.add("Organik Yapılı Elektronik Sistemler");
      greade4List.add("Yenilenebilir Enerji");
      greade4List.add("Katıhal Elektroniği");
      greade4List.add("Yüksek Gerilim Tekniği");
      greade4List.add("Peakup-Bulut Bilişim");
      greade4List.add("DeFacto Bilgi Güvenliği ve BT Yönetişimi");




      fiyatTablosu.put("Bilgisayar Mühendisliğine Giriş",40.00);
        fiyatTablosu.put("Algoritma ve Programlama-I",35.00);
        fiyatTablosu.put("Algoritma ve Programlama-II",35.00);
        fiyatTablosu.put("Matematik-I",345.5);
       fiyatTablosu.put("Matematik-II",5675.8);
        fiyatTablosu.put("Fizik-I",345.5);
        fiyatTablosu.put("Fizik-II",12313.5);
       fiyatTablosu.put("Yükseköğretime Giriş ve Kariyer Planlama",3453453.5);
       fiyatTablosu.put("Türk Dili-I",3453534.5);
       fiyatTablosu.put("Türk Dili-II",45646.6);
      fiyatTablosu.put("İngilizce-I",56756756.5);
      fiyatTablosu.put("İngilizce-II",465546.6);
      fiyatTablosu.put("Lineer Cebir ve Uygulamaları",14123.1);

//aynısını 4 ders içinde yapılacak
}

    //4 tane ayrı liste 4 ünede ayrı ayrı dersler add lenecek ve bunları başta görmesi için printleyeceğiz ve bunları da tek tek ücretlerini yazıp tutarı hesaplayıp return ettireceğiz
    //bunu da burs ile hesaplayıp tekrar printleyeceğiz ve mainde güncel tutarı yazdıracağız
    public ArrayList<String> courseInput() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>();

        // bu kodun aşağısı  dersleri alır ve ona göre ne aldıysa o dersi döner
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
        return courses;
    }


    static double calculateTuition(ArrayList<String> course) {
        double price=0;
        for(String s: course){
            price += fiyatTablosu.getOrDefault(s,0.0);
        }
        return price;
    }
     public double scholarshipAmount(double price,double scholarshipAmount){
        double bursindirimi = (price * scholarshipAmount) / 100;
        return price - bursindirimi;
    }
}
