package pl.pi_rat.part1.main.lesson2.datastructures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.addAll(Arrays.asList(1,3,2,5,3,7,4));
        int n = myList.size();
        do{
            for(int i = 0; i<n-1;i++){
                if(myList.get(i) > myList.get(i+1)){
                    int a = myList.get(i);
                    myList.set(i,myList.get(i+1));
                    myList.set(i+1,a);

                }
            }
            n = n-1;
        }while (n>1);
        System.out.println(myList);

    }
}
