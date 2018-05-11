package pl.pi_rat.collections.Lists;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindrom {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("input your word");
        String myInt = myInput.nextLine();
        myInput.close();
        checkWord(myInt);
        checkWordStrem(myInt);
    }

    static void checkWord(String myWord){
        boolean myreturn = true;
        if(myWord.isEmpty()) myreturn = false;
        for(int i = 0; i<myWord.length()/2;i++){
            if(myWord.charAt(i)!=myWord.charAt(myWord.length()-1-i)){
                myreturn =false;
                break;
            }
        }
        if(myreturn){
            System.out.println("it is a polindrom");
        }
        else System.out.println("no it is not palindrom");
    }

    static void checkWordStrem(String myWord){
        boolean myResult =  IntStream.range(0,myWord.length()/2).allMatch(i->myWord.charAt(i)==myWord.charAt(myWord.length()-1-i));
        System.out.println(myResult);
        //Arrays.asList(myWord.toCharArray()).stream().allMatch(i->);
    }

}
