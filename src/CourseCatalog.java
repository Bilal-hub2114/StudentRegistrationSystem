import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CourseCatalog {
    static ArrayList<Course> allCourses = new ArrayList<>();

    static {

        //lisansüstü için:
        allCourses.add(new Course("Ağ Programlama", "BLML463", 3,0, 24000.00));
        allCourses.add(new Course("Bilgisayar Ağlarında Güvenlik", "BLML464",3 ,0, 24000.00));
        allCourses.add(new Course("Gerçek Zamanlı Sistemler", "BLML468", 3,0, 24000.00));
        allCourses.add(new Course("İleri Nesne Tabanlı Programlama", "BLML469",3 ,0, 24000.00));
        allCourses.add(new Course("İleri Veritabanı Sistemleri", "BLML470", 3,0, 24000.00));
        allCourses.add(new Course("Kablosuz Haberleşme", "BLML471", 3,0, 24000.00));
        allCourses.add(new Course("Makine Öğrenmesi", "BLML472", 3,0, 24000.00));
        allCourses.add(new Course("Mühendisler İçin Bilgisayar Programlama", "BLML473",3, 0, 24000.00));
        allCourses.add(new Course("Nöral Ağlar", "BLML474",3 ,0, 24000.00));
        allCourses.add(new Course("Semantik Web Teknolojileri", "BLML477", 3,0, 24000.00));
        allCourses.add(new Course("Yazılım Kalite Güvencesi ve Testi", "BLML478",3 ,0, 24000.00));
        allCourses.add(new Course("Yapay Zeka", "BLML479", 3,0, 24000.00));
        allCourses.add(new Course("Yazılım Gereksinim Analizi", "BLML480", 3,0, 24000.00));
        allCourses.add(new Course("Güç Sistemlerinde Koruma", "EEML403", 3,0, 24000.00));
        allCourses.add(new Course("Robotik", "EEML415", 3,0, 24000.00));
        allCourses.add(new Course("Derin Öğrenme ve Sınıflandırma Teknikler", "BMML311", 3,0, 24000.00));
        allCourses.add(new Course("Sayısal İşaret işleme", "EEML315", 3,0, 24000.00));
        allCourses.add(new Course("Organik Yapılı Elektronik Sistemler", "EEML361", 3,0, 24000.00));
        allCourses.add(new Course("Yenilenebilir Enerji", "EEML366", 3,0, 24000.00));
        allCourses.add(new Course("Katıhal Elektroniği", "EEML368",3 ,0, 24000.00));
        allCourses.add(new Course("Yüksek Gerilim Tekniği", "EEML409", 3,0, 24000.00));
        allCourses.add(new Course("Peakup-Bulut Bilişim", "BLML306",3 ,0, 24000.00));
        allCourses.add(new Course("DeFacto Bilgi Güvenliği ve BT Yönetişimi", "BLML308",3 ,0, 24000.00));

        //1.sınıflar için:

        allCourses.add(new Course("Bilgisayar Mühendisliğine Giriş", "BLML160", 3,1, 40000.00));
        allCourses.add(new Course("Algoritma ve Programlama-I", "BLML161", 6,1, 35000.00));
        allCourses.add(new Course("Algoritma ve Programlama-II", "BLML162",6 ,1, 35000.00));
        allCourses.add(new Course("Matematik-I", "MBBL001",7 ,1, 34500.00));
        allCourses.add(new Course("Matematik-II", "MBBL003", 7,1, 34500.00));
        allCourses.add(new Course("Fizik-I", "MBBL017", 7,1, 30000.00));
        allCourses.add(new Course("Fizik-II", "MBBL019", 7,1, 30000.00));
        allCourses.add(new Course("Yükseköğretime Giriş ve Kariyer Planlama", "ORTL101",1 ,1, 15000.00));
        allCourses.add(new Course("Türk Dili-I", "ORTL171", 2,1, 15000.00));
        allCourses.add(new Course("Türk Dili-II", "ORTL271", 2,1, 15000.00));
        allCourses.add(new Course("İngilizce-I", "YDLL161",4 ,1, 15000.00));
        allCourses.add(new Course("İngilizce-II", "YDLL162",4 ,1, 15000.00));
        allCourses.add(new Course("Lineer Cebir ve Uygulamaları", "MBBL007", 4,1, 33000.00));

        //2.sınıflar için:

        allCourses.add(new Course("Veri Yapıları", "BLML201", 4,2, 40000.00));
        allCourses.add(new Course("Nesne Tabanlı Programlama", "BLML203",4 ,2, 40000.00));
        allCourses.add(new Course("Elektronik-I", "EEML202",4 ,2, 30000.00));
        allCourses.add(new Course("Ayrık Matematik", "MBBL013", 4,2, 25000.00));
        allCourses.add(new Course("Diferansiyel Denklemler", "MBBL015",6 ,2, 33250.00));
        allCourses.add(new Course("Olasılık ve İstatistik", "MBBL207", 6,2, 33250.00));
        allCourses.add(new Course("Atatürk İlkeleri ve İnkılap Tarihi-I", "ORTL161",2 ,2, 15000.00));
        allCourses.add(new Course("Yazılım Mühendisliği", "BLML210", 3,2, 40000.00));
        allCourses.add(new Course("Bilgisayar Organizasyonu", "BLML260",4 ,2, 27850.00));
        allCourses.add(new Course("Genel Biyoloji", "BMML162", 4,2, 15000.00));
        allCourses.add(new Course("İşaretler ve Sistemler", "EEML204", 4,2, 22500.00));
        allCourses.add(new Course("Sayısal Tasarıma Giriş", "EEML208", 5,2, 15000.00));
        allCourses.add(new Course("Nümerik Analiz ve Uygulamaları", "MBBL009", 5,2, 33400.00));
        allCourses.add(new Course("Kuantum Fiziği", "MBBL250", 3,2, 30000.00));
        allCourses.add(new Course("Atatürk İlkeleri ve İnkılap Tarihi-II", "ORTL261",2, 2, 15000.00));

        //3.sınıflar için:

        allCourses.add(new Course("Veri Haberleşmesi ve Bilgisayar Ağları", "BLML301", 6,3, 30000.00));
        allCourses.add(new Course("Veritabanı Yönetim Sistemleri", "BLML303", 6,3, 31250.00));
        allCourses.add(new Course("İşletim Sistemleri", "BLML361", 5,3, 32000.00));
        allCourses.add(new Course("Mikroişlemciler", "EEML311", 5,3, 40000.00));
        allCourses.add(new Course("Yetkinlik Geliştirme", "ORTL301", 1,3, 15000.00));
        allCourses.add(new Course("Eleştirel Düşünme, Yaratıcılık ve Girişimcilik", "ORTL363",2 ,3, 15000.00));
        allCourses.add(new Course("Sistem Programlama", "BLML302", 5,3, 26000.00));
        allCourses.add(new Course("Görsel Tabanlı Programlama", "BLML304", 4,3, 28450.00));
        allCourses.add(new Course("Bilgisayar Grafikleri", "BLML316",3 ,3, 37600.00));
        allCourses.add(new Course("Web Programlama", "BLML362",5 ,3, 32000.00));
        allCourses.add(new Course("Sistem Analizi ve Tasarımı", "BLML376", 4,3, 17500.00));
        allCourses.add(new Course("Çevre Koruma, İş Sağlığı ve Güvenliği", "ORTL361",2 ,3, 15000.00));
        allCourses.add(new Course("Mesleki Sorumluluk ve Etik", "ORTL367", 2,3, 15000.00));

        allCourses.add(new Course("Ağ Programlama", "BLML463", 3,3, 24000.00));
        allCourses.add(new Course("Bilgisayar Ağlarında Güvenlik", "BLML464", 3,3, 24000.00));
        allCourses.add(new Course("Gerçek Zamanlı Sistemler", "BLML468", 3,3, 24000.00));
        allCourses.add(new Course("İleri Nesne Tabanlı Programlama", "BLML469", 3,3, 24000.00));
        allCourses.add(new Course("İleri Veritabanı Sistemleri", "BLML470", 3,3, 24000.00));
        allCourses.add(new Course("Kablosuz Haberleşme", "BLML471", 3,3, 24000.00));
        allCourses.add(new Course("Makine Öğrenmesi", "BLML472", 3,3, 24000.00));
        allCourses.add(new Course("Mühendisler İçin Bilgisayar Programlama", "BLML473", 3,3, 24000.00));
        allCourses.add(new Course("Nöral Ağlar", "BLML474", 3,3, 24000.00));
        allCourses.add(new Course("Semantik Web Teknolojileri", "BLML477", 3,3, 24000.00));
        allCourses.add(new Course("Yazılım Kalite Güvencesi ve Testi", "BLML478", 3,3, 24000.00));
        allCourses.add(new Course("Yapay Zeka", "BLML479", 3,3, 24000.00));
        allCourses.add(new Course("Yazılım Gereksinim Analizi", "BLML480", 3,3, 24000.00));
        allCourses.add(new Course("Güç Sistemlerinde Koruma", "EEML403",3, 3, 24000.00));
        allCourses.add(new Course("Robotik", "EEML415", 3,3, 24000.00));
        allCourses.add(new Course("Derin Öğrenme ve Sınıflandırma Teknikler", "BMML311",3 ,3, 24000.00));
        allCourses.add(new Course("Sayısal İşaret işleme", "EEML315", 3,3, 24000.00));
        allCourses.add(new Course("Organik Yapılı Elektronik Sistemler", "EEML361",3 ,3, 24000.00));
        allCourses.add(new Course("Yenilenebilir Enerji", "EEML366", 3,3, 24000.00));
        allCourses.add(new Course("Katıhal Elektroniği", "EEML368", 3,3, 24000.00));
        allCourses.add(new Course("Yüksek Gerilim Tekniği", "EEML409", 3,3, 24000.00));
        allCourses.add(new Course("Peakup-Bulut Bilişim", "BLML306",3, 3, 24000.00));
        allCourses.add(new Course("DeFacto Bilgi Güvenliği ve BT Yönetişimi", "BLML308",3 ,3, 24000.00));

        //4.sınıflar için:

        allCourses.add(new Course("Formal Diller ve Otomata", "BLML403",5 ,4, 60000.00));
        allCourses.add(new Course("Veri Madenciliği", "BLML467", 3,4, 55750.00));
        allCourses.add(new Course("Mühendislikte Disiplinlerarası Proje", "MMFL401",4 ,4, 60000.00));

        allCourses.add(new Course("Ağ Programlama", "BLML463",3 ,4, 24000.00));
        allCourses.add(new Course("Bilgisayar Ağlarında Güvenlik", "BLML464",3 ,4, 24000.00));
        allCourses.add(new Course("Gerçek Zamanlı Sistemler", "BLML468", 3,4, 24000.00));
        allCourses.add(new Course("İleri Nesne Tabanlı Programlama", "BLML469",3 ,4, 24000.00));
        allCourses.add(new Course("İleri Veritabanı Sistemleri", "BLML470",3 ,4, 24000.00));
        allCourses.add(new Course("Kablosuz Haberleşme", "BLML471", 3,4, 24000.00));
        allCourses.add(new Course("Makine Öğrenmesi", "BLML472", 3,4, 24000.00));
        allCourses.add(new Course("Mühendisler İçin Bilgisayar Programlama", "BLML473", 3,4, 24000.00));
        allCourses.add(new Course("Nöral Ağlar", "BLML474",3 ,4, 24000.00));
        allCourses.add(new Course("Semantik Web Teknolojileri", "BLML477",3 ,4, 24000.00));
        allCourses.add(new Course("Yazılım Kalite Güvencesi ve Testi", "BLML478",3 ,4, 24000.00));
        allCourses.add(new Course("Yapay Zeka", "BLML479",3 ,4, 24000.00));
        allCourses.add(new Course("Yazılım Gereksinim Analizi", "BLML480",3 ,4, 24000.00));
        allCourses.add(new Course("Güç Sistemlerinde Koruma", "EEML403",3 ,4, 24000.00));
        allCourses.add(new Course("Robotik", "EEML415", 3,4, 24000.00));
        allCourses.add(new Course("Derin Öğrenme ve Sınıflandırma Teknikler", "BMML311",3 ,4, 24000.00));
        allCourses.add(new Course("Sayısal İşaret işleme", "EEML315",3 ,4, 24000.00));
        allCourses.add(new Course("Organik Yapılı Elektronik Sistemler", "EEML361",3 ,4, 24000.00));
        allCourses.add(new Course("Yenilenebilir Enerji", "EEML366", 3,4, 24000.00));
        allCourses.add(new Course("Katıhal Elektroniği", "EEML368", 3,4, 24000.00));
        allCourses.add(new Course("Yüksek Gerilim Tekniği", "EEML409", 3,4, 24000.00));
        allCourses.add(new Course("Peakup-Bulut Bilişim", "BLML306",3 ,4, 24000.00));
        allCourses.add(new Course("DeFacto Bilgi Güvenliği ve BT Yönetişimi", "BLML308",3 ,4, 24000.00));
}
public static void listCourseByGrade(int studentClass){

        System.out.println(studentClass+". Sınıf Dersleri Listeleniyor");
        for(Course c: allCourses){
            if(c.getStudentClass()==studentClass){
                System.out.println(c.getCourseName());
            }
        }
        System.out.println();
}

public static ArrayList<Course> courseInput(ArrayList<String> courses ) {
    ArrayList<Course> selectCourseList = new ArrayList<>();
    for(String course : courses) {
        for(Course c : allCourses) {
            if(c.getCourseName().equalsIgnoreCase(course)) {
                selectCourseList.add(c);
            break;
            }
        }
    }
    return selectCourseList;
}
}




