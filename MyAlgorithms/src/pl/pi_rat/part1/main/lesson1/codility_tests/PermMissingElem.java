package pl.pi_rat.part1.main.lesson1.codility_tests;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] A={};
        System.out.println(solution(A));

    }
    static public int solution(int[] A) {
        Arrays.sort(A);
        int defaultReturn=-1;
        for(int i=1; i<=A.length+1;i++){
            if(Arrays.binarySearch(A,i)<0){
                return i;
            }
        }
        return defaultReturn;
    }
}
