import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Course {


    public void courseInput(){
        Scanner scan= new Scanner(System.in);
        List<String> liste=new ArrayList<>();
        System.out.println("Almak istediğiniz dersleri giriniz.");
        while(true){
            System.out.print("Ders: ");
            String input=scan.nextLine();
            liste.add(input);


            System.out.println("Ders eklemeyi bitirmek istiyorsanız 'bitir' yazınız.");
            if(input=="bitir"){
                break;
            }


        }
    }

}
