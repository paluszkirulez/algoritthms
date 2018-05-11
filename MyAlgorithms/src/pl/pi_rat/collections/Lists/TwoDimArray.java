package pl.pi_rat.collections.Lists;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int N = 10;
        int tab[][]= new int[10][10];
        for(int i =0;i<10;i++){
            tab[i][9-i] =i;
            System.out.println(Arrays.toString(tab[i]));
        }
    }
}
