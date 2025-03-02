import java.util.InputMismatchException;
import java.util.Scanner;

public class Turizm {
    public void turizmuygulama() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*************************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*******************B.ŞİMŞEK TURİZME HOŞ GELDİNİZ************************* ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t*************************************************************************\n\n\n");
        System.out.println("LÜTFEN BİLGİLERİNİZİ EKSİKSİZ BİR ŞEKİLDE GİRİNİZ  :) ");
        System.out.println("---------------------------------");

        RezervasyonBilgi.setKisiBilgileri();

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("ANLAŞMALI OLDUĞUMUZ ÜLKELER (1-TÜRKİYE | 2-ALMANYA | 3-AMERİKA )");
        System.out.println("SEYAHAT ETMEK İSTEDİĞİNİZ ÜLKE BİZİMLE ANLAŞMALI DEĞİLSE 4 DE BASINIZ ");
        System.out.println("-------------------------------------------------------------------------\n\n\n");

    int ulkeSecenek = 0;
    boolean gecerliSecim = false;

    while (!gecerliSecim) {
        try {
            System.out.print("\t\t\t*****HANGİ ÜLKEYE SEYAHAT ETMEK İSTERSİNİZ******=");
            ulkeSecenek = scanner.nextInt();
            System.out.println("-------------------------------------------------------------------------\n\n\n");
            scanner.nextLine();

            if (ulkeSecenek >= 1 && ulkeSecenek <= 4) {
                gecerliSecim = true;
            } else {
                System.out.println("ANLAŞMALI OLDUĞUMUZ ÜLKELER (1-TÜRKİYE | 2-ALMANYA | 3-AMERİKA )");
                System.out.println("SEYAHAT ETMEK İSTEDİĞİNİZ ÜLKE BİZİMLE ANLAŞMALI DEĞİLSE 4 DE BASINIZ ");
                System.out.println("Geçersiz ülke seçimi! Lütfen 1-4 arasında bir sayı giriniz.\n\n");
            }
        } catch (InputMismatchException e) {
            System.out.println("ANLAŞMALI OLDUĞUMUZ ÜLKELER (1-TÜRKİYE | 2-ALMANYA | 3-AMERİKA )");
            System.out.println("SEYAHAT ETMEK İSTEDİĞİNİZ ÜLKE BİZİMLE ANLAŞMALI DEĞİLSE 4 DE BASINIZ ");
            System.out.println("Hatalı giriş! Lütfen sayısal bir değer giriniz.\n\n");
            scanner.nextLine();
        }
    }
    switch (ulkeSecenek) {
        case 1:
            Turkiye turkiye = new Turkiye();
            turkiye.anlasmaDetayiTurkiye();


            break;
        case 2:
            Almanya almanya = new Almanya();
            almanya.anlasmaDetayiAlmanya();

            break;
        case 3:
            Amerika amerika = new Amerika();
            amerika.anlasmaDetayiAmerika();

            break;
        case 4:
            System.out.println("Uygulamadan çıktınız. İyi günler dileriz...\n");
            break;
        default:
            System.out.println("Hatalı seçim! Lütfen 1-4 arasında bir sayı giriniz.\n");
            break;
    }
        System.out.println("************Bizi tercih ettiğiniz için teşekkürler*******");
        System.out.println("*********************İYİ GÜNLER DİLERİZ*******************");

    }
}

