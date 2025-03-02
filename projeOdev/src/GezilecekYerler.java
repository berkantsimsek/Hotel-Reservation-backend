interface GezilecekYerler {
    void gez();
}
class IstanbulGez implements GezilecekYerler {
    @Override
    public void gez() {
        System.out.println("İstanbul ilinde ki gezilecek yer önerilerimiz= ");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("1-AYASOFYA ");
        System.out.println("2-TOPKAPI SARAYI ");
        System.out.println("3-SULTANAHMET CAMİİ ");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");


    }
}
    class IzmirGez implements GezilecekYerler {
        @Override
        public void gez() {
            System.out.println("İzmir ilinde ki gezilecek yer önerilerimiz= ");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("1-KONAK MEYDANI VE SAAT KULESİ ");
            System.out.println("2-BERHGAMA,EFES  ANTİK KENTLERİ ");
            System.out.println("3-KEMERALTI ÇARŞISI ");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        }
    }
class TokatGez implements GezilecekYerler {
    @Override
    public void gez() {
        System.out.println("Tokat ilinde ki gezilecek yer önerilerimiz= ");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("1-TOKAT VE NİKSAR KALELERİ");
        System.out.println("2-BALLICA MAĞARASI");
        System.out.println("3-ALMUS BARAJ GÖLÜ");
        System.out.println("4-GÖĞÜ DELEN ŞELALESİ");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

    }
}
class BayburtGez implements GezilecekYerler {
    @Override
    public void gez() {
        System.out.println("Bayburt ilinde ki gezilecek yer önerilerimiz= ");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("1-BAYBURT KALESİ");
        System.out.println("2-AYDINTEPE MAĞARALARI");
        System.out.println("3-KÜMBET YAYLASI");
        System.out.println("3-BAYRAKTEPE KAYAK MERKEZİ");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

    }
}
class BerlinGez implements GezilecekYerler {
    @Override
    public void gez() {
        System.out.println("Berlin ilinde ki gezilecek yer önerilerimiz= ");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("1-BERLİN DUVARI");
        System.out.println("2-REİCHSTAG BİNASI");
        System.out.println("3-BERLİN KATEDRALİ");
        System.out.println("3-BRANDENBURG KAPISI");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

    }
}
class KolnGez implements GezilecekYerler {
    @Override
    public void gez() {
        System.out.println("Koln ilinde ki gezilecek yer önerilerimiz= ");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("1-ALTER MARKT");
        System.out.println("2-LANXESS ARENA");
        System.out.println("3-CHOCOLATE MUSEUM");
        System.out.println("3-RÖMİSCH-GERMANİSCHES MUSEUM");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

    }
}
class NewYorkGez implements GezilecekYerler {
    @Override
    public void gez() {
        System.out.println("NewYork eyaletinde ki gezilecek yer önerilerimiz= ");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("1-CENTRAL PARK");
        System.out.println("2-EMPIRE STATE BUİLDİNG");
        System.out.println("3-BROOKLYN KÖPRÜSÜ");
        System.out.println("4-ÖZGÜRLÜK HEYKELİ");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

    }
}
class TeksasGez implements GezilecekYerler {
    @Override
    public void gez() {
        System.out.println("Teksas eyaletinde ki gezilecek yer önerilerimiz= ");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("1-SAN ANTONIO");
        System.out.println("2-HOUSTON");
        System.out.println("3-DALLAS");
        System.out.println("4-GALVESTON");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

    }
}
class WashingtonGez implements GezilecekYerler {
    @Override
    public void gez() {
        System.out.println("Washington eyaletinde ki gezilecek yer önerilerimiz= ");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("1-SEATTLE");
        System.out.println("2-MOUNT RAİNİER MİLLİ PARKI");
        System.out.println("3-TACOMA");
        System.out.println("4-SAN JUAN ADALARI");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

    }
}

