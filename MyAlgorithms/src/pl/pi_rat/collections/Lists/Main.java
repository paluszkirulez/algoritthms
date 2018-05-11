package pl.pi_rat.collections.Lists;

public class Main {
    public static void main(String[] args) {
        ListElement myelement = new ListElement(21);
        ListElement myelement2 = new ListElement(33);
        List myFullList = new List();
        myFullList.add(myelement);
        myFullList.add(myelement2);
        System.out.println(myFullList.getFirst());
        System.out.println(myFullList.getFirst().getNext());
        System.out.println(myFullList.getLast().getPrevious());

        System.out.println(myFullList.get(1));
        myFullList.remove(1);
        System.out.println(myFullList.size());
        System.out.println(myFullList.getFirst());
        System.out.println(myFullList.get(1));
        System.out.println(myFullList.getLast());
        //ListElement myFullList = new ListElement(myelement);
        //myFullList.add(myelement2);

    }
}
