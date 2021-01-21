//Bahadır Işık 190201049
public class Ogrenci {
    private String ad;
    private String soyAd;
    private String ogrenciNo;
    private Ders[] dersler = new Ders[6];
    public static int index=0;
    public float toplam=0;

    public Ogrenci(String ad,String soyAd,String ogrenciNo)
    {
        this.ad = ad;
        this.soyAd = soyAd;
        this.ogrenciNo = ogrenciNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void dersEkle(Ders ders)
    {
        dersler[index++] = ders;
    }

    public void bilgileriYazdir()
    {
        System.out.println("Adi : "+this.ad);
        System.out.println("Soyadi : "+this.soyAd);
        System.out.println("Öğrenci No : "+this.ogrenciNo);
        System.out.println("Dersler :");
        for (Ders ders:dersler) {
            System.out.println(ders.getAd());
        }
    }

    public void ortalama(){
        int i;
        for (Ders ders:dersler) {
            i = Integer.parseInt(ders.getNot());
            toplam += i;
        }
        System.out.println("Öğrencinin not ortalaması : "+toplam/6);
    }
}
