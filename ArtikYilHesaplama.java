import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        int year;

        Scanner imp = new Scanner(System.in);

        System.out.print("Lütfen Yıl Giriniz: ");
        year = imp.nextInt();

        if (year % 4 == 0 ){
            System.out.println("Artık Yıl.");
            
        }else {
            System.out.println("Artık Yıl Değil");
        }


    }
}
