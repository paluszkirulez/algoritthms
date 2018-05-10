package pl.pi_rat.collections.ScannersAndIds;

import java.util.Arrays;
import java.util.Scanner;

public class ScanningInput {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("input your number");
        String myInt = myInput.nextLine();
        myInput.close();
        Pesel myPesel = new Pesel(myInt);
        System.out.println("Your PESEL is " + myPesel.checkPesel()
           + " and you are a "+ myPesel.genderCheck()
        );
        System.out.println("Your were born at: " + myPesel.getDate()
        );
    }



}
