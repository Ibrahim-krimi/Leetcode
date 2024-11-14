package com.example.demo.Exercices;

public class CarreParfait {

    public void carreParfait(int x) {
        int y = (int)(Math.sqrt((double)x));
        int z = (int)Math.pow(y,2.0);
        System.out.println(y);
        System.out.println(z);

        if(z == x){
            System.out.println("Carre Parfait");
        }
        else {
            System.out.println("Carre non Parfait");
        }
    }

    public Boolean carreParfait2(int x,int left,int right) {

        if (left <= right) {
            int milieu  = (left+right) / 2;
            if ((milieu  * milieu ) == x) {
                return true;
            }
            else if  (milieu  * milieu  > x) {
                return carreParfait2(x,left,milieu-1);
            }else {
                return carreParfait2(x,milieu +1, right);
            }
        }
        return false;
    }
}
