package pl.pi_rat.part1.main.lesson1.codility_tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxCounters {
    public static void main(String[] args) {
        int[] A = {3,4,4,6,1,4,4};
        int N = 5;
        System.out.println(Arrays.toString(solution(N,A)));
    }

    static public int[] solution(int N, int [] A){
        int [] myArray= new int[N];

        int maxCount = 0;
        for(int i = 0; i<A.length;i++){


            if(A[i]-1<=N-1){
                int IndA = A[i]-1;
                //System.out.println(IndA);
                myArray[IndA] = myArray[IndA]+1;
                maxCount = (myArray[IndA] > maxCount) ? myArray[IndA]:maxCount;
            }
            else {
                if (N > 0){
                    myArray[0] = maxCount;
                }

                for (int k = 1; k < N; k += k) {
                    System.arraycopy(myArray, 0, myArray, k, ((N - k) < k) ? (N - k) : k);
                }
            }
                //ladne ale nie dziala tak szybko
                //Arrays.fill(myArray,maxCount);



        }
        return myArray;
    }

}
