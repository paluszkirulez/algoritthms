package pl.pi_rat.other;

import java.util.Arrays;

public class MissingInteger  {
    public static void main(String[] args) {
        int[] A = {1,3,2,4,6,8,9};
        System.out.println(solution(A));
    }
    static public int solution(int[] A){
        Arrays.sort(A);
        for(int i = 1;i<=100001;i++){
            if(Arrays.binarySearch(A,i)<0){
                return i;
            }
        }
        return -1;
    }
}
