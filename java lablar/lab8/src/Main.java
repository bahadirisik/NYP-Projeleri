import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;



class kume {

    ArrayList<Integer> list = new ArrayList<Integer>();

    public kume(){

    }
    public kume(int[] a){
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
    }
    public kume(kume a){
        list = (ArrayList<Integer>) a.list.clone();
    }
    public void ekle(int a){
        list.add(a);
    }
    public void yazdir(){
        System.out.println(list);
    }
    public boolean denk(kume a){
        if(list.size() !=  a.list.size())
            return false;
        return true;
    }
    public boolean esit(kume a){
        if(list.size() !=  a.list.size())
            return false;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) != a.list.get(i))
                return false;
        }
        return true;
    }
    public kume birlesim(kume a){
        kume birlesimKume = new kume();
        birlesimKume.list.addAll(list);
        for (int i = 0; i < a.list.size(); i++) {
            if(!birlesimKume.list.contains(a.list.get(i)))
            {
                birlesimKume.list.add(a.list.get(i));
            }
        }
        return birlesimKume;
    }


    public kume kesisim(kume a) {
        kume kesisimKume = new kume();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < a.list.size(); j++) {
                if(list.get(i) == a.list.get(j))
                {
                    kesisimKume.list.add(list.get(i));
                }
            }
        }
        return kesisimKume;
    }


    public kume fark(kume a) {
        kume farkKume = new kume();
        for (int i = 0; i < list.size(); i++) {
            if (!a.list.contains(list.get(i)))
                farkKume.list.add(list.get(i));
        }
        return farkKume;
    }


    public ArrayList<kume> altKumeler() {
        ArrayList<kume> altKume = new ArrayList<kume>();
        int a = list.size();
        for (int i = 0; i < (1<<a); i++) {
            kume yedek = new  kume();
            for (int j = 0; j < a; j++) {
                if ((i & (1 << j)) > 0){
                    yedek.list.add(list.get(j));
                }
            }
            altKume.add(yedek);
        }
        return  altKume;
    }
}

public class Main {
    public static void main(String[] args) {
// TODO code application logic here
        kume km = new kume();
        km.ekle(10);
        km.ekle(11);
        km.ekle(2);
        System.out.print("km = {");
        km.yazdir();
        System.out.println("}");
        int[] a = {1,2,3,4,5,6};
        kume km2 = new kume(a);
        System.out.print("km2 = {");
        km2.yazdir();
        System.out.println("}");
        kume km3 = new kume(a);
        System.out.print("km3 = {");
        km3.yazdir();
        System.out.println("}");
        if (km.denk(km2))
            System.out.println("km ve km2 kumeleri denk.");
        else
            System.out.println("km ve km2 kumeleri denk degil.");
        if (km2.esit(km3))
            System.out.println("km2 ve km3 kumeleri esit.");
        else
            System.out.println("km2 ve km3 kumeleri esit degil.");
        kume sn = km.birlesim(km2);
        System.out.print("km ve km2 birlesimi = {");
        sn.yazdir();
        System.out.println("}");
        kume sn2 = km.kesisim(km2);
        System.out.print("km ve km2 kesisimi = {");
        sn2.yazdir();
        System.out.println("}");
        kume sn3 = km.fark(km2);
        System.out.print("km ve km2 farki = [");
        sn3.yazdir();
        System.out.println("}");
        System.out.println("km\'nin alt kumeleri");
        ArrayList<kume> sonuc = km.altKumeler();
        for(int i = 0; i < sonuc.size(); i++){
            System.out.print("{");
            sonuc.get(i).yazdir();
            System.out.println("}");
        }
    }


}