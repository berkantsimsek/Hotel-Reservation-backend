import java.util.InputMismatchException;
import java.util.Scanner;

public class OdemeBilgileri {
    public static double nakit;
    public static int ucretSecim;


    public void Odeme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");

        do {
            System.out.println("Ödeme yapma şeklinizi seçiniz=");
            System.out.println("-------------------------------------------------------------------------");

            System.out.println("1- Nakit");
            System.out.println("2- Kredi < 12 ay taksitli > (%70 faizlidir)");
            System.out.println("-------------------------------------------------------------------------");

            try {
                ucretSecim = scanner.nextInt();
                scanner.nextLine();

                if (ucretSecim == 1) {
                    nakit = OtelHesaplama.getUcret();
                    System.out.println("Ödenecek tutarınız = " + nakit);
                    RezervasyonBilgi.getRezervasyonBilgileri();
                } else if (ucretSecim == 2) {
                    nakit = 1.7 * OtelHesaplama.getUcret();
                    System.out.println("Ödenecek tutarınız = " + nakit);
                    RezervasyonBilgi.getRezervasyonBilgileri();
                } else {
                    System.out.println("Geçerli bir seçim yapın!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen sayısal bir değer giriniz.");
                scanner.nextLine();
            }
        } while (ucretSecim != 1 && ucretSecim != 2);
    }

    // Overloading Odeme metodu ile burayı yaptım
    public void Odeme(double customUcret) {
        nakit = customUcret;
        System.out.println("Ödenecek tutarınız = " + nakit);
        RezervasyonBilgi.getRezervasyonBilgileri();
    }

    public static double getNakit(){
        return nakit;
    }
}