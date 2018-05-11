package pl.pi_rat.part1.main.lesson1.codility_tests;

import java.util.Arrays;



public class GenomicRangeQuery {
    public static void main(String[] args) {
        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        System.out.println(Arrays.toString(solution(S,P,Q)));
    }
    static public int[] solution(String S, int[] P, int[] Q){


        String mySub="";

        int[] myInt = new int[P.length];

        for(int i = 0; i<P.length;i++){
            int minValue = 5;
            int tmpValue;
            mySub = S.substring(P[i],Q[i]+1);

            for(int k = 0; k<mySub.length();k++){
                if(mySub.charAt(k)== 'A') {
                    tmpValue = 1;
                    minValue = tmpValue;
                    break;

                }
                else if(mySub.charAt(k)== 'C'){
                    tmpValue = 2;

                }
                else if(mySub.charAt(k)== 'G'){
                    tmpValue = 3;

                }
                else tmpValue = 4;
                minValue = (tmpValue<minValue)? tmpValue : minValue;
            }


            myInt[i]=minValue;
        }


        return myInt;
    }
}
