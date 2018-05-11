package pl.pi_rat.collections.ScannersAndIds;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pesel {
    private String PESEL;
    static Map<Integer,String> myMonths = setMyMonths();
    //private LocalDate birthDate;
    private boolean isCorrect;
    private Gender gender;
    private String birthDate;



    private List<Integer> charPesel;


    private static Map<Integer,String>  setMyMonths() {
        Map<Integer,String> myMonths = new HashMap<>();
        myMonths.put(1,"January");
        myMonths.put(2,"February");
        myMonths.put(3,"March");
        myMonths.put(4,"April");
        myMonths.put(5,"May");
        myMonths.put(6,"June");
        myMonths.put(7,"Jule");
        myMonths.put(8,"August");
        myMonths.put(9,"September");
        myMonths.put(10,"October");
        myMonths.put(11,"November");
        myMonths.put(12,"December");
        return myMonths;
    }



    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
        this.charPesel = Arrays.stream(PESEL.split("\\B")).map(s->Integer.valueOf(s)).collect(Collectors.toList());
        if(this.checkPesel()){
            this.gender = this.genderCheck();
            this.birthDate = this.getDate();
        }
    }

    public Pesel(String PESEL) {
        this.PESEL = PESEL;
        this.charPesel = Arrays.stream(PESEL.split("\\B")).map(s->Integer.valueOf(s)).collect(Collectors.toList());
        if(this.checkPesel()){
            this.gender = this.genderCheck();
            this.birthDate = this.getDate();
        }

    }

    public boolean checkPesel(){

        // suma kontrolna
        //List<Integer> charPesel = Arrays.stream(PESEL.split("\\B")).map(s->Integer.valueOf(s)).collect(Collectors.toList());
        if(charPesel.size()<11) {
            System.out.println("Not correct PESEL");
            return false;
        }
        int[] intNumbers = {9,7,3,1,9,7,3,1,9,7};
        int sumChars =0;
        for(int i = 0; i<charPesel.size()-1;i++){
            sumChars = sumChars + (charPesel.get(i)*intNumbers[i]);
        }
        if(sumChars%10 == (charPesel.get(10))){
            System.out.println("Pesel is correct");
            return true;
        }

        else {
            System.out.println("Not correct PESEL");
            return false;
        }
    }
    public Gender genderCheck(){
        int number = charPesel.get(9);

        this.gender = (number %2 == 0 )? Gender.WOMAN : Gender.MAN;
        System.out.println("You are a: "+ gender.toString().toLowerCase());
        return gender;
    }

    public String getDate(){

        //List<Integer> charPesel = Arrays.stream(PESEL.split("\\B")).map(s->Integer.valueOf(s)).collect(Collectors.toList());
        //rok
        int basicRok = 1900 + charPesel.get(0)*10 + charPesel.get(1);
        int finalRok =0;
        int monthBase = charPesel.get(2)*10+charPesel.get(3);
        int finalMonth = 0;
        if(charPesel.get(2)==0 || charPesel.get(2)==1){
            finalRok = basicRok;
            finalMonth = monthBase;
        }
        else if(charPesel.get(2)==2 || charPesel.get(2)==3){
            finalRok = basicRok+100;
            finalMonth = monthBase-20;
        }
        else if(charPesel.get(2)==4 || charPesel.get(2)==5){
            finalRok = basicRok+200;
            finalMonth = monthBase-40;
        }
        else if(charPesel.get(2)==6 || charPesel.get(2)==7){
            finalRok = basicRok+300;
            finalMonth = monthBase-60;
        }
        else if(charPesel.get(2)==8 || charPesel.get(2)==9){
            finalRok = basicRok-100;
            finalMonth = monthBase-80;
        }

        //day
        int finalDay = charPesel.get(4)*10+charPesel.get(5);



        //this.birthDate = LocalDate.parse(finalRok+"-"+finalMonth+"-"+finalDay);
        //return this.birthDate.getMonth()+ " "+this.birthDate.getDayOfMonth()+", "+this.birthDate.getYear();
        System.out.println("Your date of birth is: "+ myMonths.get(finalMonth) + " "+finalDay+ ", "+finalRok);
        return myMonths.get(finalMonth) + " "+finalDay+ ", "+finalRok;
    }

}
