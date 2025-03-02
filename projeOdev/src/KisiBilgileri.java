import java.util.InputMismatchException;
import java.util.Scanner;

public class KisiBilgileri {
    private String ad;
    private String soyad;
    private long telNo;

    public KisiBilgileri() {

    }

    public void setAd() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("ADINIZI GİRİNİZ: ");
                ad = scanner.nextLine();
                if (ad.trim().isEmpty()){
                    printInvalidInputMessage();
                }
                else if (isValidName(ad)) {
                    break;
                } else {
                    printInvalidInputMessage();
                }
            } catch (Exception e) {
                printInvalidInputMessage();
                scanner.nextLine();
            }
        }
    }

    public void setSoyad() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("SOYADINIZI GİRİNİZ: ");
                soyad = scanner.nextLine();
                if (soyad.trim().isEmpty()){
                    printInvalidInputMessage();
                }
                else if (isValidName(soyad)) {
                    break;
                } else {
                    printInvalidInputMessage();

                }
            } catch (Exception e) {
                printInvalidInputMessage();
                scanner.nextLine();
            }
        }
    }

    public void setTelNo() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("TELEFON NUMARANIZI GİRİNİZ = ");
                telNo = scanner.nextLong();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                printInvalidInputMessage();
                scanner.nextLine();
            } catch (Exception e) {
                printInvalidInputMessage();
                scanner.nextLine();
            }
        }
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public long getTelNo() {
        return telNo;
    }

    private boolean isValidName(String name) {
        return !name.matches(".*\\d.*") && !name.contains(" ");
    }

    private void printInvalidInputMessage() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Hatalı giriş! Lütfen doğru bir değer giriniz.");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}