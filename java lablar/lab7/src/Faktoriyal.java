

/**
 *
 * @author asayar
 */
public class Faktoriyal {

    private int deger;
    private int sonuc;

    /**
     * Faktoriyali bulunmak istenen
     * değeri atar
     * @param deger
     */
    public void setDeger(int deger){
        this.deger = deger;
    }
    /**
     * Faktoriyali bulunmak istenen
     * dönderir
     * @return
     */
    public int getDeger(){
        return deger;
    }

    /**
     * Girilen değerin faktorial değerini Islemlerim
     * class ındaki methodları kullanarak
     * hesaplayıp sonuc parametresine yazdırır
     */
    public void hesapla(){
        Islemlerim islemlerim = new Islemlerim(deger);
        for (int i=1;i<deger-1;i++)
        {
            islemlerim = new Islemlerim(islemlerim.carp(deger-i));
        }
        sonuc = (int)islemlerim.topla(0);
    }

    /**
     * Degeri ve sonucu ekrana yazdırır
     */
    public void ekranaYazdir(){
        System.out.println("Faktoriyel Degeri : "+deger+"Sonucu : "+sonuc);
    }

}
