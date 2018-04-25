package pl.pi_rat.part1.main.lesson2.datastructures;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class spojPrimes {
    public static void main(String[] args) {
            checkPrimes(0,10);
    }
    public static void checkPrimes(int x, int b) {
        ArrayList<Integer> myList = new ArrayList<>();

        int k = 0;
        //add elements to arraylist
        for (int i = x; i <= b; i++) {
            myList.add(i);
        }
        System.out.println(myList);
        for (Integer j : myList) {
            if (isPrimeStream(j)) {
                System.out.println(j);
                k++;
            }

        }
    }
    public static boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n==1) return false;
        else if (n%2==0 && n!=2) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static boolean isPrimeStream(int n) {
        //check if n is a multiple of 2
        boolean czyPierwsza = IntStream.rangeClosed(2,(int)Math.sqrt(n)).noneMatch(i -> n % i ==0);
        return czyPierwsza;
    }

}
