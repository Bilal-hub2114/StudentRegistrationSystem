import java.util.Scanner;
public class SecurityControl {

    public void controlStudentID(String inputStudentID){

        String controlID=inputStudentID.replaceAll("[^0-9]","");
        if(inputStudentID.length()!=9){
            System.out.println("[UYARI]: Hata! Lütfen 9 basamaklı okul ID' si girdiğinizden emin olun.");
            System.out.println("[OBS]: Sistem kapatılıyor...");
            System.exit(0);

        }
    }



    public int controlInputStudentClass(Scanner scan) {
        while(true){
        while(!scan.hasNextInt()){
            String yanlıştuşlama = scan.next();
            System.out.println("[UYARI]: '"+yanlıştuşlama+"' geçerli bir sayi giriniz.");
            System.out.print("Lütfen tekrar deneyiniz: ");
        }
        int integer = scan.nextInt();
        scan.nextLine();
        if(integer>=0 && integer <=4){
            return integer;
        }
        else{
            System.out.println("[UYARI]: Girdiğiniz sınıf ("+ integer +".) geçerli bir sınıf değil.");
            System.out.print("Lütfen tekrar deneyiniz: ");
        }
    }
    }

    public int controlInputSelect(Scanner scan) {
        while(true){
            while(!scan.hasNextInt()){
                String yanlıştuşlama = scan.next();
                System.out.println("[UYARI]: '"+yanlıştuşlama+"' geçerli bir sayi giriniz.");
                System.out.print("Lütfen tekrar deneyiniz: ");
            }
            int integer = scan.nextInt();
            scan.nextLine();
            if(integer>=1 && integer <=6){
                return integer;
            }
            else{
                System.out.println("[UYARI]: Girdiğiniz sayı ("+ integer +") geçerli bir sayı değil.");
                System.out.print("Lütfen tekrar deneyiniz: ");
            }
        }
    }

    public int controlScholarshipAmount(Scanner scan) {
        while(true){
            while(!scan.hasNextInt()){
                String yanlıştuşlama = scan.next();
                System.out.println("[UYARI]: '"+yanlıştuşlama+"' geçerli bir sayi giriniz.");
                System.out.print("Lütfen tekrar deneyiniz: ");
            }
            int integer = scan.nextInt();
            scan.nextLine();
            if(integer>=0 && integer <=100){
                return integer;
            }
            else{
                System.out.println("[UYARI]: Girdiğiniz sayı ("+ integer +") geçerli bir sayı değil.");
                System.out.print("Lütfen tekrar deneyiniz: ");
            }
        }
    }

    public int controlInputStudentGrade(Scanner scan) {
        while(true){
            while(!scan.hasNextInt()){
                String yanlıştuşlama = scan.next();
                System.out.println("[UYARI]: '"+yanlıştuşlama+"' geçerli bir sayi giriniz.");
                System.out.print("Lütfen tekrar deneyiniz: ");
            }
            int integer = scan.nextInt();
            scan.nextLine();
            if(integer>=0 && integer <=100){
                return integer;
            }
            else{
                System.out.println("[UYARI]: Girdiğiniz sayı ("+ integer +") geçerli bir sayı değil.");
                System.out.print("Lütfen tekrar deneyiniz: ");
            }
        }
    }

}
