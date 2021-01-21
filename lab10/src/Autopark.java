import java.util.Vector;

interface Arac {
    public void hızlan(double a);
    public void yavasla(double a);
    public void stop();
}
class Automobile implements Arac{
    public static int otoSayisi;
    private double fuel;
    private double speed;
    private String license;
    private long girisZamani;
    // otoparktaki araç sayısını 1 artıracak, fueli ve speed i 0 yapacak license’i ise null
    public Automobile(){
        otoSayisi++;
        this.setFuel(0);
        this.setSpeed(0);
        this.setLicense(null);
    }

    public Automobile(double f, double s, String l)
    {
        otoSayisi++;
        this.setFuel(f);
        this.setSpeed(s);
        this.setLicense(l);
    }
    public Automobile(String l) {
        otoSayisi++;
        this.setLicense(l);
    }

    public int getOtoSayisi() {
        return otoSayisi;
    }

    private void setLicense(String l) {
        this.license = l;
    }


    // Hızlan metodunda hız saatte 300'u geçmeyecek, kontrolleri yazın.
    // hızlanma oranın (0-1] aralığında olduğundan emin olun.
    // bu şartları sağlamıyorsa hız değişmeyecek ve ekrana hız değişmedi yazılacak.
    public void hızlan(double hızlanmaOranı){
        if(hızlanmaOranı>0 && hızlanmaOranı<=1 && (this.getSpeed() + this.getSpeed() *hızlanmaOranı)<300)
            this.setSpeed(this.getSpeed() + this.getSpeed() *hızlanmaOranı);
        else
            System.out.println("Hız Değişmedi");
    }
    // yavasla metodunda yavaşlarken hızın 0 ın altına düşmediğinden emin olun. Düşerse 0 yapın.
    // yavaşlama oranın (0-1] aralığında olduğundan emin olun.
    // bu şartları sağlamıyorsa hız değişmeyecek ve ekrana hız değişmedi yazılacak.
    public void yavasla(double yavaslamaOranı){
        if(yavaslamaOranı>0 && yavaslamaOranı<=1)
            this.setSpeed(this.getSpeed() - this.getSpeed() *yavaslamaOranı);
        else
            System.out.println("Hız Değişmedi");
        if(this.getSpeed() < 0)
            this.setSpeed(0);
    }

    // aracın hızını 0 yapar.
    // ekrana da hız sıfırlandı araç durdu yazar.
    public void stop() {
        this.setSpeed(0);
        System.out.println("Hız Sıfırlandı.Araç Durdu");
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getLicense() {
        return license;
    }

    public long getGirisZamani() {
        return girisZamani;
    }

    public void setGirisZamani(long girisZamani) {
        this.girisZamani = girisZamani;
    }


}

public class Autopark {
    Vector<Automobile> sayarpark = new Vector<Automobile>(0);
    public static int oAracSayisi;
    public int otoKapasite = 0;
    public double girisZaman = 0;
    public double cikisZaman = 0;
    static long otoparkKasasi = 0;
    // vector tipinde otopark oluşturun boyutu size kadar olsun.
    // otopark kasasını 0 yapın.
    Autopark(int size){
        otoparkKasasi = 0;
        otoKapasite = size;
        sayarpark.setSize(size);
    }

    // Automobile otoparka giriyor. otoparktaki araçların otopark kapasitesini
    // geçmediğini kontrol edin. Otoparka girdiğinde otonun giriş zamanını kaydedin.
    // bunun için System.currentTimeMillis(); kullanın
    // eğer araç park edemezse, yani otopark doluysa, [license no] "park edemedi" yazılsın.
    public void girisYap(Automobile oto) {
        if(oAracSayisi < otoKapasite)
        {
            System.out.println(oto.getLicense()+" otoparka girdi.Otopark kapasitesi ve boyutu:"+sayarpark.size());
            sayarpark.add(oAracSayisi,oto);
            oAracSayisi++;
            oto.setGirisZamani(System.currentTimeMillis());
        }
        else
            System.out.println(oto.getLicense()+" Park Edemedi");
    }
    // içeride kalınan zamanı bulun. (çıkarken bulunan zaman - girişzamanı)
    //(içerde kalınan zaman/100f) * 10 ile kasaya eklenecek miltarı bulun.
    // bu miktarı kasaya ekleyin. Aracı otoparktan remove edin.
    // ekrana hangi araç çıktığını plaka ile, nekadar süre kaldığını ve kaç tl ödediğini de yazdırın.
    // eğer çıkacak olan araç otoparkta var ise çıkar. Parkta yoksa araç bulunamadı diye ekrana yazar.
    public void cikisYap(Automobile oto) {
        if(sayarpark.contains(oto)) {
            oAracSayisi--;
            girisZaman = oto.getGirisZamani();
            oto.setGirisZamani(System.currentTimeMillis());
            cikisZaman = oto.getGirisZamani();
            otoparkKasasi += ((cikisZaman - girisZaman) / 100) * 10;
            System.out.println(oto.getLicense() + " otoparktan " + (cikisZaman - girisZaman) + " milisayine sonra cikti.Kasaya eklenecek tutar (" + (cikisZaman - girisZaman) / 100 + " saniye * Saniye Başına 10TL=)" + ((cikisZaman - girisZaman) / 100) * 10);
            sayarpark.remove(oto);
        }
        else
            System.out.println("Araç Bulunamadı");
    }

    // otopark kasasında kaç TL olduğunu ekranda gösterecek.
    public static void kasaBilgi() {
        System.out.println("Kasadaki toplam para : "+otoparkKasasi);
    }

    // Çalışma-1 ile ilgili
    public int recursiveTopl(int n){
        if(n<=2)
            return 1;
        return (3*recursiveTopl(n/2))+n;
    }


    // Ornek Test senaryosu
    public static void main(String[] args) throws InterruptedException {
        Autopark park = new Autopark(1);
        Automobile a = new Automobile("41 BR 123");
        Automobile b = new Automobile("34 TR 456 ");
        park.girisYap(a); // a otoparka giris yapiyor
        Thread.sleep(200); // 200 milisaniye zaman geçiyor.

        park.girisYap(b); // b otoparka giris yapiyor
        Thread.sleep(999); // 999 milisaniye zaman geçiyor
        park.cikisYap(b);  // b otoparktan cikiyor
        park.cikisYap(a); // a otoparktan çıkıyor –aslında yukarda kapasitededen dolayı giremediği için
        //(park edemedi) araç bulunamadı yaziyo
        park.kasaBilgi(); // otoparktaki toplam parayı yazdırıyor.
        //System.out.println(park.recursiveTopl(5));
    }
}

