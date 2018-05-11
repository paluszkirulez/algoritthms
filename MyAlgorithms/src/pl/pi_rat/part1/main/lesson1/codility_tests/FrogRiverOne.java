package pl.pi_rat.part1.main.lesson1.codility_tests;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[] A = {1,3,1,4,2,3,5,4};
        System.out.println(solution(5, A));
    }
    static public int solution(int X, int [] A){
        //Arrays.sort(A);
        //
        //int step = 1;
        List<Integer> myList = new ArrayList<>();
        //Arrays.stream(A).filter(x -> x > X).g;
        for(int i= 0;i<A.length && myList.size()<X ;i++){
            System.out.println(A[i]);
            if(!myList.contains(A[i])){
                myList.add(A[i]);
                if (myList.size()==X){
                    return i;

                }
                }

        }
        return -1;
    }

}
