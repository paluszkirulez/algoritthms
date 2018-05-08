package pl.pi_rat.part1.main.lesson1.codility_tests;

import java.util.HashMap;

public class OddOccurenciesInArray {
    public static void main(String[] args) {
        int[] A={9,3,9,3,9,7,9};
        System.out.println(solution(A));

    }

    static public int solution(int[] A) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int orphantValue = 0;
        for(Integer i : A){
            if(myMap.containsKey(i)){

                myMap.replace(i,myMap.get(i)+1);
            }
            else{
                myMap.put(i,1);
            }
        }
        for(Integer k : myMap.keySet()){
            if(myMap.get(k) % 2 != 0){
                //System.out.println(myMap.get(k));
                orphantValue = orphantValue + k;
            }
        }
        return orphantValue;
        // write your code in Java SE 8
    }
}
