import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CourseCatalog {
    static ArrayList<String> greade1List = new ArrayList<>();
    static ArrayList<String> greade2List = new ArrayList<>();
    static ArrayList<String> greade3List = new ArrayList<>();
    static ArrayList<String> greade4List = new ArrayList<>();

    static Map<String,Double> priceChart=new HashMap<>();
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




        priceChart.put("Bilgisayar Mühendisliğine Giriş",40000.00);
        priceChart.put("Algoritma ve Programlama-I",35000.00);
        priceChart.put("Algoritma ve Programlama-II",35000.00);
        priceChart.put("Matematik-I",34500.00);
        priceChart.put("Matematik-II",34500.00);
        priceChart.put("Fizik-I",30000.00);
        priceChart.put("Fizik-II",30000.00);
        priceChart.put("Yükseköğretime Giriş ve Kariyer Planlama",15000.00);
        priceChart.put("Türk Dili-I",15000.00);
        priceChart.put("Türk Dili-II",15000.00);
        priceChart.put("İngilizce-I",15000.00);
        priceChart.put("İngilizce-II",15000.00);
        priceChart.put("Lineer Cebir ve Uygulamaları",33000.00);

        priceChart.put("Veri Yapıları",40000.00);
        priceChart.put("Nesne Tabanlı Programlama",40000.00);
        priceChart.put("Elektronik-I",30000.00);
        priceChart.put("Ayrık Matematik",25000.00);
        priceChart.put("Diferansiyel Denklemler",33250.00);
        priceChart.put("Olasılık ve İstatistik",33250.00);
        priceChart.put("Atatürk İlkeleri ve İnkılap Tarihi-I",15000.00);
        priceChart.put("Yazılım Mühendisliği",40000.00);
        priceChart.put("Bilgisayar Organizasyonu",27850.00);
        priceChart.put("Genel Biyoloji",15000.00);
        priceChart.put("İşaretler ve Sistemler",22500.00);
        priceChart.put("Sayısal Tasarıma Giriş",15000.00);
        priceChart.put("Kuantum Fiziği",33400.00);
        priceChart.put("Nümerik Analiz ve Uygulamaları",30000.00);
        priceChart.put("Atatürk İlkeleri ve İnkılap Tarihi-II",15000.00);

        priceChart.put("Veri Haberleşmesi ve Bilgisayar Ağları",30000.00);
        priceChart.put("Veritabanı Yönetim Sistemleri",31250.00);
        priceChart.put("Mikroişlemciler",32000.00);
        priceChart.put("İşletim Sistemleri",40000.00);
        priceChart.put("Yetkinlik Geliştirme",10000.00);
        priceChart.put("Eleştirel Düşünme, Yaratıcılık ve Girişimcilik",15000.00);
        priceChart.put("Sistem Programlama",26000.00);
        priceChart.put("Görsel Tabanlı Programlama",28450.00);
        priceChart.put("Bilgisayar Grafikleri",37600.00);
        priceChart.put("Web Programlama",32000.00);
        priceChart.put("Sistem Analizi ve Tasarımı",17500.00);
        priceChart.put("Çevre Koruma, İş Sağlığı ve Güvenliği",15000.00);
        priceChart.put("Mesleki Sorumluluk ve Etik",15000.00);


        priceChart.put("Formal Diller ve Otomata",45000.00);
        priceChart.put("Veri Madenciliği",55750.00);
        priceChart.put("Mühendislikte Disiplinlerarası Proje",60000.00);

        //seçmeli dersler
        priceChart.put("Ağ Programlama",24000.00);
        priceChart.put("Bilgisayar Ağlarında Güvenlik",24000.00);
        priceChart.put("Gerçek Zamanlı Sistemler",24000.00);
        priceChart.put("İleri Nesne Tabanlı Programlama",24000.00);
        priceChart.put("İleri Veritabanı Sistemleri",24000.00);
        priceChart.put("Kablosuz Haberleşme",24000.00);
        priceChart.put("Makine Öğrenmesi",24000.00);
        priceChart.put("Mühendisler İçin Bilgisayar Programlama",24000.00);
        priceChart.put("Nöral Ağlar",24000.00);
        priceChart.put("Semantik Web Teknolojileri",24000.00);
        priceChart.put("Yazılım Kalite Güvencesi ve Testi",24000.00);
        priceChart.put("Yapay Zeka",24000.00);
        priceChart.put("Yazılım Gereksinim Analizi",24000.00);
        priceChart.put("Güç Sistemlerinde Koruma",24000.00);
        priceChart.put("Robotik",24000.00);
        priceChart.put("Derin Öğrenme ve Sınıflandırma Teknikler",24000.00);
        priceChart.put("Sayısal İşaret işleme",24000.00);
        priceChart.put("Organik Yapılı Elektronik Sistemler",24000.00);
        priceChart.put("Yenilenebilir Enerji",24000.00);
        priceChart.put("Katıhal Elektroniği",24000.00);
        priceChart.put("Yüksek Gerilim Tekniği",24000.00);
        priceChart.put("Peakup-Bulut Bilişim",24000.00);
        priceChart.put("DeFacto Bilgi Güvenliği ve BT Yönetişimi",24000.00);
    }

    public ArrayList<String> courseInput() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>();


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
            price += priceChart.getOrDefault(s,0.0);
        }
        return price;
    }
    public double scholarshipAmount(double price,double scholarshipAmount){
        double bursindirimi = (price * scholarshipAmount) / 100;
        return price - bursindirimi;
    }
}
