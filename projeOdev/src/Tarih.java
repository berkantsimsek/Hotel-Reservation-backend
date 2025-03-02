import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Tarih {
    private Date girisTarihi;
    private Date cikisTarihi;
    public int gunSayisi;

    public Tarih(Date girisTarihi, Date cikisTarihi, int gunSayisi) {
        this.girisTarihi = girisTarihi;
        this.cikisTarihi = cikisTarihi;
        this.gunSayisi = gunSayisi;
    }

    public Tarih() {

    }
    public void girisCikisTarihleri() {
        System.out.println("-------------------------------------------------------------------------");

        do {
            this.girisTarihi = alTarih("Giriş Tarihini Giriniz (dd.MM.yyyy): ");
            this.cikisTarihi = alTarih("Çıkış Tarihini Giriniz (dd.MM.yyyy): ");

            if (this.girisTarihi.after(this.cikisTarihi)) {
                System.out.println("Giriş tarihi çıkış tarihinden sonra olamaz. Lütfen tekrar giriniz.");
            }

        } while (this.girisTarihi.after(this.cikisTarihi));

        System.out.println("-------------------------------------------------------------------------");

        this.gunSayisi = gunHesapla();
    }
    public Date alTarih(String prompt) {
        Scanner scanner = new Scanner(System.in);
        Date date = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        while (date == null) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                date = dateFormat.parse(input);
            } catch (ParseException e) {
                System.out.println("Hatalı tarih girdiniz! Lütfen dd.MM.yyyy şeklinde giriniz.");
            }
        }
        return date;
    }
    public int gunHesapla () {
        long farkMilisaniye = cikisTarihi.getTime() - girisTarihi.getTime();
        gunSayisi = (int) (farkMilisaniye / (1000 * 60 * 60 * 24));

        if (gunSayisi < 0) {
            System.out.println("Hatalı tarih aralığı! Çıkış tarihi giriş tarihinden önce olamaz.");
            return 0;
        }
        System.out.println("********TOPLAM GUNUNUZ*******----->     " + gunSayisi);
        return gunSayisi;
    }

    public Date getGirisTarihi() {
        return girisTarihi;
    }

    public Date getCikisTarihi() {
        return cikisTarihi;
    }

    public int getGunSayisi() {
        return gunSayisi;
    }
    public Date setGirisTarihi(){
        return girisTarihi;
    }

    public int setGunSayisi() {
        return gunSayisi;
    }
    public void setGirisTarihi(Date girisTarihi) {
        this.girisTarihi = girisTarihi;
    }

    public void setCikisTarihi(Date cikisTarihi) {
        this.cikisTarihi = cikisTarihi;
    }

    public void setGunSayisi(int gunSayisi) {
        this.gunSayisi = gunSayisi;
    }
}
