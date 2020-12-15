import java.util.ArrayList;

//Bahadır Işık 190201049
abstract class  Sekil {
    public  int varlikID;
    static int siradaki=0;
    private int x,i=0;
    private int y;
    private static ArrayList<Sekil> sekiller = new ArrayList<>();


    public abstract double Alan();
    public abstract double Cevre();

    public void Listele ()
    {
        for (Sekil sekil: sekiller) {
            if(sekil instanceof Dortgen)
                System.out.println("Şekil Sınıfı:Dortgen");
            else
                System.out.println("Şekil Sınıfı:Daire");

            System.out.println("X degeri :"+sekil.getX());
            System.out.println("Y degeri :"+sekil.getY());
            System.out.println(sekil.varlikID+". sırada yaratıldı");

        }
    }

    public void enUst()
    {
        if(sekiller.get(sekiller.size()-1) instanceof Daire)
            System.out.println("Şekil Sınıfı:Daire");
        else
            System.out.println("Şekil Sınıfı:Dortgen");

        System.out.println("X :"+sekiller.get(sekiller.size()-1).x);
        System.out.println("Y :"+sekiller.get(sekiller.size()-1).y);
        System.out.println("Alan :"+sekiller.get(sekiller.size()-1).Alan());
        System.out.println("Cevre :"+sekiller.get(sekiller.size()-1).Cevre());
    }

    public void sil(int id)
    {
        for(int i=0;i<sekiller.size();i++)
        {
            if(siradaki==sekiller.get(i).varlikID)
            {
                sekiller.remove(i);
                System.out.println(varlikID+"Silindi");
            }
        }
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public ArrayList<Sekil> getSekiller() {
        return sekiller;
    }

    public void setSekiller(Sekil sekil) {
        sekiller.add(i,sekil);
        i++;
    }
}
