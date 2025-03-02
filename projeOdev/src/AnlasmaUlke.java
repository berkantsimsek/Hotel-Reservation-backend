import java.util.Scanner;
public class AnlasmaUlke {
    private static String ulkeAdi;
    public int ulkeSecenek;
    public int Secim;


    public static void setUlkeAdi(String ulkeAdi){
        AnlasmaUlke.ulkeAdi = ulkeAdi;
    }

    public static String getUlkeAdi() {
        return ulkeAdi;
    }

    public int getSecim() {
        return Secim;
    }
    public void anlasmaDetayiTurkiye() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------HOŞ GELDİNİZ---------------------------");
        System.out.println("TURKİYE DE ANLAŞMALI OLDUĞUMUZ SEHİRLER (1-İSTANBUL|2-TOKAT|3-İZMİR|4-BAYBURT)||5-ÇIKIŞ YAPILIYOR");
        int secim ;
        do {
            System.out.print("Hangi sehiri sectiniz =");
            secim=scanner.nextInt();

            switch (secim) {

                case 1:
                    Istanbul istanbul = new Istanbul();
                    break;
                case 2:
                    Tokat tokat = new Tokat();
                    break;
                case 3:
                    İzmir i̇zmir = new İzmir();
                    break;
                case 4:
                    Bayburt bayburt= new Bayburt();
                    break;
                case 5:
                    System.out.println("çıkış yapılıyor");
                    break;
                default:
                    System.out.println("GECERSİZ SECİM");
                    System.out.println("Tekrar seçim yapınız");

            }

        } while (secim > 5);

        scanner.close();
    }
    public void anlasmaDetayiAlmanya() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------HOŞ GELDİNİZ---------------------------");
        System.out.println("ALMANYA DA ANLAŞMALI OLDUĞUMUZ SEHİRLER (1-BERLİN|2-KOLN)||3-ÇIKIŞ YAPILIYOR");
        System.out.println("------------------------------------------------------------------");

        int secim ;
        do {
            System.out.print("Hangi sehiri sectiniz =");
            secim=scanner.nextInt();


            switch (secim) {

                case 1:
                    Berlin berlin=new Berlin();
                    break;
                case 2:
                    Koln koln=new Koln();
                    break;
                case 3:
                    System.out.println("çıkış yapılıyor");
                    break;

                default:
                    System.out.println("GECERSİZ SECİM");
                    System.out.println("Tekrar seçim yapınız");

            }

        } while (secim > 3);

        scanner.close();
    }
    public void anlasmaDetayiAmerika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------HOŞ GELDİNİZ---------------------------");
        System.out.println("AMERİKA DA ANLAŞMALI OLDUĞUMUZ EYALETLER (1-NEW YORK|2-TEKSAS|3-WASHİNGTON)||4-ÇIKIŞ YAPILIYOR");
        int secim ;
        do {
            System.out.print("Hangi sehiri sectiniz =");
            secim=scanner.nextInt();

            switch (secim) {

                case 1:
                    NewYork newYork=new NewYork();
                    break;
                case 2:
                    Teksas teksas =new Teksas();
                    break;
                case 3:
                     Washington washington=new Washington();
                     break;
                case 4:
                    System.out.println("çıkış yapılıyor");
                    break;
                default:
                    System.out.println("GECERSİZ SECİM");
                    System.out.println("Tekrar seçim yapınız");

            }

        } while (secim > 4);

        scanner.close();
    }

        public int getUlkeSecenek () {
            return ulkeSecenek;
        }
    }

    class Turkiye extends AnlasmaUlke {
        public Turkiye() {
            setUlkeAdi("Türkiye");
            System.out.println("************************TÜRKİYE HAKKINDA KISA BİLGİ********************************");
            System.out.println("***********************************************************************************");
            System.out.println("Türkiye, iklim kuşaklarından ılıman kuşak ile subtropikal kuşak arasında yer alır.");
            System.out.println("Türkiye 4 farklı iklim tipi vardır.Bunlar=Karasal,Akdeniz,Marmara ve Karadeniz iklimidir.");
            System.out.println("Türkiye'nin nüfusu 85 milyon 279 bin 553 kişidir.");
            System.out.println("Türkiye de anlaşmalı olduğumuz oteller 5, 3 ve 7 yıldızlıdır.");
            System.out.println("Ulaşım hizmetimiz yoktur.\n");

        }

    }

    class Almanya extends AnlasmaUlke {
        public Almanya() {
            setUlkeAdi("Almanya");
            System.out.println("**********************ALMANYA HAKKINDA KISA BİLGİ**********************************");
            System.out.println("*************************************************************************************");
            System.out.println("Ülke, coğrafi olarak ılıman iklim kuşağında yer alır ve yüzölçümü 357.578 km^2 dir.");
            System.out.println("Almanya'in mevcut nüfusu 83.276.635'dir. ");
            System.out.println("Almanya da anlaşmalı olduğumuz oteller 5 ve 3 yıldızlıdır.");
            System.out.println("Ulaşım hizmetimiz yoktur.\n");

        }
    }

    class Amerika extends AnlasmaUlke {
        public Amerika() {
            setUlkeAdi("Amerika");
            System.out.println("*****************************AMERİKA HAKKINDA KISA BİLGİ********************************************");
            System.out.println("****************************************************************************************************");
            System.out.println("Ülke de çok çesiştli iklim tipleri görülmektedir.Bunlar= Tropikal,Kutup ve Kurak iklimleri hakimdir.");
            System.out.println("Ülkenin nüfusu 336 milyondur.");
            System.out.println("Amerika da anlaşmalı olduğumuz oteller 3 ve 7 yıldızlıdır.");
            System.out.println("Ulaşım hizmetimiz yoktur.\n");

        }

    }








