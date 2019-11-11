public class Ogrenci {
    private long ogrNo;
    private String ogrAd;
    private String ogrSoyad;

    public long getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(long ogrNo) {
        this.ogrNo = ogrNo;
    }

    public String getOgrAd() {
        return ogrAd;
    }

    public void setOgrAd(String ogrAd) {
        this.ogrAd = ogrAd;
    }

    public String getOgrSoyad() {
        return ogrSoyad;
    }

    public void setOgrSoyad(String ogrSoyad) {
        this.ogrSoyad = ogrSoyad;
    }

    public String getOgrBolum() {
        return ogrBolum;
    }

    public void setOgrBolum(String ogrBolum) {
        this.ogrBolum = ogrBolum;
    }

    private String ogrBolum;
    private Ders []dersler;
    private Sinav []sınavlar;

    public Ders[] getDersler() {
        return dersler;
    }

    public void setDersler(Ders[] dersler) {
        this.dersler = dersler;
    }

    public Sinav[] getSınavlar() {
        return sınavlar;
    }

    public void setSınavlar(Sinav[] sınavlar) {
        this.sınavlar = sınavlar;
    }
}
