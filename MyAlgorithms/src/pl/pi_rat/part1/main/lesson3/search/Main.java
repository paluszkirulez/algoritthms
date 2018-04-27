package pl.pi_rat.part1.main.lesson3.search;

public class Main {
    public static void main(String[] args) {
        int[] myList = new int[]{1,2,3,4,5,6};
        String lista = "ala ma kota";
        String szukane = "ala";

        System.out.println(new NaiveSearch().search(lista, szukane));

    }


}
