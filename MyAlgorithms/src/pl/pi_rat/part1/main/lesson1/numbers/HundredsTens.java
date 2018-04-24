package pl.pi_rat.part1.main.lesson1.numbers;

import java.util.ArrayList;
import java.util.List;

public class HundredsTens {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        for(int i =100;i<=900;i=i+100){

                intList.add(i);
                intList.add(i/10);
        }

        System.out.println(intList);
    }
}
