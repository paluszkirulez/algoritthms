package pl.pi_rat.collections.ScannersAndIds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pesel {
    private String PESEL;
    static Map<Integer,String> myMonths = setMyMonths();

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
        myMonths.put(9,"October");
        myMonths.put(10,"September");
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
    }

    public Pesel(String PESEL) {
        this.PESEL = PESEL;
        this.charPesel = Arrays.stream(PESEL.split("\\B")).map(s->Integer.valueOf(s)).collect(Collectors.toList());

    }

    public boolean checkPesel(){

        // suma kontrolna
        //List<Integer> charPesel = Arrays.stream(PESEL.split("\\B")).map(s->Integer.valueOf(s)).collect(Collectors.toList());
        if(charPesel.size()<11) return false;
        int[] intNumbers = {9,7,3,1,9,7,3,1,9,7};
        int sumChars =0;
        for(int i = 0; i<charPesel.size()-1;i++){
            sumChars = sumChars + (charPesel.get(i)*intNumbers[i]);
        }
        if(sumChars%10 == (charPesel.get(10))){
            return true;
        }
        else return false;
    }
    public String genderCheck(){
        if(!this.checkPesel()) return "bad PeSEL";

        int number = charPesel.get(9);
        String plec = "";
        plec = (number %2 == 0 )? "woman" : "man";
        return plec;
    }

    public String getDate(){
        if(!this.checkPesel()) return "bad PeSEL";
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





        return myMonths.get(finalMonth) + " "+finalDay+ ", "+finalRok;
    }

}
