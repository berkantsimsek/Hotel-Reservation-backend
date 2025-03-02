public class OtelHesaplama {
    public static double getUcret() {
        return ucret;
    }
    private static double ucret;


    public static double hesaplaIstanbul (String otelAdi,int yetiskinSayisi, int cocukSayisi){
            Tarih tarih=new Tarih();

            switch (otelAdi.toLowerCase()) {
                case "güzel otel":
                    ucret = ((yetiskinSayisi * 600) + (cocukSayisi * 300));
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;
                case "hayat otel":
                    ucret =  (yetiskinSayisi * 550) + (cocukSayisi * 275);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;

                default:
                    System.out.println("Geçersiz otel seçimi.");
                    return 0.0;
            }

            System.out.println("Toplam tatil ücretiniz =" + ucret);
            return ucret;
        }
        public static double hesaplaTokat (String otelAdi,int yetiskinSayisi, int cocukSayisi){
         Tarih tarih =new Tarih();

            switch (otelAdi.toLowerCase()) {
                case "ata otel":
                    ucret =   ((yetiskinSayisi * 400) + (cocukSayisi * 200));
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;
                case "yaprak otel":
                    ucret =   ((yetiskinSayisi * 350) + (cocukSayisi * 175));
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;
                default:
                    System.out.println("Geçersiz otel seçimi.");
                    return 0.0;
            }
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Toplam tatil ücretiniz =" + ucret);
            return ucret;
        }
        public static double hesaplaİzmir (String otelAdi,int yetiskinSayisi, int cocukSayisi){
            Tarih tarih =new Tarih();


            switch (otelAdi.toLowerCase()) {
                case "deniz otel":
                    ucret = (yetiskinSayisi * 450) + (cocukSayisi * 250);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;
                case "türk otel":
                    ucret = (yetiskinSayisi * 350) + (cocukSayisi * 200);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;

                default:
                    System.out.println("Geçersiz otel seçimi.");
                    return 0.0;
            }
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Toplam tatil ücretiniz =" + ucret);
            return ucret;
        }
        public static double hesaplaBayburt (String otelAdi,int yetiskinSayisi, int cocukSayisi){
            Tarih tarih =new Tarih();


            switch (otelAdi.toLowerCase()) {
                case "suat otel":
                    ucret =(yetiskinSayisi * 550) + (cocukSayisi * 350);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();

                    break;
                case "uğurlu otel":
                    ucret =(yetiskinSayisi * 650) + (cocukSayisi * 250);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;

                default:
                    System.out.println("Geçersiz otel seçimi.");
                    return 0.0;
            }
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Toplam tatil ücretiniz =" + ucret);

            return ucret;
        }
        public static double hesaplaBerlin (String otelAdi,int yetiskinSayisi, int cocukSayisi){
            Tarih tarih =new Tarih();


            switch (otelAdi.toLowerCase()) {
                case "berlin otel":
                    ucret = (yetiskinSayisi * 50) + (cocukSayisi * 30);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;
                case "central otel":
                    ucret = (yetiskinSayisi * 55) + (cocukSayisi * 27);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;

                default:
                    System.out.println("Geçersiz otel seçimi.");
                    return 0.0;
            }
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Toplam tatil ücretiniz =" + ucret + "€");
            return ucret;
        }
        public static double hesaplaKoln (String otelAdi,int yetiskinSayisi, int cocukSayisi){
            Tarih tarih =new Tarih();


            switch (otelAdi.toLowerCase()) {
                case "leonardo otel":
                    ucret = (yetiskinSayisi * 35) + (cocukSayisi * 30);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;
                case "martini otel":
                    ucret = (yetiskinSayisi * 60) + (cocukSayisi * 45);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;
                default:
                    System.out.println("Geçersiz otel seçimi.");
                    return 0.0;
            }
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Toplam tatil ücretiniz =" + ucret + "€");

            return ucret;
        }
        public static double hesaplaNewYork (String otelAdi,int yetiskinSayisi, int cocukSayisi){
            Tarih tarih =new Tarih();


            switch (otelAdi.toLowerCase()) {
                case "obama otel":
                    ucret = (yetiskinSayisi * 30) + (cocukSayisi * 25);
                    tarih.girisCikisTarihleri();
                    ucret *= tarih.getGunSayisi();
                    break;
                case "kennedy otel":
                    ucret =(yetiskinSayisi * 75) + (cocukSayisi * 60);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;
                default:
                    System.out.println("Geçersiz otel seçimi.");
                    return 0.0;
            }
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Toplam tatil ücretiniz =" + ucret + "$");

            return ucret;
        }
        public static double hesaplaTeksas (String otelAdi,int yetiskinSayisi, int cocukSayisi){
            Tarih tarih =new Tarih();


            switch (otelAdi.toLowerCase()) {
                case "club otel":
                    ucret = (yetiskinSayisi * 25) + (cocukSayisi * 20);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;
                case "plaza otel":
                    ucret = (yetiskinSayisi * 45) + (cocukSayisi * 40);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;

                default:
                    System.out.println("Geçersiz otel seçimi.");
                    return 0.0;
            }
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Toplam tatil ücretiniz =" + ucret + "$");

            return ucret;
        }
        public static double hesaplaWashington (String otelAdi,int yetiskinSayisi, int cocukSayisi){
            Tarih tarih =new Tarih();


            switch (otelAdi.toLowerCase()) {
                case "martini otel":
                    ucret = (yetiskinSayisi * 25) + (cocukSayisi * 20);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();

                    break;
                case "baron otel":
                    ucret =(yetiskinSayisi * 45) + (cocukSayisi * 40);
                    RezervasyonBilgi.girisCikis();
                    ucret *= RezervasyonBilgi.tarih1.getGunSayisi();
                    break;

                default:
                    System.out.println("Geçersiz otel seçimi.");
                    return 0.0;
            }
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Toplam tatil ücretiniz =" + ucret + "$");

            return ucret;
        }

}
