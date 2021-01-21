//Bahadır Işık 190201049
public class Ders {
    private String ad;
    private String donem;
    private String not;

    public Ders(String ad,String donem,String not)
    {
        this.ad = ad;
        this.donem = donem;
        this.not = not;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return donem;
    }

    public void setSoyAd(String soyAd) {
        this.donem = soyAd;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }
}
