package pl.pi_rat.part1.main.lesson3.search;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,8,9,10,22,33,55,77};
        /*String lista = "ala ma kota";
        String szukane = "h";

        System.out.println(new NaiveSearch().search(lista, szukane, false));*/

        ArrayList<Integer> myList = new ArrayList<>();
        myList.addAll(Arrays.asList(1,2,3,4,5,6,8,9,10,22,33,55,77));
        System.out.println(new BinarySearch().search(myList,1));

    }


}
