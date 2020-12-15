import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Çalışma 1
        Scanner girdi = new Scanner(System.in);
        float sayi=1,toplam=0,sayac=0;

        while (sayi!=0)
        {
            System.out.println("Lütfen bir sayı giriniz. Eğer çıkmak istiyorsanız 0’a basınız.");
            sayi = girdi.nextFloat();
            toplam+= sayi;
            sayac++;
        }
        sayac--;
        System.out.println("Sayıların Ortalaması = " + toplam/sayac);



        //Çalışma 2
        int [] A = new int[6];
        int sayi2=0,c=0,b=0;

        for(int i=0;i<6;i++)
        {
            System.out.println("Eleman giriniz : ");
            sayi2 = girdi.nextInt();
            A[i] = sayi2;
        }
        int [] B = new int[6];
        int [] C = new int[6];

        for(int i=0;i<6;i++)
        {
            if(i%2==0) {
                C[c] = A[i];
                c++;
            }
            if(i%2==1) {
                B[b] = A[i];
                b++;
            }
        }
        System.out.print("A =");
        for(int i=0;i<6;i++)
            System.out.print(" "+A[i]);
        System.out.println();
        System.out.print("B =");
        for(int i=0;i<b;i++)
            System.out.print(" " +B[i]);
        System.out.println();
        System.out.print("C =");
        for(int i=0;i<c;i++)
            System.out.print(" "+C[i]);

    }
}