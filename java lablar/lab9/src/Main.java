//Bahadır Işık 190201049
public class Main {

    public static void main(String[] args) {

        Daire d1 = new Daire(1,1);
        Daire d2 = new Daire(2,3, 2);
        Dortgen dg1 = new Dortgen(2,2);

        System.out.println(d1.Alan());
        System.out.println(d2.Alan());
        System.out.println(dg1.Alan());

        d1.enUst();
        d2.enUst();
        dg1.enUst();
        d1.Listele();
        d2.sil();
        d1.Listele();



    }
}
