import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Çalışma 1
        int [][] tablo = new int[3][3];
        Scanner girdi = new Scanner(System.in);
        int enBuyuk=0,enKucuk=100,sayi=0,k=0;
        System.out.println("10 Tane Sayi Giriniz");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sayi = girdi.nextInt();
                if(k==0)
                {
                    enBuyuk=sayi;
                    enKucuk=sayi;
                    k++;
                }
                if(sayi>enBuyuk)
                    enBuyuk=sayi;
                if(sayi<enKucuk)
                    enKucuk=sayi;
            }
        }

        System.out.println("En Büyük Değer Olan " + enBuyuk + " İle En Küçük Olan " +enKucuk+ " Arasındaki Fark " +(enBuyuk - enKucuk));



        //Çalışma 2
        int sayi2,b=0,c=0;
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        System.out.println("10 Tane Pozitif Sayi Giriniz");
        for(int i=0;i<10;i++)
        {
            sayi2= girdi.nextInt();
            A[i] = sayi2;
            if(sayi2%2==0){
                B[b]=sayi2;
                b++;
            }
            if(sayi2%2==1)
            {
                C[c] = sayi2;
                c++;
            }
        }

        System.out.print("A=");
        for(int i=0;i<10;i++)
            System.out.print(A[i] + " ");
        System.out.println();
        System.out.print("B=");
        for(int i=0;i<b;i++)
            System.out.print(B[i] + " ");
        System.out.println();
        System.out.print("C=");
        for(int i=0;i<c;i++)
            System.out.print(C[i] + " ");

    }
}