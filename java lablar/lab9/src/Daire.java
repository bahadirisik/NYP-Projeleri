//Bahadır Işık 190201049
public class Daire extends Sekil{
    private double yaricap=1;
    public double alan;
    public double cevre;

    public Daire(int x,int y){
        setX(x);
        setY(y);
        varlikID = siradaki;
        siradaki++;
        setSekiller(this);
        System.out.println("daire yaratildi");
    }

    public Daire(int x,int y,int  yaricap)
    {
        setX(x);
        setY(y);
        setYaricap(yaricap);
        varlikID = siradaki;
        siradaki++;
        setSekiller(this);
        System.out.println("daire yaratildi");
    }

    public void sil()
    {
        super.sil(this.varlikID);
    }

    public double Alan()
    {
        alan = 3.14*(getYaricap() * getYaricap());
        return  alan;
    }
    public double Cevre()
    {
        cevre = 2*3.14* getYaricap();
        return cevre;
    }

    public void buyut(int a)
    {
        setYaricap(yaricap + a);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
}
