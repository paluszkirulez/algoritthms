package pl.pi_rat.part1.numbers.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibbonaci {
    public static void main(String[] args) {
        List<Integer> fibList = new ArrayList<>();
        fibList.addAll(Arrays.asList(1,1));
        for(int i = 1; fibList.size()<=20;i++){

                fibList.add(fibList.get(i-1)+fibList.get(i));

        }
        System.out.println(fibList);
    }
}
