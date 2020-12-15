//Bahadır Işık 190201049
public class Dortgen extends Sekil{

    public int en=1;
    public int boy=1;
    public double alan;
    public double cevre;


    public Dortgen(int x,int y){
        setX(x);
        setY(y);
        varlikID = siradaki;
        siradaki++;
        setSekiller(this);
        System.out.println("dortgen yaratildi");
    }

    public Dortgen(int x,int y,int en,int boy)
    {
        setX(x);
        setY(y);
        this.en = en;
        this.boy = boy;
        varlikID = siradaki;
        siradaki++;
        setSekiller(this);
        System.out.println("dortgen yaratildi");
    }
    public void sil()
    {
        super.sil(this.varlikID);
    }

    public double Alan()
    {
        alan = en * boy;
        return alan;
    }
    public double Cevre()
    {
        cevre = 2*(en + boy);
        return cevre;
    }

}
