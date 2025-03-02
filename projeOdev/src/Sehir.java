abstract class Sehir {
    private static String sehirAdi;
    public String sehirSecenek;

    public static void setSehirAdi(String sehirAdi){
        Sehir.sehirAdi = sehirAdi;
    }

    public static String getSehirAdi() {
        return sehirAdi;
    }





    public void sehirDetayi() {
        System.out.println(sehirAdi + " şehri turistik yerlere sahiptir.");
    }
}
class Istanbul extends Sehir {
    public Istanbul() {
        setSehirAdi("İstanbul");
        System.out.println("**********İSTANBUL ŞEHRİNİ SEÇTİNİZ********** ");
        sehirDetayi();
        GezilecekYerler ıstanbulgez=new IstanbulGez();
        ıstanbulgez.gez();
        Oteller oteller=new Oteller();
        Oteller.istanbul();

    }


}
class Tokat extends Sehir {
    public Tokat() {
        setSehirAdi("Tokat");
        System.out.println("*********TOKAT ŞEHRİNİ SEÇTİNİZ************ ");
        sehirDetayi();
        GezilecekYerler tokatgez=new TokatGez();
        tokatgez.gez();
        Oteller oteller= new Oteller();
        Oteller.tokat();

    }


}
class İzmir extends Sehir {
    public İzmir() {
        setSehirAdi("İzmir");
        System.out.println("*************İZMİR ŞEHRİNİ SEÇTİNİZ********** ");
        sehirDetayi();
        GezilecekYerler izmirgez=new IzmirGez();
        izmirgez.gez();
        Oteller oteller=new Oteller();
        Oteller.izmir();

    }



}
class Bayburt extends Sehir {
    public Bayburt() {
        setSehirAdi("Bayburt");
        System.out.println("**********BAYBURT ŞEHRİNİ SEÇTİNİZ*****************");
        sehirDetayi();
        GezilecekYerler bayburtgez=new BayburtGez();
        bayburtgez.gez();
        Oteller oteller=new Oteller();
        Oteller.Bayburt();

    }


}


    class Berlin extends Sehir {
        public Berlin() {
            setSehirAdi("Berlin");
            System.out.println("*************BERLİN ŞEHRİNİ SEÇTİNİZ********** ");
            sehirDetayi();
            GezilecekYerler berlingez=new BerlinGez();
            berlingez.gez();
            Oteller oteller= new Oteller();
            Oteller.berlin();
        }

    }
class Koln extends Sehir {
    public Koln() {
        setSehirAdi("Koln");
        System.out.println("*************KOLN ŞEHRİNİ SEÇTİNİZ********** ");
        sehirDetayi();
        GezilecekYerler kolnGez=new KolnGez();
        kolnGez.gez();
        Oteller oteller= new Oteller();
        Oteller.koln();
    }

}


    class NewYork extends Sehir {
        public NewYork() {
            setSehirAdi("NewYork");
            System.out.println("*************NEWYORK EYALETİNİ SEÇTİNİZ********** ");
            sehirDetayi();

            GezilecekYerler newYorkGez=new NewYorkGez();
            newYorkGez.gez();
            Oteller oteller=new Oteller();
            Oteller.newYork();
        }


    }
class Teksas extends Sehir {
    public Teksas() {
        setSehirAdi("Teksas");
        System.out.println("*************TEKSAS EYALETİNİ SEÇTİNİZ********** ");
        sehirDetayi();
        GezilecekYerler teksasGez=new TeksasGez();
        teksasGez.gez();
        Oteller oteller=new Oteller();
        Oteller.Teksas();

    }


}
class Washington extends Sehir {
    public Washington() {
        setSehirAdi("Washington");
        System.out.println("*************WASHİNGTON EYALETİNİ SEÇTİNİZ********** ");
        sehirDetayi();
        GezilecekYerler washingtonGez=new WashingtonGez();
        washingtonGez.gez();
       Oteller oteller=new Oteller();
       Oteller.Washington();

    }


}