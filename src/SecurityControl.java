public class SecurityControl {

    public void controlStudentID(String inputStudentID){

        String controlID=inputStudentID.replaceAll("[^0-9]","");
        if(inputStudentID.length()!=9){
            System.out.println("[UYARI]: Hata! Lütfen 9 basamaklı okul ID' si girdiğinizden emin olun.");
            System.out.println("[OBS]: Sistem kapatılıyor...");
            System.exit(0);

        }
    }

    public void controlScholarshipAmount(int inputScholarshipAmount){
        if(inputScholarshipAmount<0 || inputScholarshipAmount>100){
            System.out.println("[UYARI]: Burs yüzdeniz (%) %0 ile %100 arası olmalıdır.");
            System.out.println("[OBS]: Sistem kapatalıyor...");
            System.exit(0);
        }
    }

}
