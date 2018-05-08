package pl.pi_rat.part1.main.lesson1.codility_tests;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] A={-1000,1000};
        //int[] A={3,1,2,4,3};
        System.out.println(solution(A));
    }

    static public int solution(int[] A) {
        int diffmin = -1;
        int SumAll = Arrays.stream(A).sum();
        int sumI = 0;
        int diff;

        for(int i =0;i<A.length-1;i++){
            sumI = sumI+A[i];
            diff = Math.abs(sumI - (SumAll-sumI));
            diffmin = (diffmin == -1)? diff:(diff<diffmin) ? diff: diffmin;

        }
        return diffmin;
    }
}
