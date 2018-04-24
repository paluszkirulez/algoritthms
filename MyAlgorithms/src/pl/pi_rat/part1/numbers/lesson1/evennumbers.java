package pl.pi_rat.part1.numbers.lesson1;


import java.util.ArrayList;
import java.util.List;

public class evennumbers {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        for(int i =0;i<=6;i++){
            if((i % 2 ==0) || i==0 ){
                intList.add(i);
            }
        }
        for(int i =5;i>=0;i--){
            if((i % 2 ==0) || i==0 ){
                intList.add(i);
            }
        }
        System.out.println(intList);
    }
}
