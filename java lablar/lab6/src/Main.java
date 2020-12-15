import java.util.Scanner;
import java.util.Random;

class Dizi{
    private int [] rastgeleDizi;
    private int boyut;

    Dizi(int boyut)
    {
        this.boyut = boyut;
        rastgeleDizi = new int[boyut];
        Random rnd = new Random();
        int sayi=0;
        for(int i=0;i<boyut;i++)
        {
            sayi = rnd.nextInt(100);
            rastgeleDizi[i] = sayi;
        }
    }

    public int sum(){
        int toplam=0;
        for(int i=0;i<boyut;i++)
        {
            toplam+=rastgeleDizi[i];
        }
        return toplam;
    }

    public void yazdir(){
        for(int i=0;i<boyut;i++)
        {
            System.out.println(" "+rastgeleDizi[i]);
        }
    }
}

public class Main {
    //Çalışma 1
    public static int[][] createArray(int satir_sayisi,int sutun_sayisi)
    {
        Random rastgeleSayi = new Random();
        int [][] array = new int[satir_sayisi][sutun_sayisi];
        for(int i=0;i<satir_sayisi;i++)
        {
            for(int j=0;j<sutun_sayisi;j++)
            {
                int a = rastgeleSayi.nextInt(101);
                array[i][j] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        //Çalışma 1'in Devamı
        Scanner girdi = new Scanner(System.in);
        int satir=0,sutun=0;
        System.out.println("Satir Sayisini Giriniz : ");
        satir = girdi.nextInt();
        System.out.println("Sutun Sayisini Giriniz : ");
        sutun = girdi.nextInt();
        int[][] yedekArray = new int[satir][sutun];

        yedekArray=createArray(satir,sutun);
        for(int i=0;i<satir;i++)
        {
            for(int j=0;j<sutun;j++)
            {
                System.out.print(" "+yedekArray[i][j]);
            }
            System.out.println();
        }


        //Çalışma 2
        Dizi dizi= new Dizi(5);
        int toplam = dizi.sum();
        System.out.println("Dizi :");
        dizi.yazdir();

    }


}