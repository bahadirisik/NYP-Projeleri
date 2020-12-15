

/**
 *
 * @author asayar
 */
public class Daire {

    // Class parametreleri
    public double PI=3.14;
    public int yaricap;

    /**
     * Constructor
     * @param yaricap Dairenin yarıçapı
     */
    public Daire(int yaricap){
        this.yaricap = yaricap;
    }

    /**
     * Dairenin alanını Islemlerim class ındaki
     * methodları kullanarak hesaplar
     * @return alanı double cinsinden dondurur
     */
    public double  alanHesapla(){
        Islemlerim islemlerim = new Islemlerim(PI);
        double alan = islemlerim.carp(yaricap *yaricap);

        return alan;
    }

    /**
     * Dairenin çevresini Islemlerim class ındaki
     * methodları kullanarak hesaplar
     * @return cevreyi double cinsinden dondurur
     */
    public double cevreHesapla(){
        Islemlerim islemlerim = new Islemlerim(PI);
        double cevre = islemlerim.carp(2*yaricap);
        return cevre;
    }

    /**
     * Bir dairenin cevresinin alanından büyüyk
     * olup olmadığını Islemlerim class ındaki
     * methodları kullanarak belirler
     * @return boolean değer dönderir
     */
    public boolean cevreAlandanBuyuktur(){
        Islemlerim islemlerim = new Islemlerim(PI);
        if(islemlerim.carp(2*yaricap) > islemlerim.carp(yaricap *yaricap))
            return true;
        return false;
    }

    /**
     * Bir dairenin cevresinin alanından küçük
     * olup olmadığını ıslemlerim class ındaki
     * methodları kullanarak belirler
     * @return boolean değer dönderir
     */
    public boolean cevreAlandanKucuktur(){
        Islemlerim islemlerim = new Islemlerim(PI);
        if(islemlerim.carp(2*yaricap) < islemlerim.carp(yaricap *yaricap))
            return true;

        return false;
    }

    /**
     * Dairenin alanını ve çevresini ekrana yazdırır.
     */
    public void ekranaYazdir(){
        Islemlerim islemlerim = new Islemlerim(PI);
        System.out.println("Dairenin Alani :"+islemlerim.carp(yaricap *yaricap)+"  Dairenin Cevresi :"+islemlerim.carp(2*yaricap));
    }



}