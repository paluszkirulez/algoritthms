package pl.pi_rat.part1.main.lesson3.search;


import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class tests {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 1};
        //int[] arr = {};
        System.out.println(Arrays.toString(solution(arr, 1)));
    }
    static public int[] solution(int[] A, int K) {
        if(K==0) return A;
        if(A.length == 0) return A;
        int timeK = (K<A.length) ? K : K%A.length;
        int absoulteK = (timeK!=0) ? timeK : 0;
        absoulteK = (A.length==2) ? timeK : absoulteK;

        //System.out.println(absoulteK);
        if(absoulteK == 0) return A;
        int[] arr1 = Arrays.copyOfRange(A,0,absoulteK);
        int[] arr2 = Arrays.copyOfRange(A,absoulteK,A.length);
        int[] arr3 = new int[A.length];
        System.arraycopy(arr2, 0, arr3, 0, arr2.length);
        System.arraycopy(arr1, 0, arr3, arr2.length, arr1.length);
        return arr3;



    }
}
