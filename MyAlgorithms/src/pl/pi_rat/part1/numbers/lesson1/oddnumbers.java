package pl.pi_rat.part1.numbers.lesson1;

import java.util.ArrayList;
import java.util.List;

public class oddnumbers {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        /*for(int i =1;i<=61;i=i+2){
            System.out.println(i);
        }*/
        for(int i =1;i<=61;i=i+2){
            if(i%2 != 0){
                intList.add(i);
            }
        }
        System.out.println(intList);
    }
}
