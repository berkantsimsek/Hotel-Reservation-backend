import java.util.InputMismatchException;
import java.util.Scanner;

public class Oteller {

    public static void istanbul() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\tİstanbul ilindeki otel seçeneklerimiz:");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\t\t1- Güzel otel | Günlük ücret *Yetişkin=600TL *Çocuk=300TL");
        OtelYıldızBilgi.OtelYediYıldızBilgi();
        System.out.println("\t\t\t2- Hayat otel | Günlük ücret *Yetişkin=550TL *Çocuk=275TL");
        OtelYıldızBilgi.OtelBesYıldızlıBilgi();
        System.out.println("-------------------------------------------------------------------------");

        int secim = 0;
        String otelAdi = "";

        while (true) {
            try {
                System.out.print("Lütfen bir otel seçiniz: ");
                secim = scanner.nextInt();
                scanner.nextLine();

                switch (secim) {
                    case 1:
                        otelAdi = "Güzel Otel";
                        break;
                    case 2:
                        otelAdi = "Hayat Otel";
                        break;
                    default:
                        System.out.println("Geçersiz otel seçimi.");
                        continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        int yetiskinSayisi = 0;
        while (true) {
            try {
                System.out.print("->Yetişkin sayısını giriniz: ");
                yetiskinSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        int cocukSayisi = 0;
        while (true) {
            try {
                System.out.print("->Çocuk sayısını giriniz: ");
                cocukSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        System.out.println("-------------------------------------------------------------------------");
        double ucret = OtelHesaplama.hesaplaIstanbul(otelAdi, yetiskinSayisi, cocukSayisi);
        OdemeBilgileri odemeBilgileri = new OdemeBilgileri();
        odemeBilgileri.Odeme();

    }


    public static void tokat() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\tTokat ilindeki otel seçeneklerimiz:");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\t\t1- Ata otel | Günlük ücret *Yetişkin=400TL *Çocuk=200TL");
        OtelYıldızBilgi.OtelBesYıldızlıBilgi();
        System.out.println("\t\t\t2- Yaprak otel | Günlük ücret *Yetişkin=350TL *Çocuk=175TL");
        OtelYıldızBilgi.OtelUcYıldızBilgi();
        System.out.println("-------------------------------------------------------------------------");


        int secim = 0;
        String otelAdi = "";

        while (true) {
            try {

                System.out.print("Lütfen bir otel seçiniz: ");
                secim = scanner.nextInt();
                scanner.nextLine();

                switch (secim) {
                    case 1:
                        otelAdi = "Ata Otel";
                        break;
                    case 2:
                        otelAdi = "Yaprak Otel";
                        break;
                    default:
                        System.out.println("Geçersiz otel seçimi.");
                        continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }


        int yetiskinSayisi = 0;
        while (true) {
            try {
                System.out.print("->Yetişkin sayısını giriniz: ");
                yetiskinSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        int cocukSayisi = 0;
        while (true) {
            try {
                System.out.print("->Çocuk sayısını giriniz: ");
                cocukSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        System.out.println("-------------------------------------------------------------------------");
        double ucret = OtelHesaplama.hesaplaTokat(otelAdi, yetiskinSayisi, cocukSayisi);
        OdemeBilgileri odemeBilgileri = new OdemeBilgileri();
        odemeBilgileri.Odeme();

    }

    public static void izmir() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\tİzmir ilindeki otel seçeneklerimiz:");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\t\t1- Deniz otel | Günlük ücret *Yetişkin=450TL *Çocuk=250TL ");
        OtelYıldızBilgi.OtelBesYıldızlıBilgi();
        System.out.println("\t\t\t2- Türk otel | Günlük ücret *Yetişkin=350TL *Çocuk=200TL");
        OtelYıldızBilgi.OtelUcYıldızBilgi();
        System.out.println("-------------------------------------------------------------------------");


        int secim = 0;
        String otelAdi = "";

        while (true) {
            try {

                System.out.print("Lütfen bir otel seçiniz: ");
                secim = scanner.nextInt();
                scanner.nextLine();

                switch (secim) {
                    case 1:
                        otelAdi = "Deniz Otel";
                        break;
                    case 2:
                        otelAdi = "Türk Otel";
                        break;
                    default:
                        System.out.println("Geçersiz otel seçimi.");
                        continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }


        int yetiskinSayisi = 0;
        while (true) {
            try {
                System.out.print("->Yetişkin sayısını giriniz: ");
                yetiskinSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        int cocukSayisi = 0;
        while (true) {
            try {
                System.out.print("->Çocuk sayısını giriniz: ");
                cocukSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        System.out.println("-------------------------------------------------------------------------");
        double ucret = OtelHesaplama.hesaplaİzmir(otelAdi, yetiskinSayisi, cocukSayisi);
        OdemeBilgileri odemeBilgileri = new OdemeBilgileri();
        odemeBilgileri.Odeme();

    }

    public static void Bayburt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\tBayburt ilindeki otel seçeneklerimiz:");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\t\t1- Suat otel | Günlük ücret *Yetişkin=550TL *Çocuk=350TL");
        OtelYıldızBilgi.OtelYediYıldızBilgi();
        System.out.println("\t\t\t2- Uğurlu otel | Günlük ücret *Yetişkin=650 *Çocuk=250TL");
        OtelYıldızBilgi.OtelBesYıldızlıBilgi();
        System.out.println("-------------------------------------------------------------------------");

        int secim = 0;
        String otelAdi = "";

        while (true) {
            try {

                System.out.print("Lütfen bir otel seçiniz: ");
                secim = scanner.nextInt();
                scanner.nextLine();

                switch (secim) {
                    case 1:
                        otelAdi = "Suat Otel";
                        break;
                    case 2:
                        otelAdi = "Uğurlu Otel";
                        break;
                    default:
                        System.out.println("Geçersiz otel seçimi.");
                        continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }


        int yetiskinSayisi = 0;
        while (true) {
            try {
                System.out.print("->Yetişkin sayısını giriniz: ");
                yetiskinSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        int cocukSayisi = 0;
        while (true) {
            try {
                System.out.print("->Çocuk sayısını giriniz: ");
                cocukSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        System.out.println("-------------------------------------------------------------------------");
        double ucret = OtelHesaplama.hesaplaBayburt(otelAdi, yetiskinSayisi, cocukSayisi);
        OdemeBilgileri odemeBilgileri = new OdemeBilgileri();
        odemeBilgileri.Odeme();

    }
    public static void berlin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\tBerlin ilindeki otel seçeneklerimiz:");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\t\t1- Berlin City otel | Günlük ücret *Yetişkin=50€ *Çocuk=30€");
        OtelYıldızBilgi.OtelUcYıldızBilgi();
        System.out.println("\t\t\t2- Central otel | Günlük ücret *Yetişkin=55€ *Çocuk=27€");
        OtelYıldızBilgi.OtelBesYıldızlıBilgi();
        System.out.println("-------------------------------------------------------------------------");

        int secim = 0;
        String otelAdi = "";

        while (true) {
            try {

                System.out.print("Lütfen bir otel seçiniz: ");
                secim = scanner.nextInt();
                scanner.nextLine();

                switch (secim) {
                    case 1:
                        otelAdi = "Berlin Otel";
                        break;
                    case 2:
                        otelAdi = "Central Otel";
                        break;
                    default:
                        System.out.println("Geçersiz otel seçimi.");
                        continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        int yetiskinSayisi = 0;
        while (true) {
            try {
                System.out.print("->Yetişkin sayısını giriniz: ");
                yetiskinSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        int cocukSayisi = 0;
        while (true) {
            try {
                System.out.print("->Çocuk sayısını giriniz: ");
                cocukSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        System.out.println("-------------------------------------------------------------------------");
        double ucret = OtelHesaplama.hesaplaBerlin(otelAdi, yetiskinSayisi, cocukSayisi);
        OdemeBilgileri odemeBilgileri = new OdemeBilgileri();
        odemeBilgileri.Odeme();

    }

    public static void koln() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\tKöln ilindeki otel seçeneklerimiz:");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\t\t1- Leonardo otel | Günlük ücret *Yetişkin=35€ *Çocuk=30€");
        OtelYıldızBilgi.OtelBesYıldızlıBilgi();
        System.out.println("\t\t\t2- Martini otel | Günlük ücret *Yetişkin=60€ *Çocuk=45€");
        OtelYıldızBilgi.OtelBesYıldızlıBilgi();
        System.out.println("-------------------------------------------------------------------------");

        int secim = 0;
        String otelAdi = "";

        while (true) {
            try {

                System.out.print("Lütfen bir otel seçiniz: ");
                secim = scanner.nextInt();
                scanner.nextLine();

                switch (secim) {
                    case 1:
                        otelAdi = "Leonardo Otel";
                        break;
                    case 2:
                        otelAdi = "Martini Otel";
                        break;
                    default:
                        System.out.println("Geçersiz otel seçimi.");
                        continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }


        int yetiskinSayisi = 0;
        while (true) {
            try {
                System.out.print("->Yetişkin sayısını giriniz: ");
                yetiskinSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        int cocukSayisi = 0;
        while (true) {
            try {
                System.out.print("->Çocuk sayısını giriniz: ");
                cocukSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        System.out.println("-------------------------------------------------------------------------");
        double ucret = OtelHesaplama.hesaplaKoln(otelAdi, yetiskinSayisi, cocukSayisi);
        OdemeBilgileri odemeBilgileri = new OdemeBilgileri();
        odemeBilgileri.Odeme();

    }
    public static void newYork() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\tNew York eyaletinde ki otel seçeneklerimiz:");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\t\t1- Obama otel | Günlük ücret *Yetişkin=30$ *Çocuk=25$");
        OtelYıldızBilgi.OtelUcYıldızBilgi();
        System.out.println("\t\t\t2- Kennedy otel | Günlük ücret *Yetişkin=75$ *Çocuk=60$");
        OtelYıldızBilgi.OtelYediYıldızBilgi();
        System.out.println("-------------------------------------------------------------------------");

        int secim = 0;
        String otelAdi = "";

        while (true) {
            try {

                System.out.print("Lütfen bir otel seçiniz: ");
                secim = scanner.nextInt();
                scanner.nextLine();

                switch (secim) {
                    case 1:
                        otelAdi = "Obama Otel";
                        break;
                    case 2:
                        otelAdi = "Kennedy Otel";
                        break;
                    default:
                        System.out.println("Geçersiz otel seçimi.");
                        continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }


        int yetiskinSayisi = 0;
        while (true) {
            try {
                System.out.print("->Yetişkin sayısını giriniz: ");
                yetiskinSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        int cocukSayisi = 0;
        while (true) {
            try {
                System.out.print("->Çocuk sayısını giriniz: ");
                cocukSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        System.out.println("-------------------------------------------------------------------------");
        double ucret = OtelHesaplama.hesaplaNewYork(otelAdi, yetiskinSayisi, cocukSayisi);
        OdemeBilgileri odemeBilgileri = new OdemeBilgileri();
        odemeBilgileri.Odeme();
    }
    public static void Teksas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\tTeksas eyaletindeki otel seçeneklerimiz:");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\t\t1- Club otel | Günlük ücret *Yetişkin=25$ *Çocuk=20$");
        OtelYıldızBilgi.OtelUcYıldızBilgi();
        System.out.println("\t\t\t2- Plaza otel | Günlük ücret *Yetişkin=45$ *Çocuk=40$");
        OtelYıldızBilgi.OtelYediYıldızBilgi();
        System.out.println("-------------------------------------------------------------------------");

        int secim = 0;
        String otelAdi = "";

        while (true) {
            try {

                System.out.print("Lütfen bir otel seçiniz: ");
                secim = scanner.nextInt();
                scanner.nextLine();

                switch (secim) {
                    case 1:
                        otelAdi = "Club Otel";
                        break;
                    case 2:
                        otelAdi = "Plaza Otel";
                        break;
                    default:
                        System.out.println("Geçersiz otel seçimi.");
                        continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        int yetiskinSayisi = 0;
        while (true) {
            try {
                System.out.print("->Yetişkin sayısını giriniz: ");
                yetiskinSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        int cocukSayisi = 0;
        while (true) {
            try {
                System.out.print("->Çocuk sayısını giriniz: ");
                cocukSayisi = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                scanner.nextLine();
            }
        }

        System.out.println("-------------------------------------------------------------------------");
        double ucret = OtelHesaplama.hesaplaTeksas(otelAdi, yetiskinSayisi, cocukSayisi);
        OdemeBilgileri odemeBilgileri = new OdemeBilgileri();
        odemeBilgileri.Odeme();

    }

     public static void Washington() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\t\t\tWashington eyaletindeki otel seçeneklerimiz:");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("\t\t\t1- Martini otel | Günlük ücret *Yetişkin=25$ *Çocuk=20$");
            OtelYıldızBilgi.OtelYediYıldızBilgi();
            System.out.println("\t\t\t2- Baron otel | Günlük ücret *Yetişkin=45$ *Çocuk=40$");
            OtelYıldızBilgi.OtelYediYıldızBilgi();
            System.out.println("-------------------------------------------------------------------------");

            int secim = 0;
            String otelAdi = "";

            while (true) {
                try {

                    System.out.print("Lütfen bir otel seçiniz: ");
                    secim = scanner.nextInt();
                    scanner.nextLine();

                    switch (secim) {
                        case 1:
                            otelAdi = "Martini Otel";
                            OtelYıldızBilgi.OtelUcYıldızBilgi();
                            break;
                        case 2:
                            otelAdi = "Baron Otel";
                            break;
                        default:
                            System.out.println("Geçersiz otel seçimi.");
                            continue;
                    }

                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                    scanner.nextLine();
                }
            }


            int yetiskinSayisi = 0;
            while (true) {
                try {
                    System.out.print("->Yetişkin sayısını giriniz: ");
                    yetiskinSayisi = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                    scanner.nextLine();
                }
            }

            int cocukSayisi = 0;
            while (true) {
                try {
                    System.out.print("->Çocuk sayısını giriniz: ");
                    cocukSayisi = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                    scanner.nextLine();
                }
            }

            System.out.println("-------------------------------------------------------------------------");
            double ucret = OtelHesaplama.hesaplaWashington(otelAdi, yetiskinSayisi, cocukSayisi);
            OdemeBilgileri odemeBilgileri = new OdemeBilgileri();
            odemeBilgileri.Odeme();
        }
    }
