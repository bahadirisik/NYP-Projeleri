

import java.util.Scanner;

/**
 *
 * @author asayar
 */
public class Main {

    public static void main(String[] args) {
        Islemlerim islemlerim = new Islemlerim(5);

        System.out.println("Toplama :"+islemlerim.topla(5));
        System.out.println("Çıkarma :"+islemlerim.cikar(5));
        System.out.println("Çarpma :"+islemlerim.carp(5));
        System.out.println("Bölme :"+islemlerim.bol(5));


        Daire daire1 = new Daire(3);
        daire1.ekranaYazdir();
        System.out.println("Dairenin1 Çevresi Alandan Büyük :"+daire1.cevreAlandanBuyuktur());
        System.out.println("Dairenin1 Çevresi Alandan Küçük :"+daire1.cevreAlandanKucuktur());


        System.out.println("Bir değer Giriniz :");
        Scanner scn = new Scanner(System.in);
        int sayi = scn.nextInt();

        Daire daire2 = new Daire(sayi);
        daire2.ekranaYazdir();
        System.out.println("Dairenin2 Çevresi Alandan Büyük :"+daire2.cevreAlandanBuyuktur());
        System.out.println("Dairenin2 Çevresi Alandan Küçük :"+daire2.cevreAlandanKucuktur());

        Faktoriyal faktoriyal1 = new Faktoriyal();
        faktoriyal1.setDeger(5);
        faktoriyal1.hesapla();
        faktoriyal1.ekranaYazdir();
        faktoriyal1.setDeger(4);
        faktoriyal1.hesapla();
        faktoriyal1.ekranaYazdir();

    }
}
