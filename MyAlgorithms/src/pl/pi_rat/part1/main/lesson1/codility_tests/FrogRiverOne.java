package pl.pi_rat.part1.main.lesson1.codility_tests;

import java.util.ArrayList;

import java.util.List;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[] A = {};
        System.out.println(solution(1, A));
    }
    static public int solution(int X, int [] A){
        //Arrays.sort(A);
        //
        //int step = 1;
        List<Integer> myList = new ArrayList<>();
        for(int i= 0;i<A.length;i++){
            if(!myList.contains(A[i]) && A[i]<=X){
                //System.out.println(A[i]);
                myList.add(A[i]);
                //System.out.println(myList.size());
            }
            if (myList.size()==X){
                return i;

            }
        }
        return -1;
    }

}
