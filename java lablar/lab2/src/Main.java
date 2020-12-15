import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Çalışma 1
        int sayi;
        System.out.println("Bir x değeri giriniz ");

        Scanner sc = new Scanner(System.in);
        sayi = sc.nextInt();

        System.out.println("Sonuç : " + ((4*sayi*sayi) - (8*sayi) + 16));



        //Çalışma 2
        int birlik = 0,onluk = 0,beslik = 0,yirmibeslik = 0,deger =0,elli = 0;

        System.out.println("Lütfen 1-99 arası deger giriniz : ");

        Scanner scn = new Scanner(System.in);
        deger = scn.nextInt();

        elli = deger / 50;
        deger = deger % 50;
        yirmibeslik = deger / 25;
        deger = deger % 25;
        onluk = deger / 10;
        deger = deger % 10;
        beslik = deger / 5;
        deger = deger % 5;

        System.out.print((elli + yirmibeslik + onluk + beslik) + "kağıt para");
        if(deger != 0)
        {
            System.out.println(" - " + deger + "TL nizi yedim :)");
        }

    }
}