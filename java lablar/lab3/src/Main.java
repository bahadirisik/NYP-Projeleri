import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Çalışma 1
        String cumle1,cumle2;
        Scanner sc1 = new Scanner(System.in);
        boolean esit=true;

        System.out.println("İlk Cümleyi Giriniz : ");
        cumle1 = sc1.nextLine();
        System.out.println("İkinci Cümleyi Giriniz : ");
        cumle2 = sc1.nextLine();

        if(cumle1.length() != cumle2.length()){
            esit = false;
        }
        else{
            for(int i=0;i<cumle1.length();i++)
            {
                if(cumle1.charAt(i) != cumle2.charAt(i))
                {
                    esit=false;
                    break;
                }
            }
        }

        if(esit)
            System.out.println("İki Cümle Eşit");
        else
            System.out.println("İki Cümle Farklıdır");


        //Çalışma 2
        for(int i=1;i<=cumle1.length();i++)
        {
            System.out.print(cumle1.charAt(cumle1.length() - i));
        }

    }
}