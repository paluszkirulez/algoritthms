package pl.pi_rat.part1.main.lesson1.codility_tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dice{
    public static void main(String[] args) {
        int[] A = {1,2,3};
        System.out.println(solution(A));
    }
        static public int solution(int[] A) {
            HashMap<Integer, Integer> myMap = new HashMap<>();
            for(Integer i : A){

                if(myMap.containsKey(i)){
                    myMap.replace(i,myMap.get(i)+1);
                    if(myMap.get(i)>1){
                        return 0;
                    }
                }
                else{
                    myMap.put(i,1);
                }
            }
return -1;
        }
}
