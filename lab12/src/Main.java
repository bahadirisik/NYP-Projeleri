//Bahadır Işık 190201049
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try{
            Scanner reader = new Scanner(new File("ali_bilge.txt"));
            String tutucu = reader.nextLine();
            String[] tutucu2 = tutucu.split(" ");
            String ogrNo = reader.nextLine();
            Ogrenci ogrenci = new Ogrenci(tutucu2[0],tutucu2[1],ogrNo);

            while (reader.hasNextLine())
            {
                tutucu = reader.nextLine();
                tutucu2 = tutucu.split(" ");
                ogrenci.dersEkle(new Ders(tutucu2[0],tutucu2[1],tutucu2[2]));
            }
            System.out.println("Öğrenci Bilgileri");
            ogrenci.bilgileriYazdir();
            ogrenci.ortalama();

        }catch (Exception FileNotFoundException){
            System.out.println("Dosya Bulunamadı");
        }

    }
}
