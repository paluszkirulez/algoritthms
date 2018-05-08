package pl.pi_rat.part1.main.lesson1.codility_tests;

import java.util.HashMap;

public class PermutationCheck {
    public static void main(String[] args) {
        int[] A={2};
        System.out.println(solution(A));

    }
    static public int solution(int[] A) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int maxI = -1;
        int minI = -1;
        //int orphantValue = -1;
        for(Integer i : A){

            if(i>maxI){
                maxI = i;
            }
            if(minI == -1 || i<minI){
                minI = i;
            }

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
        if(minI != 1){
            return 0;
        }
        if(myMap.keySet().size() != maxI - minI+1){
            return 0;
        }
        else return 1;

    }
}
