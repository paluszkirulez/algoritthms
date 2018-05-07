package pl.pi_rat.part1.main.lesson3.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch  {


    public int search(List<Integer> myList, int value) {


        int arrayLength = myList.size();
        int searched = arrayLength/2;
        System.out.println(searched);
        System.out.println(myList);
        if(myList.get(searched)==value){
            System.out.println(searched);
            return searched;
        }
        else if(myList.size()<=1){
            System.out.println('0');
            return -1;
        }
        else if(value>=myList.get(searched)){
            myList= myList.subList(searched,arrayLength);
            return search(myList,value);
        }
        else if(value<=myList.get(searched)){
            myList= myList.subList(0,searched);
            return search(myList,value);
        }
        return -1;

    }
}
