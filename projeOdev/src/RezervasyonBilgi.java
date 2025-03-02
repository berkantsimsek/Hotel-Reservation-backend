public class RezervasyonBilgi {
    static KisiBilgileri kisiBilgileri=new KisiBilgileri();
    static Tarih tarih1=new Tarih();
    public static void girisCikis(){
        tarih1.girisCikisTarihleri();
    }

    public static void setKisiBilgileri(){
        kisiBilgileri.setAd();
        kisiBilgileri.setSoyad();
        kisiBilgileri.setTelNo();
    }

    public static void getRezervasyonBilgileri(){
        System.out.println("\n\n****************REZERVASYON BİLGİLERİNİZ***************");
        System.out.println("\t\tADINIZ--->="+kisiBilgileri.getAd());
        System.out.println("\t\tSOYADINIZ--->"+kisiBilgileri.getSoyad());
        System.out.println("\t\tTELEFON NUMARANIZ--->"+kisiBilgileri.getTelNo());
        System.out.println("\t\tGİRİŞ TARİHİNİZ--->" + tarih1.getGirisTarihi());
        System.out.println("\t\tÇIKIŞ TARİHİNİZ--->"+tarih1.getCikisTarihi());
        System.out.println("\t\tKALACAĞINIZ GUN SAYISI--->"+tarih1.getGunSayisi());
        System.out.println("\t\tÖDENECEK ÜCRET--->" + OdemeBilgileri.getNakit());
        System.out.println("\t\tGİDECEĞİNİZ ÜLKE ADI--->" + AnlasmaUlke.getUlkeAdi());
        System.out.println("\t\tGİDECEĞİNİZ ŞEHİR ADI--->" + Sehir.getSehirAdi());

    }
}
