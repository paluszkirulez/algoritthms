package pl.pi_rat.part1.main.lesson1.numbers;


import java.util.ArrayList;
import java.util.List;

public class evennumbers {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();

        myList(18);
    }
    public static void myList(int max){
        List<Integer> myListlist = new ArrayList<>();
        for(int i =0;i<=max;i++){
            if((i % 2 ==0) || i==0 ){
                myListlist.add(i);
            }
        }
        for(int i =max-2;i>=0;i--){
            if((i % 2 ==0) || i==0 ){
                myListlist.add(i);
            }
        }
        System.out.println(myListlist);
    }
}
