import java.util.ArrayList;


public class CourseCatalog {
    static ArrayList<Course> allCourses = new ArrayList<>();

    static {

        Instructor instructor1= new Instructor("Tuğberk","KOCATEKİN","Yazılım Mühendisliği");
        Instructor instructor2= new Instructor("Bülent","AYANLAR","Bilişim Sistemleri Mühendisliği");
        Instructor instructor3= new Instructor("Tahir","AZEROĞLU","Türk Dili ve Edebiyatı");
        Instructor instructor4= new Instructor("Serdar","MENEKAY","Elektronik-Elektronik Mühendisliği");
        Instructor instructor5= new Instructor("Sibel","AKAR","Yapay Zeka Mühendisliği");
        Instructor instructor6= new Instructor("Ahmet","GÜRKANLI","Matematik Mühendisliği");
        Instructor instructor7= new Instructor("Pınar","ATAŞ","Bilgisayar Mühendisliği");
        Instructor instructor8= new Instructor("Elif","PARACIKOĞLU","Tarih");
        Instructor instructor9= new Instructor("Özlem","İLGİN","Fizik Mühendisliği");
        Instructor instructor10= new Instructor("Melik","EROL","İngiliz Dili ve Edebiyatı");
        Instructor instructor11= new Instructor("Kenan","DUMAN","Psikoloji");
        Instructor instructor12= new Instructor("Esra","ULUOCAK","Endüstri Mühendisliği");
        Instructor instructor13= new Instructor("Ceren","MELEK","Siber Güvenlik");
        Instructor instructor14= new Instructor("Ebru","UZUN","Yönetim Bilişim Sistemleri");
        Instructor instructor15= new Instructor("Canan","YILDIZ","Möleküler Biyoloji ve Genetik");



        //lisansüstü için:

        allCourses.add(new Course("Ağ Programlama", "BLML463","PAZARTESİ" ,"13.00",3,0, 24000.00,instructor2));
        allCourses.add(new Course("Bilgisayar Ağlarında Güvenlik", "BLML464","PAZARTESİ","12.00",3 ,0, 24000.00,instructor13));
        allCourses.add(new Course("Gerçek Zamanlı Sistemler", "BLML468", "PAZARTESİ","10.00",3,0, 24000.00,instructor7));
        allCourses.add(new Course("İleri Nesne Tabanlı Programlama", "BLML469","ÇARŞAMBA","09.00",3 ,0, 24000.00,instructor1));
        allCourses.add(new Course("İleri Veritabanı Sistemleri", "BLML470", "SALI","13.00",3,0, 24000.00,instructor5));
        allCourses.add(new Course("Kablosuz Haberleşme", "BLML471", "PAZARTESİ","12.00",3,0, 24000.00,instructor14));
        allCourses.add(new Course("Makine Öğrenmesi", "BLML472", "SALI","10.00",3,0, 24000.00,instructor12));
        allCourses.add(new Course("Mühendisler İçin Bilgisayar Programlama", "BLML473","CUMA","12.00",3, 0, 24000.00,instructor7));
        allCourses.add(new Course("Nöral Ağlar", "BLML474","SALI","13.00",3 ,0, 24000.00,instructor5));
        allCourses.add(new Course("Semantik Web Teknolojileri", "BLML477", "PAZARTESİ","13.00",3,0, 24000.00,instructor1));
        allCourses.add(new Course("Yazılım Kalite Güvencesi ve Testi", "BLML478","ÇARŞAMBA","12.00",3 ,0, 24000.00,instructor2));
        allCourses.add(new Course("Yapay Zeka", "BLML479", "PERŞEMBE","11.00",3,0, 24000.00,instructor5));
        allCourses.add(new Course("Yazılım Gereksinim Analizi", "BLML480","CUMA","09.00",3,0, 24000.00,instructor1));
        allCourses.add(new Course("Güç Sistemlerinde Koruma", "EEML403","ÇARŞAMBA" ,"14.00",3,0, 24000.00,instructor7));
        allCourses.add(new Course("Robotik", "EEML415", "PERŞEMBE","14.00",3,0, 24000.00,instructor4));
        allCourses.add(new Course("Derin Öğrenme ve Sınıflandırma Teknikler", "BMML311", "CUMA","16.00",3,0, 24000.00,instructor5));
        allCourses.add(new Course("Sayısal İşaret işleme", "EEML315", "PERŞEMBE","15.00",3,0, 24000.00,instructor6));
        allCourses.add(new Course("Organik Yapılı Elektronik Sistemler", "EEML361","CUMA", "15.00",3,0, 24000.00,instructor4));
        allCourses.add(new Course("Yenilenebilir Enerji", "EEML366", "CUMA","12.00",3,0, 24000.00,instructor12));
        allCourses.add(new Course("Katıhal Elektroniği", "EEML368","PERŞEMBE","13.00",3 ,0, 24000.00,instructor4));
        allCourses.add(new Course("Yüksek Gerilim Tekniği", "EEML409","CUMA" ,"12.00",3,0, 24000.00,instructor4));
        allCourses.add(new Course("Peakup-Bulut Bilişim", "BLML306","PERŞEMBE","10.00",3 ,0, 24000.00,instructor2));
        allCourses.add(new Course("DeFacto Bilgi Güvenliği ve BT Yönetişimi", "BLML308","CUMA","13.00",3 ,0, 24000.00,instructor1));

        //1.sınıflar için:

        allCourses.add(new Course("Bilgisayar Mühendisliğine Giriş", "BLML160","PAZARTESİ" ,"14.00",3,1, 40000.00,instructor7));
        allCourses.add(new Course("Algoritma ve Programlama-I", "BLML161", "SALI","13.00",6,1, 35000.00,instructor7));
        allCourses.add(new Course("Algoritma ve Programlama-II", "BLML162","ÇARŞAMBA","09.00",6 ,1, 35000.00,instructor7));
        allCourses.add(new Course("Matematik-I", "MBBL001","PAZARTESİ","11.00",7 ,1, 34500.00,instructor6));
        allCourses.add(new Course("Matematik-II", "MBBL003","PERŞEMBE" ,"13.00",7,1, 34500.00,instructor6));
        allCourses.add(new Course("Fizik-I", "MBBL017","PAZARTESİ" ,"12.00",7,1, 30000.00,instructor9));
        allCourses.add(new Course("Fizik-II", "MBBL019","SALI" ,"13.00",7,1, 30000.00,instructor9));
        allCourses.add(new Course("Yükseköğretime Giriş ve Kariyer Planlama", "ORTL101","CUMA","14.00",1 ,1, 15000.00,instructor8));
        allCourses.add(new Course("Türk Dili-I", "ORTL171","PAZARTESİ" ,"10.00",2,1, 15000.00,instructor3));
        allCourses.add(new Course("Türk Dili-II", "ORTL271", "PAZARTESİ","12.00",2,1, 15000.00,instructor3));
        allCourses.add(new Course("İngilizce-I", "YDLL161","CUMA","15.00",4 ,1, 15000.00,instructor10));
        allCourses.add(new Course("İngilizce-II", "YDLL162","CUMA","15.00",4 ,1, 15000.00,instructor10));
        allCourses.add(new Course("Lineer Cebir ve Uygulamaları", "MBBL007", "ÇARŞAMBA","16.00",4,1, 33000.00,instructor2));

        //2.sınıflar için:

        allCourses.add(new Course("Veri Yapıları", "BLML201","PAZARTESİ" ,"09.00",4,2, 40000.00,instructor1));
        allCourses.add(new Course("Nesne Tabanlı Programlama", "BLML203","ÇARŞAMBA","11.00",4 ,2, 40000.00,instructor1));
        allCourses.add(new Course("Elektronik-I", "EEML202","PAZARTESİ","13.00",4 ,2, 30000.00,instructor4));
        allCourses.add(new Course("Ayrık Matematik", "MBBL013", "SALI","12.00",4,2, 25000.00,instructor12));
        allCourses.add(new Course("Diferansiyel Denklemler", "MBBL015","PERŞEMBE","09.00",6 ,2, 33250.00,instructor2));
        allCourses.add(new Course("Olasılık ve İstatistik", "MBBL207", "PAZARTESİ","10.00",6,2, 33250.00,instructor12));
        allCourses.add(new Course("Atatürk İlkeleri ve İnkılap Tarihi-I", "ORTL161","CUMA","14.00",2 ,2, 15000.00,instructor8));
        allCourses.add(new Course("Yazılım Mühendisliği", "BLML210","SALI" ,"13.00",3,2, 40000.00,instructor1));
        allCourses.add(new Course("Bilgisayar Organizasyonu", "BLML260","PERŞEMBE","09.00",4 ,2, 27850.00,instructor13));
        allCourses.add(new Course("Genel Biyoloji", "BMML162", "PERŞEMBE","12.00",4,2, 15000.00,instructor15));
        allCourses.add(new Course("İşaretler ve Sistemler", "EEML204","CUMA" ,"13.00",4,2, 22500.00,instructor12));
        allCourses.add(new Course("Sayısal Tasarıma Giriş", "EEML208","ÇARŞAMBA" ,"15.00",5,2, 15000.00,instructor6));
        allCourses.add(new Course("Nümerik Analiz ve Uygulamaları", "MBBL009","CUMA" ,"16.00",5,2, 33400.00,instructor14));
        allCourses.add(new Course("Kuantum Fiziği", "MBBL250", "PERŞEMBE","16.00",3,2, 30000.00,instructor9));
        allCourses.add(new Course("Atatürk İlkeleri ve İnkılap Tarihi-II", "ORTL261","CUMA","15.00",2, 2, 15000.00,instructor8));

        //3.sınıflar için:

        allCourses.add(new Course("Veri Haberleşmesi ve Bilgisayar Ağları", "BLML301","SALI" ,"09.00",6,3, 30000.00,instructor5));
        allCourses.add(new Course("Veritabanı Yönetim Sistemleri", "BLML303","PAZARTESİ" ,"13.00",6,3, 31250.00,instructor5));
        allCourses.add(new Course("İşletim Sistemleri", "BLML361", "CUMA","11.00",5,3, 32000.00,instructor7));
        allCourses.add(new Course("Mikroişlemciler", "EEML311", "PAZARTESİ","09.00",5,3, 40000.00,instructor4));
        allCourses.add(new Course("Yetkinlik Geliştirme", "ORTL301","ÇARŞAMBA" ,"10.00",1,3, 15000.00,instructor11));
        allCourses.add(new Course("Eleştirel Düşünme, Yaratıcılık ve Girişimcilik", "ORTL363","CUMA","14.00",2 ,3, 15000.00,instructor14));
        allCourses.add(new Course("Sistem Programlama", "BLML302","SALI" ,"12.00",5,3, 26000.00,instructor12));
        allCourses.add(new Course("Görsel Tabanlı Programlama", "BLML304","CUMA" ,"10.00",4,3, 28450.00,instructor13));
        allCourses.add(new Course("Bilgisayar Grafikleri", "BLML316","PAZARTESİ","14.00",3 ,3, 37600.00,instructor12));
        allCourses.add(new Course("Web Programlama", "BLML362","ÇARŞAMBA","12.00",5 ,3, 32000.00,instructor1));
        allCourses.add(new Course("Sistem Analizi ve Tasarımı", "BLML376", "CUMA","13.00",4,3, 17500.00,instructor1));
        allCourses.add(new Course("Çevre Koruma, İş Sağlığı ve Güvenliği", "ORTL361","CUMA","15.00",2 ,3, 15000.00,instructor11));
        allCourses.add(new Course("Mesleki Sorumluluk ve Etik", "ORTL367","ÇARŞAMBA" ,"15.00",2,3, 15000.00,instructor11));

        allCourses.add(new Course("Ağ Programlama", "BLML463", "PAZARTESİ","13.00",3,3, 24000.00,instructor2));
        allCourses.add(new Course("Bilgisayar Ağlarında Güvenlik", "BLML464", "PAZARTESİ","15.00",3,3, 24000.00,instructor13));
        allCourses.add(new Course("Gerçek Zamanlı Sistemler", "BLML468", "SALI","16.00",3,3, 24000.00,instructor7));
        allCourses.add(new Course("İleri Nesne Tabanlı Programlama", "BLML469","CUMA" ,"11.00",3,3, 24000.00,instructor1));
        allCourses.add(new Course("İleri Veritabanı Sistemleri", "BLML470", "CUMA","16.00",3,3, 24000.00,instructor5));
        allCourses.add(new Course("Kablosuz Haberleşme", "BLML471", "SALI","13.00",3,3, 24000.00,instructor14));
        allCourses.add(new Course("Makine Öğrenmesi", "BLML472", "PERŞEMBE","12.00",3,3, 24000.00,instructor12));
        allCourses.add(new Course("Mühendisler İçin Bilgisayar Programlama", "BLML473", "CUMA","15.00",3,3, 24000.00,instructor7));
        allCourses.add(new Course("Nöral Ağlar", "BLML474", "PAZARTESİ","12.00",3,3, 24000.00,instructor5));
        allCourses.add(new Course("Semantik Web Teknolojileri", "BLML477", "PERŞEMBE","11.00",3,3, 24000.00,instructor1));
        allCourses.add(new Course("Yazılım Kalite Güvencesi ve Testi", "BLML478","CUMA","14.00", 3,3, 24000.00,instructor2));
        allCourses.add(new Course("Yapay Zeka", "BLML479", "SALI","09.00",3,3, 24000.00,instructor5));
        allCourses.add(new Course("Yazılım Gereksinim Analizi", "BLML480", "CUMA","09.00",3,3, 24000.00,instructor1));
        allCourses.add(new Course("Güç Sistemlerinde Koruma", "EEML403","PAZARTESİ","13.00",3, 3, 24000.00,instructor7));
        allCourses.add(new Course("Robotik", "EEML415","PERŞEMBE" ,"15.00",3,3, 24000.00,instructor4));
        allCourses.add(new Course("Derin Öğrenme ve Sınıflandırma Teknikler", "BMML311","CUMA","16.00",3 ,3, 24000.00,instructor5));
        allCourses.add(new Course("Sayısal İşaret işleme", "EEML315","SALI" ,"15.00",3,3, 24000.00,instructor6));
        allCourses.add(new Course("Organik Yapılı Elektronik Sistemler", "EEML361","CUMA","15.00",3 ,3, 24000.00,instructor4));
        allCourses.add(new Course("Yenilenebilir Enerji", "EEML366","ÇARŞAMBA" ,"12.00",3,3, 24000.00,instructor12));
        allCourses.add(new Course("Katıhal Elektroniği", "EEML368","ÇARŞAMBA" ,"14.00",3,3, 24000.00,instructor4));
        allCourses.add(new Course("Yüksek Gerilim Tekniği", "EEML409", "CUMA","10.00",3,3, 24000.00,instructor4));
        allCourses.add(new Course("Peakup-Bulut Bilişim", "BLML306","SALI","12.00",3, 3, 24000.00,instructor2));
        allCourses.add(new Course("DeFacto Bilgi Güvenliği ve BT Yönetişimi", "BLML308","PAZARTESİ","13.00",3 ,3, 24000.00,instructor1));

        //4.sınıflar için:

        allCourses.add(new Course("Formal Diller ve Otomata", "BLML403","SALI","11.00",5 ,4, 60000.00,instructor1));
        allCourses.add(new Course("Veri Madenciliği", "BLML467","CUMA", "13.00",3,4, 55750.00,instructor2));
        allCourses.add(new Course("Mühendislikte Disiplinlerarası Proje", "MMFL401","PERŞEMBE","15.00",4 ,4, 60000.00,instructor2));

        allCourses.add(new Course("Ağ Programlama", "BLML463","PAZARTESİ","12.00",3 ,4, 24000.00,instructor2));
        allCourses.add(new Course("Bilgisayar Ağlarında Güvenlik", "BLML464","PERŞEMBE","15.00",3 ,4, 24000.00,instructor13));
        allCourses.add(new Course("Gerçek Zamanlı Sistemler", "BLML468","PAZARTESİ" ,"14.00",3,4, 24000.00,instructor7));
        allCourses.add(new Course("İleri Nesne Tabanlı Programlama", "BLML469","CUMA","11.00",3 ,4, 24000.00,instructor1));
        allCourses.add(new Course("İleri Veritabanı Sistemleri", "BLML470","PERŞEMBE","10.00",3 ,4, 24000.00,instructor5));
        allCourses.add(new Course("Kablosuz Haberleşme", "BLML471","SALI", "13.00",3,4, 24000.00,instructor14));
        allCourses.add(new Course("Makine Öğrenmesi", "BLML472","PERŞEMBE","12.00" ,3,4, 24000.00,instructor12));
        allCourses.add(new Course("Mühendisler İçin Bilgisayar Programlama", "BLML473","CUMA" ,"15.00",3,4, 24000.00,instructor7));
        allCourses.add(new Course("Nöral Ağlar", "BLML474","PERŞEMBE","12.00",3 ,4, 24000.00,instructor5));
        allCourses.add(new Course("Semantik Web Teknolojileri", "BLML477","PAZARTESİ","09.00",3 ,4, 24000.00,instructor1));
        allCourses.add(new Course("Yazılım Kalite Güvencesi ve Testi", "BLML478","CUMA","13.00",3 ,4, 24000.00,instructor2));
        allCourses.add(new Course("Yapay Zeka", "BLML479","ÇARŞAMBA","12.00",3 ,4, 24000.00,instructor5));
        allCourses.add(new Course("Yazılım Gereksinim Analizi", "BLML480","SALI","09.00",3 ,4, 24000.00,instructor1));
        allCourses.add(new Course("Güç Sistemlerinde Koruma", "EEML403","CUMA","16.00",3 ,4, 24000.00,instructor7));
        allCourses.add(new Course("Robotik", "EEML415","CUMA","13.00", 3,4, 24000.00,instructor4));
        allCourses.add(new Course("Derin Öğrenme ve Sınıflandırma Teknikler", "BMML311","CUMA","10.00",3 ,4, 24000.00,instructor5));
        allCourses.add(new Course("Sayısal İşaret işleme", "EEML315","PAZARTESİ","16.00",3 ,4, 24000.00,instructor6));
        allCourses.add(new Course("Organik Yapılı Elektronik Sistemler", "EEML361","PERŞEMBE","11.00",3 ,4, 24000.00,instructor4));
        allCourses.add(new Course("Yenilenebilir Enerji", "EEML366","SALI", "13.00",3,4, 24000.00,instructor12));
        allCourses.add(new Course("Katıhal Elektroniği", "EEML368","PERŞEMBE","09.00" ,3,4, 24000.00,instructor4));
        allCourses.add(new Course("Yüksek Gerilim Tekniği", "EEML409","ÇARŞAMBA" ,"12.00",3,4, 24000.00,instructor4));
        allCourses.add(new Course("Peakup-Bulut Bilişim", "BLML306","ÇARŞAMBA","11.00",3 ,4, 24000.00,instructor2));
        allCourses.add(new Course("DeFacto Bilgi Güvenliği ve BT Yönetişimi", "BLML308","SALI","13.00",3 ,4, 24000.00,instructor1));
}
public static void listCourseByGrade(int studentClass){

        if(studentClass==0){
            System.out.println("Lisansüstü Dersleri Listeleniyor");
            for(Course c: allCourses){
                if(c.getStudentClass()==studentClass){
                    System.out.println("Dersin Adı ve Kodu: "+c.getCourseName()+" "+c.getCourseCode()+" | Dersin Kredisi: "+c.getCourseCredit());
                }
            }
            System.out.println();
        }
        else if (studentClass>=1&&studentClass<=4) {
            System.out.println(studentClass+". Sınıf Dersleri Listeleniyor");
            for(Course c: allCourses){
                if(c.getStudentClass()==studentClass){
                    System.out.println("Dersin Adı ve Kodu: "+c.getCourseName()+" "+c.getCourseCode()+" | Dersin Kredisi: "+c.getCourseCredit());
                }
            }
            System.out.println();
        }
        else{
            System.out.println("Hata! Eksik ya da yanlış tuşladınız.");
        }
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




