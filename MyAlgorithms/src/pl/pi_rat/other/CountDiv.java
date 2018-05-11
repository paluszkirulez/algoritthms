package pl.pi_rat.other;

import java.util.Arrays;

public class CountDiv {
    public static void main(String[] args) {
        //int[] A = {1,3,2,4,6,8,9};
        int A = 101;
        int B = 123000000 ;
        int C = 10000;
        System.out.println(solution(A , B, C));
        System.out.println(solution2(A , B, C));
    }
    static public int solution(int A, int B, int K){
        if(K==0){
            return 0;
        }
        int myCount = 0;
        for(int i = A;i<=B;i++){

            if(i%K == 0){
                myCount++;
            }
        }
        return myCount;
    }
    static public int solution2(int A, int B, int K){
        double myF = 1.0;
        int myCount = 0;

        double C = (B-A)*myF;
        //myCount = C/K;
        myCount = (int)(C/K);
        if(B%K==0){
            myCount++;
        }
        return myCount;
    }

}
