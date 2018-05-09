package pl.pi_rat.collections.Lists;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListElement myelement = new ListElement(21);
        ListElement myelement2 = new ListElement(33);
        ListElement myelement3 = new ListElement(34);
        ListElement myelement4 = new ListElement(35);
        List myFullList = new List();
        myFullList.add(myelement);
        myFullList.add(myelement2);
        myFullList.add(myelement3);
        myFullList.add(myelement4);

        Iterator<Integer> myIterator = myFullList.iterator();

        System.out.println(myFullList.getLast().getPrevious());
        List mySecondList = myFullList.reverse();
        mySecondList.getAll();
        //mySecondList.getAll();
        //ListElement myFullList = new ListElement(myelement);
        //myFullList.add(myelement2);

    }
}
