package pl.pi_rat.part1.main.lesson2.datastructures;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
            ArrayList<Integer> c = addNumbers(10);
        System.out.println(c);
            addPreviousNumber(c);
            addOddNumber(c);
            addAllNumber(c);
    }
    public static ArrayList<Integer> addNumbers(int x){
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i =0;i<x;i++){
            myList.add(i);

        }
        return myList;
    }

    public static void addPreviousNumber(ArrayList<Integer> myList){
        myList.stream().
                map(i -> i % 2 != 0 ? i*2 -1 : i).forEach(System.out::println);
    }
    public static void addOddNumber(ArrayList<Integer> myList){
        myList.stream().
                map(i -> i % 2 == 0 ? i/2 : i);
    }

    public static void addAllNumber(ArrayList<Integer> myList){
        int k =0;
        int sum = IntStream.range(0,10).sum();
        IntStream.iterate(0,i->i+2).limit(5).forEach(System.out::println);


    }
}