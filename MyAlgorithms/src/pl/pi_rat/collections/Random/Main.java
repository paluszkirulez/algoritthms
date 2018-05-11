package pl.pi_rat.collections.Random;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(9);
        Scanner myInput = new Scanner(System.in);
        int myInt = -1;
        boolean correct = false;
        do{
            System.out.println("zgadnij liczbe od 0 do 9");
            myInt = myInput.nextInt();
            myInput.close();
            if(myInt == i){
                System.out.println("you are correct");
                correct = true;
            }
            else {
                System.out.println("try again");
            }
        }while(!correct);



    }
}
