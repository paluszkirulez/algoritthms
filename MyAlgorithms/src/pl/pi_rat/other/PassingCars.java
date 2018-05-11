package pl.pi_rat.other;

//import pl.pi_rat.collections.Lists.List;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PassingCars {
    public static void main(String[] args) {
        int[] A = {0,1,0,1,1};
        System.out.println(solution(A));

    }
    static public int solution( int[] A){

        long pairs=0;
        long myLong = 0;
        int k = 0;


        for (int i = 0;i<A.length;i++) {

                if (A[i] == 0) {

                    myLong = Arrays.stream(Arrays.copyOfRange(A,i,A.length)).sum();
                    pairs = pairs+myLong;
                    if(pairs>1000000000){
                        return -1;
                    }
                    }

            }

        return (int)pairs;
    }
}
