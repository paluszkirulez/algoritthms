package pl.pi_rat.part1.main.lesson3.search;

import java.util.ArrayList;
import java.util.List;

public class NaiveSearch implements SearchAlgorithm {

    @Override
    public int search(String array, String value, boolean caseSensitive) {
        if(array.length()==0 || value.length()==0){
            return -1;
        }

        List<Character> myArray = new ArrayList<>();
        List<Character> mySearch = new ArrayList<>();
        if(!caseSensitive){
            array = array.toLowerCase();
            value = value.toLowerCase();
        }
        for (char c : array.toCharArray()) {
            myArray.add(c);
        }
        for (char c : value.toCharArray()) {
            mySearch.add(c);

        }

        int position = -1;


        for (int i = 0; i < myArray.size() - mySearch.size() + 1; i++) {
            boolean equals;

            if (myArray.get(i) == mySearch.get(0)) {
                equals = true;
                for (int k = 1; k < mySearch.size(); k++) {
                    //System.out.println(myArray.get(i+k).toString());
                    if (myArray.get(i + k) != mySearch.get(k)) {
                        equals = false;
                        break;
                    }

                }
                if (equals) {
                    position = i;
                }

            }
        }

        return position;

    }
}
